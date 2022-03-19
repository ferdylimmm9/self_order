package tugas.project.selforder.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.ProgressBar
import android.widget.Toast
import tugas.project.selforder.R
import kotlin.concurrent.thread

class Login : AppCompatActivity() {

    private val TAG = "MainActivity"
    lateinit var prog : ProgressBar
    lateinit var buttonLogin : Button
    lateinit var buttonRegister : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        supportActionBar?.hide()
        buttonLogin = findViewById(R.id.loginButton)
        prog = findViewById(R.id.progress_circular)
        buttonRegister = findViewById(R.id.daftar)
        prog.visibility = View.GONE

        buttonLogin.setOnClickListener {

            val handler = Handler()

            val runnable: Runnable = object : Runnable {
                override fun run() {
                    var count = 1
                    while (count < 3){
                        Log.i(TAG,"delay :$count")
                        count++
                        try {
                            Thread.sleep(3000)
                        } catch (e: InterruptedException) {
                            e.printStackTrace()
                        }
                    }
                    var intent = Intent(this@Login,MainActivity::class.java)
                    startActivity(intent)
                    handler.post { Toast.makeText(this@Login, "Login Success", Toast.LENGTH_SHORT).show()}
                    Log.i(TAG, "run: Login Success.")
                }
            }
            val thread = Thread(runnable)
            thread.start()

        }

        buttonRegister.setOnClickListener {
            startActivity(Intent(this@Login, Register1::class.java))
        }
    }
}