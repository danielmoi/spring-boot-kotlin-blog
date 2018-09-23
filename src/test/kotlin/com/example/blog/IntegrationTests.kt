package com.example.blog

//import org.junit.Test
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.AfterAll
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.springframework.beans.factory.annotation.Autowired
//import org.junit.runner.RunWith
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.web.client.TestRestTemplate
import org.springframework.boot.test.web.client.getForEntity
import org.springframework.http.HttpStatus
import org.springframework.test.context.junit.jupiter.SpringExtension
// import org.springframework.test.context.junit4.SpringRunner

// @RunWith(SpringRunner::class)
@ExtendWith(SpringExtension::class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class BlogIntegrationTests(@Autowired val restTemplate: TestRestTemplate) {
    @BeforeAll
    fun setup() {
        println(">> Setup")
    }

    @Test
    fun contextLoads() {
    }

    /*
        We can use real sentences to provide expressive test function names

        JUnit5 allows to inject constructor and method parameters,
        which is a good fit with Kotlin immutable and non-nullable properties

        This code leverages getForObject and getForEntity Kotlin extensions
        (we have imported them)
     */
    @Test
    fun `Assert blog page title, content, and status code`() {
        val entity = restTemplate.getForEntity<String>("/")
        assertThat(entity.statusCode).isEqualTo(HttpStatus.OK)
        assertThat(entity.body).contains("<h1>Blog</h1>")
    }

    /*
        Test instance lifecycle

        Sometimes we need to execute a method before or after all tests of
        a given class. Like JUnit4, JUnit5 requires by default these methods
        be static (which translates to companion object in Kotlin, which is quite verbose
        and not straightforward) because test classes are instantiated
        one time per test

        But JUnit5 allows us to change this default behaviour and instantiate
        test classes one time per class.

        This can be done in various ways, here we will use a property file to change
        the default behaviour for the WHOLE PROJECT
        /src/test/resources/junit-platform.properties

        junit.jupiter.testinstance.lifecycle.default = per_class

        This allows use to use @BeforeAll and @AfterAll annotations on regular methods
     */
    @Test
    fun `Assert article page title, content and status code`() {
        println(">> TODO")
    }

    @AfterAll
    fun teardown() {
        println(">> Tear down")
    }
}
