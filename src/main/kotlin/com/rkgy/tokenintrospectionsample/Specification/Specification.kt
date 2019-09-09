package com.rkgy.tokenintrospectionsample.Specification

interface Specification {
    fun isSatisfiedBy(param: Map<String, Any>) : Boolean

    fun and(a: Specification) : Specification {
        return AndSpecification(this, a)
    }

    fun or(a: Specification) : Specification {
        return OrSpecification(this, a)
    }
}
