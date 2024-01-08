package com.example.homework_m3_8

import android.os.Build
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.RequiresApi
import com.example.homework_m3_8.databinding.FragmentUsersBinding


class UsersFragment : Fragment() {
    private lateinit var binding: FragmentUsersBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentUsersBinding.inflate(inflater, container, false)
        return binding.root
    }

    @RequiresApi(Build.VERSION_CODES.TIRAMISU)
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        arguments?.getSerializable(MainActivity.USERS, Users::class.java)?.apply{
            binding.itemUserName.text = name
            binding.itemUserStatus.text = status

            binding.itemUserImage.setImage(imageURL)
        }
    }
}
