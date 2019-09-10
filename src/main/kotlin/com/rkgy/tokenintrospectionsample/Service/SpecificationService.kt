package com.rkgy.tokenintrospectionsample.Service

import com.rkgy.tokenintrospectionsample.Exception.BadRequestException
import com.rkgy.tokenintrospectionsample.Specification.AuthorizationHeaderSpecification
import com.rkgy.tokenintrospectionsample.Specification.ContentTypeSpecification
import com.rkgy.tokenintrospectionsample.Specification.TokenTypeSpecification
import org.springframework.stereotype.Service

@Service
class SpecificationService {

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
            throw BadRequestException("parameter is invalid")
        }
    }
}
