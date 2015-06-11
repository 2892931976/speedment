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
package com.speedment.core.code.model.java;

import com.speedment.codegen.lang.models.Import;
import com.speedment.core.config.model.Table;
import static java.util.Objects.requireNonNull;
import java.util.function.Consumer;

/**
 *
 * @author pemi
 */
public class ImportDelegator {
    
    private final Table table;
    private Consumer<Import> adder;

    public ImportDelegator(Table table) {
        this.table = table;
    }

    public Table getTable() {
        return table;
    }

    public void setImportAdder(Consumer<Import> adder) {
        this.adder = adder;
    }
    
    public void add(Import imp) {
        adder.accept(requireNonNull(imp, "Import adder has not been set."));
    }
}