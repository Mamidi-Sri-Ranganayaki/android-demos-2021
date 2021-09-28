package com.ranganayaki.kotlinbasics.basics

fun main(args: Array<String>) {

    var a = "abc"
    var b = "pqr"
    var c = "xyz"

    // Value of a is assigned to temporary
    val temporary = a

    // Value of c is assigned to a
    a = c

    // Value of temporary (which contains the initial value of a) is assigned to c
    c = temporary

    println("--After swap--")
    println("a = $a")
    println("b = $b")
    println("c = $c")
}