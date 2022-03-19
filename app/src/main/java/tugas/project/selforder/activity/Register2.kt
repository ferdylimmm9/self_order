package tugas.project.selforder.activity
import android.app.DatePickerDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import tugas.project.selforder.R
import java.util.*

class Register2 : AppCompatActivity() {
    lateinit var kalenderText : EditText
    lateinit var nextButton : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register2)
        nextButton = findViewById(R.id.next)
        var calender = Calendar.getInstance()
        val year = calender.get(Calendar.YEAR)
        val month = calender.get(Calendar.MONTH)
        supportActionBar?.hide()
        val date = calender.get(Calendar.DATE)
        kalenderText=findViewById(R.id.tanggalText)
        kalenderText.setOnClickListener {
            val dpd = DatePickerDialog(this,DatePickerDialog.OnDateSetListener {view,Myear,Mmonth,Mdate-> kalenderText.setText("$Mdate / ${Mmonth+1} / $Myear")}, year,month,date)
            dpd.show()
        }
        nextButton.setOnClickListener {
            startActivity(Intent(this@Register2,Register3::class.java))
        }

    }
}