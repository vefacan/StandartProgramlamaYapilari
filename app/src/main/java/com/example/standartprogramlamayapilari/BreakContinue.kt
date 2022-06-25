package com.example.standartprogramlamayapilari

fun main () {

    for (i in 1..5 ) {

        if (i == 3){
            break
        }
        println("Döngü1: $i")
}

    for ( x in 1..5 ) {
        if (x == 3){
            continue
        }
        println("Döngü 2 : $x")

    }
}