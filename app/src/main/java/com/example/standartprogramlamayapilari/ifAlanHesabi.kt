package com.example.standartprogramlamayapilari

import java.util.*

fun main() {

    val girdi = Scanner(System.`in`)

    println("Dikdörtgen Alanı (1)")
    println("Çember Alanı (2)")

    val secim = girdi.nextInt()

    println("Seçiminiz: $secim")

    if (secim == 1) {

        println("Kısa Kenarı Girin")
        var kisaKenar = girdi.nextInt()
        println("Uzun Kenarı Girin")
        var uzunKenar = girdi.nextInt()

        var dikdortgenAlani = kisaKenar * uzunKenar

        println("Dikdörtgenin Alanı: $dikdortgenAlani")


    } else if (secim == 2) {

        val pi = 3.14

        println("Çemberin yarıçapını girin:")
        var yariCap = girdi.nextInt()

        var cemberinAlani = (yariCap * yariCap) * pi

        println("Çemberin Alanı: $cemberinAlani")

    } else

        println("Lütfen 1 veya 2 numarayı seçiniz.")


}
