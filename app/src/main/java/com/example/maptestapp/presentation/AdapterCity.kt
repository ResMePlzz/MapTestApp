package com.example.maptestapp.presentation

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.maptestapp.R
import com.example.maptestapp.domain.MapKitModel.Component
import com.example.maptestapp.domain.MapKitModel.CountryModel
import kotlinx.android.synthetic.main.item_city.view.*

class AdapterCity:RecyclerView.Adapter<AdapterCity.MyViewHolder>() {

    var listCity = emptyList<Component>()

    class MyViewHolder(view:View):RecyclerView.ViewHolder(view) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context).
        inflate(R.layout.item_city,parent,false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.itemView.adapter_city.text = listCity[position].name
    }

    override fun getItemCount(): Int {
        return listCity.size
    }

    @SuppressLint("NotifyDataSetChanged")
    fun setList(list: List<Component>){
        listCity = list
        notifyDataSetChanged()
    }
}