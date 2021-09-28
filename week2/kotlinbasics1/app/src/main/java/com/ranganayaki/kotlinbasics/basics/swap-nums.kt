package com.ranganayaki.kotlinbasics.basics

fun main(args: Array<String>) {

    var a = "abc"
    var b = "pqr"
    var c = "xyz"

    // Value of first is assigned to temporary
    val temporary = a

    // Value of second is assigned to first
    a = c

    // Value of temporary (which contains the initial value of first) is assigned to second
    c = temporary

    println("--After swap--")
    println("a = $a")
    println("b = $b")
    println("c = $c")
}