package com.dst.unified.recycler.items.singletext

import androidx.annotation.StyleRes
import com.dst.unified.recycler.RecyclerItem

interface SingleTextItemContract : RecyclerItem {
    @StyleRes
    fun textAppearance(): Int
    fun text(): String
    fun isHtml(): Boolean
}