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
        /**
         * Print the Spring banner to System.out.
         *
         *
         * ie.
         *    .   ____          _            __ _ _
         *   /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
         *  ( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
         *   \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
         *    '  |____| .__|_| |_|_| |_\__, | / / / /
         *   =========|_|==============|___/=/_/_/_/
         *  :: Spring Boot ::  (v2.1.0.BUILD-SNAPSHOT)
         */
        setBannerMode(Banner.Mode.CONSOLE)
    }
}
