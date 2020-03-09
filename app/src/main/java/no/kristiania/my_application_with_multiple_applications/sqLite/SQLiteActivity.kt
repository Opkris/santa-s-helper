package no.kristiania.my_application_with_multiple_applications.sqLite

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import no.kristiania.my_application_with_multiple_applications.R
import no.kristiania.my_application_with_multiple_applications.sqLite.Data.DatabaseHandler


class SQLiteActivity : AppCompatActivity() {

    private var btn_Store: Button? = null
    private var et_name: EditText? = null
    private var databaseHelper: DatabaseHandler? = null
    private var display_list: TextView? = null
    private var arrayList: ArrayList<String>? = null


    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.title = "SQLite"
        setContentView(R.layout.activity_sqlite)

        getAllFromSQLiteDB()

        btn_Store!!.setOnClickListener {

            databaseHelper!!.addGroceryDetail(et_name!!.text.toString())
            et_name!!.setText("")
            Toast.makeText(this@SQLiteActivity, "Stored Successfully!", Toast.LENGTH_SHORT).show()
            getAllFromSQLiteDB()
        }
    }

    @SuppressLint("SetTextI18n")
    private fun getAllFromSQLiteDB() {

        databaseHelper = DatabaseHandler(this)
        display_list = findViewById(R.id.display_list) as TextView
        btn_Store = findViewById(R.id.btnstore) as Button
        et_name = findViewById(R.id.enter_grocery) as EditText


        arrayList = databaseHelper!!.allGroceryItems
        display_list!!.text = ""
        for (i in arrayList!!.indices) {
            display_list!!.text = display_list!!.text.toString() + "\n" + arrayList!![i]
        }
    }
}