#!/usr/bin/env kscript

//DEPS com.github.kittinunf.fuel:fuel:1.12.0

import com.github.kittinunf.fuel.httpGet

val baseUrl = "https://kotlinlang.org/"

println(baseUrl)
val test = baseUrl.httpGet().responseString()
print(test)