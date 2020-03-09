package no.kristiania.my_application_with_multiple_applications.sqLite.Data


import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import android.util.Log




class DatabaseHandler(context: Context) : SQLiteOpenHelper(context, DATABASE_NAME, null, DATABASE_VERSION) {

    companion object {

        var DATABASE_NAME = "Grocery_database"
        private val DATABASE_VERSION = 1
        private val TABLE_NAME = "grocery"
        private val KEY_ID = "id"
        private val KEY_GROCERYNAME = "name"

        /*CREATE TABLE  ( id INTEGER PRIMARY KEY AUTOINCREMENT, name TEXT, phone_number TEXT......);*/
        private val CREATE_TABLE_GROCERY = ("CREATE TABLE "
                + TABLE_NAME + "(" + KEY_ID
                + " INTEGER PRIMARY KEY AUTOINCREMENT," + KEY_GROCERYNAME + " TEXT );")
    }

    // looping through all rows and adding to list
    // adding to grocery list
    val allGroceryItems: ArrayList<String>
        get() {
            val studentsArrayList = ArrayList<String>()
            var name = ""
            val selectQuery = "SELECT  * FROM $TABLE_NAME"
            val db = this.readableDatabase
            val c = db.rawQuery(selectQuery, null)
            if (c.moveToFirst()) {
                do {
                    name = c.getString(c.getColumnIndex(KEY_GROCERYNAME))
                    studentsArrayList.add(name)
                } while (c.moveToNext())
                Log.d("array", studentsArrayList.toString())
            }
            return studentsArrayList
        }

    init {

        Log.d("DatabaseHandler", CREATE_TABLE_GROCERY)
    }

    override fun onCreate(db: SQLiteDatabase) {
        db.execSQL(CREATE_TABLE_GROCERY)
    }

    override fun onUpgrade(db: SQLiteDatabase, oldVersion: Int, newVersion: Int) {
        db.execSQL("DROP TABLE IF EXISTS '$TABLE_NAME'")
        onCreate(db)
    }

    fun addGroceryDetail(student: String): Long {
        val db = this.writableDatabase
        // Creating content values
        val values = ContentValues()
        values.put(KEY_GROCERYNAME, student)
        // insert row in grocery table

        return db.insert(TABLE_NAME, null, values)
    }
}