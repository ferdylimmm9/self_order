package tugas.project.selforder.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import tugas.project.selforder.R
import tugas.project.selforder.activity.Order
import tugas.project.selforder.classData.ongoing

class OngoingRecycler(val listData : ArrayList<ongoing>)
    : RecyclerView.Adapter<OngoingRecycler.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): OngoingRecycler.ViewHolder{
        val view = LayoutInflater.from(parent.context).inflate(R.layout.recycler_ongoing,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: OngoingRecycler.ViewHolder, position: Int) {
        var ongoing = listData[position]
        holder.logoRestoran.setImageResource(ongoing.logoRestoran)
        holder.namaPartner.text = ongoing.namaPartner
        holder.idPesanan.text = ongoing.idPesanan
        holder.itemView.setOnClickListener {
            val intent = Intent(holder.itemView.context, Order::class.java)
            intent.putExtra("content",ongoing)
            it.context.startActivity(intent)
        }
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
