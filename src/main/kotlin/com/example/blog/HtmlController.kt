package com.example.blog

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
/*
* org.springframework.ui.set
* This is a Kotlin extension
* allows us to write model["title"] = "Blog"
* instead of model.addAttribute("title", "Blog")
* */

import org.springframework.ui.set
import org.springframework.web.bind.annotation.GetMapping

@Controller
class HtmlController {

    @GetMapping("/")
    fun blog(model: Model): String {
        model["title"] = "Blog"
        return "blog"
    }
}