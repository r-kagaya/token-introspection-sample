package com.rkgy.tokenintrospectionsample.Controller

import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping

@Controller("token/introspection")
class TokenIntrospectionController {

    @GetMapping
    fun index() : ResponseEntity<String> {
        return ResponseEntity.ok("Token Introscpection Sample")
    }
}
