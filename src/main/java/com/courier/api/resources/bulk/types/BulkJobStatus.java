/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.courier.api.resources.bulk.types;

import com.fasterxml.jackson.annotation.JsonValue;

public enum BulkJobStatus {
    CREATED("CREATED"),

    PROCESSING("PROCESSING"),

    COMPLETED("COMPLETED"),

    ERROR("ERROR");

    private final String value;

    BulkJobStatus(String value) {
        this.value = value;
    }

    @JsonValue
    @java.lang.Override
    public String toString() {
        return this.value;
    }
}
