package model;

import java.util.Objects;
import static model.constants.Colour.RED;
import static model.constants.Discount.DISCOUNT;

public class Apple extends Food {
    String colour;
    public Apple(int amount, double price, String colour) {
        this.amount = amount;
        this.price = price;
        this.colour = colour;
        isVegetarian = true;
    }
    @Override
    public double getDiscount() {
        if (RED.equals(colour)) {
            return DISCOUNT;
        }
        return 0;
    }
}