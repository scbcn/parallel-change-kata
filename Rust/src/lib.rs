/// Shopping cart that handles product prices and discounts.
///
/// This implementation follows the Parallel Change kata pattern,
/// starting with a single-item cart that will be evolved to handle
/// multiple items using the expand-contract pattern.
pub struct ShoppingCart {
    price: i32,
}

impl ShoppingCart {
    /// Creates a new empty shopping cart.
    pub fn new() -> Self {
        ShoppingCart { price: 0 }
    }

    /// Adds a product with the given price to the cart.
    ///
    /// Currently replaces the existing price (single-item behavior).
    pub fn add(&mut self, price: i32) {
        self.price = price;
    }

    /// Calculates the total price of all products in the cart.
    pub fn calculate_total_price(&self) -> i32 {
        self.price
    }

    /// Determines if the cart qualifies for a discount.
    ///
    /// A discount is applied when at least one product is worth 100 or more.
    pub fn has_discount(&self) -> bool {
        self.price >= 100
    }

    /// Returns the number of products in the cart.
    pub fn number_of_products(&self) -> usize {
        1
    }
}

impl Default for ShoppingCart {
    fn default() -> Self {
        Self::new()
    }
}

#[cfg(test)]
mod tests {
    use super::*;

    #[test]
    fn single_item_number_of_products_in_the_cart() {
        let mut shopping_cart = ShoppingCart::new();
        shopping_cart.add(10);

        assert_eq!(1, shopping_cart.number_of_products());
    }

    #[test]
    fn single_item_total_price() {
        let mut shopping_cart = ShoppingCart::new();
        shopping_cart.add(10);

        assert_eq!(10, shopping_cart.calculate_total_price());
    }

    #[test]
    fn single_item_has_discount_if_contains_at_least_one_product_worth_at_least_100() {
        let mut shopping_cart = ShoppingCart::new();
        shopping_cart.add(100);

        assert!(shopping_cart.has_discount());
    }

    #[test]
    fn single_item_does_not_have_discount_if_contains_no_products_worth_at_least_100() {
        let mut shopping_cart = ShoppingCart::new();
        shopping_cart.add(99);

        assert!(!shopping_cart.has_discount());
    }
}
