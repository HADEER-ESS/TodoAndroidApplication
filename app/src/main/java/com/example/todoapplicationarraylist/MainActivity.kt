package com.example.todoapplicationarraylist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.todoapplicationarraylist.databinding.ActivityMainBinding
import java.util.ArrayList

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

//    private var adaptor : TodoListAdaptor = TodoListAdaptor()
    private var count = 0
    override fun onCreate(savedInstanceState: Bundle?) {

        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val recyclerView = binding.TaskCardRv
        recyclerView.layoutManager = LinearLayoutManager(this)

        var todo = ArrayList<TaskProperties>()

        binding.addTaskButtonBtn.setOnClickListener {
            var incomeTask =  binding.textInputTi.text
            var taskItem = TaskProperties(count , incomeTask.toString())
            todo.add(taskItem)
            count++
            Log.e("TASK LIST ..." , "$todo")
        }

//        val adapter = CustomAdapter(data)

        // Setting the Adapter with the recyclerview
//        recyclerView.adapter = adapter


    }


}