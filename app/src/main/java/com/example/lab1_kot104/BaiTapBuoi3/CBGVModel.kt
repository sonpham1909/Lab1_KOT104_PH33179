package com.example.lab1_kot104.BaiTapBuoi3

class CBGVModel (hoten: String,tuoi: Int?,quequan: String?,var msgv: String,var luongcung : Float, var luongThuong: Float?, var luongPhat: Float?) : NguoiModel(hoten, tuoi, quequan) {
    var lThuclinh : Float = 0f
        get() = luongcung + (luongThuong?:0f) - (luongPhat?:0f)

    override fun getThongTin(): String {
        return "CBGV: ${super.getThongTin()} - msgv: $msgv -" +
                "luong thuc linh: $lThuclinh"
    }

    override fun toString(): String {
        return "CBGV: ${super.getThongTin()} - msgv: $msgv -" +
                "msgv='$msgv', luongcung=$luongcung, luongThuong=$luongThuong, luongPhat=$luongPhat, lThuclinh=$lThuclinh"
    }




}