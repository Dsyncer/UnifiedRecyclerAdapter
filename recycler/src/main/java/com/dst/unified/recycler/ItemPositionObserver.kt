package com.dst.unified.recycler

import android.util.Log
import androidx.recyclerview.widget.RecyclerView

/**
 * Implementation of [RecyclerView.AdapterDataObserver] that is used
 * to keep position of item inside of [RecyclerView]
 *
 * It's position also can be observed via [onPositionChangedListener]
 *
 * @param position Initial position of the item
 */
class ItemPositionObserver(position: Int) : RecyclerView.AdapterDataObserver() {
    var position: Int = position
        private set

    /**
     * This variable is used to prevent incrementing position
     * value incrementing when item itself is added to the `RecyclerView` via calling
     * `notifyItemInserted`
     */
    private var firstSet: Boolean = true

    var onPositionChangedListener: ((newPosition: Int) -> Unit)? = null

    override fun onItemRangeInserted(positionStart: Int, itemCount: Int) {
        if (firstSet) {
            firstSet = false;
        } else if (positionStart <= position) {
            position += itemCount
            onPositionChangedListener?.invoke(position)
        }
    }

    override fun onItemRangeRemoved(positionStart: Int, itemCount: Int) {
        if (positionStart < position) {
            position -= itemCount
            onPositionChangedListener?.invoke(position)
        }
    }

    override fun onItemRangeMoved(fromPosition: Int, toPosition: Int, itemCount: Int) {
        Log.d("DST_DEBUG", "Item range moved: position: $position, fromPosition: $fromPosition, toPosition: $toPosition, itemCount: $itemCount")
        if (fromPosition < position && toPosition > position) {
            position -= itemCount
            onPositionChangedListener?.invoke(position)
        } else if (fromPosition > position && toPosition < position) {
            position += itemCount
            onPositionChangedListener?.invoke(position)
        }
        Log.d("DST_DEBUG", "Item position after: $position")
    }
}