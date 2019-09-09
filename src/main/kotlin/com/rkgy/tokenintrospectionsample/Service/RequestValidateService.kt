package com.rkgy.tokenintrospectionsample.Service

import com.rkgy.tokenintrospectionsample.Exception.BadRequestException
import com.rkgy.tokenintrospectionsample.Specification.AuthorizationHeaderSpecification
import com.rkgy.tokenintrospectionsample.Specification.ContentTypeSpecification
import com.rkgy.tokenintrospectionsample.Specification.TokenTypeSpecification
import org.springframework.stereotype.Service

@Service
class RequestValidateService {

    fun valid(contentType: String, authorizationHeader: String, token: String, tokenTypeHint: String) {
        val param: Map<String, Any> = mapOf(
            "authorizationHeader" to authorizationHeader,
            "tokenTypeHint" to tokenTypeHint,
            "contentType" to contentType
        )
        val spec = AuthorizationHeaderSpecification()
                .and(TokenTypeSpecification())
                .and(ContentTypeSpecification())

        if (!spec.isSatisfiedBy(param)) {
            throw BadRequestException("invalid request")
        }
    }
    
    private fun validateContentType(contentType: String) {
        if (!contentType.contains("application/x-www-form-urlencoded")) {
            throw BadRequestException("Content-Type $contentType not supported")
        }
    }
}
