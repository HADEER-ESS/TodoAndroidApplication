package com.example.todoapplicationarraylist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.todoapplicationarraylist.databinding.ActivityMainBinding
import kotlin.collections.ArrayList

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    private var count = 2
    private var todos : ArrayList<TaskProperties> = arrayListOf(TaskProperties(1,"Hello"))

    override fun onCreate(savedInstanceState: Bundle?) {

        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val recyclerView : RecyclerView = binding.TaskCardRv

        val adaptor = TodosAdaptor(todos)

        recyclerView.adapter = adaptor

        recyclerView.layoutManager = LinearLayoutManager(this)
        
        binding.addTaskButtonBtn.setOnClickListener {
            var incomeTask =  binding.textInputTi.text
            var taskItem = TaskProperties(count , incomeTask.toString())
            todos.add(taskItem)
            count++
            Log.e("TASK LIST ..." , "$todos")
        }

    }

}

//    private fun addTodoItemsTodoList (item : TaskProperties):ArrayList<TaskProperties>{
//        var listArray = ArrayList<TaskProperties>()
//        listArray.add(item)
//        return  listArray
//    }

//        var todos : ArrayList<TaskProperties> =
//            arrayListOf(TaskProperties(1,"Hello") , TaskProperties(2,"Hello"))