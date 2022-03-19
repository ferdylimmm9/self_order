package tugas.project.selforder.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.ImageButton
import tugas.project.selforder.R

class splash_screen_pendaftaran : AppCompatActivity() {
    lateinit var next : ImageButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen_pendaftaran)
        supportActionBar?.hide()
        next = findViewById(R.id.next)
        next.setOnClickListener {
            startActivity(Intent(this@splash_screen_pendaftaran, MainActivity::class.java))
        }
    }
}