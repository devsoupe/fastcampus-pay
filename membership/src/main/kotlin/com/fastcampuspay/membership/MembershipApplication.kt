package com.fastcampuspay.membership

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration
import org.springframework.boot.runApplication

@SpringBootApplication(exclude = [DataSourceAutoConfiguration::class])
class MembershipApplication

fun main(args: Array<String>) {
	runApplication<MembershipApplication>(*args)
}
