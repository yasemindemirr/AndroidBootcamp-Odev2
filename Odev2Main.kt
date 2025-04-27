package com.example.kotlinderslerim.nesne_tabanli_programlama

fun main() {

    val odev2 = Odev2()

    //Girilen Celcius değerini Fahrenheit'a dönüştürme
    println("30 derece Celsius kaç Fahrenheit eder: ${odev2.celsiusToFahrenheit(30.0)}")

    //Dikdörtgenin kenar uzunluklarına göre çevresini hesaplama
    println("Kenarları 5 ve 10 olan dikdörtgenin çevresi: ${odev2.dikdortgenKenar(5.0, 10.0)}")

    //Faktöriyel hesaplama
    println("5 sayısının faktöriyeli: ${odev2.faktoriyel(5)}")

    //Girilen kelime içinde kaç adet a harfi olduğunu bulma
    println("\"Ankara\" kelimesinde geçen 'a' harfi sayısı: ${odev2.harfSayac("Ankara")}")

    //Bir çokgenin iç açılarının toplamını bulma
    println("5 kenarlı bir çokgenin iç açılar toplamı: ${odev2.icAcılarToplami(5)}")


    //Çalışılan gün sayısına göre maaşı hesaplama (8 saatlik mesai üzerinden değerlendirme
    println("22 gün çalışan bir kişinin maaşı: ${odev2.maas(22)} TL")


    //Kullanılan internet kotasını hesaplama
    println("60 GB internet kullanan bir kişinin ödeyeceği kota ücreti: ${odev2.internetFaturası(60)} TL")
}