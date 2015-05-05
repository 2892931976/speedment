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
package com.speedment.orm.field;

import java.util.Objects;
import java.util.function.IntPredicate;

/**
 *
 * @author pemi
 */
public enum StandardBinaryOperator implements BinaryOperator {

    EQUAL(i -> i == 0),
    NOT_EQUAL(i -> i != 0),
    LESS_THAN(i -> i < 0),
    LESS_OR_EQUAL(i -> i <= 0),
    GREATER_THAN(i -> i > 0),
    GREATER_OR_EQUAL(i -> i >= 0);

    private final IntPredicate comparator;

    private StandardBinaryOperator(IntPredicate comparator) {
        this.comparator = Objects.requireNonNull(comparator);
    }

    public IntPredicate getComparator() {
        return comparator;
    }
}
