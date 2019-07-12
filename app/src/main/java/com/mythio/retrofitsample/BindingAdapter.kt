package com.mythio.retrofitsample

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide

@BindingAdapter("imageUrl")
fun bindImage(ivProfile: ImageView, imgUrl: String?) {
    ivProfile.let {
        Glide.with(ivProfile.context)
            .load(imgUrl)
            .into(ivProfile)
    }
}