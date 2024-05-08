package com.example.lab1_kot104

import android.annotation.SuppressLint


@SuppressLint("SuspiciousIndentation")
fun main(){
    println("Hello kotlin - Lab1")
    println("--------------------")


//    val a = 1
//    val b = 2
//
//    var c = a + b

//    val mess: String =  "Tổng 2 sô $a và $b là: $c"
//    println(mess)

    val soA = 9
    val soB : Float= 9.89F

  val kq =  phepChia(soA,soB)
    println(kq)



    //khai báo sd mảng
    val ArrayX = intArrayOf(1,2,3,4,5)
    var ArrayY = arrayOf(1,"a",3.5f)

    for (x in ArrayX){
        println(x)
    }
    print("Phạm văn sơn -  ph33179\n")
    print("=========================\n")
    println("Quanh năm buôn bán ở mom sông")
    println("Nuôi đủ năm con với một chồng")
    println("\tlặn lội thân cờ khi quãng vắng")
    println("\teo sèo mặt nước buổi đò đồng")
    println("Một duyên hai nợ âu đành phận")
    println("Năm nắng mười mưa há chẳng công")
    println("\tCha mẹ thói đời \"ăn ở bạc\"")
    println("\tCó chồng hờ hững cũng như không")


    var a = 0.0
    var b = 0.0
    println("Nhập a:")
    var s = readLine()
    if (s != null) a = s.toDouble()
    println("Nhập b:")
    s = readLine()
    if (s != null) b = s.toDouble()
    println("Tổng: " + (a + b))
    println("Hiệu: " + (a - b))
    println("Tích: " + (a * b))
    println("Thương: " + (a / b))



}

fun phepChia(soA : Int, soB : Float): String {
    if(soB == 0f){
        return "Số B không được bằng 0"
    }else {
        var Kq = soA / soB
        return "Kết quả phép chia là $Kq"
    }

}
class Lab1 {
}