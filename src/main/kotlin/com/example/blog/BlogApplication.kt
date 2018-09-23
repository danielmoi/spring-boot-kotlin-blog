package com.example.blog

import org.springframework.boot.Banner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
// No need for brackets on empty classes
class BlogApplication

fun main(args: Array<String>) {
    /*
    * Kotlin idiomatic alternative to
    * SpringApplication.run(BlogApplication::class.java, *args)
    * */
    runApplication<BlogApplication>(*args) {
        setBannerMode(Banner.Mode.OFF)
    }
}
