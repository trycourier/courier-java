package com.courier.api.errors

class CourierInvalidDataException
@JvmOverloads
constructor(message: String? = null, cause: Throwable? = null) : CourierException(message, cause)
