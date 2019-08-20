package com.rkgy.tokenintrospectionsample.Controller

import com.rkgy.tokenintrospectionsample.Service.TokenIntroscpectionService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping

@Controller("token/introspection")
class TokenIntrospectionController @Autowired constructor(private val tokenIntroscpectionService: TokenIntroscpectionService) {

    @GetMapping
    fun index() : ResponseEntity<String> {
        return tokenIntroscpectionService.fetchTokenInfo()
    }
}
