package com.project.ourlog

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class OurLogApplication

fun main(args: Array<String>) {
	runApplication<OurLogApplication>(*args)
}
