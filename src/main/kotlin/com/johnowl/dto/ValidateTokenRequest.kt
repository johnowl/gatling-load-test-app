package com.johnowl.dto

import io.micronaut.core.annotation.Introspected

@Introspected
data class ValidateTokenRequest(
    val token: String
)