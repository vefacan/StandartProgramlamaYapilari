package com.example.standartprogramlamayapilari

fun main (){

    //Tanımlamalar

    val dizi1 = Array<Int>(size=5){0}//00000

    val dizi2 = arrayOf(1,10,7)

    val dizi3 = arrayOf<Int>(3,10,17)

    val dizi4 = arrayOf<String>("Çilek","Elma","Erik","Karpuz")

    val dizi5 = arrayOf(3,8,"İzmir","Bursa")

    val meyveler = arrayOf<String>("Çilek","Muz","Elma","Kivi","Kiraz")

    //Verilere erişim

    val str1 = meyveler[2]

    println(str1)

    val str2 = meyveler.get(3)

    println(str2)

    //Veri üzerinde işlem yapma

    meyveler[1] = "Yeni Muz"

    println(meyveler.contentToString())

    meyveler.set(2,"Yeni Elma")

    println(meyveler.contentToString())

    //Array İşlemleri

    println(meyveler.isEmpty())

    println(meyveler.count())

    println(meyveler.first())

    println(meyveler.last())

    println(meyveler.indexOf("Kivi"))

    println(meyveler.contains("Yeni Muz"))

    println(meyveler.sort())

    println(meyveler.contentToString())

    println(meyveler.reverse())

    println(meyveler.contentToString())


}