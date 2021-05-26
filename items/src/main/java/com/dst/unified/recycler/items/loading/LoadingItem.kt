package com.dst.unified.recycler.items.loading

import com.dst.unified.recycler.NotifiableRecyclerItem
import com.dst.unified.recycler.UnifiedRecyclerAdapter


open class LoadingItem(position: Int, adapter: UnifiedRecyclerAdapter) :
    NotifiableRecyclerItem(position, adapter) {

    override fun viewType(position: Int): Int {
        return LoadingItemHolder.viewType
    }
}