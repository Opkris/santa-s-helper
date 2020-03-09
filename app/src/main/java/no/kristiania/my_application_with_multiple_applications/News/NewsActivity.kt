package no.kristiania.my_application_with_multiple_applications.News

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_news.*
import no.kristiania.my_application_with_multiple_applications.R

class NewsActivity : AppCompatActivity() {

    companion object {
        val TAG = "NewsActivity"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.title = "News"
        setContentView(R.layout.activity_news)

        news_activity_amta.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse ("http://www.amta.no"))
            startActivity(intent)
        }

        news_activity_vg.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse ("http://www.vg.no"))
            startActivity(intent)
        }

        news_activity_tek.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse ("http://www.tek.no"))
            startActivity(intent)
        }

        news_activity_nrk.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse ("http://www.nrk.no"))
            startActivity(intent)
        }

        news_activity_tv2.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse ("http://www.tv2.no"))
            startActivity(intent)
        }

        news_activity_dinside.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse ("http://www.dinside.no"))
            startActivity(intent)
        }

        news_activity_aftenposten.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse ("http://www.aftenposten.no"))
            startActivity(intent)
        }

        news_activity_dagbladet.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse ("http://www.dagbladet.no"))
            startActivity(intent)
        }

        news_activity_nettavisen.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse ("http://www.nettavisen.no"))
            startActivity(intent)
        }

        news_activity_addressavisen.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse ("http://www.adresseavisen.no"))
            startActivity(intent)
        }

        news_activity_e24.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse ("http://www.e24.no"))
            startActivity(intent)
        }

        news_activity_BT.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse ("http://www.bt.no"))
            startActivity(intent)
        }

        news_activity_dagens_nliv.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse ("http://www.dn.no"))
            startActivity(intent)
        }

        news_activity_sol.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse ("http://www.sol.no"))
            startActivity(intent)
        }

        news_activity_abc.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse ("http://www.abc.no"))
            startActivity(intent)
        }



    }
}