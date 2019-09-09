package com.rkgy.tokenintrospectionsample.Specification

class TokenTypeSpecification : Specification {

    override fun isSatisfiedBy(param: Map<String, Any>) : Boolean {
        println("TokenTypeSpecification")
        val tokenTypeList : List<String> = listOf("access_token", "refresh_token")
        return tokenTypeList.contains(param["tokenTypeHint"].toString())
    }
}
