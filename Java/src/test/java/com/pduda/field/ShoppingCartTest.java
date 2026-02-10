package com.pduda.field;

import org.junit.Assert;
import org.junit.Test;

public class ShoppingCartTest {

    /**
     * Verify that adding a single item results in one product in the cart.
     */
    @Test
    public void singleItemNumberOfProductsInTheCart() throws Exception {
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.add(10);

        Assert.assertEquals(1, shoppingCart.numberOfProducts());
    }

    /**
     * Verify that the total price reflects the price of the added item.
     */
    @Test
    public void singleItemTotalTotalPrice() throws Exception {
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.add(10);

        Assert.assertEquals(10, shoppingCart.calculateTotalPrice());
    }

    /**
     * Verify that a discount is applied when at least one product is worth 100
     * or more.
     */
    @Test
    public void singleItemHasDiscountIfContainsAtLeastOneProductWorthAtLeast100() throws Exception {
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.add(100);

        Assert.assertTrue(shoppingCart.hasDiscount());
    }

    /**
     * Verify that no discount is applied when no product is worth 100 or more.
     */
    @Test
    public void singleItemDoesNotHaveDiscountIfContainsNoProductsWorthAtLeast100() throws Exception {
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.add(99);

        Assert.assertFalse(shoppingCart.hasDiscount());
    }
}
