package com.dst.unified.recycler.helpers

import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager

/**
 * This is an implementation of [RecyclerView.OnScrollListener] that supports
 * pagination scrolling.
 *
 * @param layoutManager LayoutManger that is attached to RecyclerView which you want to support
 * pagination scrolling in
 * @param pageSize Amount of items per page.
 */
abstract class PaginationListener(
    private val layoutManager: RecyclerView.LayoutManager,
    private val pageSize: Int
) : RecyclerView.OnScrollListener() {

    override fun onScrolled(recyclerView: RecyclerView, dx: Int, dy: Int) {
        super.onScrolled(recyclerView, dx, dy)

        val visibleItemCount = layoutManager.childCount
        val totalItemCount = layoutManager.itemCount
        val firstVisibleItemPosition = when(layoutManager) {
            is LinearLayoutManager -> layoutManager.findFirstVisibleItemPosition()
            is GridLayoutManager -> layoutManager.findFirstVisibleItemPosition()
            is StaggeredGridLayoutManager -> layoutManager.findFirstVisibleItemPositions(null)[0]
            else -> throw IllegalArgumentException("PaginationListener do not support that type of LayoutManager")
        }

        if (!isLoading() && !isLastPage()) {
            if (visibleItemCount + firstVisibleItemPosition >= totalItemCount && firstVisibleItemPosition >= 0 && totalItemCount >= pageSize) {
                loadMoreItems()
            }
        }
    }

    /**
     * This is the method which is called when RecyclerView has been
     * scrolled enough to load new items.
     *
     * Here you can make call to your API to load more or start a transaction
     * in your local database to get more items
     */
    protected abstract fun loadMoreItems()

    /**
     * This methods returns whether last page has been fetched or not
     */
    abstract fun isLastPage(): Boolean

    /**
     * This methods returns whether items are currently loading or not
     */
    abstract fun isLoading(): Boolean
}