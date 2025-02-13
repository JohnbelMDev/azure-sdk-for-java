// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** A copy activity ServiceNowV2 server source. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("ServiceNowV2Source")
@Fluent
public final class ServiceNowV2Source extends TabularSource {
    /*
     * Expression to filter data from source.
     */
    @JsonProperty(value = "expression")
    private ExpressionV2 expression;

    /** Creates an instance of ServiceNowV2Source class. */
    public ServiceNowV2Source() {}

    /**
     * Get the expression property: Expression to filter data from source.
     *
     * @return the expression value.
     */
    public ExpressionV2 getExpression() {
        return this.expression;
    }

    /**
     * Set the expression property: Expression to filter data from source.
     *
     * @param expression the expression value to set.
     * @return the ServiceNowV2Source object itself.
     */
    public ServiceNowV2Source setExpression(ExpressionV2 expression) {
        this.expression = expression;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ServiceNowV2Source setQueryTimeout(Object queryTimeout) {
        super.setQueryTimeout(queryTimeout);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ServiceNowV2Source setAdditionalColumns(Object additionalColumns) {
        super.setAdditionalColumns(additionalColumns);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ServiceNowV2Source setSourceRetryCount(Object sourceRetryCount) {
        super.setSourceRetryCount(sourceRetryCount);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ServiceNowV2Source setSourceRetryWait(Object sourceRetryWait) {
        super.setSourceRetryWait(sourceRetryWait);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ServiceNowV2Source setMaxConcurrentConnections(Object maxConcurrentConnections) {
        super.setMaxConcurrentConnections(maxConcurrentConnections);
        return this;
    }
}
