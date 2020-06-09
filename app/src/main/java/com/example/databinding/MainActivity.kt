package com.example.databinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.databinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val activityMainBinding : ActivityMainBinding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        setSupportActionBar(activityMainBinding.toolbar)
        val list = ArrayList<Model>()
        list.add(Model("David","Carlos","DavidCarlos@gmail.com"))
        list.add(Model("Tony","Monata","TonyMonata@gmail.com"))
        list.add(Model("Frederic","Lampo","FredericLampo@gmail.com"))
        list.add(Model("John","James","JohnJames@gmail.com"))
        list.add(Model("Bras","Carlos","BrasCarlos@gmail.com"))
        list.add(Model("Robert","Charles","RobertCharles@gmail.com"))
        list.add(Model("William","Daniel","WilliamDaniel@gmail.com"))
        activityMainBinding.listview.adapter = customAdapter(this,list)

    }
}