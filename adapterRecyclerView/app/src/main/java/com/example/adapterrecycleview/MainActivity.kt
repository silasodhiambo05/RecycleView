package com.example.adapterrecycleview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

data class Names(val name: String, val age: Int, val hobby: String, val dob:String)

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvNames.layoutManager = LinearLayoutManager(baseContext)
        val namesAdapter = NamesRecyclerViewAdapter(namesList = listOf(
                Names("Merveille",14,"Dancing","11/2/2006"),
                Names("Nicklouse",22,"Football","11/2/1998"),
                Names("Brad",17,"Singing","14/4/2003"),
                Names("Buyole",20,"Poetry","11/2/2000"),
                Names("Monicah",19,"Singing","11/2/2001"),
                Names("Shelizah",20,"Reading Novels","11/7/2000"),
                Names("Lily",22,"Watching movies","11/2/1998"),
                Names("Rachel",14,"Poetry","11/4/2006"),
                Names("Kame",18,"Dancing","11/1/2001"),
                Names("Esther",21,"Reading Novels","10/4/1999")

            ))
            rvNames.adapter = namesAdapter
    }
}
