# UnifiedRecyclerAdapter

This is an Android library that provides set of abstractions for displaying models in `RecyclerView` without writing boilerplate code.
All these abstraction can be found under `recycler` directory

Example app with different ways of it's usage can be found inside of `app` directory

Set of simple useful items can be found under `items` directory

## How to use it
1. Implement `RecyclerItem` in your model class:
```kotlin
class MyModel : RecyclerItem {
  override fun viewType(position: Int): Int {
    return MyModelHolder.viewType
  }
}
```
2. Add `ViewHolder` class for you model and extend it from `UnifiedViewHodler` class:
```kotlin
class MyModelHolder(itemView: View) : UnifiedViewHolder<MyModel>(itemView) {

    private val myView: MyView = itemView.findViewById(R.id.myView)

    override fun bind(item: MyModel, position: Int) {
        myView.data = item.data
    }
}
```
3. Create Type object to connect `ViewHolder` and `RecyclerItem` by extending `UnifiedViewHolderType` and passing appropriate parameters in constructor. 
You can add it as a companion object to your ViewHolder:
```kotlin
class MyModelHolder(itemView: View) : UnifiedViewHolder<MyModel>(itemView) {
  ...
  
  companion object Type : UnifiedViewHolderType<MyModel>(1, R.layout.my_model_item, MyModelHolder::class.java)
}
```
4. Create instance of `UnifiedRecyclerAdapter` and pass array of `UnifiedViewHolderType`s that are used in that `RecyclerView` and then set is as RecyclerView's adapter:
```kotlin
val unifiedRecyclerAdapter = UnifiedRecyclerAdapter(arrayOf(MyModelHolder.Type))
recyclerView.adapter = unifiedRecyclerAdapter
```

There are also other useful utilities classes such as SwipeToDelete or PaginationListener that are located under `recycler/helpers`

**For more information, please, see documentation in `docs` folder. You can also follow 
[html](https://dsyncer.github.io/UnifiedRecyclerAdapter/html) documentation link or [gfm](https://dsyncer.github.io/UnifiedRecyclerAdapter/gfm) link**
