package tugas.project.selforder.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.widget.Toast
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView
import tugas.project.selforder.R

class MainActivity : AppCompatActivity() {
    lateinit var navController: NavController
    companion object{
        private const val STATE_FRAG = "state_frag"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if(savedInstanceState != null){
            navController.navigate(savedInstanceState.getInt(STATE_FRAG))
        }

        val botNav = findViewById<BottomNavigationView>(R.id.botNav)
        navController = findNavController(R.id.fragment)
        botNav.setupWithNavController(navController)
        botNav.setOnFocusChangeListener { v, hasFocus ->
            Toast.makeText(this,navController.currentDestination?.id.toString(),Toast.LENGTH_SHORT).show()
        }
    }
    fun notifOnClick(item: android.view.MenuItem) {
        Toast.makeText(this,navController.currentDestination?.id.toString(),Toast.LENGTH_SHORT).show()
/*        val intent = Intent(this, Notifikasi::class.java)
        startActivity(intent)*/
    }

    fun settingOnClick(item: android.view.MenuItem) {
        Toast.makeText(this,navController.currentDestination?.id.toString(),Toast.LENGTH_SHORT).show()
/*        val intent = Intent(this, SettingPayment::class.java)
        startActivity(intent)*/
    }

    override fun onSaveInstanceState(outState: Bundle) {
        outState.putInt(STATE_FRAG,navController.currentDestination!!.id)
        super.onSaveInstanceState(outState)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        supportActionBar?.title = savedInstanceState.getString(STATE_FRAG)
    }
}