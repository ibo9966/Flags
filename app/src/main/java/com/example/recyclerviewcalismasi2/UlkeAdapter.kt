package com.example.recyclerviewcalismasi2

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.list_item.view.*

class UlkeAdapter(var alListe:ArrayList<Ulke>,itemClick:(position:Int)->Unit) : RecyclerView.Adapter<VHolder>() {

    val itemClick = itemClick
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.list_item,parent,false)
        return VHolder(v,itemClick)
    }

    override fun onBindViewHolder(holder: VHolder, position: Int) {
        holder.tvAd.text=alListe.get(position).ad
        holder.ivResim.setImageResource(alListe.get(position).bayrakId)
    }

    override fun getItemCount(): Int {
        return alListe.size
    }
}