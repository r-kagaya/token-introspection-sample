package com.rkgy.tokenintrospectionsample.Specification

class ContentTypeSpecification : Specification {
    override fun isSatisfiedBy(param: Map<String, Any>) : Boolean {
        println("ContentTypeSpecification")
        return param["contentType"].toString() == ("application/x-www-form-urlencoded")
    }
}
