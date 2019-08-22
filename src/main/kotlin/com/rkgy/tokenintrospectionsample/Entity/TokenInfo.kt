package com.rkgy.tokenintrospectionsample.Entity

class TokenInfo {

    private var token: String

    constructor(token: String) {
        this.token = token
    }

    fun getJsonString() : String {
        return "Token Introscpection Sample. token: " + this.token
    }
}
