package tugas.project.selforder.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import tugas.project.selforder.R
import tugas.project.selforder.activity.Payment1
import tugas.project.selforder.classData.card

class CardRecycler(
    private val listData: ArrayList<card>)
    : RecyclerView.Adapter<CardRecycler.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardRecycler.ViewHolder{
        val view = LayoutInflater.from(parent.context).inflate(R.layout.recycler_card,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: CardRecycler.ViewHolder, position: Int) {
        var card = listData[position]
        holder.cardName.text = card.charName
        holder.balance.text = card.balance
        holder.cardBalance.text = card.cardBalance

        Glide.with(holder.itemView.context)
            .load(card.cardBackground)
            .apply(RequestOptions.overrideOf(300,300))
            .into(holder.cardBackground)

        holder.itemView.setOnClickListener {
            val intent = Intent(holder.itemView.context,Payment1::class.java)
            intent.putExtra("card",card)
            it.context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return listData.size
    }

    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val cardBackground: ImageView = itemView.findViewById(R.id.cardBackground)
        val cardName : TextView = itemView.findViewById(R.id.cardName)
        val balance : TextView = itemView.findViewById(R.id.balance)
        val cardBalance: TextView = itemView.findViewById(R.id.cardBalance)
    }
}
