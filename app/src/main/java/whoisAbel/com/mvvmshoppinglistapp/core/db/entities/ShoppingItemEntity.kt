package whoisAbel.com.mvvmshoppinglistapp.core.db.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "shopping_items")
data class ShoppingItemEntity(var name: String, var mount: Int) {
    @PrimaryKey(autoGenerate = true)
    var id: Int? = null
}