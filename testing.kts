#!/usr/bin/env kscript

//DEPS com.github.kittinunf.fuel:fuel:1.12.0

import com.github.kittinunf.fuel.httpGet


val (request, response, result) ="https://9gag.com".httpGet().responseString()
val (data, error) = result
