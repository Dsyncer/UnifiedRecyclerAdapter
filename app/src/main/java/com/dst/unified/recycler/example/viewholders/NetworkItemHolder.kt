package com.dst.unified.recycler.example.viewholders

import android.view.View
import android.widget.RatingBar
import android.widget.TextView
import com.dst.unified.recycler.UnifiedViewHolder
import com.dst.unified.recycler.UnifiedViewHolderType
import com.dst.unified.recycler.example.R
import com.dst.unified.recycler.example.items.NetworkItem
import java.text.DecimalFormat

class NetworkItemHolder(itemView: View) : UnifiedViewHolder<NetworkItem>(itemView) {

    private val headline: TextView = itemView.findViewById(R.id.network_item_headline)
    private val ratingBar: RatingBar = itemView.findViewById(R.id.network_item_rating)
    private val price: TextView = itemView.findViewById(R.id.network_item_price)

    override fun bind(item: NetworkItem, position: Int) {
        headline.text = item.title
        ratingBar.rating = item.rating
        price.text = DecimalFormat.getCurrencyInstance().format(item.price)
    }

    companion object Type : UnifiedViewHolderType<NetworkItem>(10, R.layout.rc_network_item, NetworkItemHolder::class.java)
}