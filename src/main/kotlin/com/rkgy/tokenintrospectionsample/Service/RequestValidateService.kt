package com.rkgy.tokenintrospectionsample.Service

import org.springframework.stereotype.Service

@Service
class RequestValidateService {

    private var responseMsg: String = ""

    fun valid(contentType: String, authorizationHeader: String, token: String, tokenTypeHint: String) : Boolean {
        if (!validateContentType(contentType) || !validateAuthorizationHeader(authorizationHeader)) {
            return false
        }
        return true
    }

    fun getResponseMsg() : String {
        return this.responseMsg
    }

    private fun validateContentType(contentType: String) : Boolean {
        if (!contentType.contains("application/x-www-form-urlencoded")) {
            this.responseMsg = "Content-Type $contentType not supported"
            return false
        }
        return true
    }

    private fun validateAuthorizationHeader(authorizationHeader: String) : Boolean {
        if (!authorizationHeader.contains(" ")) {
            this.responseMsg = "Authorization Header is invalid"
            return false
        }
        val (authorizationType, authorizationValue) = authorizationHeader.split(" ")

        if (authorizationType != "Basic" || authorizationValue.isEmpty()) {
            this.responseMsg = "Authorization Header is invalid"
            return false
        }
        return true
    }
}
