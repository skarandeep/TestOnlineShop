package com.androidtest.testonlineshop.Contoller

import android.content.Intent
import android.nfc.cardemulation.CardEmulation.EXTRA_CATEGORY
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Layout
import android.widget.ListView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.androidtest.testonlineshop.R
import com.androidtest.testonlineshop.Services.DataService

class MainActivity : AppCompatActivity() {
    lateinit var adapter: CategoryAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = CategoryAdapter(this, DataService.categories){
            category ->
            val productIntent = Intent(this,ProductsActivity::class.java)
            productIntent.putExtra(EXTRA_CATEGORY, category.title)
            startActivity(productIntent)
        }

        val recyclerListView = findViewById<RecyclerView>(R.id.recyclerListView)
        recyclerListView.adapter = adapter

        val layoutManager = LinearLayoutManager(this)
        recyclerListView.layoutManager = layoutManager

        recyclerListView.setHasTransientState(true)


    }


}