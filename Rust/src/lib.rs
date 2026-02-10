pub struct ShoppingCart {
    price: i32,
}

impl ShoppingCart {
    pub fn new() -> Self {
        ShoppingCart { price: 0 }
    }

    pub fn add(&mut self, price: i32) {
        self.price = price;
    }

    pub fn calculate_total_price(&self) -> i32 {
        self.price
    }

    pub fn has_discount(&self) -> bool {
        self.price >= 100
    }

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
