package com.rkgy.tokenintrospectionsample.Entity

import java.sql.Date

class Client {
    private var clientId: String  = ""
    private var secret: String = ""

    fun getClientId() : String {
        return this.clientId
    }

    fun getSecret() : String {
        return this.secret
    }
}
