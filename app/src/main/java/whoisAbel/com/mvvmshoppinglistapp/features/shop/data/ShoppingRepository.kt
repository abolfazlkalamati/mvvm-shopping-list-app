package whoisAbel.com.mvvmshoppinglistapp.features.shop.data

class ShoppingRepository(
    private val localDataSource: ShoppingLocalDataSource
) {

    suspend fun upser(shopItem: ShoppingItemEntity) = localDataSource.upsert(shopItem)

    suspend fun delete(shopItem: ShoppingItemEntity) = localDataSource.delete(shopItem)

    fun getAllShoppingItems() = localDataSource.getAllShoppingItems()

}