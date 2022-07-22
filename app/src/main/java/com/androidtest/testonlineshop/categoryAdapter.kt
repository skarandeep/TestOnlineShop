package com.androidtest.testonlineshop

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.androidtest.testonlineshop.DataService.categories

class categoryAdapter (var context: Context, var categories: List<Category>, val itemClick: (Category) -> Unit):
    RecyclerView.Adapter<categoryAdapter.Holder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val view = LayoutInflater.from(context).inflate(R.layout.category_layout,parent,false)
        return Holder(view)
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        return categories.count()
    }

    inner class Holder (itemView: View): RecyclerView.ViewHolder(itemView){
        val categoryName = itemView?.findViewById<TextView>(R.id.categoryName)
        val categoryImage = itemView?.findViewById<ImageView>(R.id.categoryImage)

        fun bindCategory (category: Category, context: Context){
            val resourceID = context.resources.getIdentifier(category.image, "drawable",context.packageName)
            categoryImage?.setImageResource(resourceID)
            categoryName?.text = category.title
            itemView.setOnClickListener{itemClick(category)}
        }

    }
}