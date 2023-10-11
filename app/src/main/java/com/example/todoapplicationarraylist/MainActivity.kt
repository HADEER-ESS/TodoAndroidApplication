package com.example.todoapplicationarraylist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.todoapplicationarraylist.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    private var adaptor : TodoListAdaptor = TodoListAdaptor()

    override fun onCreate(savedInstanceState: Bundle?) {

        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

//        binding.TaskCardRv.setAdaptor(adaptor)

//        binding.TaskCardRv.layoutManager(LinearLayoutManager(this))
    }


}