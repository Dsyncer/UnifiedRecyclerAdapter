package com.dst.unified.recycler.items.singletext

import android.view.View
import android.widget.TextView
import androidx.core.text.HtmlCompat
import androidx.core.widget.TextViewCompat
import com.dst.unified.recycler.UnifiedViewHolder
import com.dst.unified.recycler.UnifiedViewHolderType
import com.dst.unified.recycler.items.R

open class SingleTextHolder(itemView: View) : UnifiedViewHolder<SingleTextItemContract>(itemView) {

    val textView: TextView = itemView.findViewById(R.id.rc_single_text_item_text)

    override fun bind(item: SingleTextItemContract, position: Int) {
        if (item.isHtml()) {
            textView.text = HtmlCompat.fromHtml(item.text(), HtmlCompat.FROM_HTML_MODE_LEGACY)
        } else {
            textView.text = item.text()
        }
        TextViewCompat.setTextAppearance(textView, item.textAppearance())
    }

    companion object Type : UnifiedViewHolderType<SingleTextItemContract>(1, R.layout.rc_single_text_item, SingleTextHolder::class.java)
}