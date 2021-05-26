package com.dst.unified.recycler.items.singletext

import androidx.annotation.StyleRes
import com.dst.unified.recycler.items.R

open class SingleTextItem(
    private val text: String,
    @StyleRes
    private val textAppearance: Int = R.style.TextAppearance_MaterialComponents_Body1,
    private val isHtml: Boolean = false
) : SingleTextItemContract {


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