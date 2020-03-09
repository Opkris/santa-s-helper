package no.kristiania.my_application_with_multiple_applications.school

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_school.*
import no.kristiania.my_application_with_multiple_applications.R


class SchoolActivity : AppCompatActivity() {

    companion object {
        val TAG = "NewsActivity"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.title = "School stuff"
        setContentView(R.layout.activity_school)


        activity_school_timeEdit_link.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse ("https://cloud.timeedit.net/kristiania/web/student/ri15485Qg33Z3YQ3Zx7Q0.html"))
            startActivity(intent)
        }

        activity_school_programing_link.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse ("https://www.kristiania.no/studier/bachelor/informasjonsteknologi-programmering/"))
            startActivity(intent)
        }

        activity_school_booking_of_rooms_link.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse ("https://cloud.timeedit.net/kristiania/web/student/ri1Q55.html"))
            startActivity(intent)
        }

        activity_school_studentweb_link.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse ("https://fsweb.no/studentweb/index.jsf"))
            startActivity(intent)
        }
    }
}