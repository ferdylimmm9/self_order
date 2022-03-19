package tugas.project.selforder.activity

import android.content.Intent
import android.graphics.Bitmap
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.provider.MediaStore
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.Toast
import tugas.project.selforder.R

class Register3 : AppCompatActivity() {
    lateinit var imgButton : ImageButton
    lateinit var imgView : ImageView
    lateinit var next : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register3)
        supportActionBar?.hide()
        imgButton = findViewById(R.id.camera)
        imgView = findViewById(R.id.imgView)
        next = findViewById(R.id.next)
        imgButton.setOnClickListener {
            startActivityForResult(Intent(MediaStore.ACTION_IMAGE_CAPTURE),101)

        }
        next.setOnClickListener {
            Toast.makeText(this,"Tunggu Sejenak",Toast.LENGTH_SHORT).show()
            Handler().postDelayed({
                startActivity(Intent(this@Register3,splash_screen_pendaftaran::class.java))
            },2000)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if(requestCode==101){
            var pic = data?.getParcelableExtra<Bitmap>("data")
            imgView.setImageBitmap(pic)
        }
    }
}