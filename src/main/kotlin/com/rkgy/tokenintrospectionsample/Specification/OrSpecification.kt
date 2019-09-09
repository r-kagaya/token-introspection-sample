package com.rkgy.tokenintrospectionsample.Specification

class OrSpecification constructor(
        private val a: Specification,
        private val b: Specification): Specification {

    override fun isSatisfiedBy(param: Map<String, Any>): Boolean {
        return this.a.isSatisfiedBy(param) || this.b.isSatisfiedBy(param)
    }
}
