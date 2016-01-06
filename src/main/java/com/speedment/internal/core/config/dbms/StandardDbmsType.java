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
package com.speedment.internal.core.config.dbms;

import com.speedment.config.db.parameters.DbmsType;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author pemi
 */
public final class StandardDbmsType {

    private static final MySqlDbmsType MYSQL_DBMS_TYPE = new MySqlDbmsType();
    private static final MariaDbDbmsType MARIADB_DBMS_TYPE = new MariaDbDbmsType();
    private static final PostgresDbmsType POSTGRE_DBMS_TYPE = new PostgresDbmsType();

    private final static List<DbmsType> STANDARD_TYPES = Stream.of(
        MYSQL_DBMS_TYPE,
        MARIADB_DBMS_TYPE,
        POSTGRE_DBMS_TYPE
    ).collect(Collectors.toList());

    public static Stream<DbmsType> stream() {
        return STANDARD_TYPES.stream();
    }

    public static DbmsType defaultType() {
        return MYSQL_DBMS_TYPE; 
    }
}
