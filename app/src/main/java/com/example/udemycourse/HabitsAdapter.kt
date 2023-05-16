package com.example.udemycourse

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.single_card.view.*

class HabitsAdapter(val habits: List<Habit>) : RecyclerView.Adapter<HabitsAdapter.HabitViewHolder>() {

    class HabitViewHolder(val iv: View) : RecyclerView.ViewHolder(iv)

    // Create a new ViewHolder
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HabitViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.single_card, parent, false)
        return HabitViewHolder(view)
    }

    // Specifies the contents for the shown habit
    override fun onBindViewHolder(holder: HabitViewHolder, index: Int) {
        holder.iv.tv_title.text = habits[index].title
        holder.iv.tv_description.text = habits[index].description
        holder.iv.iv_icon.setImageResource(habits[index].image)
    }

    override fun getItemCount() = habits.size
}