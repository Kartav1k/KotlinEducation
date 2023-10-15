package com.example.myapplication

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class DateTimeAdapter(private val dateTimeList: List<DateItem>) :
    RecyclerView.Adapter<DateTimeAdapter.DateTimeViewHolder>() {

    class DateTimeViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val dateTextView: TextView = itemView.findViewById(R.id.dateText)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DateTimeViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.listelement, parent, false)
        return DateTimeViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: DateTimeViewHolder, position: Int) {
        val currentItem = dateTimeList[position]
        holder.dateTextView.text = currentItem.date
    }

    override fun getItemCount(): Int {
        return dateTimeList.size
    }
}