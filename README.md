# kotlinscript-webcrawler
- first install kotlin: <pre>brew install kotlin</pre>

## Outline:

### Kotlinscript
- Skripting in Kotlin
- https://kotlinlang.org/docs/tutorials/command-line.html 
- <pre>kotlinc -script &lt;scriptname&gt;.kts</pre> to run
- show example! (start-with-kotlinscript.kts)


### Webcrawler
- many different definitions
- in this talk: download a website and do sth. with its content
- dangerous! many websites prohibit crawling in their tos - especially for enterprises
- this is the reason why there will be no excessive crawling shown here

### kscript
- library for extending kotlin scripting functionality
- Awesome! 
- https://github.com/holgerbrandl/kscript
- https://www.youtube.com/watch?v=cOJPKhlRa8c&t= : Session about kscript @KotlinConf 2017

#### why?
- #! -Shebang (https://en.wikipedia.org/wiki/Shebang)
- makes scripts executable with <pre>./&lt;scriptname&gt;</pre>
- less recompiling
- when you run a kotlin-script it gets recompiled everytime
- kscript does a MD5-Checksum to compare if the script stayed the same before compiling
- Dependencies. I wanted an easy way to use some dependencies in my script.
- show example! (kscript.kts)
- import functionality for other kotlin-files

### Lets Crawl!
- easy to crawl Meme-Site 
- goal is to get all images 
