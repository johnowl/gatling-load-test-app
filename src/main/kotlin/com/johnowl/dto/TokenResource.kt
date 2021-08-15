package com.johnowl.dto

import io.micronaut.core.annotation.Introspected

@Introspected
data class TokenResource(
    val token: String,
    val expires: Long
)