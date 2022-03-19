package tugas.project.selforder.activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.widget.Button
import android.widget.ProgressBar
import tugas.project.selforder.R

class Register1 : AppCompatActivity() {
    lateinit var buttonNext: Button
    lateinit var prog : ProgressBar
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register1)
        supportActionBar?.hide()
        buttonNext = findViewById(R.id.next)
        prog = findViewById(R.id.progress)
        prog.visibility = View.GONE
        buttonNext.setOnClickListener {
            prog.visibility = View.VISIBLE
            Handler().postDelayed({
                startActivity(Intent(this@Register1,Register2::class.java))
            },3000)
        }
    }
}