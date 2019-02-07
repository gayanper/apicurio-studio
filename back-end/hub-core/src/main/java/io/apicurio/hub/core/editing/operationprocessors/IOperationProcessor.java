/*
 * Copyright 2018 JBoss Inc
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.apicurio.hub.core.editing.operationprocessors;

import io.apicurio.hub.core.editing.ApiDesignEditingSession;
import io.apicurio.hub.core.editing.ISessionContext;
import io.apicurio.hub.core.editing.sessionbeans.BaseOperation;

/**
 * @author Marc Savy {@literal <marc@rhymewithgravy.com>}
 */
public interface IOperationProcessor {

    /**
     * Processes the given operation, performing some work specific to the type of operation.
     * @param editingSession
     * @param session
     * @param operation
     */
    void process(ApiDesignEditingSession editingSession, ISessionContext session, BaseOperation operation);
    
    /**
     * Returns the name of the operation that this processor is responsible for.  The name
     * of the operation maps to the "type" of an inbound websocket message.
     */
    String getOperationName();
    
    /**
     * The class to use when unmarshalling the message payload into a {@link BaseOperation} instance.
     * @return
     */
    Class<? extends BaseOperation> unmarshallClass();
}
