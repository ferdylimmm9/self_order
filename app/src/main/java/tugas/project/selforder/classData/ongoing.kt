package tugas.project.selforder.classData

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class ongoing (var logoRestoran : Int =0,var namaPartner:String="",var idPesanan:String="", var statusPesanan:String="",var listPesanan : ArrayList<String> = ArrayList(), var listJumlah : ArrayList<Int> = ArrayList()) :
    Parcelable
// Value Recycle View
