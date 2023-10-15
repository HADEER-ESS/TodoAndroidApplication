package com.example.todoapplicationarraylist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.todoapplicationarraylist.databinding.ActivityMainBinding
import java.util.ArrayList
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    //NEEDED
//    private lateinit var customAdaptor : CustomAdaptor

//    private var adaptor : TodoListAdaptor = TodoListAdaptor()
    private var count = 0
    private var todo = ArrayList<TaskProperties>()
    override fun onCreate(savedInstanceState: Bundle?) {

        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val recyclerView = binding.TaskCardRv
//        customAdaptor = CustomAdaptor(todo)
        recyclerView.layoutManager = LinearLayoutManager(this)

//        recyclerView.adapter = customAdaptor



        binding.addTaskButtonBtn.setOnClickListener {
            var incomeTask =  binding.textInputTi.text
            var taskItem = TaskProperties(count , incomeTask.toString())
            todo.add(taskItem)
            count++
            Log.e("TASK LIST ..." , "$todo")
        }

    }


}