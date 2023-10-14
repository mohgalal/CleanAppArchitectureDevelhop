package com.example.cleanarchwithshafietask.util

class Constants {
    companion object {
        const val IPHONE = "iPhone"
        const val SAMSUNG = "Samsung"
        const val UNKNOWN = "Unknown"
    }
}

enum class Mobile(brandName:String){
    IPHONE("i"),
    SAMSUNG("s"),
}