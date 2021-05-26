//[recycler](../../../index.md)/[com.dst.unified.recycler](../index.md)/[UnifiedRecyclerAdapter](index.md)/[UnifiedRecyclerAdapter](-unified-recycler-adapter.md)



# UnifiedRecyclerAdapter  
[androidJvm]  
Content  
fun [UnifiedRecyclerAdapter](-unified-recycler-adapter.md)(viewHolderTypes: [Array](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)<[UnifiedViewHolderType](../-unified-view-holder-type/index.md)<out [RecyclerItem](../-recycler-item/index.md)>>)  
More info  


## Parameters  
  
androidJvm  
  
| | |
|---|---|
| <a name="com.dst.unified.recycler/UnifiedRecyclerAdapter/UnifiedRecyclerAdapter/#kotlin.Array[com.dst.unified.recycler.UnifiedViewHolderType[com.dst.unified.recycler.RecyclerItem]]/PointingToDeclaration/"></a>viewHolderTypes| <a name="com.dst.unified.recycler/UnifiedRecyclerAdapter/UnifiedRecyclerAdapter/#kotlin.Array[com.dst.unified.recycler.UnifiedViewHolderType[com.dst.unified.recycler.RecyclerItem]]/PointingToDeclaration/"></a><br><br>Array of all [UnifiedViewHolderType](../-unified-view-holder-type/index.md) that will be used in that RecyclerView. If you do not specify appropriate [UnifiedViewHolderType](../-unified-view-holder-type/index.md) for each [RecyclerItem.viewType](../-recycler-item/view-type.md) that is used in that adapter then adapter will throw [NullPointerException](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-null-pointer-exception/index.html). If you want to dynamically add types depending on some conditions use [addViewHolderType](add-view-holder-type.md) method<br><br>|
  
  



