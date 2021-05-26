//[recycler](../../../index.md)/[com.dst.unified.recycler](../index.md)/[UnifiedViewHolderType](index.md)



# UnifiedViewHolderType  
 [androidJvm] open class [UnifiedViewHolderType](index.md)<[T](index.md) : [RecyclerItem](../-recycler-item/index.md)>(**viewType**: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), @[LayoutRes](https://developer.android.com/reference/kotlin/androidx/annotation/LayoutRes.html)()**layoutRes**: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), **unifiedViewHolderClass**: [Class](https://docs.oracle.com/javase/8/docs/api/java/lang/Class.html)<out [UnifiedViewHolder](../-unified-view-holder/index.md)<[T](index.md)>>)

That class is used to connect [RecyclerItem](../-recycler-item/index.md) and appropriate [UnifiedViewHolder](../-unified-view-holder/index.md) that is used for displaying it.



It is also used to connect [UnifiedViewHolder](../-unified-view-holder/index.md) and it's appropriate [LayoutRes](https://developer.android.com/reference/kotlin/androidx/annotation/LayoutRes.html)



Recommended way of using that class is by adding companion object to [UnifiedViewHolder](../-unified-view-holder/index.md):

class SomeItemHolder : UnifiedViewHolder<SomeItem> {  
    ...  
  
    companion object Type :  
        UnifiedViewHolderType<SomeItem>(viewType,  
                                        R.layout.some_item_layout,  
                                        SomeItemHolder::class.java)  
}   


## See also  
  
androidJvm  
  
| | |
|---|---|
| <a name="com.dst.unified.recycler/UnifiedViewHolderType///PointingToDeclaration/"></a>[com.dst.unified.recycler.RecyclerItem](../-recycler-item/index.md)| <a name="com.dst.unified.recycler/UnifiedViewHolderType///PointingToDeclaration/"></a>|
| <a name="com.dst.unified.recycler/UnifiedViewHolderType///PointingToDeclaration/"></a>[com.dst.unified.recycler.UnifiedViewHolder](../-unified-view-holder/index.md)| <a name="com.dst.unified.recycler/UnifiedViewHolderType///PointingToDeclaration/"></a>|
| <a name="com.dst.unified.recycler/UnifiedViewHolderType///PointingToDeclaration/"></a>[com.dst.unified.recycler.UnifiedRecyclerAdapter](../-unified-recycler-adapter/index.md)| <a name="com.dst.unified.recycler/UnifiedViewHolderType///PointingToDeclaration/"></a>|
  


## Parameters  
  
androidJvm  
  
| | |
|---|---|
| <a name="com.dst.unified.recycler/UnifiedViewHolderType///PointingToDeclaration/"></a>T| <a name="com.dst.unified.recycler/UnifiedViewHolderType///PointingToDeclaration/"></a><br><br>Type of object that is going to be displayed in [UnifiedViewHolder](../-unified-view-holder/index.md). Has to implement [RecyclerItem](../-recycler-item/index.md)<br><br>|
| <a name="com.dst.unified.recycler/UnifiedViewHolderType///PointingToDeclaration/"></a>viewType| <a name="com.dst.unified.recycler/UnifiedViewHolderType///PointingToDeclaration/"></a><br><br>That value has to be the same as [RecyclerItem.viewType](../-recycler-item/view-type.md) to connect [UnifiedViewHolder](../-unified-view-holder/index.md) with it<br><br>|
| <a name="com.dst.unified.recycler/UnifiedViewHolderType///PointingToDeclaration/"></a>layoutRes| <a name="com.dst.unified.recycler/UnifiedViewHolderType///PointingToDeclaration/"></a><br><br>Root layout for [UnifiedViewHolder](../-unified-view-holder/index.md)<br><br>|
| <a name="com.dst.unified.recycler/UnifiedViewHolderType///PointingToDeclaration/"></a>unifiedViewHolderClass| <a name="com.dst.unified.recycler/UnifiedViewHolderType///PointingToDeclaration/"></a><br><br>Reference to [UnifiedViewHolder](../-unified-view-holder/index.md) class that is later used to instantiate it<br><br>|
  


## Constructors  
  
| | |
|---|---|
| <a name="com.dst.unified.recycler/UnifiedViewHolderType/UnifiedViewHolderType/#kotlin.Int#kotlin.Int#java.lang.Class[com.dst.unified.recycler.UnifiedViewHolder[TypeParam(bounds=[com.dst.unified.recycler.RecyclerItem])]]/PointingToDeclaration/"></a>[UnifiedViewHolderType](-unified-view-holder-type.md)| <a name="com.dst.unified.recycler/UnifiedViewHolderType/UnifiedViewHolderType/#kotlin.Int#kotlin.Int#java.lang.Class[com.dst.unified.recycler.UnifiedViewHolder[TypeParam(bounds=[com.dst.unified.recycler.RecyclerItem])]]/PointingToDeclaration/"></a> [androidJvm] fun <[T](index.md) : [RecyclerItem](../-recycler-item/index.md)> [UnifiedViewHolderType](-unified-view-holder-type.md)(viewType: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), @[LayoutRes](https://developer.android.com/reference/kotlin/androidx/annotation/LayoutRes.html)()layoutRes: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), unifiedViewHolderClass: [Class](https://docs.oracle.com/javase/8/docs/api/java/lang/Class.html)<out [UnifiedViewHolder](../-unified-view-holder/index.md)<[T](index.md)>>)Type of object that is going to be displayed in [UnifiedViewHolder](../-unified-view-holder/index.md).   <br>|


## Properties  
  
|  Name |  Summary | 
|---|---|
| <a name="com.dst.unified.recycler/UnifiedViewHolderType/layoutRes/#/PointingToDeclaration/"></a>[layoutRes](layout-res.md)| <a name="com.dst.unified.recycler/UnifiedViewHolderType/layoutRes/#/PointingToDeclaration/"></a> [androidJvm] val [layoutRes](layout-res.md): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)Root layout for [UnifiedViewHolder](../-unified-view-holder/index.md)   <br>|
| <a name="com.dst.unified.recycler/UnifiedViewHolderType/unifiedViewHolderClass/#/PointingToDeclaration/"></a>[unifiedViewHolderClass](unified-view-holder-class.md)| <a name="com.dst.unified.recycler/UnifiedViewHolderType/unifiedViewHolderClass/#/PointingToDeclaration/"></a> [androidJvm] val [unifiedViewHolderClass](unified-view-holder-class.md): [Class](https://docs.oracle.com/javase/8/docs/api/java/lang/Class.html)<out [UnifiedViewHolder](../-unified-view-holder/index.md)<[T](index.md)>>Reference to [UnifiedViewHolder](../-unified-view-holder/index.md) class that is later used to instantiate it   <br>|
| <a name="com.dst.unified.recycler/UnifiedViewHolderType/viewType/#/PointingToDeclaration/"></a>[viewType](view-type.md)| <a name="com.dst.unified.recycler/UnifiedViewHolderType/viewType/#/PointingToDeclaration/"></a> [androidJvm] val [viewType](view-type.md): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)That value has to be the same as [RecyclerItem.viewType](../-recycler-item/view-type.md) to connect [UnifiedViewHolder](../-unified-view-holder/index.md) with it   <br>|

