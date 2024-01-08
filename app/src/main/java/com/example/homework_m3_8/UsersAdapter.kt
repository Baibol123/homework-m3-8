package com.example.homework_m3_8

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.homework_m3_8.databinding.ItemUserBinding

class UsersAdapter(
    private val list: List<Users>,
    private val onClick: (Users) -> Unit
) : RecyclerView.Adapter<UserViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        return UserViewHolder(
            ItemUserBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    private fun onItemClicked(users: Users) {
        onClick(users)
    }

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
        holder.onBind(list[position])
        holder.itemView.setOnClickListener { onItemClicked(list[position]) }
    }

    override fun getItemCount(): Int {
        return list.size
    }
}
