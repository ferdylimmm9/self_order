package tugas.project.selforder.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import tugas.project.selforder.R
import tugas.project.selforder.adapter.DetailOrderRecycler
import tugas.project.selforder.adapter.ListOrderRecycler
import tugas.project.selforder.adapter.RingkasanHargaRecycler
import tugas.project.selforder.classData.ongoing
import tugas.project.selforder.data.dataHarga
import tugas.project.selforder.data.dataOngoing
import tugas.project.selforder.data.dataOrder

class Order : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_order)
        var data = intent.getParcelableExtra<ongoing>("content")
        val recycler = findViewById<RecyclerView>(R.id.recyclerOrder)
        val recycler1 = findViewById<RecyclerView>(R.id.recyclerDetail)
        val recycler2 = findViewById<RecyclerView>(R.id.recyclerBayar)
        recycler2.layoutManager = LinearLayoutManager(this)
        recycler1.layoutManager = LinearLayoutManager(this)
        recycler.layoutManager = LinearLayoutManager(this)
        recycler.adapter = DetailOrderRecycler(dataOngoing.listData)
        recycler1.adapter = ListOrderRecycler(data!!.listPesanan)
        recycler2.adapter = RingkasanHargaRecycler(dataHarga.listData)
    }
}