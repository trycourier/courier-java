// File generated from our OpenAPI spec by Stainless.

package com.courier.errors

import com.courier.core.JsonValue
import com.courier.core.http.Headers

abstract class CourierServiceException
protected constructor(message: String, cause: Throwable? = null) :
    CourierException(message, cause) {

    abstract fun statusCode(): Int

    abstract fun headers(): Headers

    abstract fun body(): JsonValue
}
