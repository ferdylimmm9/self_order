package tugas.project.selforder.data

import tugas.project.selforder.classData.harga

object dataHarga {

    private val totalHarga =  arrayOf("Total Harga")
    private val valueHarga = arrayOf("Rp250.000")
    val listData : ArrayList<harga>get(){
        val list= arrayListOf<harga>()
        for (i in totalHarga.indices){
            val harga = harga()
            harga.totalHarga = totalHarga[i]
            harga.valueHarga = valueHarga[i]
            list.add(harga)
        }
        return list
    }
}