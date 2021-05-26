package com.dst.unified.recycler.example.items

import com.dst.unified.recycler.RecyclerItem
import com.dst.unified.recycler.example.viewholders.NetworkItemHolder
import kotlin.random.Random

/**
 * Some item that you get from your API
 *
 * It is just a dummy example and there in nothing too useful here
 */
class NetworkItem(val title: String, val price: Float, val rating: Float) : RecyclerItem {

    override fun viewType(position: Int): Int {
        return NetworkItemHolder.viewType
    }

    companion object {
        private val titles = arrayOf("Rubber duck", "Soap", "Tesla", "Cup", "Sir Arthur's sword", "Jedi's sword", "Withers's amulet")
        fun newInstance(): NetworkItem {
            return NetworkItem(titles[Random.nextInt(0, titles.size)],
                Random.nextDouble(0.99, 999.99).toFloat(),
                Random.nextDouble(0.0, 5.0).toFloat()
            )
        }
    }
}