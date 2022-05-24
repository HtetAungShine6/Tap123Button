package com.example.mosquito

class Greeting {
    fun greeting(): String {
        return "Hello, ${Platform().platform}!"
    }
}