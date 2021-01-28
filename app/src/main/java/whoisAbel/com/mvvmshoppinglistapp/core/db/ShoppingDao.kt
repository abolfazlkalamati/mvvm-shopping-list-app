package whoisAbel.com.mvvmshoppinglistapp.core.db

import androidx.lifecycle.LiveData
import androidx.room.*
import whoisAbel.com.mvvmshoppinglistapp.core.db.entities.ShoppingItemEntity

@Dao
interface ShoppingDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun upsert(item: ShoppingItemEntity)

    @Delete
    suspend fun delete(item: ShoppingItemEntity)

    @Query("SELECT * FROM shopping_items")
    fun getAllShoppingItems():LiveData<List<ShoppingItemEntity>>

}