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

import com.speedment.api.Speedment;
import com.speedment.codegen.util.Formatting;
import com.speedment.codegen.base.Generator;
import com.speedment.codegen.base.Meta;
import com.speedment.codegen.java.JavaGenerator;
import com.speedment.codegen.lang.models.File;
import com.speedment.core.code.model.Translator;
import com.speedment.core.code.model.java.entity.EntityImplTranslator;
import com.speedment.core.code.model.java.manager.EntityManagerImplTranslator;
import com.speedment.core.code.model.java.entity.EntityTranslator;
import com.speedment.core.code.model.java.lifecycle.SpeedmentApplicationMetadataTranslator;
import com.speedment.core.code.model.java.lifecycle.SpeedmentApplicationTranslator;
import com.speedment.api.config.Project;
import com.speedment.api.config.Table;
import com.speedment.logging.Logger;
import com.speedment.logging.LoggerManager;

import com.speedment.util.Statistics;
import com.speedment.util.analytics.AnalyticsUtil;
import static com.speedment.util.analytics.FocusPoint.GENERATE;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import static java.util.stream.Collectors.toList;

/**
 *
 * @author pemi
 */
public class MainGenerator implements Consumer<Project> {

    private final static Logger LOGGER = LoggerManager.getLogger(MainGenerator.class);
    private int fileCounter = 0;
    
    private final Speedment speedment;
    
    public MainGenerator(Speedment speedment) {
        this.speedment = speedment;
    }

    @Override
    public void accept(Project project) {
        AnalyticsUtil.notify(GENERATE);
        Statistics.onGenerate();
        
        fileCounter = 0;

        final List<Translator<?, File>> translators = new ArrayList<>();

        final Generator gen = new JavaGenerator();

        translators.add(new SpeedmentApplicationTranslator(speedment, gen, project));
        translators.add(new SpeedmentApplicationMetadataTranslator(speedment, gen, project));

        project.traverseOver(Table.class)
            .filter(Table::isEnabled)
            .forEach(table -> {
                translators.add(new EntityTranslator(speedment, gen, table));
                translators.add(new EntityImplTranslator(speedment, gen, table));
                translators.add(new EntityManagerImplTranslator(speedment, gen, table));
            });

        Formatting.tab("    ");
        gen.metaOn(translators.stream()
            .map(Translator::get)
            .collect(Collectors.toList()))
            .forEach(meta -> {

                final String fname = project.getPackageLocation()
                + "/"
                + meta.getModel().getName();
                final String content = meta.getResult();
                final Path path = Paths.get(fname);
                path.getParent().toFile().mkdirs();

                try {
                    Files.write(path, content.getBytes(StandardCharsets.UTF_8), StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
                    fileCounter++;
                } catch (IOException ex) {
                    LOGGER.error("Failed to create file " + fname, ex);
                }

                LOGGER.info("done");

                System.out.println("*** BEGIN File:" + fname);
                System.out.println(content);
                System.out.println("*** END   File:" + fname);
            });

        List<Table> tables = project
            .traverseOver(Table.class)
            .filter(Table::isEnabled)
            .collect(toList());

        gen.metaOn(tables, File.class).forEach(meta -> {
            writeToFile(project, gen, meta);
            fileCounter++;
        });
    }

    public int getFilesCreated() {
        return fileCounter;
    }

    private static void writeToFile(Project project, Generator gen, Meta<Table, File> c) {
        final Optional<String> content = gen.on(c.getResult());

        if (content.isPresent()) {
            final String fname
                = project.getPackageLocation()
                + "/" + c.getResult().getName();

            final Path path = Paths.get(fname);
            path.getParent().toFile().mkdirs();

            try {
                Files.write(path,
                    content.get().getBytes(StandardCharsets.UTF_8)
                );
            } catch (IOException ex) {
                LOGGER.error("Failed to create file " + fname, ex);
            }

            LOGGER.info("done");

            System.out.println("*** BEGIN File:" + fname);
            System.out.println(content);
            System.out.println("*** END   File:" + fname);
        } else {
            throw new IllegalArgumentException("Input file could not be generated.");
        }
    }

}
