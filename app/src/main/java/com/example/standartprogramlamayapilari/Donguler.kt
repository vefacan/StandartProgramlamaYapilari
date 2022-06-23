package com.example.standartprogramlamayapilari

fun main () {

    for ( i in 3..5 ){
        println(i)
    }

    var baslangic = 10
    var bitis = 20
    var artis = 5
    for (x in baslangic..bitis step artis){

        println("x değeri: $x")

    }

    for (a in 20 downTo 10 step 2) {

        println(a)
    }

    for (c in 1 until 5)

    println(c)

    var sayac = 1

    while (sayac < 4) {

        println(sayac)

        sayac = sayac + 1

    }





}