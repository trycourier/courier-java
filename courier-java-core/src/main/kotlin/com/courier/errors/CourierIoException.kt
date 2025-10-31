package com.courier.errors

class CourierIoException
@JvmOverloads
constructor(message: String? = null, cause: Throwable? = null) : CourierException(message, cause)
