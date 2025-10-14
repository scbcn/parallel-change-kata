package com.pduda.field

import org.junit.Assert

class ImagineThisIsAClientInADifferentRepositoryTest extends munit.FunSuite {
  test("single item: number of products in the cart") {
    val client = new ImagineThisIsAClientInADifferentRepository
    Assert.assertEquals("Total price is 50 euro", client.formattedTotalPrice(50))
  }
}
