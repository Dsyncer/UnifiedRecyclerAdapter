//[recycler](../../../index.md)/[com.dst.unified.recycler](../index.md)/[RecyclerItem](index.md)/[getSpanSize](get-span-size.md)



# getSpanSize  
[androidJvm]  
Content  
open fun [getSpanSize](get-span-size.md)(position: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)  
More info  


Method that returns span size of that item. It is used in GridLayoutManager



Example of usage:

val gridLayoutManager = GridLayoutManager(this, 2)  
gridLayoutManager.spanSizeLookup = object: GridLayoutManager.SpanSizeLookup() {  
    override fun getSpanSize(position: Int): Int {  
        return unifiedRecyclerAdapter.recyclerItems()[position].getSpanSize(position)  
    }  
}  



