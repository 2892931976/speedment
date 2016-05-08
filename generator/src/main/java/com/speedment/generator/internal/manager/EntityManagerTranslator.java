/**
 *
 * Copyright (c) 2006-2016, Speedment, Inc. All Rights Reserved.
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
package com.speedment.generator.internal.manager;

import com.speedment.runtime.Speedment;
import com.speedment.fika.codegen.Generator;
import com.speedment.fika.codegen.model.File;
import com.speedment.fika.codegen.model.Interface;
import com.speedment.runtime.config.db.Table;
import com.speedment.generator.internal.EntityAndManagerTranslator;

/**
 *
 * @author Emil Forslund
 * @author Per-Åke Minborg
 */
public final class EntityManagerTranslator extends EntityAndManagerTranslator<Interface> {

    public EntityManagerTranslator(Speedment speedment, Generator gen, Table doc) {
        super(speedment, gen, doc, Interface::of);
    }

    @Override
    protected Interface makeCodeGenModel(File file) {
        return newBuilder(file, getSupport().managerName()).build()
            .public_().add(getSupport().generatedManagerType());
    }
    
    @Override
    protected String getClassOrInterfaceName() {
        return getSupport().managerName();
    }

    @Override
    protected String getJavadocRepresentText() {
        return "A manager";
    }
}