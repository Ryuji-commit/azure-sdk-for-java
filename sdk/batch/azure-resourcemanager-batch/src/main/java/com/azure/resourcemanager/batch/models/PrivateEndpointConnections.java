// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.batch.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.batch.fluent.models.PrivateEndpointConnectionInner;

/** Resource collection API of PrivateEndpointConnections. */
public interface PrivateEndpointConnections {
    /**
     * Lists all of the private endpoint connections in the specified account.
     *
     * @param resourceGroupName The name of the resource group that contains the Batch account.
     * @param accountName The name of the Batch account.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return values returned by the List operation.
     */
    PagedIterable<PrivateEndpointConnection> listByBatchAccount(String resourceGroupName, String accountName);

    /**
     * Lists all of the private endpoint connections in the specified account.
     *
     * @param resourceGroupName The name of the resource group that contains the Batch account.
     * @param accountName The name of the Batch account.
     * @param maxresults The maximum number of items to return in the response.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return values returned by the List operation.
     */
    PagedIterable<PrivateEndpointConnection> listByBatchAccount(
        String resourceGroupName, String accountName, Integer maxresults, Context context);

    /**
     * Gets information about the specified private endpoint connection.
     *
     * @param resourceGroupName The name of the resource group that contains the Batch account.
     * @param accountName The name of the Batch account.
     * @param privateEndpointConnectionName The private endpoint connection name. This must be unique within the
     *     account.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about the specified private endpoint connection.
     */
    PrivateEndpointConnection get(String resourceGroupName, String accountName, String privateEndpointConnectionName);

    /**
     * Gets information about the specified private endpoint connection.
     *
     * @param resourceGroupName The name of the resource group that contains the Batch account.
     * @param accountName The name of the Batch account.
     * @param privateEndpointConnectionName The private endpoint connection name. This must be unique within the
     *     account.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about the specified private endpoint connection.
     */
    Response<PrivateEndpointConnection> getWithResponse(
        String resourceGroupName, String accountName, String privateEndpointConnectionName, Context context);

    /**
     * Updates the properties of an existing private endpoint connection.
     *
     * @param resourceGroupName The name of the resource group that contains the Batch account.
     * @param accountName The name of the Batch account.
     * @param privateEndpointConnectionName The private endpoint connection name. This must be unique within the
     *     account.
     * @param parameters PrivateEndpointConnection properties that should be updated. Properties that are supplied will
     *     be updated, any property not supplied will be unchanged.
     * @param ifMatch The state (ETag) version of the private endpoint connection to update. This value can be omitted
     *     or set to "*" to apply the operation unconditionally.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return contains information about a private link resource.
     */
    PrivateEndpointConnection update(
        String resourceGroupName,
        String accountName,
        String privateEndpointConnectionName,
        PrivateEndpointConnectionInner parameters,
        String ifMatch);

    /**
     * Updates the properties of an existing private endpoint connection.
     *
     * @param resourceGroupName The name of the resource group that contains the Batch account.
     * @param accountName The name of the Batch account.
     * @param privateEndpointConnectionName The private endpoint connection name. This must be unique within the
     *     account.
     * @param parameters PrivateEndpointConnection properties that should be updated. Properties that are supplied will
     *     be updated, any property not supplied will be unchanged.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return contains information about a private link resource.
     */
    PrivateEndpointConnection update(
        String resourceGroupName,
        String accountName,
        String privateEndpointConnectionName,
        PrivateEndpointConnectionInner parameters);

    /**
     * Updates the properties of an existing private endpoint connection.
     *
     * @param resourceGroupName The name of the resource group that contains the Batch account.
     * @param accountName The name of the Batch account.
     * @param privateEndpointConnectionName The private endpoint connection name. This must be unique within the
     *     account.
     * @param parameters PrivateEndpointConnection properties that should be updated. Properties that are supplied will
     *     be updated, any property not supplied will be unchanged.
     * @param ifMatch The state (ETag) version of the private endpoint connection to update. This value can be omitted
     *     or set to "*" to apply the operation unconditionally.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return contains information about a private link resource.
     */
    PrivateEndpointConnection update(
        String resourceGroupName,
        String accountName,
        String privateEndpointConnectionName,
        PrivateEndpointConnectionInner parameters,
        String ifMatch,
        Context context);
}