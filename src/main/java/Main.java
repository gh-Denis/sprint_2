import model.Apple;
import model.Food;
import model.Meat;
import model.service.ShoppingCart;
import static model.constants.Colour.GREEN;
import static model.constants.Colour.RED;

public class Main {
    public static void main(String[] args) {
        Meat meat = new Meat(5, 100);
        Apple appleRed = new Apple(10, 50, RED);
        Apple appleGreen = new Apple(8, 60, GREEN);

        Food[] items = {meat, appleRed, appleGreen};

        ShoppingCart shoppingCart = new ShoppingCart(items);

        System.out.println("Общая сумма товаров без скидки " + shoppingCart.getTotalPriceWithoutDiscount());
        System.out.println("Общая сумма товаров со скидкой " + shoppingCart.getTotalPriceWithDiscount());
        System.out.println("Сумма всех вегетарианских продуктов без скидки " + shoppingCart.getVegetarianTotalPrice());
    }
}