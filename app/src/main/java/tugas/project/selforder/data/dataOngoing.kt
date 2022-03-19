package tugas.project.selforder.data

import tugas.project.selforder.R
import tugas.project.selforder.classData.ongoing

object dataOngoing {
    private val logoRestoran = intArrayOf(R.drawable.ic_baseline_restaurant_24)
    private val namaPartner =  arrayOf("Cust01", "Cust02", "Cust03", "Cust04", "Cust05", "Cust06")
    private val idPesanan = arrayOf("001", "002", "003", "004", "005", "006")
    private val listPesanan = arrayOf(
        arrayOf("Pesanan01", "Pesanan02", "Pesanan03", "Pesanan04", "Pesanan05"),
        arrayOf("Pesanan01", "Pesanan02", "Pesanan03"),
        arrayOf("Pesanan01", "Pesanan02", "Pesanan03", "Pesanan04"),
        arrayOf("Pesanan01", "Pesanan02", "Pesanan03", "Pesanan04", "Pesanan05", "Pesanan06"),
        arrayOf("Pesanan01", "Pesanan02", "Pesanan03", "Pesanan04", "Pesanan05", "Pesanan06"),
        arrayOf("Pesanan01", "Pesanan02", "Pesanan03", "Pesanan04", "Pesanan05", "Pesanan06")
    )
    private val jumlahPesanan =  arrayListOf(
        intArrayOf(3, 4, 3, 4, 3),
        intArrayOf(3, 4, 3),
        intArrayOf(3, 4, 3, 4),
        intArrayOf(3, 4, 3, 4, 3, 4),
        intArrayOf(3, 4, 3, 4, 3, 4),
        intArrayOf(3, 4, 3, 4, 3, 4)
    )
    val listData : ArrayList<ongoing>get(){
        val list= arrayListOf<ongoing>()
        for (i in namaPartner.indices){
            val ongoing = ongoing()
            ongoing.logoRestoran = logoRestoran[i]
            ongoing.namaPartner = namaPartner[i]
            ongoing.idPesanan = idPesanan[i]
            ongoing.statusPesanan = "diantarkan ke meja"
            ongoing.listPesanan+=listPesanan[i]
            ongoing.listJumlah+ jumlahPesanan[i]
            list.add(ongoing)
        }
        return list
    }

}