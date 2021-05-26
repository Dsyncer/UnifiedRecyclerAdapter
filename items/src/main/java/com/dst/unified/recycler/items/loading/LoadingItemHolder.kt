package com.dst.unified.recycler.items.loading

import android.view.View
import android.widget.ProgressBar
import com.dst.unified.recycler.UnifiedViewHolder
import com.dst.unified.recycler.UnifiedViewHolderType
import com.dst.unified.recycler.items.R

open class LoadingItemHolder(itemView: View) : UnifiedViewHolder<LoadingItem>(itemView) {

    val progressBar: ProgressBar = itemView.findViewById(R.id.rc_loading_item_progress_bar)

    override fun bind(item: LoadingItem, position: Int) {

    }

    companion object Type : UnifiedViewHolderType<LoadingItem>(2, R.layout.rc_loading_item, LoadingItemHolder::class.java)
}