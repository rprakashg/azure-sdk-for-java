/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.batch;

import com.microsoft.azure.PagedList;
import com.microsoft.azure.batch.protocol.models.ApplicationGetHeaders;
import com.microsoft.azure.batch.protocol.models.ApplicationGetOptions;
import com.microsoft.azure.batch.protocol.models.ApplicationListHeaders;
import com.microsoft.azure.batch.protocol.models.ApplicationListOptions;
import com.microsoft.azure.batch.protocol.models.ApplicationSummary;
import com.microsoft.azure.batch.protocol.models.BatchErrorException;
import com.microsoft.rest.ServiceResponseWithHeaders;

import java.io.IOException;
import java.util.Collection;
import java.util.List;

/**
 * Performs application related operations on an Azure Batch account.
 */
public class ApplicationOperations  implements IInheritedBehaviors {

    ApplicationOperations(BatchClient batchClient, Collection<BatchClientBehavior> customBehaviors) {
        _parentBatchClient = batchClient;

        // inherit from instantiating parent
        InternalHelper.InheritClientBehaviorsAndSetPublicProperty(this, customBehaviors);
    }

    private Collection<BatchClientBehavior> _customBehaviors;

    private BatchClient _parentBatchClient;

    /**
     * Gets a list of behaviors that modify or customize requests to the Batch service.
     *
     * @return A list of BatchClientBehavior
     */
    @Override
    public Collection<BatchClientBehavior> customBehaviors() {
        return _customBehaviors;
    }

    /**
     * Sets a list of behaviors that modify or customize requests to the Batch service.
     *
     * @param behaviors The collection of BatchClientBehavior classes
     * @return The current instance
     */
    @Override
    public IInheritedBehaviors withCustomBehaviors(Collection<BatchClientBehavior> behaviors) {
        _customBehaviors = behaviors;
        return this;
    }

    /**
     * Enumerates the {@link ApplicationSummary applications} in the Batch account.
     *
     * @return A collection of {@link ApplicationSummary}
     * @throws BatchErrorException Exception thrown from REST call
     * @throws IOException Exception thrown from serialization/deserialization
     */
    public List<ApplicationSummary> listApplications() throws BatchErrorException, IOException {
        return listApplications(null);
    }

    /**
     * Enumerates the {@link ApplicationSummary applications}  in the Batch account.
     *
     * @param additionalBehaviors A collection of {@link BatchClientBehavior} instances that are applied to the Batch service request.
     * @return A collection of {@link ApplicationSummary}
     * @throws BatchErrorException Exception thrown from REST call
     * @throws IOException Exception thrown from serialization/deserialization
     */
    public List<ApplicationSummary> listApplications(Iterable<BatchClientBehavior> additionalBehaviors) throws BatchErrorException, IOException {
        ApplicationListOptions options = new ApplicationListOptions();
        BehaviorManager bhMgr = new BehaviorManager(this.customBehaviors(), additionalBehaviors);
        bhMgr.applyRequestBehaviors(options);

        ServiceResponseWithHeaders<PagedList<ApplicationSummary>, ApplicationListHeaders> response = this._parentBatchClient.protocolLayer().applications().list(options);

        return response.getBody();
    }

    /**
     * Gets information about the specified application.
     *
     * @param applicationId The ID of the application to get.
     * @return An {@link ApplicationSummary} containing information about the specified application.
     * @throws BatchErrorException Exception thrown from REST call
     * @throws IOException Exception thrown from serialization/deserialization
     */
    public ApplicationSummary getApplication(String applicationId) throws BatchErrorException, IOException {
        return getApplication(applicationId, null);
    }

    /**
     * Gets information about the specified application.
     *
     * @param applicationId The ID of the application to get.
     * @param additionalBehaviors A collection of {@link BatchClientBehavior} instances that are applied to the Batch service request.
     * @return An {@link ApplicationSummary} containing information about the specified application.
     * @throws BatchErrorException Exception thrown from REST call
     * @throws IOException Exception thrown from serialization/deserialization
     */
    public ApplicationSummary getApplication(String applicationId, Iterable<BatchClientBehavior> additionalBehaviors) throws BatchErrorException, IOException {
        ApplicationGetOptions options = new ApplicationGetOptions();
        BehaviorManager bhMgr = new BehaviorManager(this.customBehaviors(), additionalBehaviors);
        bhMgr.applyRequestBehaviors(options);

        ServiceResponseWithHeaders<ApplicationSummary, ApplicationGetHeaders> response = this._parentBatchClient.protocolLayer().applications().get(applicationId, options);

        return response.getBody();
    }
}
