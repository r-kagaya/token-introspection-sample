package com.rkgy.tokenintrospectionsample.Controller.Response

data class Response constructor(private val isActive: Boolean, private val scope: List<String>?)
