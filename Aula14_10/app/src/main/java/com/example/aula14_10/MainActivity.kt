package com.example.aula14_10

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun Button_1(view: View)
    {
        val edit1 = findViewById<EditText>(R.id.e1)

        val text1 = findViewById<TextView>(R.id.t1)
        val msg = if (edit1.text.toString().toInt() >= 18)
        {
            "Maior de idade"
        }
        else
        {
            "Menor de idade"
        }

        Toast.makeText(this, edit1.text, Toast.LENGTH_SHORT).show()

        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()
        text1.text = msg
    }
}

