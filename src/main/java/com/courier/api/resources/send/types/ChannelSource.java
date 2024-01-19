/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.courier.api.resources.send.types;

import com.fasterxml.jackson.annotation.JsonValue;

public enum ChannelSource {
    SUBSCRIPTION("subscription"),

    LIST("list"),

    RECIPIENT("recipient");

    private final String value;

    ChannelSource(String value) {
        this.value = value;
    }

    @JsonValue
    @java.lang.Override
    public String toString() {
        return this.value;
    }
}
