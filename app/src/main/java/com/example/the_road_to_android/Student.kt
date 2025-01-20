package com.example.the_road_to_android

import kotlin.concurrent.thread

class Student: Person() {
    var sno=""
    var grade=0

}

fun main()
{
    val map= mapOf("sjsj" to 1,"sjjsjs" to 2)
    for((a,b) in map)
    {
        println(a+' '+b)
    }
    thread { println("ddjjd") }.start()
}
