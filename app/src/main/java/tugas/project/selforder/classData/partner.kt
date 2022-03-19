package tugas.project.selforder.classData

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class partner (var kotaPartner: String ="",var namaPartner:String="",var profilePartner:Int=0,var harga:String="") : Parcelable
// Value Recycle View
