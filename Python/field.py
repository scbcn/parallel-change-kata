class ShoppingCart:
    def __init__(self):
        self.price = 0

    def add(self, price):
        self.price = price

    def calculate_total_price(self):
        return self.price

    def has_discount(self):
        return self.price >= 100

    def number_of_products(self):
        return 1
