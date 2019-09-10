package com.rkgy.tokenintrospectionsample.Exception

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity

class ErrorResponse(val error: String, val error_description: String) {
    companion object {
        fun createResponse(e: BadRequestException): ResponseEntity<ErrorResponse> {
            val message = "invalid request"
            val description = e.errorMessage
            return ResponseEntity(ErrorResponse(message, description), HttpStatus.BAD_REQUEST)
        }
    }
}


