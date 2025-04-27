package com.example.kotlinderslerim.nesne_tabanli_programlama

class Odev2 {

    //Girilen Celsius değerini Fahrenheit'a dönüştürme
    fun celsiusToFahrenheit(celcius: Double): Double {
        return celcius * 1.8 + 32
    }

    //Dikdörtgenin kenar uzunluklarına göre çevresini hesaplama
    fun dikdortgenKenar(en: Double, boy: Double): Double{
        return 2 * (en + boy)
    }

    //Faktöriyel hesaplama
    fun faktoriyel(sayi: Int): Long {
        var sonuc = 1L
        for (i in 1..sayi) {
            sonuc *= i
        }
        return sonuc
    }

    //Girilen kelime içinde kaç adet a harfi olduğunu bulma
    fun harfSayac(kelime: String): Int{
        return kelime.count {it.lowercaseChar() == 'a'}
    }

    //Bir çokgenin iç açılarının toplamını bulma
    fun icAcılarToplami (kenarSayisi: Int):Int {
        return (kenarSayisi - 2) * 180

        //println("İç Açılar Toplamı : ${}")
    }

    //Çalışılan gün sayısına göre maaşı hesaplama (8 saatlik mesai üzerinden değerlendirme
    fun maas(gunSayisi:Int): Int {
        val toplamSaat = gunSayisi * 8
        val normalSaat = if (toplamSaat > 160) 160 else toplamSaat
        val asanSaat = if (toplamSaat > 160) toplamSaat - 160 else 0

        return (normalSaat * 10) + (asanSaat * 20)
    }

    //Kullanılan internet kotasını hesaplama
    fun internetFaturası (kullanılanKota: Int): Int{
        return if (kullanılanKota <= 50) {
            100
        } else {
            100 + (kullanılanKota - 50) * 4
        }
    }









}