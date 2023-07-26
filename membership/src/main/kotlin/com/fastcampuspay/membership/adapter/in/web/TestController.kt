package com.fastcampuspay.membership.adapter.`in`.web

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class TestController {

    @GetMapping("/test")
    fun test() {
        println("Hello World!")
    }
}