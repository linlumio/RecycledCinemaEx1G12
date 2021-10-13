package com.example.recycledcinemaex1g12

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recycledcinemaex1g12.adapter.RecycledAdapter

class MainActivity : AppCompatActivity() {
    lateinit var recycler:RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //richiesta al server

        //salvataggio dati

        //preparazione lista

        //lista in view
        recycler = findViewById(R.id.recycled_view)
        recycler.layoutManager = LinearLayoutManager(this)
        recycler.adapter = RecycledAdapter(listona, this)
    }
}