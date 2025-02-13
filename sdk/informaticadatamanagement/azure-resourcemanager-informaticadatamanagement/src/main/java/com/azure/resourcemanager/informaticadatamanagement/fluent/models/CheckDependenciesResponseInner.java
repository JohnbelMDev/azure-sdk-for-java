// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.informaticadatamanagement.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.informaticadatamanagement.models.ServerlessRuntimeDependency;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Model for the check dependencies API for an informatica serverless runtime resource.
 */
@Immutable
public final class CheckDependenciesResponseInner {
    /*
     * Count of dependencies
     */
    @JsonProperty(value = "count", required = true)
    private int count;

    /*
     * id of resource
     */
    @JsonProperty(value = "id", required = true)
    private String id;

    /*
     * List of dependencies
     */
    @JsonProperty(value = "references", required = true)
    private List<ServerlessRuntimeDependency> references;

    /**
     * Creates an instance of CheckDependenciesResponseInner class.
     */
    private CheckDependenciesResponseInner() {
    }

    /**
     * Get the count property: Count of dependencies.
     * 
     * @return the count value.
     */
    public int count() {
        return this.count;
    }

    /**
     * Get the id property: id of resource.
     * 
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Get the references property: List of dependencies.
     * 
     * @return the references value.
     */
    public List<ServerlessRuntimeDependency> references() {
        return this.references;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (id() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property id in model CheckDependenciesResponseInner"));
        }
        if (references() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property references in model CheckDependenciesResponseInner"));
        } else {
            references().forEach(e -> e.validate());
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(CheckDependenciesResponseInner.class);
}
