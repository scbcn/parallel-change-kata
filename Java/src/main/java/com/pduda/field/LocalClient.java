package com.pduda.field;

import java.util.logging.Level;
import java.util.logging.Logger;

public class LocalClient {

    private static final Logger LOGGER = Logger.getLogger(LocalClient.class.getName());

    public static void main(String[] args) {
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.add(10);
        LOGGER.log(Level.INFO, "shoppingCart.numberOfProducts() = {0}", shoppingCart.numberOfProducts());
        LOGGER.log(Level.INFO, "shoppingCart.calculateTotalPrice() = {0}", shoppingCart.calculateTotalPrice());
        LOGGER.log(Level.INFO, "shoppingCart.hasDiscount() = {0}", shoppingCart.hasDiscount());
    }
}
