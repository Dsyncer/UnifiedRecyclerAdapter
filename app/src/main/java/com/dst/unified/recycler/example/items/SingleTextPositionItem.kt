package com.dst.unified.recycler.example.items

import androidx.annotation.StyleRes
import com.dst.unified.recycler.UnifiedRecyclerAdapter
import com.dst.unified.recycler.example.R
import com.dst.unified.recycler.items.singletext.SingleTextItemMutable

class SingleTextPositionItem(
    position: Int,
    adapter: UnifiedRecyclerAdapter
) : SingleTextItemMutable("Position item", position, adapter) {

    constructor(position: Int, adapter: UnifiedRecyclerAdapter, @StyleRes textAppearance: Int): this(position, adapter)  {
        this.textAppearance = textAppearance
    }

    override fun text(): String {
        return "${this.text} on position: ${positionObserver.position}"
    }

    init {
        positionObserver.onPositionChangedListener = { newPosition ->
            textAppearance = if (newPosition % 5 == 0) {
                R.style.TextAppearance_MaterialComponents_Headline6
            } else {
                R.style.TextAppearance_MaterialComponents_Body1
            }
        }
    }
}