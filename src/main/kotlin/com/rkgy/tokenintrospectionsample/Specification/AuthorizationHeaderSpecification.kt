package com.rkgy.tokenintrospectionsample.Specification

class AuthorizationHeaderSpecification : Specification {

    override fun isSatisfiedBy(param: Map<String, Any>) : Boolean {
        println("AuthorizationHeaderSpecification")

        val authorizationHeader = param["authorizationHeader"].toString()

        if (!authorizationHeader.contains(" ")) {
            return false
        }

        val (authorizationType, authorizationValue) = authorizationHeader.split(" ")
        return !authorizationValue.isEmpty() && authorizationType == "Basic"
    }
}
