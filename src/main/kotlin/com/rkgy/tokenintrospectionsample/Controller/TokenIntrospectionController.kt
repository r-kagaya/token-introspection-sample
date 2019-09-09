package com.rkgy.tokenintrospectionsample.Controller

import com.rkgy.tokenintrospectionsample.Service.ClientService
import com.rkgy.tokenintrospectionsample.Service.SpecificationService
import com.rkgy.tokenintrospectionsample.Service.TokenIntrospectionService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
class TokenIntrospectionController @Autowired constructor(
        private val tokenIntrospectionService: TokenIntrospectionService,
        private val specificationService: SpecificationService,
        private val clientService: ClientService) {

    @PostMapping("token/introspection")
    fun index(
            @RequestHeader(name = "Content-Type", required = true) contentType: String,
            @RequestHeader(name = "Authorization", required = true) authorizationHeader: String,
            @RequestParam(name = "token", required = true) token: String,
            @RequestParam(name = "tokenTypeHint", required = false) tokenTypeHint: String?): ResponseEntity<String> {

        specificationService.valid(contentType, authorizationHeader, token, tokenTypeHint ?: "")
        clientService.validClient(authorizationHeader)
        return tokenIntrospectionService.fetchTokenInfo(token = token, tokenTypeHint = tokenTypeHint ?: "")
    }
}
