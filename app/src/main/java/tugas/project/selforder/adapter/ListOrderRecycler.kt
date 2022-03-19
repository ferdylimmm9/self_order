package tugas.project.selforder.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import tugas.project.selforder.R
import tugas.project.selforder.classData.ongoing
import tugas.project.selforder.classData.order

class ListOrderRecycler(val listData : ArrayList<order>)
    : RecyclerView.Adapter<ListOrderRecycler.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListOrderRecycler.ViewHolder{
        val view = LayoutInflater.from(parent.context).inflate(R.layout.recycler_detail_order,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListOrderRecycler.ViewHolder, position: Int) {
        holder.namaPesanan.text = listData[position].namaPesanan
        holder.banyakPesanan.text = listData[position].banyakPesanan
    }

    override fun getItemCount(): Int {
        return listData.size
    }

    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val namaPesanan : TextView = itemView.findViewById(R.id.namaPesanan)
        val banyakPesanan : TextView = itemView.findViewById(R.id.banyakPesanan)
    }
}
