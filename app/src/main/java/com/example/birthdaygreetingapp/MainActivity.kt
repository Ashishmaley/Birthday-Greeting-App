package com.example.birthdaygreetingapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun createBirthdaycard(view : View) {
        val name = nameInput.editableText.toString()
        Toast.makeText(this, "Entered name is $name", Toast.LENGTH_SHORT).show()
        val intent = Intent(this,BirthdayCardActivity::class.java)
        intent.putExtra(BirthdayCardActivity.NAME_EXTRA,name)
        startActivity(intent)
    }
}