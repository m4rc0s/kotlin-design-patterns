package com.example

import io.kotest.matchers.shouldBe
import io.kotest.matchers.string.shouldNotBeEmpty
import org.junit.jupiter.api.Test

class AppTest {
    @Test
    fun appHasAGreeting() {
        val classUnderTest = App()
        classUnderTest.greeting.shouldNotBeEmpty()
        classUnderTest.greeting shouldBe "Hello World!"
    }
}
