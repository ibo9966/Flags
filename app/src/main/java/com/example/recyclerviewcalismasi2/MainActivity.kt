package com.example.recyclerviewcalismasi2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    val alUlkeler = ArrayList<Ulke>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        alUlkeler.add(Ulke("Almanya",R.drawable.almanya))
        alUlkeler.add(Ulke("Bosna Hersek",R.drawable.bosnahersek))
        alUlkeler.add(Ulke("Bulgaristan",R.drawable.bulgaristan))
        alUlkeler.add(Ulke("Estonya",R.drawable.estonya))
        alUlkeler.add(Ulke("Fransa",R.drawable.fransa))
        alUlkeler.add(Ulke("Hollanda",R.drawable.hollanda))
        alUlkeler.add(Ulke("İspanya",R.drawable.ispanya))
        alUlkeler.add(Ulke("İtalya",R.drawable.italya))
        alUlkeler.add(Ulke("Norveç",R.drawable.norvec))
        alUlkeler.add(Ulke("Romanya",R.drawable.romanya))
        alUlkeler.add(Ulke("Rusya",R.drawable.rusya))
        alUlkeler.add(Ulke("Slovakya",R.drawable.slovakya))
        alUlkeler.add(Ulke("Slovenya",R.drawable.slovenya))
        alUlkeler.add(Ulke("Türkiye",R.drawable.turkiye))
        alUlkeler.add(Ulke("Yunanistan",R.drawable.yunanistan))
        alUlkeler.add(Ulke("Afganistan", R.drawable.afganistan))
        alUlkeler.add(Ulke("Andorra", R.drawable.andorra))
        alUlkeler.add(Ulke("Angola", R.drawable.angola))
        alUlkeler.add(Ulke("Arjantin", R.drawable.arjantin))
        alUlkeler.add(Ulke("Arnavutluk", R.drawable.arnavutluk))
        alUlkeler.add(Ulke("Avustralya", R.drawable.avustralya))
        alUlkeler.add(Ulke("Azerbaycan", R.drawable.azerbaycan))
        alUlkeler.add(Ulke("Bahreyn", R.drawable.bahreyn))
        alUlkeler.add(Ulke("Barbados", R.drawable.barbados))
        alUlkeler.add(Ulke("Belarus", R.drawable.belarus))
        alUlkeler.add(Ulke("Belçika", R.drawable.belcika))
        alUlkeler.add(Ulke("Benin", R.drawable.benin))
        alUlkeler.add(Ulke("Bhutan", R.drawable.bhutan))
        alUlkeler.add(Ulke("Brezilya", R.drawable.brezilya))
        alUlkeler.add(Ulke("Çin", R.drawable.cin))
        alUlkeler.add(Ulke("Danimarka", R.drawable.danimarka))
        alUlkeler.add(Ulke("Dominik Cumhuriyeti", R.drawable.dominik))
        alUlkeler.add(Ulke("Portekiz", R.drawable.portekiz))
        alUlkeler.add(Ulke("Kosova", R.drawable.kosova))
        alUlkeler.add(Ulke("Kıbrıs", R.drawable.kibris))
        alUlkeler.add(Ulke("Tayland", R.drawable.tayland))






        val adapter = UlkeAdapter(alUlkeler,this::RvItem_OnClick)
        rvUlkeler.adapter=adapter

        val layoutManager=LinearLayoutManager(this)
        layoutManager.orientation = LinearLayoutManager.VERTICAL
        rvUlkeler.layoutManager=layoutManager

        rvUlkeler.addItemDecoration(DividerItemDecoration(this,layoutManager.orientation))

    }
    fun RvItem_OnClick(position:Int){
        Toast.makeText(this,alUlkeler.get(position).ad,Toast.LENGTH_SHORT).show()
    }
}