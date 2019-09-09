package com.rkgy.tokenintrospectionsample.Specification

class AndSpecification constructor(
        private val a: Specification,
        private val b: Specification): Specification {

    override fun isSatisfiedBy(param: Map<String, Any>): Boolean {
        println("AndSpecification")
        return this.a.isSatisfiedBy(param) && this.b.isSatisfiedBy(param)
    }
}
