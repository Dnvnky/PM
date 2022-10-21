package com.example.aula14_10

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
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

    override fun onCreateOptionsMenu(menu: Menu?): Boolean
    {
        menuInflater.inflate(R.menu.menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean
    {
        return when (item.itemId)
        {
            R.id.cidadesPortugal -> {
                Toast.makeText(this, "CidadesPortugal", Toast.LENGTH_SHORT).show()
                true
            }

            R.id.todasCidades -> {
                Toast.makeText(this, "CidadesPortugal", Toast.LENGTH_SHORT).show()
                true
            }

            else -> super.onOptionsItemSelected(item)
        }
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

