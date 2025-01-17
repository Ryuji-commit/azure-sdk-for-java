// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Details of the data lake storage account associated with the workspace. */
@Fluent
public final class DataLakeStorageAccountDetails {
    /*
     * Account URL
     */
    @JsonProperty(value = "accountUrl")
    private String accountUrl;

    /*
     * Filesystem name
     */
    @JsonProperty(value = "filesystem")
    private String filesystem;

    /*
     * ARM resource Id of this storage account
     */
    @JsonProperty(value = "resourceId")
    private String resourceId;

    /*
     * Create managed private endpoint to this storage account or not
     */
    @JsonProperty(value = "createManagedPrivateEndpoint")
    private Boolean createManagedPrivateEndpoint;

    /**
     * Get the accountUrl property: Account URL.
     *
     * @return the accountUrl value.
     */
    public String accountUrl() {
        return this.accountUrl;
    }

    /**
     * Set the accountUrl property: Account URL.
     *
     * @param accountUrl the accountUrl value to set.
     * @return the DataLakeStorageAccountDetails object itself.
     */
    public DataLakeStorageAccountDetails withAccountUrl(String accountUrl) {
        this.accountUrl = accountUrl;
        return this;
    }

    /**
     * Get the filesystem property: Filesystem name.
     *
     * @return the filesystem value.
     */
    public String filesystem() {
        return this.filesystem;
    }

    /**
     * Set the filesystem property: Filesystem name.
     *
     * @param filesystem the filesystem value to set.
     * @return the DataLakeStorageAccountDetails object itself.
     */
    public DataLakeStorageAccountDetails withFilesystem(String filesystem) {
        this.filesystem = filesystem;
        return this;
    }

    /**
     * Get the resourceId property: ARM resource Id of this storage account.
     *
     * @return the resourceId value.
     */
    public String resourceId() {
        return this.resourceId;
    }

    /**
     * Set the resourceId property: ARM resource Id of this storage account.
     *
     * @param resourceId the resourceId value to set.
     * @return the DataLakeStorageAccountDetails object itself.
     */
    public DataLakeStorageAccountDetails withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * Get the createManagedPrivateEndpoint property: Create managed private endpoint to this storage account or not.
     *
     * @return the createManagedPrivateEndpoint value.
     */
    public Boolean createManagedPrivateEndpoint() {
        return this.createManagedPrivateEndpoint;
    }

    /**
     * Set the createManagedPrivateEndpoint property: Create managed private endpoint to this storage account or not.
     *
     * @param createManagedPrivateEndpoint the createManagedPrivateEndpoint value to set.
     * @return the DataLakeStorageAccountDetails object itself.
     */
    public DataLakeStorageAccountDetails withCreateManagedPrivateEndpoint(Boolean createManagedPrivateEndpoint) {
        this.createManagedPrivateEndpoint = createManagedPrivateEndpoint;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
