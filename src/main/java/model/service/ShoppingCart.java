package model.service;

import model.Food;

public class ShoppingCart {
    private final Food[] items;

    public ShoppingCart(Food[] items) {
        this.items = items;
    }

    public double getTotalPriceWithoutDiscount() {
        double totalPrice = 0;
        for (Food item : items) {
            totalPrice += item.getAmount() * item.getPrice();
        }
        return totalPrice;
    }

    public double getTotalPriceWithDiscount() {
        double totalPrice = 0;
        for (Food item : items) {
            totalPrice += item.getAmount() * item.getPrice() * (1 - item.getDiscount());
        }
        return totalPrice;
    }

    public double getVegetarianTotalPrice() {
        double totalPrice = 0;
        for (Food item : items) {
            if (item.getVegetarian()) {
                totalPrice += item.getAmount() * item.getPrice();
            }
        }
        return totalPrice;
    }
}