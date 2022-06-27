package com.example.standartprogramlamayapilari

fun main (){

    val meyveler = arrayOf<String>("Çilek","Erik","Elma","Karpuz","Kivi","Kiraz")


    for (meyve in meyveler ){

        println("Sonuç: $meyve")

    }

    for ((index,meyve) in meyveler.withIndex()){

        println("Sonuç: $index : $meyve")
    }




}