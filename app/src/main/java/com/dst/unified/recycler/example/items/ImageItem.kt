package com.dst.unified.recycler.example.items

import com.dst.unified.recycler.RecyclerItem

class ImageItem(val imageUrl: String) : RecyclerItem {
    override fun viewType(position: Int): Int {
        return ImageItemHolder.viewType
    }
}