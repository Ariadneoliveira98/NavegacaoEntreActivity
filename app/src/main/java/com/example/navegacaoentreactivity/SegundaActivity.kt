package com.example.navegacaoentreactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_segunda.*

class SegundaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_segunda)


        button3.setOnClickListener {
            var intent = Intent(this, TerceiraActivity::class.java)

            startActivity(intent)
        }
    }
}