package com.android.mycalculator

fun main() {
    var num1 = readln().toDouble()
    var operate = '+'
    var num2 = readln().toDouble()

    if(operate == '+') {
        println("${num1}+${num2}")
    } else if(operate == '-') {
        println("${num1}-${num2}")
    } else if(operate == '*') {
        println("${num1}*${num2}")
    } else if(operate == '/') {
        println("${num1}/${num2}")
    } else {
        println("잘못 된 연산자 입니다.")
    }
}