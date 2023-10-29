package com.example.todoapplicationarraylist;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

//public class TodoListAdaptor extends RecyclerView.Adapter<TodoListAdaptor.TodoViewHolder> {
//    ArrayList<TaskProperties> todoList = new ArrayList<>();
//    @NonNull
//    @Override
//    public TodoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
//        return new TodoViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.todo_card_layout , parent , false));
//    }
//
//    @Override
//    public void onBindViewHolder(@NonNull TodoViewHolder holder, int position) {
//        holder.todoChangeablePart.setText(todoList.get(position).getTodo());
//        holder.todoCountPart.setText(todoList.get(position).getCount());
//    }
//
//    @Override
//    public int getItemCount() {
//        return todoList.size();
//    }
//
//    public ArrayList<TaskProperties> createTodoList (TaskProperties todoItem){
//        todoList.add(todoItem);
//        return todoList;
//    }
//    public class TodoViewHolder extends RecyclerView.ViewHolder {
//        TextView todoChangeablePart;
//        TextView todoCountPart;
//        public TodoViewHolder(@NonNull View itemView) {
//            super(itemView);
//            todoCountPart = itemView.findViewById(R.id.contentType_tv);
//            todoChangeablePart = itemView.findViewById(R.id.changeableTaskItem_tv);
//        }
//    }
//}

//class TodoListAdaptor (val todoList : List<TaskProperties>) : RecyclerView.Adapter<TodoListAdaptor.ViewHolder>(){
//
//        }

//class TodosAdaptor (var todosList : List<TaskProperties>) : RecyclerView.Adapter<TodosAdaptor.ViewHolder>(){}