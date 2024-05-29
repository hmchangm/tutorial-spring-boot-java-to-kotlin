package com.example.demokt

import org.junit.jupiter.api.Test
import java.util.function.Consumer
import java.util.stream.Collectors
import java.util.stream.IntStream

class DemoTestKt {
    @Test
    fun test() {
        val list = IntStream.iterate(2) { i: Int -> i + 2 }
            .boxed().takeWhile { i: Int -> i <= 10 }
            .collect(Collectors.toList())
        list.forEach(Consumer { x: Int? -> println(x) })

        println("----Start Kotlin")

        (2..10).step(2).forEach{ x: Int -> println(x) }

        listOf("🌱", "🚀", "💡", "🐧", "⚙️", "🤖", "📚").also(::println)
            .chunked(3).also(::println)
            .map{it.reversed()}.also(::println)
            .flatten().also(::println)
    }
}
