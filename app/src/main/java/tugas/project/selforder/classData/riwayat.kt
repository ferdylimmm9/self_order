package tugas.project.selforder.classData

import android.os.Parcelable
import kotlinx.parcelize.Parcelize


@Parcelize
data class riwayat (var namaPartner : String ="", var idPesanan:String ="" , var harga:String=""):Parcelable

