package com.example.standartprogramlamayapilari

fun main (){

    // 3 ile 6

    for (i in 3..6){

        println("Döngü1: $i")

    }

    var sayac = 2

   while (sayac<6){

       sayac = sayac + 1

       println("Döngü 2 : $sayac")


   }

    // 0 ile 8 arası ikişer

    for (a in 0..8 step 2){

        println("Döngü3: $a")
    }

    var sayac2 = 0

    while (sayac2 <8)

        sayac2 = sayac2 + 2

    println("Döngü4: $sayac2")

    // 8 den 0 a ikişer

    for (x in 8 downTo 0 step 2){

        println("Döngü 5: $x")

    }
    var sayac3 = 8
    while (sayac3>0){

        sayac3 = sayac3-2

        println("Döngü 6: $sayac3")
    }
}