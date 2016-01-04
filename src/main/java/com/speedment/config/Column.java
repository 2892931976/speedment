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
package com.speedment.config;

import com.speedment.config.aspects.Ordinable;
import com.speedment.annotation.Api;
import com.speedment.annotation.External;
import com.speedment.config.aspects.Child;
import com.speedment.config.aspects.Enableable;
import com.speedment.internal.core.config.ColumnImpl;
import com.speedment.config.aspects.ColumnCompressionTypeable;
import com.speedment.config.aspects.FieldStorageTypeable;
import com.speedment.config.aspects.RestExposable;
import com.speedment.config.mapper.TypeMapper;
import static java.util.Objects.requireNonNull;
import java.util.Optional;
import java.util.function.Supplier;

/**
 * A Column represents meta data that relates to a column in a database table.
 *
 * @author pemi
 */
@Api(version = "2.2")
public interface Column extends Node, Enableable, Ordinable, Child<Table>,
    FieldStorageTypeable, ColumnCompressionTypeable, RestExposable {

    /**
     * The holder of the factory for instances of the {@link Column} interface.
     * To create a new instance, call the {@link #newColumn()} method. To change
     * the implementing class, call {@link #setSupplier(java.util.function.Supplier)}.
     */
    enum Holder { HOLDER;
        private Supplier<Column> provider = ColumnImpl::new;
    }

    /**
     * Set the implementation class to use when {@link Column#newColumn()} is
     * called.
     * 
     * @param provider  the constructor of the new implementation class
     */
    static void setSupplier(Supplier<Column> provider) {
        Holder.HOLDER.provider = requireNonNull(provider);
    }

    /**
     * Creates a new instance that satisfies the <code>Column</code> interface.
     * 
     * @return  the created instance
     */
    static Column newColumn() {
        return Holder.HOLDER.provider.get();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    default Class<Column> getInterfaceMainClass() {
        return Column.class;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    default Class<Table> getParentInterfaceMainClass() {
        return Table.class;
    }

    /**
     * Returns whether or not this column can hold <code>null</code> values.
     * <p>
     * This property is editable in the GUI through reflection.
     * 
     * @return  <code>true</code> if null values are tolerated, else 
     *          <code>false</code>
     */
    @External(type = Boolean.class)
    Boolean isNullable();

    /**
     * Sets if this column should tolerate <code>null</code> values or not.
     * <p>
     * This property is editable in the GUI through reflection.
     * 
     * @param nullable <code>true</code> if null values should be tolerated
     */
    @External(type = Boolean.class)
    void setNullable(Boolean nullable);

    /**
     * Returns whether or not this column will auto increment when new values
     * are added to the table.
     * <p>
     * This property is editable in the GUI through reflection.
     * 
     * @return  <code>true</code> if the column auto increments, else 
     *          <code>false</code>
     */
    @External(type = Boolean.class)
    Boolean isAutoincrement();

    /**
     * Sets if this column should auto increment when new values are added to 
     * the table.
     * <p>
     * This property is editable in the GUI through reflection.
     * 
     * @param autoIncrement <code>true</code> if the column should auto increment
     */
    @External(type = Boolean.class)
    void setAutoincrement(Boolean autoIncrement);

    /**
     * Returns the alias of this column, which is the name that Speedment will
     * use when generating code. This can be different from the actual column
     * name used in the database.
     * <p>
     * This property is editable in the GUI through reflection.
     * 
     * @return  the alias
     */
    @External(type = String.class)
    Optional<String> getAlias();

    /**
     * Sets the alias of this column, which is the name that Speedment will
     * use when generating code. This can be different from the actual column
     * name used in the database.
     * <p>
     * This property is editable in the GUI through reflection.
     * 
     * @param alias  the alias
     */
    @External(type = String.class)
    void setAlias(String alias);
    
    /**
     * Returns the mapper class that will be used to generate a java 
     * representation of the database types.
     * <p>
     * This property is editable in the GUI through reflection.
     * 
     * @return  the mapper class
     */
    @External(type = TypeMapper.class)
    TypeMapper<?, ?> getTypeMapper();

    /**
     * Sets the mapper class that will be used to generate a java 
     * representation of the database types.
     * <p>
     * This property is editable in the GUI through reflection.
     * 
     * @param mapper  the new mapper class
     */
    @External(type = TypeMapper.class)
    void setTypeMapper(TypeMapper<?, ?> mapper);
    
    /**
     * Constructs and sets the type mapper using it's default constructor.
     * 
     * @param mapper  the type mapper class to instantiate
     */
    void setTypeMapper(Class<?> mapper);
    
    /**
     * Returns the type that this column has in the database.
     * <p>
     * This property is editable in the GUI through reflection.
     * 
     * @return  the database type class
     */
    @External(type = Class.class, isVisibleInGui = false)
    Class<?> getDatabaseType();
    
    /**
     * Sets the type that this column has in the database. This should only
     * be called during the initialization of the metadata model!
     * <p>
     * To change the mapping to use, see {@link #setTypeMapper(java.lang.Class)}.
     * <p>
     * This property is editable in the GUI through reflection.
     * 
     * @param databaseType  the type of this column in the database
     * @see #setTypeMapper(java.lang.Class)
     */
    @External(type = Class.class, isVisibleInGui = false)
    void setDatabaseType(Class<?> databaseType);
}