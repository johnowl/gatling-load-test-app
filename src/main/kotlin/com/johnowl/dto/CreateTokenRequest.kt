package com.johnowl.dto

import com.fasterxml.jackson.annotation.JsonProperty
import io.micronaut.core.annotation.Introspected

@Introspected
data class CreateTokenRequest(
    @field:JsonProperty("client_id")
    val clientId: String,
    @field:JsonProperty("client_secret")
    val clientSecret: String,
)
