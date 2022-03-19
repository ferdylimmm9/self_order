package tugas.project.selforder.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import tugas.project.selforder.databinding.FragmentSelesaiBinding

class Selesai : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = FragmentSelesaiBinding.inflate(layoutInflater)


        return view.root
    }
}