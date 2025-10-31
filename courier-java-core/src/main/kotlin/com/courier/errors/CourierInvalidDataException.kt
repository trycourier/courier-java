package com.courier.errors

class CourierInvalidDataException
@JvmOverloads
constructor(message: String? = null, cause: Throwable? = null) : CourierException(message, cause)
