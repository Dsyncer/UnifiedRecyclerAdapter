//[recycler](../../../index.md)/[com.dst.unified.recycler](../index.md)/[RecyclerItem](index.md)



# RecyclerItem  
 [androidJvm] interface [RecyclerItem](index.md)

This is a base interface that all classes that want to be displayed in [UnifiedRecyclerAdapter](../-unified-recycler-adapter/index.md) have to implement



This interface is considered to be default building block of that library and many methods pass it as a parameter, such as [UnifiedRecyclerAdapter.onItemClickListener](../-unified-recycler-adapter/on-item-click-listener.md) or [UnifiedRecyclerAdapter.onItemLongClickListener](../-unified-recycler-adapter/on-item-long-click-listener.md). It can be safely upcasted to parent classes by doing next:

if (item is ParentClass) {  
 item.someParentClassMethod()  
}

Or if [UnifiedViewHolder](../-unified-view-holder/index.md) supports only one item

if (item.viewType == ParentHolder.viewType) {  
 val parentItem = item as ParentClass  
 parentItem.someParentClassMethod()  
}   


## See also  
  
androidJvm  
  
| | |
|---|---|
| <a name="com.dst.unified.recycler/RecyclerItem///PointingToDeclaration/"></a>[com.dst.unified.recycler.UnifiedViewHolder](../-unified-view-holder/index.md)| <a name="com.dst.unified.recycler/RecyclerItem///PointingToDeclaration/"></a>|
| <a name="com.dst.unified.recycler/RecyclerItem///PointingToDeclaration/"></a>[com.dst.unified.recycler.UnifiedViewHolderType](../-unified-view-holder-type/index.md)| <a name="com.dst.unified.recycler/RecyclerItem///PointingToDeclaration/"></a>|
| <a name="com.dst.unified.recycler/RecyclerItem///PointingToDeclaration/"></a>[com.dst.unified.recycler.UnifiedRecyclerAdapter](../-unified-recycler-adapter/index.md)| <a name="com.dst.unified.recycler/RecyclerItem///PointingToDeclaration/"></a>|
| <a name="com.dst.unified.recycler/RecyclerItem///PointingToDeclaration/"></a>[com.dst.unified.recycler.NotifiableRecyclerItem](../-notifiable-recycler-item/index.md)| <a name="com.dst.unified.recycler/RecyclerItem///PointingToDeclaration/"></a>|
  


## Functions  
  
|  Name |  Summary | 
|---|---|
| <a name="com.dst.unified.recycler/RecyclerItem/getItemId/#kotlin.Int/PointingToDeclaration/"></a>[getItemId](get-item-id.md)| <a name="com.dst.unified.recycler/RecyclerItem/getItemId/#kotlin.Int/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>open fun [getItemId](get-item-id.md)(position: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)): [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)  <br>More info  <br>Method that returns objects unique id that is used in [RecyclerView.Adapter.getItemId](https://developer.android.com/reference/kotlin/androidx/recyclerview/widget/RecyclerView.Adapter.html#getItemId-kotlin.Int-).  <br><br><br>|
| <a name="com.dst.unified.recycler/RecyclerItem/getSpanSize/#kotlin.Int/PointingToDeclaration/"></a>[getSpanSize](get-span-size.md)| <a name="com.dst.unified.recycler/RecyclerItem/getSpanSize/#kotlin.Int/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>open fun [getSpanSize](get-span-size.md)(position: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)  <br>More info  <br>Method that returns span size of that item.  <br><br><br>|
| <a name="com.dst.unified.recycler/RecyclerItem/viewType/#kotlin.Int/PointingToDeclaration/"></a>[viewType](view-type.md)| <a name="com.dst.unified.recycler/RecyclerItem/viewType/#kotlin.Int/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>abstract fun [viewType](view-type.md)(position: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)  <br>More info  <br>This method is used to connect [UnifiedViewHolder](../-unified-view-holder/index.md) and it's corresponding items  <br><br><br>|


## Inheritors  
  
|  Name | 
|---|
| <a name="com.dst.unified.recycler/NotifiableRecyclerItem///PointingToDeclaration/"></a>[NotifiableRecyclerItem](../-notifiable-recycler-item/index.md)|

