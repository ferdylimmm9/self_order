package tugas.project.selforder.classData

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize
import tugas.project.selforder.R

@Parcelize
data class card (var charName: String ="", var balance: String ="", var cardBackground:Int = 0, var cardBalance:String = ""):Parcelable

