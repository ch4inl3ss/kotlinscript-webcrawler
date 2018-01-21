#!/usr/bin/env kscript
//INCLUDE progressbar.kt
//DEPS com.github.kittinunf.fuel:fuel:1.12.0

import com.github.kittinunf.fuel.httpGet
import com.github.kittinunf.fuel.*
import java.io.File


val baseUrl = "https://webfail.com"


val (request, response, result) = baseUrl.httpGet().responseString()
val (data, error) = result
val tagsplit=data?.split("<")
val tags =tagsplit?.filter({it.contains("wf-image")}) ?: emptyList()
val links= tags
		.map({ tag -> tag.split("\"")[3]})
		.map({ link -> "http:"+link})
					
links.forEach({println(it)})

links.forEach({ link->
	val imageName=link.split("/")[5]
	println(imageName)
	val (request, response, result)=Fuel.download(link).destination { 
	    response, url -> File("/Users/ch4inl3ss/Desktop/kotlinscript-webcrawler/images", imageName+".jpg")
	}.progress {
	    readBytes, totalBytes -> val progress = readBytes.toFloat() / totalBytes.toFloat()
	    progressBar(progress)
	}.response()
	
	println()
	println("download completed ")    
})

