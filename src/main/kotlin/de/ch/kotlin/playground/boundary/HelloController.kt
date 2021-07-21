package de.ch.kotlin.playground.boundary

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/hellos")
class HelloController {
    @GetMapping
    fun getHelloWorlds(): List<String> {
        return listOf("hello 1", "hello 2", "welcome Lucas")
    }

    @GetMapping("{id}")
    fun getHelloWorld(@PathVariable id: String): String {
        return "hello $id"
    }
}
