package com.rkgy.tokenintrospectionsample.Exception

import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.ResponseStatus

@ResponseStatus(HttpStatus.BAD_REQUEST)
class BadRequestException(var errorMessage: String) : Exception() {
    fun BadRequestException(errorMessage: String) {
        this.errorMessage = errorMessage
    }
}
