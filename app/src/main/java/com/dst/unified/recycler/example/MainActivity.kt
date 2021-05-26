package com.dst.unified.recycler.example

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.PopupMenu
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.ItemTouchHelper
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.dst.unified.recycler.NotifiableRecyclerItem
import com.dst.unified.recycler.RecyclerItem
import com.dst.unified.recycler.UnifiedRecyclerAdapter
import com.dst.unified.recycler.example.databinding.ActivityMainBinding
import com.dst.unified.recycler.example.items.ImageItem
import com.dst.unified.recycler.example.items.ImageItemHolder
import com.dst.unified.recycler.example.items.NetworkItem
import com.dst.unified.recycler.example.items.SingleTextPositionItem
import com.dst.unified.recycler.example.viewholders.NetworkItemHolder
import com.dst.unified.recycler.helpers.PaginationListener
import com.dst.unified.recycler.helpers.SwipeToDelete
import com.dst.unified.recycler.items.loading.LoadingItem
import com.dst.unified.recycler.items.loading.LoadingItemHolder
import com.dst.unified.recycler.items.singletext.SingleTextHolder
import com.dst.unified.recycler.items.singletext.SingleTextItem
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.tabs.TabLayout


class MainActivity : AppCompatActivity() {

    private lateinit var unifiedRecyclerAdapter: UnifiedRecyclerAdapter
    private var itemTouchHelper: ItemTouchHelper? = null

    private lateinit var binding: ActivityMainBinding

    private var currentExampleIndex: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val tabLayout = binding.tabLayout
        tabLayout.addTab(tabLayout.newTab().setText("Notifiable Recycler Item"))
        tabLayout.addTab(tabLayout.newTab().setText("Swipe To Delete"))
        tabLayout.addTab(tabLayout.newTab().setText("Pagination"))
        tabLayout.addTab(tabLayout.newTab().setText("Staggered Grid Layout Manager"))

        tabLayout.addOnTabSelectedListener(object: TabLayout.OnTabSelectedListener {
            override fun onTabReselected(tab: TabLayout.Tab?) {
                onTabSelected(tab)
            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {
            }

            override fun onTabSelected(tab: TabLayout.Tab?) {
                currentExampleIndex = tab?.position ?: 0
                when(tab?.position) {
                    0 -> {
                        setNotifiableRecyclerItemsExample()
                        binding.recyclerView.smoothScrollToPosition(0)
                    }
                    1 -> {
                        setSwipeToDeleteExample()
                        binding.recyclerView.smoothScrollToPosition(0)
                    }
                    2 -> {
                        setPaginationExample()
                        binding.recyclerView.smoothScrollToPosition(0)
                    }
                    3 -> {
                        setStaggeredGridLayoutManagerExample()
                        binding.recyclerView.smoothScrollToPosition(0)
                    }
                }
            }
        })

        binding.floatingActionButton.setOnClickListener {
            unifiedRecyclerAdapter.addItem(
                1,
                SingleTextPositionItem(
                    1,
                    unifiedRecyclerAdapter,
                    R.style.TextAppearance_MaterialComponents_Body1
                )
            )
        }

        setNotifiableRecyclerItemsExample()
    }

    private fun clearRecyclerView() {
        binding.recyclerView.layoutManager = null
        binding.recyclerView.adapter = null
        binding.recyclerView.clearOnScrollListeners()
        itemTouchHelper?.attachToRecyclerView(null)
    }

    private fun setNotifiableRecyclerItemsExample() {
        clearRecyclerView()
        unifiedRecyclerAdapter = UnifiedRecyclerAdapter(arrayOf(SingleTextHolder.Type))

        val linearLayoutManager = LinearLayoutManager(this)
        binding.recyclerView.layoutManager = linearLayoutManager
        binding.recyclerView.adapter = unifiedRecyclerAdapter

        itemTouchHelper = ItemTouchHelper(SwipeToDelete(this, ItemTouchHelper.LEFT, { viewHolder, _ ->
            val position = viewHolder.adapterPosition
            unifiedRecyclerAdapter.removeItem(position)
        }, ContextCompat.getColor(this, R.color.purple_200), R.drawable.ic_baseline_delete_24))
        itemTouchHelper?.attachToRecyclerView(binding.recyclerView)

        unifiedRecyclerAdapter.onItemLongClickListener = { item, holder, position ->
            if (position != 0) {
                val popupMenu = PopupMenu(this@MainActivity, holder.itemView)
                popupMenu.menu.add("Edit")
                popupMenu.menu.add("Delete")
                popupMenu.setOnMenuItemClickListener { menuItem ->
                    if (menuItem.title.toString() == "Edit") {
                        if (item is SingleTextPositionItem) {
                            //No need to call unifiedRecyclerAdapter.notifyItemChanged() because it is done under hood in setter method
                            item.text = "Changed position item"
                        }
                    } else {
                        if (item is NotifiableRecyclerItem) {
                            item.removeItemFromRecyclerView()
                        } else {
                            unifiedRecyclerAdapter.removeItem(position)
                        }
                    }
                    true
                }
                popupMenu.show()
                true
            } else {
                false
            }
        }

        unifiedRecyclerAdapter.addItem(SingleTextItem("" +
                "This is an example of <b>NotifiableRecyclerItem</b> that keeps it's position and can internally notify that it was updated<br>" +
                "To prove that long click on item and press edit and it will automatically update item's text<br>" +
                "<b>NotifiableRecyclerItem</b> also can delete itself from the list<br>" +
                "Long click on item and press delete or swipe it to the left", isHtml = true))
        val bulkOfItems = ArrayList<RecyclerItem>()
        for (i in 1..100) {
            if (i % 5 == 0) {
                bulkOfItems.add(
                    SingleTextPositionItem(
                        i,
                        unifiedRecyclerAdapter,
                        R.style.TextAppearance_MaterialComponents_Headline6
                    )
                )
            } else {
                bulkOfItems.add(SingleTextPositionItem(i, unifiedRecyclerAdapter))
            }
        }
        unifiedRecyclerAdapter.addItems(bulkOfItems)
    }

    private fun setSwipeToDeleteExample() {
        clearRecyclerView()
        unifiedRecyclerAdapter = UnifiedRecyclerAdapter(arrayOf(SingleTextHolder.Type))

        val linearLayoutManager = LinearLayoutManager(this)
        binding.recyclerView.layoutManager = linearLayoutManager
        binding.recyclerView.adapter = unifiedRecyclerAdapter

        unifiedRecyclerAdapter.addItem(SingleTextItem("This is an example of <b>SwipeToDelete</b> listener<br>" +
                "It allows to delete items by swiping them. You can try it yourself", isHtml = true))

        itemTouchHelper = ItemTouchHelper(SwipeToDelete(this, ItemTouchHelper.LEFT or ItemTouchHelper.RIGHT, { viewHolder, _ ->
            val position = viewHolder.adapterPosition
            val item = unifiedRecyclerAdapter.recyclerItems()[position]
            unifiedRecyclerAdapter.removeItem(position)
            Snackbar.make(binding.recyclerView, "Item deleted", Snackbar.LENGTH_LONG)
                .setAction("Undo") {
                    unifiedRecyclerAdapter.addItem(position, item)
                }
                .show()
        }, ContextCompat.getColor(this, R.color.purple_200), R.drawable.ic_baseline_delete_24))
        itemTouchHelper?.attachToRecyclerView(binding.recyclerView)

        val bulkOfItems = ArrayList<RecyclerItem>()
        for (i in 1..100) {
            bulkOfItems.add(SingleTextItem("Delete Me, Senpai"))
        }
        unifiedRecyclerAdapter.addItems(bulkOfItems)
    }

    private fun setPaginationExample() {
        clearRecyclerView()
        unifiedRecyclerAdapter = UnifiedRecyclerAdapter(arrayOf(SingleTextHolder.Type, NetworkItemHolder.Type, LoadingItemHolder.Type))

        val linearLayoutManager = LinearLayoutManager(this)
        binding.recyclerView.layoutManager = linearLayoutManager
        binding.recyclerView.adapter = unifiedRecyclerAdapter

        unifiedRecyclerAdapter.addItem(SingleTextItem("This is an example of <b>PaginationListener</b><br>" +
                "It supports dynamically loading items, for example from <b>API</b> or local <b>DB</b>", isHtml = true))

        var isLoading = false
        var currentPage = 0
        val maxPage = 10
        val loadItems = {
            isLoading = true
            val loadingItem = LoadingItem(unifiedRecyclerAdapter.recyclerItems().size, unifiedRecyclerAdapter)
            unifiedRecyclerAdapter.addItem(loadingItem)
            //Simulate loading
            Handler(Looper.getMainLooper()).postDelayed({
                if (currentExampleIndex == 2) {
                    val items = ArrayList<NetworkItem>()
                    for (i in 1..20) {
                        items.add(NetworkItem.newInstance())
                    }
                    loadingItem.removeItemFromRecyclerView()
                    unifiedRecyclerAdapter.addItems(items)
                    isLoading = false
                    currentPage++
                }
            }, 2500)
        }

        binding.recyclerView.addOnScrollListener(object: PaginationListener(linearLayoutManager, 20) {
            override fun loadMoreItems() {
                loadItems.invoke()
            }

            override fun isLastPage(): Boolean {
                return currentPage >= maxPage
            }

            override fun isLoading(): Boolean {
                return isLoading
            }

        })
        loadItems.invoke()
    }

    private fun setStaggeredGridLayoutManagerExample() {
        clearRecyclerView()

        unifiedRecyclerAdapter = UnifiedRecyclerAdapter(arrayOf(SingleTextHolder.Type, ImageItemHolder.Type))

        val layoutManager = StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)
        binding.recyclerView.layoutManager = layoutManager
        binding.recyclerView.adapter = unifiedRecyclerAdapter

        unifiedRecyclerAdapter.addItem(SingleTextItem("This is an example of <b>StaggeredGridLayoutManager</b>", isHtml = true))

        val bulkOfItems = ArrayList<RecyclerItem>()
        bulkOfItems.add(ImageItem("https://homepages.cae.wisc.edu/~ece533/images/airplane.png"))
        bulkOfItems.add(ImageItem("https://homepages.cae.wisc.edu/~ece533/images/baboon.png"))
        bulkOfItems.add(ImageItem("https://homepages.cae.wisc.edu/~ece533/images/boat.png"))
        bulkOfItems.add(ImageItem("https://homepages.cae.wisc.edu/~ece533/images/pool.png"))
        bulkOfItems.add(ImageItem("https://homepages.cae.wisc.edu/~ece533/images/peppers.png"))
        bulkOfItems.add(ImageItem("https://homepages.cae.wisc.edu/~ece533/images/arctichare.png"))


        unifiedRecyclerAdapter.addItems(bulkOfItems)
    }
}