package com.example.fastcampuspay

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration
import org.springframework.boot.runApplication

@SpringBootApplication(exclude = [DataSourceAutoConfiguration::class])
class FastCampusPayApplication

fun main(args: Array<String>) {
	runApplication<FastCampusPayApplication>(*args)
}
