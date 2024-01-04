package com.extel.prefencedatastore

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val preferenceDatastore = PreferenceDatastore(this)

        val buttonAdd = findViewById<Button>(R.id.add)
        val buttonGet = findViewById<Button>(R.id.get)

        buttonAdd.setOnClickListener{
            CoroutineScope(Dispatchers.IO).launch {
                val userDetails = UserDetails("Aadil Ahmad", " 7006119399", 25)
                preferenceDatastore.setDetails(userDetails)
            }
        }

        buttonGet.setOnClickListener{
            CoroutineScope(Dispatchers.IO).launch {
                preferenceDatastore.getDetails().collect(){
                    withContext(Dispatchers.Main){
                        Log.d("aadar",it.toString())
                        Toast.makeText(this@MainActivity, it.toString(), Toast.LENGTH_SHORT).show()

                    }
                }
            }
        }
    }
}