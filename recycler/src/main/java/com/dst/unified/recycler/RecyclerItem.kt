package com.dst.unified.recycler

import androidx.recyclerview.widget.RecyclerView

/**
 * This is a base interface that all classes
 * that want to be displayed in [UnifiedRecyclerAdapter] have to implement
 *
 * This interface is considered to be default building block of that library and
 * many methods pass it as a parameter, such as [UnifiedRecyclerAdapter.onItemClickListener] or [UnifiedRecyclerAdapter.onItemLongClickListener].
 * It can be safely upcasted to parent classes by doing next:
 *
 * ```
 * if (item is ParentClass) {
 *  item.someParentClassMethod()
 * }
 * ```
 *
 * Or if [UnifiedViewHolder] supports only one item
 *
 * ```
 * if (item.viewType == ParentHolder.viewType) {
 *  val parentItem = item as ParentClass
 *  parentItem.someParentClassMethod()
 * }
 * ```
 *
 * @see UnifiedViewHolder
 * @see UnifiedViewHolderType
 * @see UnifiedRecyclerAdapter
 * @see NotifiableRecyclerItem
 */
interface RecyclerItem {
    /**
     * This method is used to connect [UnifiedViewHolder] and it's corresponding items
     * @return Item's viewType that has to correspond with [UnifiedViewHolderType.viewType]
     * of [UnifiedViewHolder] that is used to display that item
     */
    fun viewType(position: Int): Int

    /**
     * Method that returns objects unique id that is used in [RecyclerView.Adapter.getItemId].
     * If [UnifiedRecyclerAdapter.hasStableIds] is true but [getItemId] returns [RecyclerView.NO_ID] it will
     * throw [IllegalArgumentException]
     * @return Item's unique id
     */
    fun getItemId(position: Int): Long {
        return RecyclerView.NO_ID
    }

    /**
     * Method that returns span size of that item.
     * It is used in `GridLayoutManager`
     *
     * Example of usage:
     * ```
     *  val gridLayoutManager = GridLayoutManager(this, 2)
     *  gridLayoutManager.spanSizeLookup = object: GridLayoutManager.SpanSizeLookup() {
     *      override fun getSpanSize(position: Int): Int {
     *          return unifiedRecyclerAdapter.recyclerItems()[position].getSpanSize(position)
     *      }
     *  }
     * ```
     */
    fun getSpanSize(position: Int): Int {
        return 1
    }
}