package com.example.standartprogramlamayapilari

import java.util.*

fun main(){

    val girdi = Scanner(System.`in`)

/*
  Benim yaptığım Örnek:

    println("1. ismi giriniz:")
    var isim1 = girdi.next()

    println("2. ismi giriniz:")
    var isim2 = girdi.next()

    println("3. ismi giriniz:")
    var isim3 = girdi.next()

    println("4. ismi giriniz:")
    var isim4 = girdi.next()

    println("5. ismi giriniz:")
    var isim5 = girdi.next()

    var isimler = arrayOf(isim1,isim2,isim3,isim4,isim5)

    //println(isimler.contentToString())

    for ((index,isim) in isimler.withIndex()){

        println("$index. İsim = $isim")


    }*/

    // Pratik olan:

    val isimler = Array<String>(size = 5){""}

    for (i in 0 until isimler.count()){

        println("${i+1}. isim giriniz:")
        val isim = girdi.next()
        isimler[i] = isim
    }

    for ((index,isim) in isimler.withIndex()){

        println("${index+1}. İsim = $isim")

    }




}