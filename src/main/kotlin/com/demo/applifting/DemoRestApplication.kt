package com.demo.applifting

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DemoRestApplication

fun main(args: Array<String>) {
    runApplication<DemoRestApplication>(*args)
}
