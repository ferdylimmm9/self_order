package tugas.project.selforder.activity

import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.SwitchCompat
import androidx.appcompat.widget.Toolbar
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import tugas.project.selforder.R
import tugas.project.selforder.classData.card


private const val EXTRA_STATUS = "EXTRA_STATUS"
class Payment1 : AppCompatActivity() {
    private var isSwitchOn:Boolean = true
    lateinit var balance: TextView
    lateinit var name : TextView
    lateinit var imageView: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_payment1)

        val toolbar = findViewById<Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)
        val actionBar = supportActionBar
        actionBar?.setDisplayShowTitleEnabled(false)
        actionBar?.setDisplayHomeAsUpEnabled(true)
        actionBar?.setHomeAsUpIndicator(R.drawable.ic_baseline_close_24)

        var dataIntent = intent.getParcelableExtra<card>("card")
        val switch = findViewById<SwitchCompat>(R.id.switchOn)
        switch.setOnCheckedChangeListener { buttonView, isChecked ->
            if(isChecked){
                isSwitchOn = true
                Toast.makeText(this, "${dataIntent!!.charName} menjadi metode pembayaran utamamu!", Toast.LENGTH_SHORT).show()
            }
            else {
                isSwitchOn = false
                Toast.makeText(this, "${dataIntent!!.charName} tidak menjadi metode pembayaran utamamu!", Toast.LENGTH_SHORT).show()
            }
        }
        balance = findViewById(R.id.cardBalance)
        name = findViewById(R.id.cardName)
        imageView = findViewById(R.id.cardBackground)
        balance.text = dataIntent!!.cardBalance
        name = findViewById(R.id.cardName)
        name.text = dataIntent!!.charName
        imageView.setImageResource(dataIntent!!.cardBackground)
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.getBoolean(EXTRA_STATUS,isSwitchOn)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        isSwitchOn = savedInstanceState.getBoolean(EXTRA_STATUS)
    }
}