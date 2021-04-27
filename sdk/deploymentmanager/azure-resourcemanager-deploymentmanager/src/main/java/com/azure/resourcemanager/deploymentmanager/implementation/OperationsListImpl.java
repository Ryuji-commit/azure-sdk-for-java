// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.deploymentmanager.implementation;

import com.azure.resourcemanager.deploymentmanager.fluent.models.OperationsListInner;
import com.azure.resourcemanager.deploymentmanager.models.Operation;
import com.azure.resourcemanager.deploymentmanager.models.OperationsList;

public final class OperationsListImpl implements OperationsList {
    private OperationsListInner innerObject;

    private final com.azure.resourcemanager.deploymentmanager.DeploymentManager serviceManager;

    OperationsListImpl(
        OperationsListInner innerObject, com.azure.resourcemanager.deploymentmanager.DeploymentManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public Operation value() {
        return this.innerModel().value();
    }

    public OperationsListInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.deploymentmanager.DeploymentManager manager() {
        return this.serviceManager;
    }
}