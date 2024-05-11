package com.example.lab1_kot104

fun main(){

    println("Bai 1: Giai PT Bac 1")

    var a = 0.0
    var b = 0.0
    println("Nhap a: ")
    var s = readLine()
    if (s != null) a = s.toDouble()
    println("Nhap b:")
    s = readLine()
    if (s != null) b = s.toDouble()
    if (a == 0.0 && b == 0.0){
        println("PT vo so nghiem")
    }else if (a == 0.0 && b != 0.0){
        println("PT vo nghiem")
    }else{
        val x = -b/a
        println("No x = "+x)
    }

    println("Bai 2: tính quý ")

    var month = 0
    println("Nhap thang: ")
    val t : String? = readLine()
    if (t != null) month = t.toInt()
    when(month){
        1, 2, 3 -> println("Thang "+ month +" thuoc quy 1")
        4, 5, 6 -> println("Thang "+ month +" thuoc quy 2")
        7, 8, 9 -> println("Thang "+ month +" thuoc quy 3")
        10, 11, 12 -> println("Thang "+ month +" thuoc quy 4")
        else -> println("Thang "+ month +" khong hop le")
    }

    println("Bai 3: Kiểm tra năm nhuận ")

    var year = 0
    var y : String?
    println("Chuong trinh kiem tra nam nhuan: ")
    do {
        println("Nhap 1 nam: ")
        y = readLine()
        while (y == null || y.toInt() <0){
            println("Nhap sai nam, nhap lai:")
            y = readLine()
        }
        year = y.toInt()
        if (year %4 == 0 && year %100 != 0 || year % 400 ==0){
            println("Nam $year la nam nhuan")
        }else{
            println("Nam $year khong phai la nam nhuan")
        }
        println("Tiep khong? (c/k):")
        y = readLine()
        if(y =="k")
            break;
    }while (true)
    println("Ket thuc chuong trinh")

}