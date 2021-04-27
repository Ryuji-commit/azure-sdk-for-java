// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.applicationinsights.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/** The parameters that can be provided when updating workbook properties properties. */
@JsonFlatten
@Fluent
public class WorkbookUpdateParameters {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(WorkbookUpdateParameters.class);

    /*
     * The kind of workbook. Choices are user and shared.
     */
    @JsonProperty(value = "kind")
    private SharedTypeKind kind;

    /*
     * Resource tags
     */
    @JsonProperty(value = "tags")
    private Map<String, String> tags;

    /*
     * The user-defined name (display name) of the workbook.
     */
    @JsonProperty(value = "properties.displayName")
    private String displayName;

    /*
     * Configuration of this particular workbook. Configuration data is a
     * string containing valid JSON
     */
    @JsonProperty(value = "properties.serializedData")
    private String serializedData;

    /*
     * Workbook category, as defined by the user at creation time.
     */
    @JsonProperty(value = "properties.category")
    private String category;

    /*
     * A list of 0 or more tags that are associated with this workbook
     * definition
     */
    @JsonProperty(value = "properties.tags")
    private List<String> tagsPropertiesTags;

    /**
     * Get the kind property: The kind of workbook. Choices are user and shared.
     *
     * @return the kind value.
     */
    public SharedTypeKind kind() {
        return this.kind;
    }

    /**
     * Set the kind property: The kind of workbook. Choices are user and shared.
     *
     * @param kind the kind value to set.
     * @return the WorkbookUpdateParameters object itself.
     */
    public WorkbookUpdateParameters withKind(SharedTypeKind kind) {
        this.kind = kind;
        return this;
    }

    /**
     * Get the tags property: Resource tags.
     *
     * @return the tags value.
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set the tags property: Resource tags.
     *
     * @param tags the tags value to set.
     * @return the WorkbookUpdateParameters object itself.
     */
    public WorkbookUpdateParameters withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get the displayName property: The user-defined name (display name) of the workbook.
     *
     * @return the displayName value.
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the displayName property: The user-defined name (display name) of the workbook.
     *
     * @param displayName the displayName value to set.
     * @return the WorkbookUpdateParameters object itself.
     */
    public WorkbookUpdateParameters withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the serializedData property: Configuration of this particular workbook. Configuration data is a string
     * containing valid JSON.
     *
     * @return the serializedData value.
     */
    public String serializedData() {
        return this.serializedData;
    }

    /**
     * Set the serializedData property: Configuration of this particular workbook. Configuration data is a string
     * containing valid JSON.
     *
     * @param serializedData the serializedData value to set.
     * @return the WorkbookUpdateParameters object itself.
     */
    public WorkbookUpdateParameters withSerializedData(String serializedData) {
        this.serializedData = serializedData;
        return this;
    }

    /**
     * Get the category property: Workbook category, as defined by the user at creation time.
     *
     * @return the category value.
     */
    public String category() {
        return this.category;
    }

    /**
     * Set the category property: Workbook category, as defined by the user at creation time.
     *
     * @param category the category value to set.
     * @return the WorkbookUpdateParameters object itself.
     */
    public WorkbookUpdateParameters withCategory(String category) {
        this.category = category;
        return this;
    }

    /**
     * Get the tagsPropertiesTags property: A list of 0 or more tags that are associated with this workbook definition.
     *
     * @return the tagsPropertiesTags value.
     */
    public List<String> tagsPropertiesTags() {
        return this.tagsPropertiesTags;
    }

    /**
     * Set the tagsPropertiesTags property: A list of 0 or more tags that are associated with this workbook definition.
     *
     * @param tagsPropertiesTags the tagsPropertiesTags value to set.
     * @return the WorkbookUpdateParameters object itself.
     */
    public WorkbookUpdateParameters withTagsPropertiesTags(List<String> tagsPropertiesTags) {
        this.tagsPropertiesTags = tagsPropertiesTags;
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