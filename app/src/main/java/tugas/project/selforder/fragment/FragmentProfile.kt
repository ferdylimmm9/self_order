package tugas.project.selforder.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import tugas.project.selforder.R
import tugas.project.selforder.databinding.FragmentHomeBinding
import tugas.project.selforder.databinding.FragmentProfileBinding


class FragmentProfile : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = FragmentProfileBinding.inflate(layoutInflater)
        activity!!.setTitle("Profile")
        return view.root
    }
}