package com.example.blog

//import org.junit.Test
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
//import org.junit.runner.RunWith
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit.jupiter.SpringExtension
// import org.springframework.test.context.junit4.SpringRunner

// @RunWith(SpringRunner::class)
@ExtendWith(SpringExtension::class)
@SpringBootTest
class BlogApplicationTests {

	@Test
	fun contextLoads() {
	}

}
