package com.example.myfastcampuspay

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration
import org.springframework.boot.runApplication

@SpringBootApplication(exclude = [DataSourceAutoConfiguration::class])
class MyFastCampusPayApplication

fun main(args: Array<String>) {
	runApplication<MyFastCampusPayApplication>(*args)
}
