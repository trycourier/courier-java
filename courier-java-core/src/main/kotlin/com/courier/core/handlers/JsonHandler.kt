@file:JvmName("JsonHandler")

package com.courier.core.handlers

import com.courier.core.http.HttpResponse
import com.courier.core.http.HttpResponse.Handler
import com.courier.errors.CourierInvalidDataException
import com.fasterxml.jackson.databind.json.JsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef

@JvmSynthetic
internal inline fun <reified T> jsonHandler(jsonMapper: JsonMapper): Handler<T> =
    object : Handler<T> {
        override fun handle(response: HttpResponse): T =
            try {
                jsonMapper.readValue(response.body(), jacksonTypeRef())
            } catch (e: Exception) {
                throw CourierInvalidDataException("Error reading response", e)
            }
    }
