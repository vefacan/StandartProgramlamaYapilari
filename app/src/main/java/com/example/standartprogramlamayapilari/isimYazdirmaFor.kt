package com.example.standartprogramlamayapilari

import java.util.*

fun main(){

    val girdi = Scanner(System.`in`)

    println("İsminizi Girin:")
    var isim = girdi.next()

    println("Kaç kere yazılsın?:")
    var girdisayisi = girdi.nextInt()


    for (x in 1..girdisayisi){

        println("İsminiz: $isim")

    }






}