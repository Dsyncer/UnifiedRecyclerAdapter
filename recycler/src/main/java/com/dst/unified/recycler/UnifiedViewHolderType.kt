package com.dst.unified.recycler

import androidx.annotation.LayoutRes

/**
 * That class is used to connect [RecyclerItem] and appropriate [UnifiedViewHolder]
 * that is used for displaying it.
 *
 * It is also used to connect [UnifiedViewHolder] and it's
 * appropriate [LayoutRes]
 *
 * Recommended way of using that class is by adding `companion object` to [UnifiedViewHolder]:
 *
 * ```
 *  class SomeItemHolder : UnifiedViewHolder<SomeItem> {
 *      ...
 *
 *      companion object Type :
 *          UnifiedViewHolderType<SomeItem>(viewType,
 *                                          R.layout.some_item_layout,
 *                                          SomeItemHolder::class.java)
 *  }
 * ```
 *
 * @param T Type of object that is going to be displayed in [UnifiedViewHolder].
 * Has to implement [RecyclerItem]
 * @param viewType That value has to be the same as [RecyclerItem.viewType] to connect [UnifiedViewHolder] with it
 * @param layoutRes Root layout for [UnifiedViewHolder]
 * @param unifiedViewHolderClass Reference to [UnifiedViewHolder] class that is later used to instantiate it
 * @see RecyclerItem
 * @see UnifiedViewHolder
 * @see UnifiedRecyclerAdapter
 */
open class UnifiedViewHolderType<T : RecyclerItem>(
    val viewType: Int,
    @LayoutRes val layoutRes: Int,
    val unifiedViewHolderClass: Class<out UnifiedViewHolder<T>>
)