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
package com.speedment.core.field.builders;

import com.speedment.api.field.Field;
import com.speedment.api.field.ReferenceField;
import com.speedment.api.field.builders.SetterBuilder;

/**
 * @author Emil Forslund
 * @param <ENTITY>  the entity
 * @param <V>       the value type
 */
public class SetterBuilderImpl<ENTITY, V> implements SetterBuilder<ENTITY, V> {

    private final ReferenceField<ENTITY, V> field;
    private final V newValue;

    public SetterBuilderImpl(ReferenceField<ENTITY, V> field, V newValue) {
        this.field    = field;
        this.newValue = newValue;
    }

    @Override
    public Field<ENTITY> getField() {
        return field;
    }

    @Override
    public V getValue() {
        return newValue;
    }
    
    @Override
    public ENTITY apply(ENTITY entity) {
        return field.setter().apply(entity, newValue);
    }
}