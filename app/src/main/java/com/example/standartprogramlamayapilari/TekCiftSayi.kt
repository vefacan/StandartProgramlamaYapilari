package com.example.standartprogramlamayapilari

import java.util.*

fun main(){

    val girdi = Scanner(System.`in`)



    while (true){

        println("Bir sayı giriniz:")
        var sayi = girdi.nextInt()

        val sonuc = sayi % 2

        if (sonuc == 0){
            println("Sayınız çift sayıdır.")
        }
        else {

            println("Sayınız tek sayıdır.")
        }

        println("Çıkmak için (1) - Devam etmek için diğer sayılar.")

        var cikis = girdi.nextInt()

        if (cikis == 1 ){

            println("Çıkış yapıldı.")
            break


        }



    }




}