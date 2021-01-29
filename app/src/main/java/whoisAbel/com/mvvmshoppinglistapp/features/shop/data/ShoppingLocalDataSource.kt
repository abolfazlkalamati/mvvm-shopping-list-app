package whoisAbel.com.mvvmshoppinglistapp.features.shop.data

import whoisAbel.com.mvvmshoppinglistapp.core.db.ShoppingDatabase

class ShoppingLocalDataSource(
    private val db: ShoppingDatabase
) {

    suspend fun upsert(shopItem: ShoppingItemEntity) = db.getShoppingDao().upsert(shopItem)

    suspend fun delete(shopItem: ShoppingItemEntity) = db.getShoppingDao().delete(shopItem)

    fun getAllShoppingItems() = db.getShoppingDao().getAllShoppingItems()

}