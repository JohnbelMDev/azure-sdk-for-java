// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.informaticadatamanagement.implementation.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.informaticadatamanagement.fluent.models.InformaticaServerlessRuntimeResourceInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * The response of a InformaticaServerlessRuntimeResource list operation.
 */
@Immutable
public final class InformaticaServerlessRuntimeResourceListResult {
    /*
     * The InformaticaServerlessRuntimeResource items on this page
     */
    @JsonProperty(value = "value", required = true)
    private List<InformaticaServerlessRuntimeResourceInner> value;

    /*
     * The link to the next page of items
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Creates an instance of InformaticaServerlessRuntimeResourceListResult class.
     */
    private InformaticaServerlessRuntimeResourceListResult() {
    }

    /**
     * Get the value property: The InformaticaServerlessRuntimeResource items on this page.
     * 
     * @return the value value.
     */
    public List<InformaticaServerlessRuntimeResourceInner> value() {
        return this.value;
    }

    /**
     * Get the nextLink property: The link to the next page of items.
     * 
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property value in model InformaticaServerlessRuntimeResourceListResult"));
        } else {
            value().forEach(e -> e.validate());
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(InformaticaServerlessRuntimeResourceListResult.class);
}
