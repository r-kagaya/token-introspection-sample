package com.rkgy.tokenintrospectionsample.Exception

import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.ResponseStatus
import java.lang.Exception

@ResponseStatus(HttpStatus.BAD_REQUEST)
class BadRequestException constructor(errorMessage: String) : Exception(errorMessage)
