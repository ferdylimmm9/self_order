package tugas.project.selforder.data

import tugas.project.selforder.R
import tugas.project.selforder.classData.partner

object dataPartner {
    val kotaPartner = arrayOf("Medan", "Binjai", "Stabat")
    val namaPartner = arrayOf("Mas Joko", "Mas Budi", "Mbak Beti")
    val profilePartner = intArrayOf(R.drawable.reservation, R.drawable.reservation, R.drawable.reservation)
    val harga = arrayOf("Mulai Rp200.000","Mulai Rp500.000","Mulai Rp700.000")

    val listData: ArrayList<partner>get() {

        var list = arrayListOf<partner>()

        for (i in kotaPartner.indices){
            var partner = partner()
            partner.kotaPartner = kotaPartner[i]
            partner.namaPartner = namaPartner[i]
            partner.profilePartner = profilePartner[i]
            partner.harga = harga[i]
            list.add(partner)
        }
        return list
    }
}