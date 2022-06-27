package com.example.standartprogramlamayapilari

import java.util.*

fun main () {

    val girdi = Scanner(System.`in`)

    val dersler = Array<String>(size = 5) { "" }
    val notlar = Array<Int>(size = 5) { 0 }

    for (i in 0 until dersler.count()){

        println("${i+1}. Dersi giriniz:")
        val ders = girdi.next()
        dersler [i] = ders

        println("${i+1}. Ders notunu giriniz:")
        val not = girdi.nextInt()
        notlar [i] = not
    }

    var toplam = 0



    for (i in 0 until dersler.count()){

        println("${dersler[i]} : ${notlar[i]}")
        toplam = toplam + notlar[i]

    }


    var ortalama = toplam / notlar.count()
    println("Ortalama: $ortalama")

    if (ortalama >= 50){

        println("Tebrikler sınıfı geçtiniz.")
    }

    else {

        println("Sınıfta kaldınız.")
    }

}