package com.example.homework_m3_8
import android.widget.ImageView
import com.bumptech.glide.Glide
import java.io.Serializable
data class Users(val name: String, val imageURL: String, val status: String) : Serializable
fun ImageView.setImage(url: String) {
    Glide.with(this)
        .load(url)
        .into(this)
}
