package com.dst.unified.recycler.helpers

import android.content.Context
import android.graphics.Canvas
import android.graphics.drawable.ColorDrawable
import android.graphics.drawable.Drawable
import androidx.annotation.DrawableRes
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.ItemTouchHelper
import androidx.recyclerview.widget.RecyclerView

/**
 * This is a helper class that implements simple Swipe To Delete
 * functionality.
 *
 * It extends [ItemTouchHelper.SimpleCallback] and can be added to [RecyclerView]
 * by calling:
 *
 * ```
 *   ItemTouchHelper(SwipeToDelete(
 *      context,
 *      directions,
 *      onSwipeCallback,
 *      backgroundColor,
 *      (optional) icon
 *   )).attachToRecyclerView(recyclerView)
 * ```
 *
 * It supports swiping in [ItemTouchHelper.LEFT], [ItemTouchHelper.RIGHT], [ItemTouchHelper.START] and [ItemTouchHelper.END].
 * When you do swiping in that directions it draws a background with color of [color] parameter and draws [icon] if it were passed
 *
 * @param context Context that is used to get [icon] drawable. It isn't stored in class so it won't call memory leak
 * @param swipeDirs Binary OR of next directions:
 * [ItemTouchHelper.LEFT], [ItemTouchHelper.RIGHT], [ItemTouchHelper.START] and [ItemTouchHelper.END],
 * for more info see [ItemTouchHelper.SimpleCallback]
 * @param onSwipedListener Function that will be called when item were swiped in one of supported directions
 * @param color Color of background that will be drawn when user swipes item
 * @param icon [DrawableRes] of icon that will be displayed when user swipes item. If you don't want to draw any icon pass 0 (it is the default value)
 * @see [ItemTouchHelper.SimpleCallback]
 */
class SwipeToDelete(
    context: Context,
    swipeDirs: Int,
    private val onSwipedListener: (viewHolder: RecyclerView.ViewHolder, direction: Int) -> Unit,
    color: Int,
    @DrawableRes
    icon: Int = 0
) : ItemTouchHelper.SimpleCallback(0, swipeDirs) {

    private val backgroundCornerOffset: Int = 20
    private val background: ColorDrawable
    private val icon: Drawable?

    init {
        if(icon == 0) {
            this.icon = null
        } else {
            this.icon = ContextCompat.getDrawable(context, icon)
        }
        background = ColorDrawable(color);
    }

    override fun onMove(
        recyclerView: RecyclerView,
        viewHolder: RecyclerView.ViewHolder,
        target: RecyclerView.ViewHolder
    ): Boolean {
        return false
    }

    override fun onSwiped(viewHolder: RecyclerView.ViewHolder, direction: Int) {
        onSwipedListener(viewHolder, direction)
    }

    override fun onChildDraw(
        c: Canvas,
        recyclerView: RecyclerView,
        viewHolder: RecyclerView.ViewHolder,
        dX: Float,
        dY: Float,
        actionState: Int,
        isCurrentlyActive: Boolean
    ) {
        super.onChildDraw(c, recyclerView, viewHolder, dX, dY, actionState, isCurrentlyActive)
        val itemView = viewHolder.itemView

        val iconMargin: Int = if (icon == null) 0 else (itemView.height - icon.intrinsicHeight) / 2
        val iconTop: Int = if (icon == null) 0 else itemView.top + (itemView.height - icon.intrinsicHeight) / 2
        val iconBottom: Int = if (icon == null) 0 else iconTop + icon.intrinsicHeight

        when {
            dX > 0 -> {
                if (icon != null) {
                    val iconLeft: Int = itemView.left + iconMargin
                    val iconRight = itemView.left + iconMargin + icon.intrinsicWidth
                    icon.setBounds(iconLeft, iconTop, iconRight, iconBottom)
                }
                background.setBounds(
                    itemView.left,
                    itemView.top,
                    itemView.left + dX.toInt() + backgroundCornerOffset,
                    itemView.bottom
                )
            }
            dX < 0 -> {
                if (icon != null) {
                    val iconLeft: Int = itemView.right - iconMargin - icon.intrinsicWidth
                    val iconRight = itemView.right - iconMargin
                    icon.setBounds(iconLeft, iconTop, iconRight, iconBottom)
                }
                background.setBounds(
                    itemView.right + dX.toInt() - backgroundCornerOffset,
                    itemView.top,
                    itemView.right,
                    itemView.bottom
                )
            }
            else -> {
                background.setBounds(0, 0, 0, 0)
                icon?.setBounds(0, 0, 0, 0)
            }
        }

        background.draw(c)
        icon?.draw(c)
    }
}