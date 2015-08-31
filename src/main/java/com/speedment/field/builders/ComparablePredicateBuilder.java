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
package com.speedment.field.builders;

import com.speedment.annotation.Api;
import java.util.function.Predicate;
import com.speedment.field.operators.ComparableOperator;

/**
 *
 * @author pemi
 * @param <ENTITY> The entity type
 * @param <V> the field value type
 */
@Api(version = "2.1")
public interface ComparablePredicateBuilder<ENTITY, V extends Comparable<? super V>> extends PredicateBuilder<ENTITY>, Predicate<ENTITY> {

    ComparableOperator getComparableOperator();
    
    V getValue();
}