package com.rkgy.tokenintrospectionsample.Service

import com.google.gson.Gson
import com.rkgy.tokenintrospectionsample.Entity.Response
import com.rkgy.tokenintrospectionsample.Repository.TokenIntrospectionRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Service

@Service
class TokenIntroscpectionService @Autowired constructor(private val tokenIntrospectionRepository: TokenIntrospectionRepository) {

    fun fetchTokenInfo(token: String, tokenTypeHint: String) : ResponseEntity<String> {
        val tokenList = tokenIntrospectionRepository.select()
        tokenList.forEach{ token ->
            println(token.token)
            println(token.created_at)
            println(token.updated_at)
        }
        return ResponseEntity.ok(Gson().toJson(Response(true)))
    }
}
