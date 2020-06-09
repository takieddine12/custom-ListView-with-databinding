package com.example.databinding

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import androidx.databinding.DataBindingUtil
import com.example.databinding.databinding.ItemRowBinding

class customAdapter(context: Context,var list : List<Model>) : ArrayAdapter<Model>(context,0) {

    lateinit var view : ItemRowBinding

    override fun getCount(): Int {
        return list.size
    }


    @SuppressLint("ViewHolder")
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        view = DataBindingUtil.inflate(LayoutInflater.from(context),R.layout.item_row,parent,false)
        val model = list[position]
            view.model = model
        return view.root
    }
}