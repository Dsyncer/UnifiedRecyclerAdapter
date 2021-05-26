//[recycler](../../../index.md)/[com.dst.unified.recycler.helpers](../index.md)/[PaginationListener](index.md)



# PaginationListener  
 [androidJvm] abstract class [PaginationListener](index.md)(**layoutManager**: [RecyclerView.LayoutManager](https://developer.android.com/reference/kotlin/androidx/recyclerview/widget/RecyclerView.LayoutManager.html), **pageSize**: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)) : [RecyclerView.OnScrollListener](https://developer.android.com/reference/kotlin/androidx/recyclerview/widget/RecyclerView.OnScrollListener.html)

This is an implementation of [RecyclerView.OnScrollListener](https://developer.android.com/reference/kotlin/androidx/recyclerview/widget/RecyclerView.OnScrollListener.html) that supports pagination scrolling.

   


## Parameters  
  
androidJvm  
  
| | |
|---|---|
| <a name="com.dst.unified.recycler.helpers/PaginationListener///PointingToDeclaration/"></a>layoutManager| <a name="com.dst.unified.recycler.helpers/PaginationListener///PointingToDeclaration/"></a><br><br>LayoutManger that is attached to RecyclerView which you want to support pagination scrolling in<br><br>|
| <a name="com.dst.unified.recycler.helpers/PaginationListener///PointingToDeclaration/"></a>pageSize| <a name="com.dst.unified.recycler.helpers/PaginationListener///PointingToDeclaration/"></a><br><br>Amount of items per page.<br><br>|
  


## Constructors  
  
| | |
|---|---|
| <a name="com.dst.unified.recycler.helpers/PaginationListener/PaginationListener/#androidx.recyclerview.widget.RecyclerView.LayoutManager#kotlin.Int/PointingToDeclaration/"></a>[PaginationListener](-pagination-listener.md)| <a name="com.dst.unified.recycler.helpers/PaginationListener/PaginationListener/#androidx.recyclerview.widget.RecyclerView.LayoutManager#kotlin.Int/PointingToDeclaration/"></a> [androidJvm] fun [PaginationListener](-pagination-listener.md)(layoutManager: [RecyclerView.LayoutManager](https://developer.android.com/reference/kotlin/androidx/recyclerview/widget/RecyclerView.LayoutManager.html), pageSize: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html))LayoutManger that is attached to RecyclerView which you want to support pagination scrolling in   <br>|


## Functions  
  
|  Name |  Summary | 
|---|---|
| <a name="com.dst.unified.recycler.helpers/PaginationListener/isLastPage/#/PointingToDeclaration/"></a>[isLastPage](is-last-page.md)| <a name="com.dst.unified.recycler.helpers/PaginationListener/isLastPage/#/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>abstract fun [isLastPage](is-last-page.md)(): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)  <br>More info  <br>This methods returns whether last page has been fetched or not  <br><br><br>|
| <a name="com.dst.unified.recycler.helpers/PaginationListener/isLoading/#/PointingToDeclaration/"></a>[isLoading](is-loading.md)| <a name="com.dst.unified.recycler.helpers/PaginationListener/isLoading/#/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>abstract fun [isLoading](is-loading.md)(): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)  <br>More info  <br>This methods returns whether items are currently loading or not  <br><br><br>|
| <a name="com.dst.unified.recycler.helpers/PaginationListener/onScrolled/#androidx.recyclerview.widget.RecyclerView#kotlin.Int#kotlin.Int/PointingToDeclaration/"></a>[onScrolled](on-scrolled.md)| <a name="com.dst.unified.recycler.helpers/PaginationListener/onScrolled/#androidx.recyclerview.widget.RecyclerView#kotlin.Int#kotlin.Int/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>open override fun [onScrolled](on-scrolled.md)(recyclerView: [RecyclerView](https://developer.android.com/reference/kotlin/androidx/recyclerview/widget/RecyclerView.html), dx: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), dy: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html))  <br><br><br>|


## Inherited functions  
  
|  Name |  Summary | 
|---|---|
| <a name="androidx.recyclerview.widget/RecyclerView.OnScrollListener/onScrollStateChanged/#androidx.recyclerview.widget.RecyclerView#kotlin.Int/PointingToDeclaration/"></a>[onScrollStateChanged](index.md#-767679993%2FFunctions%2F1072867916)| <a name="androidx.recyclerview.widget/RecyclerView.OnScrollListener/onScrollStateChanged/#androidx.recyclerview.widget.RecyclerView#kotlin.Int/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>open fun [onScrollStateChanged](index.md#-767679993%2FFunctions%2F1072867916)(@[NonNull](https://developer.android.com/reference/kotlin/androidx/annotation/NonNull.html)()p0: [RecyclerView](https://developer.android.com/reference/kotlin/androidx/recyclerview/widget/RecyclerView.html), p1: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html))  <br><br><br>|

