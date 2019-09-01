package com.rkgy.tokenintrospectionsample.Repository

import com.rkgy.tokenintrospectionsample.Entity.Client
import org.apache.ibatis.annotations.Mapper
import org.apache.ibatis.annotations.Param
import org.apache.ibatis.annotations.Select

@Mapper
interface ClientRepository {
    @Select("SELECT * FROM Client WHERE clientId = (#{clientId});")
    fun fetch(@Param("clientId") clientId: String) : Client
}
