@file:JvmName("EmptyHandler")

package com.courier.core.handlers

import com.courier.core.http.HttpResponse
import com.courier.core.http.HttpResponse.Handler

@JvmSynthetic internal fun emptyHandler(): Handler<Void?> = EmptyHandlerInternal

private object EmptyHandlerInternal : Handler<Void?> {
    override fun handle(response: HttpResponse): Void? = null
}
