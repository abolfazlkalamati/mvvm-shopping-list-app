package whoisAbel.com.mvvmshoppinglistapp.core.db

import androidx.lifecycle.LiveData
import androidx.room.*
import whoisAbel.com.mvvmshoppinglistapp.features.shop.data.ShoppingItemEntity

@Dao
interface ShoppingDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun upsert(shopItem: ShoppingItemEntity)

    @Delete
    suspend fun delete(shopItem: ShoppingItemEntity)

    @Query("SELECT * FROM shopping_items")
    fun getAllShoppingItems():LiveData<List<ShoppingItemEntity>>

}