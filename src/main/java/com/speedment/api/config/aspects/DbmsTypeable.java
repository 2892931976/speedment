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
package com.speedment.api.config.aspects;

import com.speedment.api.HasSpeedment;
import com.speedment.api.annotation.Api;
import com.speedment.api.config.parameters.DbmsType;
import com.speedment.api.annotation.External;

/**
 *
 * @author Emil Forslund
 */
@Api(version = "2.1")
public interface DbmsTypeable extends HasSpeedment {

    DbmsType getType();

    void setType(DbmsType dbmsType);
    
    @External(type = DbmsType.class)
    String getTypeName();
    
    /**
     *
     * @param name  the type name of the dbms
     * @throws      IllegalArgumentException if a DbmsType for the given 
     *              dbmsTypeName could not be found
     */
    @External(type = DbmsType.class)
    void setTypeName(String name);
}