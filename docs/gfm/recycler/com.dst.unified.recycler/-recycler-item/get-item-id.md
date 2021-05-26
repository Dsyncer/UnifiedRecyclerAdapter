//[recycler](../../../index.md)/[com.dst.unified.recycler](../index.md)/[RecyclerItem](index.md)/[getItemId](get-item-id.md)



# getItemId  
[androidJvm]  
Content  
open fun [getItemId](get-item-id.md)(position: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)): [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)  
More info  


Method that returns objects unique id that is used in [RecyclerView.Adapter.getItemId](https://developer.android.com/reference/kotlin/androidx/recyclerview/widget/RecyclerView.Adapter.html#getItemId-kotlin.Int-). If UnifiedRecyclerAdapter.hasStableIds is true but [getItemId](get-item-id.md) returns [RecyclerView.NO_ID](https://developer.android.com/reference/kotlin/androidx/recyclerview/widget/RecyclerView.html#NO_ID--) it will throw [IllegalArgumentException](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-illegal-argument-exception/index.html)



#### Return  


Item's unique id

  



