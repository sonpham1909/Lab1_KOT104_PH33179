package com.example.lab1_kot104.BaiTapBuoi3


fun main(){



    var gv1 = CBGVModel("Nguyen Van A",25,"HN","0001",15000f,50f,10f)
    println(gv1.getThongTin())



    val QLGV = QLGV()
    println("------------------------")
    println("Menu quan ly GV")
    println("1. Them giao vien")
    println("2. Hien thi danh sach GV")
    println("3. Xoa GV")
    println("4. Cap nhat thong tin GV")
    println("5. Thoat chuong trinh")

    var tiepTuc: Boolean
    do {
        try {
            print("Nhap lua chon cua ban: ")
            val options: Int = readLine()!!.toInt()
            when (options) {
                1 -> {
                    println("Them Giao Vien")
                    println("--------------------------")
                    QLGV.ThemGiaoVien()


                }


                2 -> {
                    println("Danh sach giao vien")
                    println("--------------------------")
                    QLGV.xemDanhSachGiaoVien()
                }

                3 -> {
                    println("Xoa giao vien")
                    println("--------------------------")
                    println("Nhap msgv can xoa: ")
                    QLGV.xoaGiaoVien()

                }

                4 -> {
                    println("Cap nhat thong tin gv")
                    println("Nhap msgv can cap nhat: ")
                    QLGV.suaGV()
                }

                5 -> {
                    println("Ket thuc chuong trinh")
                    tiepTuc = false
                }

                else -> {
                    println("Nhap sai, vui long nhap lai")
                }
            }
            println("Ban co muon chon tiep lua chon tren menu? (c/k) ")
            val s = readLine()
            tiepTuc = s == "c"
        } catch (e: Exception) {
            println("Nhap sai, vui long nhap lai")
            tiepTuc = true
        }

    } while (tiepTuc)
}


class QLGV {
    private val GiaoVien = mutableListOf<CBGVModel>()

    fun ThemGiaoVien() {
        println("Nhap thong tin giao vien:")
        println("Ten: ")
        val ten = readLine() ?: ""
        println("tuoi: ")
        val tuoi = readLine()?.toIntOrNull() ?: 0
        println("que quan: ")
        val quequan = readLine() ?: ""
        println("msgv: ")
        var msgv = readLine() ?: ""

        var check = GiaoVien.any { it.msgv == msgv }
        while (check){
            println("Giao vien có msgv $msgv da ton tai")
        println("msgv: ")
        msgv = readLine() ?: ""
        check = GiaoVien.any { it.msgv == msgv }
    }





        println("Luong cung: ")
        val luongCung = readLine()?.toFloatOrNull()?: 0.0f
        println("Luong thuong: ")
        val luongThuong = readLine()?.toFloatOrNull()?: 0.0f
        println("Luong phat: ")
        val luongPhat = readLine()?.toFloatOrNull()?: 0.0f


        val gvT = CBGVModel(ten,tuoi,quequan,msgv, luongCung, luongThuong, luongPhat)
        GiaoVien.add(gvT)
        println("Them thanh cong")



    }
    fun xemDanhSachGiaoVien() {
        if (GiaoVien.isEmpty()) {
            println("Danh sách sinh viên rỗng.")
        } else {
            println("Danh sách sinh viên:")
            for ((index, sv) in GiaoVien.withIndex()) {
                println("Giáo viên ${index + 1}: $sv")
            }
        }
    }

    fun xoaGiaoVien() {
        println("Nhập MSGV của sinh viên cần xóa:")
        val msgv = readLine() ?: ""
        val sv = GiaoVien.find { it.msgv == msgv }
        if (sv == null) {
            println("Không tìm thấy sinh viên có MSSV $msgv")
        } else {
            GiaoVien.remove(sv)
            println("Sinh viên có MSSV $msgv đã được xóa khỏi danh sách.")
        }
    }
    fun suaGV(){
        println("Nhập MSGV của giao vien cần sửa:")
        val msgv = readLine() ?: ""
        val gv = GiaoVien.find { it.msgv == msgv }
        if (gv == null){
            println("Khong tim thay gv voi msgv la $msgv")

        }else{
            println("Nhap thong tin giao vien:")
            println("Ten: ")
            gv.hoten= readLine() ?: ""
            println("tuoi: ")
            gv.tuoi= readLine()?.toIntOrNull() ?: 0
            println("que quan: ")
            gv.quequan= readLine() ?: ""







            println("Luong cung: ")
            gv.luongcung = readLine()?.toFloatOrNull()?: 0.0f
            println("Luong thuong: ")
            gv.luongThuong = readLine()?.toFloatOrNull()?: 0.0f
            println("Luong phat: ")
            gv.luongPhat = readLine()?.toFloatOrNull()?: 0.0f



            println("thong tin cua gv $msgv da cap nhat thanh cong")
        }
    }
}