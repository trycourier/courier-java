/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.courier.api.resources.users.tokens.types;

import com.fasterxml.jackson.annotation.JsonValue;

public enum TokenStatus {
    ACTIVE("active"),

    UNKNOWN("unknown"),

    FAILED("failed"),

    REVOKED("revoked");

    private final String value;

    TokenStatus(String value) {
        this.value = value;
    }

    @JsonValue
    @java.lang.Override
    public String toString() {
        return this.value;
    }
}
