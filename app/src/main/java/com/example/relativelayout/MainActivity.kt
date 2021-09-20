package com.example.relativelayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity()
{
    lateinit var editNome: EditText //faz com que espere até que o momento seja propício para criação da variável.
    lateinit var editPassword: EditText
    override fun onCreate(savedInstanceState: Bundle?)
    {
        Log.i("LIFE_CYCLE", "OnCreat")
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonOk = findViewById<Button>(R.id.btn_ok)
        editPassword = findViewById<EditText>(R.id.edit_password)
        editNome = findViewById<EditText>(R.id.edit_nome)

    }

    override fun onStart() {
        super.onStart()
        Log.i("LIFE_CYCLE", "OnStart")
    }

    override fun onResume() {
        super.onResume()
        Log.i("LIFE_CYCLE", "OnResume")
    }

    override fun onPause() {
        super.onPause()
        Log.i("LIFE_CYCLE", "OnPause")
    }

    override fun onStop() {
        super.onStop()
        Log.i("LIFE_CYCLE", "OnStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("LIFE_CYCLE", "OnDestroy")
    }
//    fun validar (){
//        if (editNo)
//    }
}