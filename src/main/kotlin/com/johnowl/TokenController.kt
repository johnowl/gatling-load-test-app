package com.johnowl

import com.johnowl.dto.CreateTokenRequest
import com.johnowl.dto.TokenResource
import com.johnowl.dto.ValidateTokenRequest
import io.micronaut.http.HttpResponse
import io.micronaut.http.HttpStatus
import io.micronaut.http.annotation.Body
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Post
import io.micronaut.http.annotation.Status
import java.util.concurrent.TimeUnit

@Controller
class TokenController {

    @Post("/auth/v1/tokens")
    fun createToken(@Body createTokenRequest: CreateTokenRequest): TokenResource {
        return TokenResource(
            token = getRandomString(36),
            expires = System.currentTimeMillis() + TimeUnit.MINUTES.toMillis(20)
        )
    }

    @Post("/auth/v1/tokens/validate")
    fun validateToken(@Body validateTokenRequest: ValidateTokenRequest) : HttpResponse<Any> {
        return HttpResponse.ok()
    }

    private fun getRandomString(length: Int) : String {
        val allowedChars = ('A'..'Z') + ('a'..'z') + ('0'..'9')
        return (1..length)
            .map { allowedChars.random() }
            .joinToString("")
    }
}