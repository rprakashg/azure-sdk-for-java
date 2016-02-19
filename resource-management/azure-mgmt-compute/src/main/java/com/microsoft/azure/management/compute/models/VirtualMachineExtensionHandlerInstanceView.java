/**
 * 
 * Copyright (c) Microsoft and contributors.  All rights reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * 
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 */

// Warning: This code was generated by a tool.
// 
// Changes to this file may cause incorrect behavior and will be lost if the
// code is regenerated.

package com.microsoft.azure.management.compute.models;

/**
* The instance view of a virtual machine extension handler.
*/
public class VirtualMachineExtensionHandlerInstanceView {
    private InstanceViewStatus status;
    
    /**
    * Optional. Gets or sets the extension handler status.
    * @return The Status value.
    */
    public InstanceViewStatus getStatus() {
        return this.status;
    }
    
    /**
    * Optional. Gets or sets the extension handler status.
    * @param statusValue The Status value.
    */
    public void setStatus(final InstanceViewStatus statusValue) {
        this.status = statusValue;
    }
    
    private String type;
    
    /**
    * Optional. Gets or sets full type of the extension handler which includes
    * both publisher and type.
    * @return The Type value.
    */
    public String getType() {
        return this.type;
    }
    
    /**
    * Optional. Gets or sets full type of the extension handler which includes
    * both publisher and type.
    * @param typeValue The Type value.
    */
    public void setType(final String typeValue) {
        this.type = typeValue;
    }
    
    private String typeHandlerVersion;
    
    /**
    * Optional. Gets or sets the type version of the extension handler.
    * @return The TypeHandlerVersion value.
    */
    public String getTypeHandlerVersion() {
        return this.typeHandlerVersion;
    }
    
    /**
    * Optional. Gets or sets the type version of the extension handler.
    * @param typeHandlerVersionValue The TypeHandlerVersion value.
    */
    public void setTypeHandlerVersion(final String typeHandlerVersionValue) {
        this.typeHandlerVersion = typeHandlerVersionValue;
    }
}