package com.ranganayaki.kotlinbasics.clsobj

class GtSt(
    private var xPos: Int
) {
    var x: Int
        get() = this.xPos
        set(value) {
            this.xPos = value
        }
}

fun main() {
    val gt1 = GtSt(10)
    gt1.x = 10

    val a = Abc()
    data = 50;

    val sv = Visibility()
    sv.v = 10
    sv.z = 56

    val sb = SubVisibility()
    sb.v = 10
    sb.z = 10
}

class SubVisibility : Visibility() {
    fun sb() {
        y = 25
    }
}