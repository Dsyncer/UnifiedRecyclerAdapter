//[recycler](../../../index.md)/[com.dst.unified.recycler](../index.md)/[UnifiedViewHolder](index.md)/[bind](bind.md)



# bind  
[androidJvm]  
Content  
abstract fun [bind](bind.md)(item: [T](index.md), position: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html))  
More info  


Abstract method for binding [item](bind.md) into [RecyclerView.ViewHolder](https://developer.android.com/reference/kotlin/androidx/recyclerview/widget/RecyclerView.ViewHolder.html) and later displaying in into [RecyclerView](https://developer.android.com/reference/kotlin/androidx/recyclerview/widget/RecyclerView.html)



## See also  
  
androidJvm  
  
| | |
|---|---|
| <a name="com.dst.unified.recycler/UnifiedViewHolder/bind/#TypeParam(bounds=[com.dst.unified.recycler.RecyclerItem])#kotlin.Int/PointingToDeclaration/"></a>[androidx.recyclerview.widget.RecyclerView.Adapter](https://developer.android.com/reference/kotlin/androidx/recyclerview/widget/RecyclerView.Adapter.html#onBindViewHolder-TypeParam(bounds=[androidx.recyclerview.widget.RecyclerView.ViewHolder])-kotlin.Int-)| <a name="com.dst.unified.recycler/UnifiedViewHolder/bind/#TypeParam(bounds=[com.dst.unified.recycler.RecyclerItem])#kotlin.Int/PointingToDeclaration/"></a>|
  


## Parameters  
  
androidJvm  
  
| | |
|---|---|
| <a name="com.dst.unified.recycler/UnifiedViewHolder/bind/#TypeParam(bounds=[com.dst.unified.recycler.RecyclerItem])#kotlin.Int/PointingToDeclaration/"></a>item| <a name="com.dst.unified.recycler/UnifiedViewHolder/bind/#TypeParam(bounds=[com.dst.unified.recycler.RecyclerItem])#kotlin.Int/PointingToDeclaration/"></a><br><br>Item itself<br><br>|
| <a name="com.dst.unified.recycler/UnifiedViewHolder/bind/#TypeParam(bounds=[com.dst.unified.recycler.RecyclerItem])#kotlin.Int/PointingToDeclaration/"></a>position| <a name="com.dst.unified.recycler/UnifiedViewHolder/bind/#TypeParam(bounds=[com.dst.unified.recycler.RecyclerItem])#kotlin.Int/PointingToDeclaration/"></a><br><br>Position of [item](bind.md) in [RecyclerView](https://developer.android.com/reference/kotlin/androidx/recyclerview/widget/RecyclerView.html)<br><br>|
  
  


[androidJvm]  
Content  
open fun [bind](bind.md)(item: [T](index.md), position: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), payloads: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)<[Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)>)  
More info  


Same method as [bind](bind.md) but also has [payloads](bind.md). Usually used for efficient partial bind



## See also  
  
androidJvm  
  
| | |
|---|---|
| <a name="com.dst.unified.recycler/UnifiedViewHolder/bind/#TypeParam(bounds=[com.dst.unified.recycler.RecyclerItem])#kotlin.Int#kotlin.collections.List[kotlin.Any]/PointingToDeclaration/"></a>[com.dst.unified.recycler.UnifiedViewHolder](bind.md)| <a name="com.dst.unified.recycler/UnifiedViewHolder/bind/#TypeParam(bounds=[com.dst.unified.recycler.RecyclerItem])#kotlin.Int#kotlin.collections.List[kotlin.Any]/PointingToDeclaration/"></a>|
| <a name="com.dst.unified.recycler/UnifiedViewHolder/bind/#TypeParam(bounds=[com.dst.unified.recycler.RecyclerItem])#kotlin.Int#kotlin.collections.List[kotlin.Any]/PointingToDeclaration/"></a>[androidx.recyclerview.widget.RecyclerView.Adapter](https://developer.android.com/reference/kotlin/androidx/recyclerview/widget/RecyclerView.Adapter.html#onBindViewHolder-TypeParam(bounds=[androidx.recyclerview.widget.RecyclerView.ViewHolder])-kotlin.Int-)| <a name="com.dst.unified.recycler/UnifiedViewHolder/bind/#TypeParam(bounds=[com.dst.unified.recycler.RecyclerItem])#kotlin.Int#kotlin.collections.List[kotlin.Any]/PointingToDeclaration/"></a>|
  


## Parameters  
  
androidJvm  
  
| | |
|---|---|
| <a name="com.dst.unified.recycler/UnifiedViewHolder/bind/#TypeParam(bounds=[com.dst.unified.recycler.RecyclerItem])#kotlin.Int#kotlin.collections.List[kotlin.Any]/PointingToDeclaration/"></a>payloads| <a name="com.dst.unified.recycler/UnifiedViewHolder/bind/#TypeParam(bounds=[com.dst.unified.recycler.RecyclerItem])#kotlin.Int#kotlin.collections.List[kotlin.Any]/PointingToDeclaration/"></a><br><br>List of payload objects that were passed during [RecyclerView.Adapter.notifyItemRangeChanged](../-unified-recycler-adapter/index.md#1769183193%2FFunctions%2F1072867916) or [RecyclerView.Adapter.notifyItemRangeChanged](../-unified-recycler-adapter/index.md#1769183193%2FFunctions%2F1072867916)<br><br>|
  
  



