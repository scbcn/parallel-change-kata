package com.pduda.field

class ShoppingCart {
  private var price = 0
  def add(price: Int): Unit    = this.price = price
  def calculateTotalPrice: Int = price
  def hasDiscount: Boolean     = price >= 100
  def numberOfProducts = 1
}
