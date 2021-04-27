// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.notificationhubs.models;

import com.azure.resourcemanager.notificationhubs.fluent.models.DebugSendResponseInner;
import java.util.Map;

/** An immutable client-side representation of DebugSendResponse. */
public interface DebugSendResponse {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     *
     * @return the type value.
     */
    String type();

    /**
     * Gets the location property: The geo-location where the resource lives.
     *
     * @return the location value.
     */
    String location();

    /**
     * Gets the tags property: Resource tags.
     *
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * Gets the success property: successful send.
     *
     * @return the success value.
     */
    Float success();

    /**
     * Gets the failure property: send failure.
     *
     * @return the failure value.
     */
    Float failure();

    /**
     * Gets the results property: actual failure description.
     *
     * @return the results value.
     */
    Object results();

    /**
     * Gets the sku property: The sku of the created namespace.
     *
     * @return the sku value.
     */
    Sku sku();

    /**
     * Gets the inner com.azure.resourcemanager.notificationhubs.fluent.models.DebugSendResponseInner object.
     *
     * @return the inner object.
     */
    DebugSendResponseInner innerModel();
}