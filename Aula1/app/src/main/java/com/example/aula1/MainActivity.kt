package com.example.aula1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    { 
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        
        // setContentView(R.layout.activity_main2)
    }

    override fun onStart()
    {
        super.onStart()
        Log.d("TAG", "onStart")
    }

    override fun onResume()
    {
        super.onResume()
        Log.d("TAG", "onResume")
    }

    override fun onStop()
    {
        super.onStop()
        Log.d("TAG", "onStop")
    }

    fun clickBotao(view: View)
    {
        Toast.makeText(this, R.string.textapp, Toast.LENGTH_SHORT).show()
    }
}