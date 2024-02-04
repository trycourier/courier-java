/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.courier.api.core;

import java.util.HashMap;
import java.util.Map;

public final class IdempotentRequestOptions {
    private final String authorizationToken;

    private final String idempotencyKey;

    private final String idempotencyExpiry;

    private IdempotentRequestOptions(String authorizationToken, String idempotencyKey, String idempotencyExpiry) {
        this.authorizationToken = authorizationToken;
        this.idempotencyKey = idempotencyKey;
        this.idempotencyExpiry = idempotencyExpiry;
    }

    public Map<String, String> getHeaders() {
        Map<String, String> headers = new HashMap<>();
        if (this.authorizationToken != null) {
            headers.put("Authorization", "Bearer " + this.authorizationToken);
        }
        if (this.idempotencyKey != null) {
            headers.put("Idempotency-Key", this.idempotencyKey);
        }
        if (this.idempotencyExpiry != null) {
            headers.put("X-Idempotency-Expiration", this.idempotencyExpiry);
        }
        return headers;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static final class Builder {
        private String authorizationToken = null;

        private String idempotencyKey = null;

        private String idempotencyExpiry = null;

        public Builder authorizationToken(String authorizationToken) {
            this.authorizationToken = authorizationToken;
            return this;
        }

        public Builder idempotencyKey(String idempotencyKey) {
            this.idempotencyKey = idempotencyKey;
            return this;
        }

        public Builder idempotencyExpiry(String idempotencyExpiry) {
            this.idempotencyExpiry = idempotencyExpiry;
            return this;
        }

        public IdempotentRequestOptions build() {
            return new IdempotentRequestOptions(authorizationToken, idempotencyKey, idempotencyExpiry);
        }
    }
}