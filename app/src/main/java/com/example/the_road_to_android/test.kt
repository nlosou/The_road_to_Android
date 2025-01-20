package com.example.the_road_to_android

fun main()
{
    println(add(2,2))
    checkNumber(100)
    for(i in 0..10)
    {
        println(i)
    }
}
fun add(a:Int,b:Int):Int{
    return  a+b
}

fun checkNumber(number: Number){
    when(number)
    {
        is Int-> println("number is int")
        is Double->println("number is DOuble")
        else-> println("number not support")
    }
}