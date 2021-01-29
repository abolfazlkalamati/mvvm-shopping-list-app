package whoisAbel.com.mvvmshoppinglistapp.features.shop.domain

import whoisAbel.com.mvvmshoppinglistapp.features.shop.data.ShoppingRepository

class GetShopItems constructor(private val shoppingRepository: ShoppingRepository) {
    operator fun invoke() = shoppingRepository.getAllShoppingItems()
}