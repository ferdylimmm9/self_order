package tugas.project.selforder.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import tugas.project.selforder.R
import tugas.project.selforder.classData.riwayat

class RiwayatTransaksiRecycler(val listData : ArrayList<riwayat>)
    : RecyclerView.Adapter<RiwayatTransaksiRecycler.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RiwayatTransaksiRecycler.ViewHolder{
        val view = LayoutInflater.from(parent.context).inflate(R.layout.recycler_riwayat_transaksi,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: RiwayatTransaksiRecycler.ViewHolder, position: Int) {
        holder.namaPartner.text = listData[position].namaPartner
        holder.idPesanan.text = listData[position].idPesanan
        holder.harga.text = listData[position].harga
    }

    override fun getItemCount(): Int {
        return listData.size
    }

    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val namaPartner : TextView = itemView.findViewById(R.id.namaPartner)
        val idPesanan : TextView = itemView.findViewById(R.id.idPesanan)
        val harga: TextView = itemView.findViewById(R.id.harga)
    }
}
