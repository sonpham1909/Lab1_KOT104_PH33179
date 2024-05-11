package com.example.lab1_kot104

import java.sql.DatabaseMetaData


fun main(){




    val soA = 5
    var soB = 10

    val luyThuaBac3 = soA.let{
        it*it*it
    }

    val title : String ? = "Buoi 3 Android-Kotlin"
    val legth = title?.run{
        if (isEmpty()){
            0
        }else{
            length


        }
    }

    with(soB){
        soB = this.inc()
        println("SO B : $soB")
    }


    println("Tong 2 so $soA va $soB = ${tinhTong(soA,soB)}")
    println("Tich 2 so $soA va $soB = ${phepNhan(soA,soB)}")
    println("Thuong 2 so $soA va $soB = ${phepChia(soA.toFloat(),soB.toFloat()) ()}")
    println("Tich 2 so $soA  = ${luyThua(soA)}")
    println("Tich 2 so $soA  = ${luyThuaBac3}")
    println("Title co do dai ki tu la ${legth}")
}

val tinhTong = {soA : Int,soB : Int -> (soA+soB)}

val phepNhan : (Int, Int) -> Int = {soA : Int,soB : Int -> (soA*soB)}

val luyThua : (Int) -> Int = {it*it}

val phepChia = {soA: Float, soB: Float -> {
    if (soB == 0f){
        "So bi chia phai khac 0"
    }else{
        val kq = soA/soB
        kq
    }
}}
class buoi3 {
}