/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.courier.api;

import com.courier.api.core.ClientOptions;
import com.courier.api.core.Environment;

public final class CourierBuilder {
    private ClientOptions.Builder clientOptionsBuilder = ClientOptions.builder();

    private String authorizationToken = System.getenv("COURIER_AUTH_TOKEN");

    private Environment environment = Environment.PRODUCTION;

    /**
     * Sets authorizationToken.
     * Defaults to the COURIER_AUTH_TOKEN environment variable.
     */
    public CourierBuilder authorizationToken(String authorizationToken) {
        this.authorizationToken = authorizationToken;
        return this;
    }

    public CourierBuilder environment(Environment environment) {
        this.environment = environment;
        return this;
    }

    public CourierBuilder url(String url) {
        this.environment = Environment.custom(url);
        return this;
    }

    public Courier build() {
        if (authorizationToken == null) {
            throw new RuntimeException(
                    "Please provide authorizationToken or set the COURIER_AUTH_TOKEN environment variable.");
        }
        this.clientOptionsBuilder.addHeader("Authorization", "Bearer " + this.authorizationToken);
        clientOptionsBuilder.environment(this.environment);
        return new Courier(clientOptionsBuilder.build());
    }
}
