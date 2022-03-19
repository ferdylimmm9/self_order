package tugas.project.selforder.fragment

import android.os.Bundle
import android.view.*
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import tugas.project.selforder.R
import tugas.project.selforder.adapter.ViewPagerAdapter
import tugas.project.selforder.databinding.FragmentOrdersBinding


class FragmentOrders : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = FragmentOrdersBinding.inflate(layoutInflater)

        val adapter = ViewPagerAdapter(childFragmentManager)
        adapter.addFragment(Ongoing(),"Sedang Berlangsung")
        adapter.addFragment(Selesai(),"Riwayat")
        view.viewPage.adapter = adapter
        view.tab.setupWithViewPager(view.viewPage)

        val fragmentOngoing = Ongoing()
        parentFragmentManager.beginTransaction().replace(R.id.viewPage,fragmentOngoing).commit()


        return view.root
    }


}