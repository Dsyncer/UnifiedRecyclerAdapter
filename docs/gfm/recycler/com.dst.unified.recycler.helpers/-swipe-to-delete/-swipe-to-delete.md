//[recycler](../../../index.md)/[com.dst.unified.recycler.helpers](../index.md)/[SwipeToDelete](index.md)/[SwipeToDelete](-swipe-to-delete.md)



# SwipeToDelete  
[androidJvm]  
Content  
fun [SwipeToDelete](-swipe-to-delete.md)(context: [Context](https://developer.android.com/reference/kotlin/android/content/Context.html), swipeDirs: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), onSwipedListener: (viewHolder: [RecyclerView.ViewHolder](https://developer.android.com/reference/kotlin/androidx/recyclerview/widget/RecyclerView.ViewHolder.html), direction: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)) -> [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html), color: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), @[DrawableRes](https://developer.android.com/reference/kotlin/androidx/annotation/DrawableRes.html)()icon: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) = 0)  
More info  


## Parameters  
  
androidJvm  
  
| | |
|---|---|
| <a name="com.dst.unified.recycler.helpers/SwipeToDelete/SwipeToDelete/#android.content.Context#kotlin.Int#kotlin.Function2[androidx.recyclerview.widget.RecyclerView.ViewHolder,kotlin.Int,kotlin.Unit]#kotlin.Int#kotlin.Int/PointingToDeclaration/"></a>context| <a name="com.dst.unified.recycler.helpers/SwipeToDelete/SwipeToDelete/#android.content.Context#kotlin.Int#kotlin.Function2[androidx.recyclerview.widget.RecyclerView.ViewHolder,kotlin.Int,kotlin.Unit]#kotlin.Int#kotlin.Int/PointingToDeclaration/"></a><br><br>Context that is used to get icon drawable. It isn't stored in class so it won't call memory leak<br><br>|
| <a name="com.dst.unified.recycler.helpers/SwipeToDelete/SwipeToDelete/#android.content.Context#kotlin.Int#kotlin.Function2[androidx.recyclerview.widget.RecyclerView.ViewHolder,kotlin.Int,kotlin.Unit]#kotlin.Int#kotlin.Int/PointingToDeclaration/"></a>swipeDirs| <a name="com.dst.unified.recycler.helpers/SwipeToDelete/SwipeToDelete/#android.content.Context#kotlin.Int#kotlin.Function2[androidx.recyclerview.widget.RecyclerView.ViewHolder,kotlin.Int,kotlin.Unit]#kotlin.Int#kotlin.Int/PointingToDeclaration/"></a><br><br>Binary OR of next directions: [ItemTouchHelper.LEFT](https://developer.android.com/reference/kotlin/androidx/recyclerview/widget/ItemTouchHelper.html#LEFT--), [ItemTouchHelper.RIGHT](https://developer.android.com/reference/kotlin/androidx/recyclerview/widget/ItemTouchHelper.html#RIGHT--), [ItemTouchHelper.START](https://developer.android.com/reference/kotlin/androidx/recyclerview/widget/ItemTouchHelper.html#START--) and [ItemTouchHelper.END](https://developer.android.com/reference/kotlin/androidx/recyclerview/widget/ItemTouchHelper.html#END--), for more info see [ItemTouchHelper.SimpleCallback](https://developer.android.com/reference/kotlin/androidx/recyclerview/widget/ItemTouchHelper.SimpleCallback.html)<br><br>|
| <a name="com.dst.unified.recycler.helpers/SwipeToDelete/SwipeToDelete/#android.content.Context#kotlin.Int#kotlin.Function2[androidx.recyclerview.widget.RecyclerView.ViewHolder,kotlin.Int,kotlin.Unit]#kotlin.Int#kotlin.Int/PointingToDeclaration/"></a>onSwipedListener| <a name="com.dst.unified.recycler.helpers/SwipeToDelete/SwipeToDelete/#android.content.Context#kotlin.Int#kotlin.Function2[androidx.recyclerview.widget.RecyclerView.ViewHolder,kotlin.Int,kotlin.Unit]#kotlin.Int#kotlin.Int/PointingToDeclaration/"></a><br><br>Function that will be called when item were swiped in one of supported directions<br><br>|
| <a name="com.dst.unified.recycler.helpers/SwipeToDelete/SwipeToDelete/#android.content.Context#kotlin.Int#kotlin.Function2[androidx.recyclerview.widget.RecyclerView.ViewHolder,kotlin.Int,kotlin.Unit]#kotlin.Int#kotlin.Int/PointingToDeclaration/"></a>color| <a name="com.dst.unified.recycler.helpers/SwipeToDelete/SwipeToDelete/#android.content.Context#kotlin.Int#kotlin.Function2[androidx.recyclerview.widget.RecyclerView.ViewHolder,kotlin.Int,kotlin.Unit]#kotlin.Int#kotlin.Int/PointingToDeclaration/"></a><br><br>Color of background that will be drawn when user swipes item<br><br>|
| <a name="com.dst.unified.recycler.helpers/SwipeToDelete/SwipeToDelete/#android.content.Context#kotlin.Int#kotlin.Function2[androidx.recyclerview.widget.RecyclerView.ViewHolder,kotlin.Int,kotlin.Unit]#kotlin.Int#kotlin.Int/PointingToDeclaration/"></a>icon| <a name="com.dst.unified.recycler.helpers/SwipeToDelete/SwipeToDelete/#android.content.Context#kotlin.Int#kotlin.Function2[androidx.recyclerview.widget.RecyclerView.ViewHolder,kotlin.Int,kotlin.Unit]#kotlin.Int#kotlin.Int/PointingToDeclaration/"></a><br><br>[DrawableRes](https://developer.android.com/reference/kotlin/androidx/annotation/DrawableRes.html) of icon that will be displayed when user swipes item. If you don't want to draw any icon pass 0 (it is the default value)<br><br>|
  
  



