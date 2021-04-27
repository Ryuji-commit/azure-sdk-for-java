// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.timeseriesinsights.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** An object that represents a set of mutable IoTHub event source resource properties. */
@Fluent
public final class IoTHubEventSourceMutableProperties extends EventSourceMutableProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(IoTHubEventSourceMutableProperties.class);

    /*
     * The value of the shared access key that grants the Time Series Insights
     * service read access to the iot hub. This property is not shown in event
     * source responses.
     */
    @JsonProperty(value = "sharedAccessKey")
    private String sharedAccessKey;

    /**
     * Get the sharedAccessKey property: The value of the shared access key that grants the Time Series Insights service
     * read access to the iot hub. This property is not shown in event source responses.
     *
     * @return the sharedAccessKey value.
     */
    public String sharedAccessKey() {
        return this.sharedAccessKey;
    }

    /**
     * Set the sharedAccessKey property: The value of the shared access key that grants the Time Series Insights service
     * read access to the iot hub. This property is not shown in event source responses.
     *
     * @param sharedAccessKey the sharedAccessKey value to set.
     * @return the IoTHubEventSourceMutableProperties object itself.
     */
    public IoTHubEventSourceMutableProperties withSharedAccessKey(String sharedAccessKey) {
        this.sharedAccessKey = sharedAccessKey;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public IoTHubEventSourceMutableProperties withTimestampPropertyName(String timestampPropertyName) {
        super.withTimestampPropertyName(timestampPropertyName);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public IoTHubEventSourceMutableProperties withLocalTimestamp(LocalTimestamp localTimestamp) {
        super.withLocalTimestamp(localTimestamp);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}