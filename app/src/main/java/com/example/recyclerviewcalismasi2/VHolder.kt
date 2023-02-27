package com.example.recyclerviewcalismasi2

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView.ViewHolder

class VHolder(itemView:View,itemClick:(position:Int)->Unit) : ViewHolder(itemView) {
    var ivResim:ImageView
    var tvAd:TextView

    init {
        ivResim=itemView.findViewById(R.id.imageView)
        tvAd=itemView.findViewById(R.id.textView)
        itemView.setOnClickListener {
            view->
            itemClick(adapterPosition)

        }
    }
}