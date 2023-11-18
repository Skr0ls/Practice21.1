package ru.mggtk.practice211

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val webView: WebView = findViewById(R.id.web)
        val btn: Button = findViewById(R.id.button)
        btn.setOnClickListener {
            var runnable: Runnable = Runnable({
                val url = "https://github.com/skr0ls"

                webView.post(Runnable{
                    webView.loadUrl(url)
                })
            })
            val th: Thread = Thread(runnable)
            th.start()
        }
    }
}