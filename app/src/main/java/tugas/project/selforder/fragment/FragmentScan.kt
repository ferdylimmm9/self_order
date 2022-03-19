package tugas.project.selforder.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import tugas.project.selforder.R
import tugas.project.selforder.databinding.FragmentHomeBinding
import tugas.project.selforder.databinding.FragmentScanBinding


class FragmentScan : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = FragmentScanBinding.inflate(layoutInflater)
        activity!!.setTitle("Scan")
        return view.root
    }
}