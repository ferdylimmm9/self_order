package tugas.project.selforder.data

import tugas.project.selforder.classData.ongoing
import tugas.project.selforder.classData.order

object dataOrder {

    private val namaPesanan =  arrayOf("Paket Steak Ber-empat")
    private val banyakPesanan = arrayOf("1")
    val listData : ArrayList<order>get(){
        val list= arrayListOf<order>()
        for (i in namaPesanan.indices){
            val order = order()
            order.namaPesanan = namaPesanan[i]
            order.banyakPesanan = banyakPesanan[i]
            list.add(order)
        }
        return list
    }
}