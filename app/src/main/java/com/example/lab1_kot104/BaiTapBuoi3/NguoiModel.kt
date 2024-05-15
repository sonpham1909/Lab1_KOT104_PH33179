package com.example.lab1_kot104.BaiTapBuoi3

open class NguoiModel(var hoten: String, var tuoi: Int?, var quequan: String?) {
   open fun getThongTin() : String {
        return "$hoten - $tuoi - $quequan"
    }

}