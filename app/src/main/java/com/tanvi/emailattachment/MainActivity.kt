package com.tanvi.emailattachment

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Html
import android.view.Menu
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var tvTextView: TextView
    lateinit var button: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tvTextView =findViewById(R.id.tvTextView)
        button =findViewById(R.id.button)
    }
    fun sendHtmlEmail(view: View?) {
        val mailId = "tripathi.tanvi1996@gmail.com"
        val emailIntent = Intent(Intent.ACTION_SENDTO, Uri.fromParts("mailto", mailId, null))
        emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Subject text here")
        emailIntent.putExtra(Intent.EXTRA_TEXT, Html.fromHtml("<p><b>Some Content</b></p>" +
                "http://www.google.com" + "<small><p>More content</p></small>"))
        startActivity(Intent.createChooser(emailIntent, "Send email..."))
    }
}
