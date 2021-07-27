package com.example.sleuthlettucepropagationtest

import org.springframework.data.redis.core.ReactiveStringRedisTemplate
import org.springframework.data.redis.core.getAndAwait
import org.springframework.data.redis.core.setAndAwait
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping
class PingPongController (
    private val reactiveStringRedisTemplate: ReactiveStringRedisTemplate
) {
    @GetMapping("/ping")
    suspend fun ping(): String? {
        reactiveStringRedisTemplate.opsForValue().setAndAwait("ping", "pong")
        reactiveStringRedisTemplate.opsForValue().getAndAwait("ping")
        return reactiveStringRedisTemplate.opsForValue().getAndAwait("ping")
    }
}
