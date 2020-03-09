package no.kristiania.my_application_with_multiple_applications

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*
import no.kristiania.my_application_with_multiple_applications.News.NewsActivity
import no.kristiania.my_application_with_multiple_applications.calculator.CalculatorActivity
import no.kristiania.my_application_with_multiple_applications.school.SchoolActivity
import no.kristiania.my_application_with_multiple_applications.sqLite.SQLiteActivity

class MainActivity : AppCompatActivity() {

    companion object{
        val TAG = "MainActivity"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.title = "Home"
        setContentView(R.layout.activity_main)



        activity_main_button_news.setOnClickListener {
            Log.d(TAG, "Clicking on News paper button")
            val intent = Intent(this, NewsActivity::class.java)
            startActivity(intent)
        }


        activity_main_button_calculator.setOnClickListener {
            Log.d(TAG,"Clicking on Calculator button")
            val intent = Intent(this, CalculatorActivity::class.java)
            startActivity(intent)
        }

        activity_main_button_school.setOnClickListener {
            Log.d(TAG,"Clicking on school button")
            val intent = Intent(this, SchoolActivity::class.java)
            startActivity(intent)
        }

        activity_main_button_db.setOnClickListener {
            Log.d(TAG,"Clicking on SQLite button")
            val intent = Intent(this, SQLiteActivity::class.java)
            startActivity(intent)

        }
    }
}
