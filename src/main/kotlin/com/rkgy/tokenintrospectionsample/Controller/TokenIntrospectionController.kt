package com.rkgy.tokenintrospectionsample.Controller

import com.rkgy.tokenintrospectionsample.Service.TokenIntroscpectionService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.*

@RestController
class TokenIntrospectionController @Autowired constructor(private val tokenIntroscpectionService: TokenIntroscpectionService) {

    @PostMapping("token/introspection")
    fun index(@RequestHeader(name = "Content-Type", required = true) contentType: String, @RequestParam(name = "token") token: String, @RequestParam(name = "token" +
            "TypeHint", required = false) tokenTypeHint: String) : ResponseEntity<String> {
        if (!contentType.contains("application/x-www-form-urlencoded")) {
            return ResponseEntity.badRequest().body("Content-Type " + contentType + " not supported")
        }
        return tokenIntroscpectionService.fetchTokenInfo(token = token, tokenTypeHint = tokenTypeHint)
    }
}
