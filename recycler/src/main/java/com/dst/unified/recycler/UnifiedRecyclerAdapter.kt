package com.dst.unified.recycler

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

/**
 * Implementation of [RecyclerView.Adapter] that supports displaying multiple
 * types of items in it without writing a lot of boilerplate code
 *
 * To get read-only version of items use [recyclerItems] method. To modify that list
 * use appropriate methods such as: [addItem], [removeItem], [setItem] etc. These methods
 * already implement all `notify*` methods that improve performance, allow
 * [RecyclerView.AdapterDataObserver] correctly observe changes and make possible for animations
 * to play correctly.
 *
 * This class do not store any reference to [android.content.Context] so it can
 * be safely stored in `ViewModel`. It is actually recommended to keep this adapter inside
 * of `ViewModel` in order to safe it's values when `Activity` or `Fragment` are destroyed due
 * to screen rotation or language change.
 *
 * @param viewHolderTypes Array of all [UnifiedViewHolderType] that will be used in
 * that `RecyclerView`. If you do not specify appropriate [UnifiedViewHolderType] for each [RecyclerItem.viewType]
 * that is used in that adapter then adapter will throw [NullPointerException]. If you want to dynamically add types depending on
 * some conditions use [addViewHolderType] method
 *
 * @see RecyclerItem
 * @see UnifiedViewHolder
 * @see UnifiedViewHolderType
 */
class UnifiedRecyclerAdapter(
    viewHolderTypes: Array<UnifiedViewHolderType<out RecyclerItem>>
) : RecyclerView.Adapter<UnifiedViewHolder<in RecyclerItem>>() {

    private val viewHolderTypes: MutableMap<Int, UnifiedViewHolderType<out RecyclerItem>>
    private val recyclerItems: MutableList<RecyclerItem> = ArrayList()

    fun recyclerItems(): List<RecyclerItem> {
        return this.recyclerItems
    }

    var onItemClickListener: ((item: RecyclerItem, holder: UnifiedViewHolder<RecyclerItem>, position: Int) -> Unit)? = null
    var onItemLongClickListener: ((item: RecyclerItem, holder: UnifiedViewHolder<RecyclerItem>, position: Int) -> Boolean)? = null

    init {
        this.viewHolderTypes = HashMap()
        for (viewHolderType in viewHolderTypes) {
            this.viewHolderTypes[viewHolderType.viewType] = viewHolderType;
        }
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): UnifiedViewHolder<RecyclerItem> {
        val viewHolderType = viewHolderTypes[viewType]
        if (viewHolderType != null) {
            val layoutInflater = LayoutInflater.from(parent.context)
            return viewHolderType.unifiedViewHolderClass.getConstructor(View::class.java)
                .newInstance(layoutInflater.inflate(viewHolderType.layoutRes, parent, false)) as UnifiedViewHolder<RecyclerItem>
        } else {
            throw NullPointerException("There were no UnifiedViewHolder for viewType: $viewType")
        }
    }

    override fun onBindViewHolder(holder: UnifiedViewHolder<in RecyclerItem>, position: Int) {
        val item = recyclerItems[position]
        holder.bind(item, position)
        holder.itemView.setOnClickListener { onItemClickListener?.invoke(item, holder, position) }
        holder.itemView.setOnLongClickListener {
            return@setOnLongClickListener onItemLongClickListener?.invoke(item, holder, position) ?: false
        }
    }

    override fun onBindViewHolder(
        holder: UnifiedViewHolder<in RecyclerItem>,
        position: Int,
        payloads: MutableList<Any>
    ) {
        if (payloads.isNotEmpty()) {
            holder.bind(recyclerItems[position], position, payloads)
        } else {
            super.onBindViewHolder(holder, position, payloads)
        }
    }

    override fun getItemCount(): Int {
        return recyclerItems.size
    }

    override fun getItemViewType(position: Int): Int {
        return recyclerItems[position].viewType(position)
    }

    override fun getItemId(position: Int): Long {
        return if (hasStableIds()) {
            val id = recyclerItems[position].getItemId(position)
            if (id == RecyclerView.NO_ID) {
                throw IllegalArgumentException("RecyclerView hasStableIds, but item returned NO_ID. Did you forget to implement getItemId method?")
            }
            id
        } else {
            RecyclerView.NO_ID
        }
    }

    fun addViewHolderType(viewHolderType: UnifiedViewHolderType<RecyclerItem>) {
        this.viewHolderTypes[viewHolderType.viewType] = viewHolderType
    }

    fun addItem(recyclerItem: RecyclerItem) {
        recyclerItems.add(recyclerItem)
        notifyItemInserted(recyclerItems.size - 1)
    }

    fun addItem(position: Int, recyclerItem: RecyclerItem) {
        recyclerItems.add(position, recyclerItem)
        notifyItemInserted(position)
        notifyItemRangeChanged(position, recyclerItems.size);
    }

    fun addItems(items: Collection<RecyclerItem>) {
        recyclerItems.addAll(items)
        notifyItemRangeInserted(recyclerItems.size - items.size, items.size)
    }

    fun addItems(position: Int, items: Collection<RecyclerItem>) {
        recyclerItems.addAll(position, items)
        notifyItemRangeInserted(position, items.size)
        notifyItemRangeChanged(position + items.size, recyclerItems.size)
    }

    fun setItem(position: Int, recyclerItem: RecyclerItem) {
        recyclerItems[position] = recyclerItem
        notifyItemChanged(position)
    }

    fun removeItem(recyclerItem: RecyclerItem) {
        val index = recyclerItems.indexOf(recyclerItem)
        if (index != -1) {
            removeItem(index)
        }
    }

    fun removeItem(position: Int) {
        recyclerItems.removeAt(position)
        notifyItemRemoved(position)
        notifyItemRangeChanged(position, recyclerItems.size);
    }

    fun clear() {
        recyclerItems.clear()
        notifyDataSetChanged()
    }
}