package tugas.project.selforder.data

import tugas.project.selforder.classData.riwayat

object dataRiwayat {
   private val namaPartner = arrayOf("Mas Joko","Mas Budi","Mbak Beti")
   private val idPesanan = arrayOf("A00189","B22789","D09876")
   private val harga = arrayOf("- IDR250.000  ","- IDR500.000  ","- IDR725.000  " )
   val listData :ArrayList<riwayat>get() {
      val list= arrayListOf<riwayat>()
      for (i in namaPartner.indices){
         val riwayat = riwayat()
         riwayat.namaPartner = namaPartner[i]
         riwayat.idPesanan = idPesanan[i]
         riwayat.harga = harga[i]
         list.add(riwayat)
      }
      return list
   }
}