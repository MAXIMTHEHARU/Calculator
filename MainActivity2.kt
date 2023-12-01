package com.android.mycalculator

fun main() {
    var num1 = readln().toInt()
    var operate = '/'
    var num2 = readln().toInt()



    if(operate == '+') {
        var result = num1 + num2
        println("${result}")
    } else if(operate == '-') {
        var result = num1 - num2
        println("${result}")
    } else if(operate == '*') {
        var result = num1 * num2
        println("${result}")
    } else if(operate == '/') {
        var result = num1 / num2
        println("${result}")
    } else {
        println("잘못 된 연산자 입니다.")
    }
}