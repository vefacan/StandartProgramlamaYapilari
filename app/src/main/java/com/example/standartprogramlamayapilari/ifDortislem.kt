package com.example.standartprogramlamayapilari

import java.util.*

fun main() {

    val girdi = Scanner(System.`in`)

    println("Toplama(1)")
    println("Çıkarma(2)")
    println("Çarpma(3)")
    println("Bölme(4)")


    val tercih = girdi.nextInt()

    println("Birinci sayıyı giriniz:")

    val sayi1 = girdi.nextInt()

    println("İkinci sayıyı giriniz:")

    val sayi2 = girdi.nextInt()


    if (tercih == 1) {

        var toplama = sayi1 + sayi2
        println("Sonuç: $toplama")

    } else if (tercih == 2) {

        var cikarma = sayi1 - sayi2
        println("Sonuç: $cikarma")

    } else if (tercih == 3) {

        var carpma = sayi1 * sayi2
        println("Sonuç: $carpma")

    } else if (tercih == 4) {

        var bolme = sayi1 / sayi2
        println("Sonuç: $bolme")

    } else {
        println("Lütfen 1 ve 4 arasında bir sayı seçiniz")
    }


}
