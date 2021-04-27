// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.vmwarecloudsimple.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.Resource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.vmwarecloudsimple.models.NodeStatus;
import com.azure.resourcemanager.vmwarecloudsimple.models.Sku;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;
import java.util.UUID;

/** Dedicated cloud node model. */
@JsonFlatten
@Fluent
public class DedicatedCloudNodeInner extends Resource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(DedicatedCloudNodeInner.class);

    /*
     * Dedicated Cloud Nodes SKU
     */
    @JsonProperty(value = "sku")
    private Sku sku;

    /*
     * Availability Zone id, e.g. "az1"
     */
    @JsonProperty(value = "properties.availabilityZoneId")
    private String availabilityZoneId;

    /*
     * Availability Zone name, e.g. "Availability Zone 1"
     */
    @JsonProperty(value = "properties.availabilityZoneName", access = JsonProperty.Access.WRITE_ONLY)
    private String availabilityZoneName;

    /*
     * VMWare Cloud Rack Name
     */
    @JsonProperty(value = "properties.cloudRackName", access = JsonProperty.Access.WRITE_ONLY)
    private String cloudRackName;

    /*
     * date time the resource was created
     */
    @JsonProperty(value = "properties.created", access = JsonProperty.Access.WRITE_ONLY)
    private Object created;

    /*
     * count of nodes to create
     */
    @JsonProperty(value = "properties.nodesCount")
    private Integer nodesCount;

    /*
     * Placement Group id, e.g. "n1"
     */
    @JsonProperty(value = "properties.placementGroupId")
    private String placementGroupId;

    /*
     * Placement Name, e.g. "Placement Group 1"
     */
    @JsonProperty(value = "properties.placementGroupName", access = JsonProperty.Access.WRITE_ONLY)
    private String placementGroupName;

    /*
     * Private Cloud Id
     */
    @JsonProperty(value = "properties.privateCloudId", access = JsonProperty.Access.WRITE_ONLY)
    private String privateCloudId;

    /*
     * Resource Pool Name
     */
    @JsonProperty(value = "properties.privateCloudName", access = JsonProperty.Access.WRITE_ONLY)
    private String privateCloudName;

    /*
     * The provisioning status of the resource
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningState;

    /*
     * purchase id
     */
    @JsonProperty(value = "properties.purchaseId")
    private UUID purchaseId;

    /*
     * Node status, indicates is private cloud set up on this node or not
     */
    @JsonProperty(value = "properties.status", access = JsonProperty.Access.WRITE_ONLY)
    private NodeStatus status;

    /*
     * VMWare Cluster Name
     */
    @JsonProperty(value = "properties.vmwareClusterName", access = JsonProperty.Access.WRITE_ONLY)
    private String vmwareClusterName;

    /*
     * SKU's id
     */
    @JsonProperty(value = "properties.skuDescription.id")
    private String idPropertiesSkuDescriptionId;

    /*
     * SKU's name
     */
    @JsonProperty(value = "properties.skuDescription.name")
    private String namePropertiesSkuDescriptionName;

    /**
     * Get the sku property: Dedicated Cloud Nodes SKU.
     *
     * @return the sku value.
     */
    public Sku sku() {
        return this.sku;
    }

    /**
     * Set the sku property: Dedicated Cloud Nodes SKU.
     *
     * @param sku the sku value to set.
     * @return the DedicatedCloudNodeInner object itself.
     */
    public DedicatedCloudNodeInner withSku(Sku sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get the availabilityZoneId property: Availability Zone id, e.g. "az1".
     *
     * @return the availabilityZoneId value.
     */
    public String availabilityZoneId() {
        return this.availabilityZoneId;
    }

    /**
     * Set the availabilityZoneId property: Availability Zone id, e.g. "az1".
     *
     * @param availabilityZoneId the availabilityZoneId value to set.
     * @return the DedicatedCloudNodeInner object itself.
     */
    public DedicatedCloudNodeInner withAvailabilityZoneId(String availabilityZoneId) {
        this.availabilityZoneId = availabilityZoneId;
        return this;
    }

    /**
     * Get the availabilityZoneName property: Availability Zone name, e.g. "Availability Zone 1".
     *
     * @return the availabilityZoneName value.
     */
    public String availabilityZoneName() {
        return this.availabilityZoneName;
    }

    /**
     * Get the cloudRackName property: VMWare Cloud Rack Name.
     *
     * @return the cloudRackName value.
     */
    public String cloudRackName() {
        return this.cloudRackName;
    }

    /**
     * Get the created property: date time the resource was created.
     *
     * @return the created value.
     */
    public Object created() {
        return this.created;
    }

    /**
     * Get the nodesCount property: count of nodes to create.
     *
     * @return the nodesCount value.
     */
    public Integer nodesCount() {
        return this.nodesCount;
    }

    /**
     * Set the nodesCount property: count of nodes to create.
     *
     * @param nodesCount the nodesCount value to set.
     * @return the DedicatedCloudNodeInner object itself.
     */
    public DedicatedCloudNodeInner withNodesCount(Integer nodesCount) {
        this.nodesCount = nodesCount;
        return this;
    }

    /**
     * Get the placementGroupId property: Placement Group id, e.g. "n1".
     *
     * @return the placementGroupId value.
     */
    public String placementGroupId() {
        return this.placementGroupId;
    }

    /**
     * Set the placementGroupId property: Placement Group id, e.g. "n1".
     *
     * @param placementGroupId the placementGroupId value to set.
     * @return the DedicatedCloudNodeInner object itself.
     */
    public DedicatedCloudNodeInner withPlacementGroupId(String placementGroupId) {
        this.placementGroupId = placementGroupId;
        return this;
    }

    /**
     * Get the placementGroupName property: Placement Name, e.g. "Placement Group 1".
     *
     * @return the placementGroupName value.
     */
    public String placementGroupName() {
        return this.placementGroupName;
    }

    /**
     * Get the privateCloudId property: Private Cloud Id.
     *
     * @return the privateCloudId value.
     */
    public String privateCloudId() {
        return this.privateCloudId;
    }

    /**
     * Get the privateCloudName property: Resource Pool Name.
     *
     * @return the privateCloudName value.
     */
    public String privateCloudName() {
        return this.privateCloudName;
    }

    /**
     * Get the provisioningState property: The provisioning status of the resource.
     *
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the purchaseId property: purchase id.
     *
     * @return the purchaseId value.
     */
    public UUID purchaseId() {
        return this.purchaseId;
    }

    /**
     * Set the purchaseId property: purchase id.
     *
     * @param purchaseId the purchaseId value to set.
     * @return the DedicatedCloudNodeInner object itself.
     */
    public DedicatedCloudNodeInner withPurchaseId(UUID purchaseId) {
        this.purchaseId = purchaseId;
        return this;
    }

    /**
     * Get the status property: Node status, indicates is private cloud set up on this node or not.
     *
     * @return the status value.
     */
    public NodeStatus status() {
        return this.status;
    }

    /**
     * Get the vmwareClusterName property: VMWare Cluster Name.
     *
     * @return the vmwareClusterName value.
     */
    public String vmwareClusterName() {
        return this.vmwareClusterName;
    }

    /**
     * Get the idPropertiesSkuDescriptionId property: SKU's id.
     *
     * @return the idPropertiesSkuDescriptionId value.
     */
    public String idPropertiesSkuDescriptionId() {
        return this.idPropertiesSkuDescriptionId;
    }

    /**
     * Set the idPropertiesSkuDescriptionId property: SKU's id.
     *
     * @param idPropertiesSkuDescriptionId the idPropertiesSkuDescriptionId value to set.
     * @return the DedicatedCloudNodeInner object itself.
     */
    public DedicatedCloudNodeInner withIdPropertiesSkuDescriptionId(String idPropertiesSkuDescriptionId) {
        this.idPropertiesSkuDescriptionId = idPropertiesSkuDescriptionId;
        return this;
    }

    /**
     * Get the namePropertiesSkuDescriptionName property: SKU's name.
     *
     * @return the namePropertiesSkuDescriptionName value.
     */
    public String namePropertiesSkuDescriptionName() {
        return this.namePropertiesSkuDescriptionName;
    }

    /**
     * Set the namePropertiesSkuDescriptionName property: SKU's name.
     *
     * @param namePropertiesSkuDescriptionName the namePropertiesSkuDescriptionName value to set.
     * @return the DedicatedCloudNodeInner object itself.
     */
    public DedicatedCloudNodeInner withNamePropertiesSkuDescriptionName(String namePropertiesSkuDescriptionName) {
        this.namePropertiesSkuDescriptionName = namePropertiesSkuDescriptionName;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DedicatedCloudNodeInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DedicatedCloudNodeInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (sku() != null) {
            sku().validate();
        }
    }
}