package com.ocbc.auctionservice

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class AuctionServiceApplication

fun main(args: Array<String>) {

	println("Hello Fucking world!!")
	runApplication<AuctionServiceApplication>(*args)
}