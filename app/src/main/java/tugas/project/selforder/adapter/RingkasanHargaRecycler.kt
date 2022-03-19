package tugas.project.selforder.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import tugas.project.selforder.R
import tugas.project.selforder.classData.harga

class RingkasanHargaRecycler(val listData : ArrayList<harga>)
    : RecyclerView.Adapter<RingkasanHargaRecycler.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RingkasanHargaRecycler.ViewHolder{
        val view = LayoutInflater.from(parent.context).inflate(R.layout.recycler_ringkasan_harga,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: RingkasanHargaRecycler.ViewHolder, position: Int) {
        holder.totalHarga.text = listData[position].totalHarga
        holder.valueHarga.text = listData[position].valueHarga
    }

    override fun getItemCount(): Int {
        return listData.size
    }

    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val totalHarga : TextView = itemView.findViewById(R.id.totalHarga)
        val valueHarga : TextView = itemView.findViewById(R.id.valueHarga)
    }
}
