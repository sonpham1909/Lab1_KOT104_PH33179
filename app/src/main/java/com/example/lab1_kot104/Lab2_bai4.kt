package com.example.lab1_kot104

data class SinhVien(
    var tenSV: String,
    var mssv: String,
    var diemTB: Float,
    var daTotNghiep: Boolean?,
    var tuoi: Int?
)

class QuanLySinhVien {
    private val danhSachSinhVien = mutableListOf<SinhVien>()

    fun themSinhVien() {
        println("Nhập thông tin sinh viên:")
        print("Tên SV: ")
        val tenSV = readLine() ?: ""
        print("MSSV: ")
        val mssv = readLine() ?: ""
        print("Điểm TB: ")
        val diemTB = readLine()?.toFloatOrNull() ?: 0.0f
        print("Đã tốt nghiệp? (yes/no): ")
        val daTotNghiepInput = readLine()
        val daTotNghiep = when (daTotNghiepInput?.toLowerCase()) {
            "yes" -> true
            "no" -> false
            else -> null
        }
        print("Tuổi: ")
        val tuoi = readLine()?.toIntOrNull()

        val sv = SinhVien(tenSV, mssv, diemTB, daTotNghiep, tuoi)
        danhSachSinhVien.add(sv)
        println("Sinh viên đã được thêm vào danh sách.")
    }

    fun xemDanhSachSinhVien() {
        if (danhSachSinhVien.isEmpty()) {
            println("Danh sách sinh viên rỗng.")
        } else {
            println("Danh sách sinh viên:")
            for ((index, sv) in danhSachSinhVien.withIndex()) {
                println("Sinh viên ${index + 1}: $sv")
            }
        }
    }

    fun suaSinhVien() {
        println("Nhập MSSV của sinh viên cần sửa:")
        val mssv = readLine() ?: ""
        val sv = danhSachSinhVien.find { it.mssv == mssv }
        if (sv == null) {
            println("Không tìm thấy sinh viên có MSSV $mssv")
        } else {
            println("Nhập thông tin mới cho sinh viên:")
            print("Tên SV: ")
            sv.tenSV = readLine() ?: ""
            print("Điểm TB: ")
            sv.diemTB = readLine()?.toFloatOrNull() ?: 0.0f
            print("Đã tốt nghiệp? (yes/no): ")
            val daTotNghiepInput = readLine()
            sv.daTotNghiep = when (daTotNghiepInput?.toLowerCase()) {
                "yes" -> true
                "no" -> false
                else -> null
            }
            print("Tuổi: ")
            sv.tuoi = readLine()?.toIntOrNull()
            println("Thông tin của sinh viên đã được cập nhật.")
        }
    }

    fun xoaSinhVien() {
        println("Nhập MSSV của sinh viên cần xóa:")
        val mssv = readLine() ?: ""
        val sv = danhSachSinhVien.find { it.mssv == mssv }
        if (sv == null) {
            println("Không tìm thấy sinh viên có MSSV $mssv")
        } else {
            danhSachSinhVien.remove(sv)
            println("Sinh viên có MSSV $mssv đã được xóa khỏi danh sách.")
        }
    }
}

fun main() {
    val quanLySV = QuanLySinhVien()

    while (true) {
        println("+==========Quản Lý Sinh Viên==========+")
        println("|1. Thêm sinh viên                    |")
        println("|2. Xem danh sách sinh viên           |")
        println("|3. Sửa thông tin sinh viên           |")
        println("|4. Xóa sinh viên                     |")
        println("|5. Thoát                             |")
        println("+=====================================+")
        print("Lựa chọn của bạn: ")
        when (readLine()?.toIntOrNull()) {
            1 -> quanLySV.themSinhVien()
            2 -> quanLySV.xemDanhSachSinhVien()
            3 -> quanLySV.suaSinhVien()
            4 -> quanLySV.xoaSinhVien()
            5 -> return
            else -> println("Lựa chọn không hợp lệ. Vui lòng chọn lại.")
        }
        println()
    }
}



