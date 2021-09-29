package com.ranganayaki.kotlinbasics.controlflow

fun demo1() {
    val os = readLine()

    if(os.equals("10")) {
        println("Oreo")
    } else if (os.equals("9")) {
        println("Pie")
    } else {
        print("Android")
    }
}

fun demo2() {
    val os = readLine()
    when(os) {
        "10" -> println("Oreo")
        "9" -> print("Pie")
        "8", "7" -> println("Jelly Bean")
        else -> print("android")
    }
}

fun main() {

}