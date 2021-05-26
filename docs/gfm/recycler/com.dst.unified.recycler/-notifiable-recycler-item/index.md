//[recycler](../../../index.md)/[com.dst.unified.recycler](../index.md)/[NotifiableRecyclerItem](index.md)



# NotifiableRecyclerItem  
 [androidJvm] abstract class [NotifiableRecyclerItem](index.md)(**position**: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), **adapter**: [UnifiedRecyclerAdapter](../-unified-recycler-adapter/index.md)) : [RecyclerItem](../-recycler-item/index.md)

Abstract implementation of [RecyclerItem](../-recycler-item/index.md) that keeps value of it's position in [UnifiedRecyclerAdapter](../-unified-recycler-adapter/index.md) and has methods to notify that item has been changed or to remove itself from the list



Some items with mutable fields can extend it in order to be able to modify their values and immediately notifying [UnifiedRecyclerAdapter](../-unified-recycler-adapter/index.md) that they need to be updated. So that their displayed state is always up to date



For example:

class SomeMutableItem : NotifiableRecyclerItem {  
    var someMutableField  
        set(value) {  
            field = value  
            notifyItemChanged()  
        }  
    ...  
}   


## See also  
  
androidJvm  
  
| | |
|---|---|
| <a name="com.dst.unified.recycler/NotifiableRecyclerItem///PointingToDeclaration/"></a>[com.dst.unified.recycler.RecyclerItem](../-recycler-item/index.md)| <a name="com.dst.unified.recycler/NotifiableRecyclerItem///PointingToDeclaration/"></a>|
| <a name="com.dst.unified.recycler/NotifiableRecyclerItem///PointingToDeclaration/"></a>[com.dst.unified.recycler.ItemPositionObserver](../-item-position-observer/index.md)| <a name="com.dst.unified.recycler/NotifiableRecyclerItem///PointingToDeclaration/"></a>|
  


## Parameters  
  
androidJvm  
  
| | |
|---|---|
| <a name="com.dst.unified.recycler/NotifiableRecyclerItem///PointingToDeclaration/"></a>position| <a name="com.dst.unified.recycler/NotifiableRecyclerItem///PointingToDeclaration/"></a><br><br>Initial position of the item inside [UnifiedRecyclerAdapter](../-unified-recycler-adapter/index.md)<br><br>|
| <a name="com.dst.unified.recycler/NotifiableRecyclerItem///PointingToDeclaration/"></a>adapter| <a name="com.dst.unified.recycler/NotifiableRecyclerItem///PointingToDeclaration/"></a><br><br>Reference to [UnifiedRecyclerAdapter](../-unified-recycler-adapter/index.md) where that item is stored<br><br>|
  


## Constructors  
  
| | |
|---|---|
| <a name="com.dst.unified.recycler/NotifiableRecyclerItem/NotifiableRecyclerItem/#kotlin.Int#com.dst.unified.recycler.UnifiedRecyclerAdapter/PointingToDeclaration/"></a>[NotifiableRecyclerItem](-notifiable-recycler-item.md)| <a name="com.dst.unified.recycler/NotifiableRecyclerItem/NotifiableRecyclerItem/#kotlin.Int#com.dst.unified.recycler.UnifiedRecyclerAdapter/PointingToDeclaration/"></a> [androidJvm] fun [NotifiableRecyclerItem](-notifiable-recycler-item.md)(position: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), adapter: [UnifiedRecyclerAdapter](../-unified-recycler-adapter/index.md))Initial position of the item inside [UnifiedRecyclerAdapter](../-unified-recycler-adapter/index.md)   <br>|


## Properties  
  
|  Name |  Summary | 
|---|---|
| <a name="com.dst.unified.recycler/NotifiableRecyclerItem/positionObserver/#/PointingToDeclaration/"></a>[positionObserver](position-observer.md)| <a name="com.dst.unified.recycler/NotifiableRecyclerItem/positionObserver/#/PointingToDeclaration/"></a> [androidJvm] val [positionObserver](position-observer.md): [ItemPositionObserver](../-item-position-observer/index.md)   <br>|


## Functions  
  
|  Name |  Summary | 
|---|---|
| <a name="com.dst.unified.recycler/NotifiableRecyclerItem/notifyItemChanged/#/PointingToDeclaration/"></a>[notifyItemChanged](notify-item-changed.md)| <a name="com.dst.unified.recycler/NotifiableRecyclerItem/notifyItemChanged/#/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>fun [notifyItemChanged](notify-item-changed.md)()  <br>More info  <br>Call this method when you need to update [UnifiedViewHolder](../-unified-view-holder/index.md) of that item  <br><br><br>[androidJvm]  <br>Content  <br>fun [notifyItemChanged](notify-item-changed.md)(payload: [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html))  <br>More info  <br>Call this method when you need to update [UnifiedViewHolder](../-unified-view-holder/index.md) of that item and pass some extra payload  <br><br><br>|
| <a name="com.dst.unified.recycler/NotifiableRecyclerItem/removeItemFromRecyclerView/#/PointingToDeclaration/"></a>[removeItemFromRecyclerView](remove-item-from-recycler-view.md)| <a name="com.dst.unified.recycler/NotifiableRecyclerItem/removeItemFromRecyclerView/#/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>fun [removeItemFromRecyclerView](remove-item-from-recycler-view.md)()  <br>More info  <br>Call this method to remove item from [UnifiedRecyclerAdapter](../-unified-recycler-adapter/index.md)  <br><br><br>|


## Inherited functions  
  
|  Name |  Summary | 
|---|---|
| <a name="com.dst.unified.recycler/RecyclerItem/getItemId/#kotlin.Int/PointingToDeclaration/"></a>[getItemId](../-recycler-item/get-item-id.md)| <a name="com.dst.unified.recycler/RecyclerItem/getItemId/#kotlin.Int/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>open fun [getItemId](../-recycler-item/get-item-id.md)(position: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)): [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)  <br>More info  <br>Method that returns objects unique id that is used in [RecyclerView.Adapter.getItemId](https://developer.android.com/reference/kotlin/androidx/recyclerview/widget/RecyclerView.Adapter.html#getItemId-kotlin.Int-).  <br><br><br>|
| <a name="com.dst.unified.recycler/RecyclerItem/getSpanSize/#kotlin.Int/PointingToDeclaration/"></a>[getSpanSize](../-recycler-item/get-span-size.md)| <a name="com.dst.unified.recycler/RecyclerItem/getSpanSize/#kotlin.Int/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>open fun [getSpanSize](../-recycler-item/get-span-size.md)(position: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)  <br>More info  <br>Method that returns span size of that item.  <br><br><br>|
| <a name="com.dst.unified.recycler/RecyclerItem/viewType/#kotlin.Int/PointingToDeclaration/"></a>[viewType](../-recycler-item/view-type.md)| <a name="com.dst.unified.recycler/RecyclerItem/viewType/#kotlin.Int/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>abstract fun [viewType](../-recycler-item/view-type.md)(position: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)  <br>More info  <br>This method is used to connect [UnifiedViewHolder](../-unified-view-holder/index.md) and it's corresponding items  <br><br><br>|

