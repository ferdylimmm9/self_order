package tugas.project.selforder.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import tugas.project.selforder.R
import tugas.project.selforder.classData.ongoing

class DetailOrderRecycler(val listData : ArrayList<ongoing>)
    : RecyclerView.Adapter<DetailOrderRecycler.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DetailOrderRecycler.ViewHolder{
        val view = LayoutInflater.from(parent.context).inflate(R.layout.recycler_ongoing,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: DetailOrderRecycler.ViewHolder, position: Int) {
        holder.logoRestoran.setImageResource(listData[position].logoRestoran)
        holder.namaPartner.text = listData[position].namaPartner
        holder.idPesanan.text = listData[position].idPesanan

    }

    override fun getItemCount(): Int {
        return listData.size
    }

    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val namaPartner : TextView = itemView.findViewById(R.id.namaPartner)
        val idPesanan : TextView = itemView.findViewById(R.id.idPesanan)
        val logoRestoran : ImageView = itemView.findViewById(R.id.logoRestoran)
    }
}
