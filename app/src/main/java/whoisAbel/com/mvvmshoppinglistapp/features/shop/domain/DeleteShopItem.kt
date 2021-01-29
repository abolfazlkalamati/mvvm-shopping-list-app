package whoisAbel.com.mvvmshoppinglistapp.features.shop.domain

import whoisAbel.com.mvvmshoppinglistapp.features.shop.data.ShoppingItemEntity
import whoisAbel.com.mvvmshoppinglistapp.features.shop.data.ShoppingRepository

class DeleteShopItem constructor(private val shoppingRepository: ShoppingRepository) {
    suspend operator fun invoke(shopItem: ShoppingItemEntity) = shoppingRepository.delete(shopItem)
}