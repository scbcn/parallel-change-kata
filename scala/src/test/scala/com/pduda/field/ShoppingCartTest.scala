package com.pduda.field

import org.junit.Assert

class ShoppingCartTest extends munit.FunSuite {
  test("single item: number of products in the cart") {
    val shoppingCart = new ShoppingCart
    shoppingCart.add(10)
    Assert.assertEquals(1, shoppingCart.numberOfProducts)
  }

  test("single item: total price") {
    val shoppingCart = new ShoppingCart
    shoppingCart.add(10)
    Assert.assertEquals(10, shoppingCart.calculateTotalPrice)
  }

  test("single item: has discount if contains at least one product worth at least 100") {
    val shoppingCart = new ShoppingCart
    shoppingCart.add(100)
    Assert.assertTrue(shoppingCart.hasDiscount)
  }

  test("single item: does not have discount if contains no products worth at least 100") {
    val shoppingCart = new ShoppingCart
    shoppingCart.add(99)
    Assert.assertFalse(shoppingCart.hasDiscount)
  }
}
