package com.rkgy.tokenintrospectionsample.Repository

import com.rkgy.tokenintrospectionsample.Entity.TokenInfo
import org.springframework.stereotype.Repository

@Repository
class TokenIntrospectionRepository {

    fun fetchTokenInfo() : TokenInfo {
        return TokenInfo()
    }
}
