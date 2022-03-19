package tugas.project.selforder.classData

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class harga (var totalHarga:String="",var valueHarga:String="") :
    Parcelable