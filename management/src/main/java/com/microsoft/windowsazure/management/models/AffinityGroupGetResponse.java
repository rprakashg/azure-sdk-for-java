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

package com.microsoft.windowsazure.management.models;

import com.microsoft.windowsazure.core.OperationResponse;
import java.net.URI;
import java.util.ArrayList;

/**
* The Get Affinity Group operation response.
*/
public class AffinityGroupGetResponse extends OperationResponse {
    private ArrayList<String> capabilities;
    
    /**
    * Optional. Indicates if the virtual machine-related operations can be
    * performed in this affinity group. If so, the string PersistentVMRole
    * will be returned by this element. Otherwise, this element will not be
    * present.
    * @return The Capabilities value.
    */
    public ArrayList<String> getCapabilities() {
        return this.capabilities;
    }
    
    /**
    * Optional. Indicates if the virtual machine-related operations can be
    * performed in this affinity group. If so, the string PersistentVMRole
    * will be returned by this element. Otherwise, this element will not be
    * present.
    * @param capabilitiesValue The Capabilities value.
    */
    public void setCapabilities(final ArrayList<String> capabilitiesValue) {
        this.capabilities = capabilitiesValue;
    }
    
    private String description;
    
    /**
    * Optional. The user-supplied description for this affinity group.
    * @return The Description value.
    */
    public String getDescription() {
        return this.description;
    }
    
    /**
    * Optional. The user-supplied description for this affinity group.
    * @param descriptionValue The Description value.
    */
    public void setDescription(final String descriptionValue) {
        this.description = descriptionValue;
    }
    
    private ArrayList<AffinityGroupGetResponse.HostedServiceReference> hostedServices;
    
    /**
    * Optional. The hosted services associated with this affinity group.
    * @return The HostedServices value.
    */
    public ArrayList<AffinityGroupGetResponse.HostedServiceReference> getHostedServices() {
        return this.hostedServices;
    }
    
    /**
    * Optional. The hosted services associated with this affinity group.
    * @param hostedServicesValue The HostedServices value.
    */
    public void setHostedServices(final ArrayList<AffinityGroupGetResponse.HostedServiceReference> hostedServicesValue) {
        this.hostedServices = hostedServicesValue;
    }
    
    private String label;
    
    /**
    * Optional. The user-supplied label for the affinity group, returned as a
    * base-64-encoded string.
    * @return The Label value.
    */
    public String getLabel() {
        return this.label;
    }
    
    /**
    * Optional. The user-supplied label for the affinity group, returned as a
    * base-64-encoded string.
    * @param labelValue The Label value.
    */
    public void setLabel(final String labelValue) {
        this.label = labelValue;
    }
    
    private String location;
    
    /**
    * Optional. The location of the data center that the affinity group is
    * associated with.
    * @return The Location value.
    */
    public String getLocation() {
        return this.location;
    }
    
    /**
    * Optional. The location of the data center that the affinity group is
    * associated with.
    * @param locationValue The Location value.
    */
    public void setLocation(final String locationValue) {
        this.location = locationValue;
    }
    
    private String name;
    
    /**
    * Optional. The user-supplied name for the affinity group.
    * @return The Name value.
    */
    public String getName() {
        return this.name;
    }
    
    /**
    * Optional. The user-supplied name for the affinity group.
    * @param nameValue The Name value.
    */
    public void setName(final String nameValue) {
        this.name = nameValue;
    }
    
    private ArrayList<AffinityGroupGetResponse.StorageServiceReference> storageServices;
    
    /**
    * Optional. The storage services associated with this affinity group.
    * @return The StorageServices value.
    */
    public ArrayList<AffinityGroupGetResponse.StorageServiceReference> getStorageServices() {
        return this.storageServices;
    }
    
    /**
    * Optional. The storage services associated with this affinity group.
    * @param storageServicesValue The StorageServices value.
    */
    public void setStorageServices(final ArrayList<AffinityGroupGetResponse.StorageServiceReference> storageServicesValue) {
        this.storageServices = storageServicesValue;
    }
    
    /**
    * Initializes a new instance of the AffinityGroupGetResponse class.
    *
    */
    public AffinityGroupGetResponse() {
        super();
        this.capabilities = new ArrayList<String>();
        this.hostedServices = new ArrayList<AffinityGroupGetResponse.HostedServiceReference>();
        this.storageServices = new ArrayList<AffinityGroupGetResponse.StorageServiceReference>();
    }
    
    /**
    * Reference to a hosted service associated with an affinity group.
    */
    public static class HostedServiceReference {
        private String serviceName;
        
        /**
        * Optional. The name of the hosted service.
        * @return The ServiceName value.
        */
        public String getServiceName() {
            return this.serviceName;
        }
        
        /**
        * Optional. The name of the hosted service.
        * @param serviceNameValue The ServiceName value.
        */
        public void setServiceName(final String serviceNameValue) {
            this.serviceName = serviceNameValue;
        }
        
        private URI uri;
        
        /**
        * Optional. The Service Management API request URI used to perform Get
        * Hosted Service Properties requests against the hosted service.
        * @return The Uri value.
        */
        public URI getUri() {
            return this.uri;
        }
        
        /**
        * Optional. The Service Management API request URI used to perform Get
        * Hosted Service Properties requests against the hosted service.
        * @param uriValue The Uri value.
        */
        public void setUri(final URI uriValue) {
            this.uri = uriValue;
        }
    }
    
    /**
    * Reference to a storage service associated with an affinity group.
    */
    public static class StorageServiceReference {
        private String serviceName;
        
        /**
        * Optional. The user supplied name of the storage account.
        * @return The ServiceName value.
        */
        public String getServiceName() {
            return this.serviceName;
        }
        
        /**
        * Optional. The user supplied name of the storage account.
        * @param serviceNameValue The ServiceName value.
        */
        public void setServiceName(final String serviceNameValue) {
            this.serviceName = serviceNameValue;
        }
        
        private URI uri;
        
        /**
        * Optional. The Service Management API request URI used to perform Get
        * Storage Account Properties requests against the storage account.
        * @return The Uri value.
        */
        public URI getUri() {
            return this.uri;
        }
        
        /**
        * Optional. The Service Management API request URI used to perform Get
        * Storage Account Properties requests against the storage account.
        * @param uriValue The Uri value.
        */
        public void setUri(final URI uriValue) {
            this.uri = uriValue;
        }
    }
}
