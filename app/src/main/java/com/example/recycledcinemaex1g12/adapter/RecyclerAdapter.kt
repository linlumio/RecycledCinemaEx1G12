package com.example.recycledcinemaex1g12.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.recycledcinemaex1g12.R


class RecycledAdapter(val list: List<Card>, var context:Context):RecyclerView.Adapter<RecycledAdapter.CosoViewHolder>() {
    lateinit var cardImage: ImageView

    inner class CosoViewHolder(view: View):RecyclerView.ViewHolder(view){
        val imageCard: ImageView
        val textTitle: TextView

        init {
            imageCard = view.findViewById(R.id.card_img)
            textTitle = view.findViewById(R.id.txt_title)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CosoViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.card, parent, false)
        return CosoViewHolder(view)
    }

    override fun onBindViewHolder(holder: CosoViewHolder, position: Int) {
        val boomerCard = list.get(position)
        holder.textTitle.text = boomerCard.title
        Glide.with(context)
            .load(boomerCard.url)
            .into(holder.imageCard)
    }

    override fun getItemCount(): Int = list.size




}