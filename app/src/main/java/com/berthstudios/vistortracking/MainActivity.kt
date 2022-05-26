package com.berthstudios.vistortracking

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity() {

    private lateinit var signInCard: CardView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        signInCard = findViewById(R.id.card_view_sign_in)

        signInCard.setOnClickListener {
            signInTapped()
        }

    }

    private fun signInTapped() {
      val intent = Intent(this, SignInActivity::class.java)
        startActivity(intent)
    }
}