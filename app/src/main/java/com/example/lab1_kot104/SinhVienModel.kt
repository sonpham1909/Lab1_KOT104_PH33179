package com.example.lab1_kot104

class SinhVienModel (var tenSV: String, var mssv: String, var diemTB: Float) {
    var daTotNghiep : Boolean? = null
    var tuoi : Int? = null

    constructor(tenSV: String,  mssv: String, diemTB: Float, datotnghiep: Boolean, tuoi: Int) : this(tenSV, mssv, diemTB) {
        this.daTotNghiep = datotnghiep
        this.tuoi = tuoi
    }

    fun getThongTin () : String {
        var thongtin : String
        if (daTotNghiep != null && tuoi != null) {
            thongtin = "Ten: $tenSV , mssv: $mssv , diemTB: $diemTB , da tot nghiep: $daTotNghiep , tuoi: $tuoi"
        } else {
            thongtin = "Ten: $tenSV , mssv: $mssv , diemTB: $diemTB"
        }
        return thongtin
    }

    override fun toString(): String {
        return "SinhVienModel(tenSV='$tenSV', mssv='$mssv', diemTB=$diemTB, daTotNghiep=$daTotNghiep, tuoi=$tuoi)"
    }
}