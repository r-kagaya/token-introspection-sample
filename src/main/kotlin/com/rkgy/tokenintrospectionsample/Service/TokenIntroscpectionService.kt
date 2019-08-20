package com.rkgy.tokenintrospectionsample.Service

import com.rkgy.tokenintrospectionsample.Repository.TokenIntrospectionRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Service

@Service
class TokenIntroscpectionService @Autowired constructor(private val tokenIntrospectionRepository: TokenIntrospectionRepository) {

    fun fetchTokenInfo() : ResponseEntity<String> {
        val tokenInfo = tokenIntrospectionRepository.fetchTokenInfo()
        return ResponseEntity.ok(tokenInfo.getJsonString())
    }
}
