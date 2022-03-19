package tugas.project.selforder.fragment

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import tugas.project.selforder.R
import tugas.project.selforder.activity.*
import tugas.project.selforder.adapter.CardRecycler
import tugas.project.selforder.adapter.RiwayatTransaksiRecycler
import tugas.project.selforder.data.dataCard
import tugas.project.selforder.data.dataRiwayat
import tugas.project.selforder.databinding.FragmentPaymentBinding

class FragmentPayment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = FragmentPaymentBinding.inflate(layoutInflater)

        view.recyclerCard.layoutManager = LinearLayoutManager(this@FragmentPayment.requireContext(), LinearLayoutManager.HORIZONTAL,false)
        view.recyclerRiwayatTransaksi.layoutManager = LinearLayoutManager(this@FragmentPayment.requireContext())
        view.recyclerCard.adapter = CardRecycler(dataCard.listData)
        view.recyclerRiwayatTransaksi.adapter = RiwayatTransaksiRecycler(dataRiwayat.listData)

        return view.root
    }
    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.header_pembayaran, menu)
        super.onCreateOptionsMenu(menu, inflater)
    }
}