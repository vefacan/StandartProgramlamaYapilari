package com.example.standartprogramlamayapilari

import java.util.*

fun main() {

    val girdi = Scanner(System.`in`)

    println("Toplama için (1)")
    println("Çıkarma için (2)")
    println("Çarpma için (3)")
    println("Bölme için (4)")

    val tercih = girdi.nextInt()


    println("İlk sayıyı giriniz:")
    val ilksayi = girdi.nextInt()

    println("İkinci sayıyı giriniz:")
    val ikincisayi = girdi.nextInt()


    when (tercih){

        1-> println(ilksayi + ikincisayi)
        2-> println(ilksayi - ikincisayi)
        3-> println(ilksayi * ikincisayi)
        4-> println(ilksayi / ikincisayi)
        else -> println("Böyle bir sayı yok.")
    }
}