package com.rkgy.tokenintrospectionsample.Entity

import java.sql.Date

class AccessToken {
    var token: String = ""
    var expire: String = ""
    var created_at: Date? = null
    var updated_at: Date? = null

    fun isExepired() : Boolean {
        return expire.toLong() < System.currentTimeMillis() / 1000
    }
}
