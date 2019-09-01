package com.rkgy.tokenintrospectionsample.Service

import com.rkgy.tokenintrospectionsample.Entity.Client
import com.rkgy.tokenintrospectionsample.Exception.BadRequestException
import com.rkgy.tokenintrospectionsample.Repository.ClientRepository
import org.springframework.stereotype.Service
import java.util.*

@Service
class ClientService constructor(private val clientRepository: ClientRepository) {

    fun validClient(authorizationHeader: String) {
        val (_ , authorizationValue) = authorizationHeader.split(" ")
        val (clientId, secret) = Base64.getDecoder().decode(authorizationValue.toByteArray()).toString(Charsets.UTF_8).split(":")

        val client: Client? = clientRepository.fetch(clientId)
        client ?: throw BadRequestException("Invalid Client")
        if (client.getSecret() != secret) {
            throw BadRequestException("Invalid Client")
        }
    }
}
