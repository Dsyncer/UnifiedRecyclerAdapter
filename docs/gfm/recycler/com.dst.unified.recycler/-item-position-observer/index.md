//[recycler](../../../index.md)/[com.dst.unified.recycler](../index.md)/[ItemPositionObserver](index.md)



# ItemPositionObserver  
 [androidJvm] class [ItemPositionObserver](index.md)(**position**: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)) : [RecyclerView.AdapterDataObserver](https://developer.android.com/reference/kotlin/androidx/recyclerview/widget/RecyclerView.AdapterDataObserver.html)

Implementation of [RecyclerView.AdapterDataObserver](https://developer.android.com/reference/kotlin/androidx/recyclerview/widget/RecyclerView.AdapterDataObserver.html) that is used to keep position of item inside of [RecyclerView](https://developer.android.com/reference/kotlin/androidx/recyclerview/widget/RecyclerView.html)



It's position also can be observed via [onPositionChangedListener](on-position-changed-listener.md)

   


## Parameters  
  
androidJvm  
  
| | |
|---|---|
| <a name="com.dst.unified.recycler/ItemPositionObserver///PointingToDeclaration/"></a>position| <a name="com.dst.unified.recycler/ItemPositionObserver///PointingToDeclaration/"></a><br><br>Initial position of the item<br><br>|
  


## Constructors  
  
| | |
|---|---|
| <a name="com.dst.unified.recycler/ItemPositionObserver/ItemPositionObserver/#kotlin.Int/PointingToDeclaration/"></a>[ItemPositionObserver](-item-position-observer.md)| <a name="com.dst.unified.recycler/ItemPositionObserver/ItemPositionObserver/#kotlin.Int/PointingToDeclaration/"></a> [androidJvm] fun [ItemPositionObserver](-item-position-observer.md)(position: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html))Initial position of the item   <br>|


## Properties  
  
|  Name |  Summary | 
|---|---|
| <a name="com.dst.unified.recycler/ItemPositionObserver/onPositionChangedListener/#/PointingToDeclaration/"></a>[onPositionChangedListener](on-position-changed-listener.md)| <a name="com.dst.unified.recycler/ItemPositionObserver/onPositionChangedListener/#/PointingToDeclaration/"></a> [androidJvm] var [onPositionChangedListener](on-position-changed-listener.md): (newPosition: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)) -> [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)? = null   <br>|
| <a name="com.dst.unified.recycler/ItemPositionObserver/position/#/PointingToDeclaration/"></a>[position](position.md)| <a name="com.dst.unified.recycler/ItemPositionObserver/position/#/PointingToDeclaration/"></a> [androidJvm] var [position](position.md): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)   <br>|


## Functions  
  
|  Name |  Summary | 
|---|---|
| <a name="com.dst.unified.recycler/ItemPositionObserver/onItemRangeInserted/#kotlin.Int#kotlin.Int/PointingToDeclaration/"></a>[onItemRangeInserted](on-item-range-inserted.md)| <a name="com.dst.unified.recycler/ItemPositionObserver/onItemRangeInserted/#kotlin.Int#kotlin.Int/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>open override fun [onItemRangeInserted](on-item-range-inserted.md)(positionStart: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), itemCount: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html))  <br><br><br>|
| <a name="com.dst.unified.recycler/ItemPositionObserver/onItemRangeMoved/#kotlin.Int#kotlin.Int#kotlin.Int/PointingToDeclaration/"></a>[onItemRangeMoved](on-item-range-moved.md)| <a name="com.dst.unified.recycler/ItemPositionObserver/onItemRangeMoved/#kotlin.Int#kotlin.Int#kotlin.Int/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>open override fun [onItemRangeMoved](on-item-range-moved.md)(fromPosition: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), toPosition: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), itemCount: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html))  <br><br><br>|
| <a name="com.dst.unified.recycler/ItemPositionObserver/onItemRangeRemoved/#kotlin.Int#kotlin.Int/PointingToDeclaration/"></a>[onItemRangeRemoved](on-item-range-removed.md)| <a name="com.dst.unified.recycler/ItemPositionObserver/onItemRangeRemoved/#kotlin.Int#kotlin.Int/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>open override fun [onItemRangeRemoved](on-item-range-removed.md)(positionStart: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), itemCount: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html))  <br><br><br>|


## Inherited functions  
  
|  Name |  Summary | 
|---|---|
| <a name="androidx.recyclerview.widget/RecyclerView.AdapterDataObserver/onChanged/#/PointingToDeclaration/"></a>[onChanged](index.md#2086699820%2FFunctions%2F1072867916)| <a name="androidx.recyclerview.widget/RecyclerView.AdapterDataObserver/onChanged/#/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>open fun [onChanged](index.md#2086699820%2FFunctions%2F1072867916)()  <br><br><br>|
| <a name="androidx.recyclerview.widget/RecyclerView.AdapterDataObserver/onItemRangeChanged/#kotlin.Int#kotlin.Int/PointingToDeclaration/"></a>[onItemRangeChanged](index.md#-1832444497%2FFunctions%2F1072867916)| <a name="androidx.recyclerview.widget/RecyclerView.AdapterDataObserver/onItemRangeChanged/#kotlin.Int#kotlin.Int/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>open fun [onItemRangeChanged](index.md#-1832444497%2FFunctions%2F1072867916)(p0: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), p1: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html))  <br>open fun [onItemRangeChanged](index.md#-1426182318%2FFunctions%2F1072867916)(p0: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), p1: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), @[Nullable](https://developer.android.com/reference/kotlin/androidx/annotation/Nullable.html)()p2: [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)?)  <br><br><br>|

