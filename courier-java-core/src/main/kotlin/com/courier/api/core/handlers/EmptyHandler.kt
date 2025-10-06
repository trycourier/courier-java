@file:JvmName("EmptyHandler")

package com.courier.api.core.handlers

import com.courier.api.core.http.HttpResponse
import com.courier.api.core.http.HttpResponse.Handler

@JvmSynthetic internal fun emptyHandler(): Handler<Void?> = EmptyHandlerInternal

private object EmptyHandlerInternal : Handler<Void?> {
    override fun handle(response: HttpResponse): Void? = null
}
