package com.example.todoapplicationarraylist

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class TodosAdaptor(private val todos : List<TaskProperties>) : RecyclerView.Adapter<TodosAdaptor.ViewHolder>(){

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        // Your holder should contain and initialize a member variable
        // for any view that will be set as you render a row
        val todoCount: TextView = itemView.findViewById<TextView>(R.id.contentType_tv)
        val todoText: TextView = itemView.findViewById<TextView>(R.id.changeableTaskItem_tv)
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TodosAdaptor.ViewHolder {
        val context = parent.context
        val inflater = LayoutInflater.from(context)
        // Inflate the custom layout
        val contactView = inflater.inflate(R.layout.todo_card_layout, parent, false)
        // Return a new holder instance
        return ViewHolder(contactView)
    }

    override fun getItemCount(): Int {
        return todos.size
    }

    @SuppressLint("SetTextI18n")
    override fun onBindViewHolder(viewHolder: TodosAdaptor.ViewHolder, position: Int) {
        // Get the data model based on position
        val todoItem: TaskProperties = todos[position]
        // Set item views based on your views and data model
        val textView = viewHolder.todoText
        textView.text = todoItem.todo
        val todosCount = viewHolder.todoCount
        todosCount.text ="Task ${todoItem.count.toString()}"
    }
}