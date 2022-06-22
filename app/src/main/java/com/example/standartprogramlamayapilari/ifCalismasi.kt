package com.example.standartprogramlamayapilari

fun main(){

    var yas = 17
    var isim = "Mehmet"

    //Örnek 1

    if (yas>=18){

        println("Reşitsiniz")
    }

    //Örnek 2

    if (yas>=18){

        println("Reşitsiniz")
    } else{

        println("Reşit Değilsiniz")
    }


    //Örnek 3

    if (isim == "Ahmet"){

        println("Merhaba Ahmet")
    }
    else if (isim == "Mehmet") {

        println("Merhaba Mehmet")
    }
    else {
        println("Merhaba yabancı.")
    }


    //Örnek 4

    var kullaniciAdi = "admin"
    var sifre = 12345


    if (sifre == 12345 && kullaniciAdi == "admin") {

        println("Hoşgeldiniz.")
    }
    else{
        println("Hatalı Giriş")
    }


    //Örnek 5 Kısaltma

    var a = 10
    var b = 10

    if (a == b) println("Eşit") else println("Eşit değil")
}