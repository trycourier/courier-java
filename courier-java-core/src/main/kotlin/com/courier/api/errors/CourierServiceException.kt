// File generated from our OpenAPI spec by Stainless.

package com.courier.api.errors

import com.courier.api.core.JsonValue
import com.courier.api.core.http.Headers

abstract class CourierServiceException
protected constructor(message: String, cause: Throwable? = null) :
    CourierException(message, cause) {

    abstract fun statusCode(): Int

    abstract fun headers(): Headers

    abstract fun body(): JsonValue
}
