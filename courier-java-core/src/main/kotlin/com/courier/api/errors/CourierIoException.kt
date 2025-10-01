package com.courier.api.errors

class CourierIoException
@JvmOverloads
constructor(message: String? = null, cause: Throwable? = null) : CourierException(message, cause)
