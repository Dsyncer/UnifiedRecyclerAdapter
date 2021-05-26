package com.dst.unified.recycler

import android.view.View
import androidx.recyclerview.widget.RecyclerView

/**
 * This is a class that is responsible for displaying classes that implement [RecyclerItem]
 * in [RecyclerView].
 *
 * All your UI logic for displaying a class should go here.
 * In `init` block you can set references to all your `views` using `itemView.findViewById`
 * and in `bind` method display appropriate data in them
 *
 * For example:
 * ```
 *  class MyItemHolder : UnifiedViewHolder<MyItem> {
 *      val myView: MyView
 *
 *      init {
 *          myView = itemView.findViewById(R.id.myView)
 *      }
 *
 *      override fun bind(item: MyItem, position: Int) {
 *          myView.setMyData(item.myData)
 *      }
 *  }
 * ```
 *
 * @param T Type of the item that is going to be displayed in that ViewHolder.
 * That type has to implement [RecyclerItem] and return same [RecyclerItem.viewType] as appropriate
 * [UnifiedViewHolderType.viewType] for that UnifiedViewHolder
 * @param itemView Root [View] for that ViewHolder. For more info see [RecyclerView.ViewHolder.itemView]
 * @see RecyclerItem
 * @see UnifiedViewHolderType
 * @see UnifiedRecyclerAdapter
 */
abstract class UnifiedViewHolder<T : RecyclerItem>(itemView: View) : RecyclerView.ViewHolder(itemView) {
    /**
     * Abstract method for binding [item] into [RecyclerView.ViewHolder] and
     * later displaying in into [RecyclerView]
     * @param item Item itself
     * @param position Position of [item] in [RecyclerView]
     * @see [RecyclerView.Adapter.onBindViewHolder]
     */
    abstract fun bind(item: T, position: Int)

    /**
     * Same method as [bind] but also has [payloads].
     * Usually used for efficient partial bind
     * @param payloads List of payload objects that were passed during [RecyclerView.Adapter.notifyItemRangeChanged]
     * or [RecyclerView.Adapter.notifyItemRangeChanged]
     * @see [bind]
     * @see [RecyclerView.Adapter.onBindViewHolder]
     */
    open fun bind(item: T, position: Int, payloads: List<Any>) {
        bind(item, position)
    }
}