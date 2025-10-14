package com.pduda.field

class ImagineThisIsAClientInADifferentRepository {
  def formattedTotalPrice(price: Int): String = {
    val shoppingCart = new ShoppingCart
    shoppingCart.add(price)
    f"Total price is ${shoppingCart.calculateTotalPrice}%d euro"
  }
}
