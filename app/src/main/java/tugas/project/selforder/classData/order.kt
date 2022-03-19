package tugas.project.selforder.classData

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class order (var namaPesanan:String="",var banyakPesanan : String=""): Parcelable