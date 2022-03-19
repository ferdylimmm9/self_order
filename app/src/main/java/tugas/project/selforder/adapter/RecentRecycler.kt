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
import tugas.project.selforder.activity.Partner1
import tugas.project.selforder.activity.RiwayatPayment1
import tugas.project.selforder.classData.partner

class RecentRecycler(
    var listData:ArrayList<partner>)
    : RecyclerView.Adapter<RecentRecycler.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecentRecycler.ViewHolder{
        val view = LayoutInflater.from(parent.context).inflate(R.layout.recycler_layout,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecentRecycler.ViewHolder, position: Int) {
        Glide.with(holder.itemView.context)
            .load(listData[position].profilePartner)
            .into(holder.profilePartner)
        holder.namaPartner.text = listData[position].namaPartner
        holder.kotaPartner.text = listData[position].kotaPartner
        holder.harga.text = listData[position].harga

        holder.itemView.setOnClickListener {
            var intent = Intent(it.context,RiwayatPayment1::class.java)
            it.context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return listData.size
    }

    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val profilePartner: ImageView = itemView.findViewById(R.id.profile_partner)
        val namaPartner : TextView = itemView.findViewById(R.id.nama_partner)
        val kotaPartner : TextView = itemView.findViewById(R.id.kota_partner)
        val harga: TextView = itemView.findViewById(R.id.harga)
    }
}