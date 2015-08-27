/**
 *
 * Copyright (c) 2006-2015, Speedment, Inc. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); You may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at:
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.speedment.api.config;

import com.speedment.api.config.aspects.Ordinable;
import com.speedment.api.annotation.Api;
import com.speedment.api.config.aspects.Child;
import com.speedment.api.config.aspects.Columnable;
import com.speedment.api.config.aspects.Enableable;
import com.speedment.core.config.impl.IndexColumnImpl;
import com.speedment.api.config.aspects.OrderTypeable;
import java.util.function.Supplier;

/**
 *
 * @author pemi
 */
@Api(version = "2.1")
public interface IndexColumn extends Node, Enableable, Ordinable, OrderTypeable, 
    Columnable, Child<Index> {

    /**
     * Factory holder.
     */
    enum Holder { HOLDER;
        private Supplier<IndexColumn> provider = IndexColumnImpl::new;
    }

    /**
     * Sets the instantiation method used to create new instances of this
     * interface.
     * 
     * @param provider  the new constructor 
     */
    static void setSupplier(Supplier<IndexColumn> provider) {
        Holder.HOLDER.provider = provider;
    }

    /**
     * Creates a new instance implementing this interface by using the class
     * supplied by the default factory. To change implementation, please use
     * the {@link #setSupplier(java.util.function.Supplier) setSupplier} method.

     * @return  the new instance
     */
    static IndexColumn newIndexColumn() {
        return Holder.HOLDER.provider.get();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    default Class<IndexColumn> getInterfaceMainClass() {
        return IndexColumn.class;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    default Class<Index> getParentInterfaceMainClass() {
        return Index.class;
    }
}