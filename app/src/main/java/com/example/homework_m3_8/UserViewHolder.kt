package com.example.homework_m3_8

import androidx.recyclerview.widget.RecyclerView
import com.example.homework_m3_8.databinding.ItemUserBinding

class UserViewHolder(private val binding: ItemUserBinding) : RecyclerView.ViewHolder(binding.root) {
    fun onBind(users: Users) {
        binding.usersName.text = users.name
        binding.userImage.setImage(users.imageURL)

        binding.usersStatus.text = users.status

    }
}
