package com.rkgy.tokenintrospectionsample.Entity

import java.sql.Date

class AccessToken {
    private var token: String = ""
    private var expire: String = ""
    private var scope: String = ""
    private var created_at: Date? = null
    private var updated_at: Date? = null

    fun isExepired() : Boolean {
        return expire.toLong() < System.currentTimeMillis() / 1000
    }

    fun getToken(): String {
        return this.token
    }

    fun getScope(): String {
        return this.scope.replace(",", " ")
    }
}
