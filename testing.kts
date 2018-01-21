#!/usr/bin/env kscript

//DEPS com.github.kittinunf.fuel:fuel:1.12.0

import com.github.kittinunf.fuel.httpGet


val (request, response, result) ="https://9gag.com".httpGet().responseString()
val (data, error) = result
println(d)


val tagsplit= data?.split("<")
tagsplit?.forEach({println(it)})

tagsplit?.filter({line-> line.contains("https://img-9gag-fun.9cache.com/photo/")})
		?.forEach({println(it)})

//divsplit
//	?.split("img")
	//?.filter({line -> line.contains("img")})
//	?.forEach({ println(it) })


println("finished")