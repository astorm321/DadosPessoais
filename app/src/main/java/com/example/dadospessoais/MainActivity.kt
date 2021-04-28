package com.example.dadospessoais

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    companion object {
        const val INFO_EXTRA_NAME = "NAME"
        const val INFO_EXTRA_EMAIL = "EMAIL"
        const val INFO_EXTRA_PHONE = "PHONE"
        const val INFO_EXTRA_AGE = "AGE"


    }

    fun enviaDados(view: View) {
        val edittextname = findViewById<EditText>(R.id.edittextname)
        val name = edittextname.text.toString()

        val EditTextEmail = findViewById<EditText>(R.id.EditTextEmail)
        val Email = EditTextEmail.text.toString()

        val editTextPhone = findViewById<EditText>(R.id.editTextPhone)
        val phone = editTextPhone.text.toString()

        val editTextAge = findViewById<EditText>(R.id.editTextAge)
        val age = editTextAge.text.toString()

        val intent = Intent(this, MostraDados::class.java).apply {
            putExtra(INFO_EXTRA_NAME, name)
            putExtra(INFO_EXTRA_EMAIL, Email)
            putExtra(INFO_EXTRA_PHONE, phone)
            putExtra(INFO_EXTRA_AGE, age)
        }

    }
}