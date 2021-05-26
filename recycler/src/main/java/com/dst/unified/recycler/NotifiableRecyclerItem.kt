package com.dst.unified.recycler

/**
 * Abstract implementation of [RecyclerItem] that keeps value
 * of it's position in [UnifiedRecyclerAdapter] and has methods to notify that
 * item has been changed or to remove itself from the list
 *
 * Some items with mutable fields can extend it in order to be able to modify their values
 * and immediately notifying [UnifiedRecyclerAdapter] that they need to be updated.
 * So that their displayed state is always up to date
 *
 * For example:
 * ```
 *  class SomeMutableItem : NotifiableRecyclerItem {
 *      var someMutableField
 *          set(value) {
 *              field = value
 *              notifyItemChanged()
 *          }
 *      ...
 *  }
 * ```
 *
 * @param position Initial position of the item inside [UnifiedRecyclerAdapter]
 * @param adapter Reference to [UnifiedRecyclerAdapter] where that item is stored
 *
 * @see RecyclerItem
 * @see ItemPositionObserver
 */
abstract class NotifiableRecyclerItem(position: Int, private val adapter: UnifiedRecyclerAdapter) : RecyclerItem {
    val positionObserver: ItemPositionObserver = ItemPositionObserver(position)

    init {
        adapter.registerAdapterDataObserver(positionObserver)
    }

    /**
     * Call this method when you need to update [UnifiedViewHolder] of
     * that item
     */
    fun notifyItemChanged() {
        adapter.notifyItemChanged(positionObserver.position)
    }

    /**
     * Call this method when you need to update [UnifiedViewHolder] of
     * that item and pass some extra payload
     * @param payload Payload that would be later passed into [UnifiedViewHolder.bind] method
     */
    fun notifyItemChanged(payload: Any) {
        adapter.notifyItemChanged(positionObserver.position, payload)
    }

    /**
     * Call this method to remove item from [UnifiedRecyclerAdapter]
     */
    fun removeItemFromRecyclerView() {
        adapter.removeItem(positionObserver.position)
    }
}
