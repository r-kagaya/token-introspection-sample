package com.rkgy.tokenintrospectionsample.Controller

import com.rkgy.tokenintrospectionsample.Service.RequestValidateService
import com.rkgy.tokenintrospectionsample.Service.TokenIntroscpectionService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
class TokenIntrospectionController @Autowired constructor(private val tokenIntroscpectionService: TokenIntroscpectionService, private val requestValidateService: RequestValidateService) {

    @PostMapping("token/introspection")
    fun index(
            @RequestHeader(name = "Content-Type", required = true) contentType: String,
            @RequestHeader(name = "Authorization", required = true) authorizationHeader: String,
            @RequestParam(name = "token") token: String, 
            @RequestParam(name = "tokenTypeHint", required = false) tokenTypeHint: String?): ResponseEntity<String> {
        
        if (!requestValidateService.valid(contentType, authorizationHeader, token, tokenTypeHint ?: "")) {
            return ResponseEntity.badRequest().body(requestValidateService.getResponseMsg())
        }
        return tokenIntroscpectionService.fetchTokenInfo(token = token, tokenTypeHint = tokenTypeHint ?: "")
    }
}
