package tugas.project.selforder.fragment

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import tugas.project.selforder.R
import tugas.project.selforder.adapter.OngoingRecycler
import tugas.project.selforder.data.dataOngoing
import tugas.project.selforder.databinding.FragmentOngoingBinding

class Ongoing : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = FragmentOngoingBinding.inflate(layoutInflater)

        view.recyclerOngoing.layoutManager = LinearLayoutManager(this@Ongoing.requireContext())
        view.recyclerOngoing.adapter = OngoingRecycler(dataOngoing.listData)

        return view.root
    }
}