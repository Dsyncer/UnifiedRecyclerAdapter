package com.dst.unified.recycler.example.items

import android.view.View
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.dst.unified.recycler.UnifiedViewHolder
import com.dst.unified.recycler.UnifiedViewHolderType
import com.dst.unified.recycler.example.R

class ImageItemHolder(itemView: View) : UnifiedViewHolder<ImageItem>(itemView) {
    private val image: ImageView = itemView.findViewById(R.id.rc_image_item)

    override fun bind(item: ImageItem, position: Int) {
        Glide.with(image).load(item.imageUrl).into(image)
    }

    companion object Type : UnifiedViewHolderType<ImageItem>(11, R.layout.rc_image_item, ImageItemHolder::class.java)
}