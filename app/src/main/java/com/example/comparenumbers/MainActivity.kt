package com.example.comparenumbers

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.example.comparenumbers.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.testar_button).setOnClickListener {
            compare(it)
        }
    }
    private fun compare(view: View){
        val valor1 = findViewById<EditText>(R.id.val1)
        val valor2 = findViewById<EditText>(R.id.val2)

            val num1 = Integer.parseInt(valor1.text.toString())
            val num2 = Integer.parseInt(valor2.text.toString())

        if(num1 > num2){
            Toast.makeText(this, "O primeiro valor é maior", Toast.LENGTH_SHORT).show()
        }
        if(num2 >num1){
            Toast.makeText(this, "O segundo valor é maior", Toast.LENGTH_SHORT).show()
        }
        else{
            Toast.makeText(this, "Os valores são iguais", Toast.LENGTH_SHORT).show()
        }
    }
}