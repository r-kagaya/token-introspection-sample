package com.rkgy.tokenintrospectionsample.Service

import com.rkgy.tokenintrospectionsample.Exception.BadRequestException
import org.springframework.stereotype.Service

@Service
class RequestValidateService {

    fun valid(contentType: String, authorizationHeader: String, token: String, tokenTypeHint: String) {
        validateContentType(contentType)
        validateAuthorizationHeader(authorizationHeader)
    }
    
    private fun validateContentType(contentType: String) {
        if (!contentType.contains("application/x-www-form-urlencoded")) {
            throw BadRequestException("Content-Type $contentType not supported")
        }
    }

    private fun validateAuthorizationHeader(authorizationHeader: String) {
        if (!authorizationHeader.contains(" ")) {
            throw BadRequestException("Authorization Header is invalid")
        }
        val (authorizationType, authorizationValue) = authorizationHeader.split(" ")

        if (authorizationType != "Basic" || authorizationValue.isEmpty()) {
            throw BadRequestException("Authorization Header is invalid")
        }
    }
}
