package com.dst.unified.recycler.items.singletext

import androidx.annotation.StyleRes
import com.dst.unified.recycler.NotifiableRecyclerItem
import com.dst.unified.recycler.UnifiedRecyclerAdapter
import com.dst.unified.recycler.items.R

open class SingleTextItemMutable(text: String, position: Int, adapter: UnifiedRecyclerAdapter) :
    NotifiableRecyclerItem(position, adapter), SingleTextItemContract {

    var text: String = text
        set(value) {
            field = value
            notifyItemChanged()
        }

    var textAppearance: Int = R.style.TextAppearance_MaterialComponents_Body1
        set(value) {
            field = value
            notifyItemChanged()
        }

    private var isHtml: Boolean = false

    fun setIsHtml(isHtml: Boolean) {
        this.isHtml = isHtml
        notifyItemChanged()
    }

    constructor(text: String, @StyleRes textAppearance: Int, isHtml: Boolean, position: Int, adapter: UnifiedRecyclerAdapter) : this(text, position, adapter) {
        this.textAppearance = textAppearance
        this.isHtml = isHtml
    }

    override fun textAppearance(): Int {
        return textAppearance
    }

    override fun text(): String {
        return text
    }

    override fun isHtml(): Boolean {
        return isHtml
    }

    override fun viewType(position: Int): Int {
        return SingleTextHolder.viewType
    }

}