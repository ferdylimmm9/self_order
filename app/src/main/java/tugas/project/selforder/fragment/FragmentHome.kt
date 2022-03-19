package tugas.project.selforder.fragment

import android.content.Intent
import android.os.Bundle
import android.view.*
import android.widget.ArrayAdapter
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import tugas.project.selforder.R
import tugas.project.selforder.activity.*
import tugas.project.selforder.adapter.RecentRecycler
import tugas.project.selforder.adapter.RecommendedRecycler
import tugas.project.selforder.data.dataPartner
import tugas.project.selforder.databinding.FragmentHomeBinding


class FragmentHome : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = FragmentHomeBinding.inflate(layoutInflater)

        // Untuk Recycle View
        view.recyclerRecent.layoutManager = LinearLayoutManager(this@FragmentHome.requireContext(),LinearLayoutManager.HORIZONTAL,false)
        view.recyclerForYou.layoutManager = LinearLayoutManager(this@FragmentHome.requireContext(),LinearLayoutManager.HORIZONTAL,false)
        view.recyclerRecent.adapter = RecentRecycler(dataPartner.listData)
        view.recyclerForYou.adapter = RecommendedRecycler(dataPartner.listData)

        return view.root
    }


    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.menu_header, menu)
        super.onCreateOptionsMenu(menu, inflater)
    }
}