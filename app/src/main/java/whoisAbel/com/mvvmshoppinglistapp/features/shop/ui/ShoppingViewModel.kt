package whoisAbel.com.mvvmshoppinglistapp.features.shop.ui

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import whoisAbel.com.mvvmshoppinglistapp.features.shop.data.ShoppingItemEntity
import whoisAbel.com.mvvmshoppinglistapp.features.shop.domain.DeleteShopItem
import whoisAbel.com.mvvmshoppinglistapp.features.shop.domain.GetShopItems
import whoisAbel.com.mvvmshoppinglistapp.features.shop.domain.UpsertShopItem

class ShoppingViewModel(
    private val deleteItem: DeleteShopItem,
    private val getItems: GetShopItems,
    private val upsertItem: UpsertShopItem
) : ViewModel() {

    fun upsert(shopItem: ShoppingItemEntity) = GlobalScope.launch {
        upsertItem.invoke(shopItem)
    }

    fun delete(shopItem: ShoppingItemEntity) = GlobalScope.launch {
        deleteItem.invoke(shopItem)
    }

    fun getItems() = GlobalScope.launch {
        getItems.invoke()
    }

}