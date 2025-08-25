public class FoodProduct extends Product {
    public FoodProduct(String id, String name, double price, int quantity, Manufacturer manufacturer) {
        super(id, name, price, quantity, "Food", manufacturer);
    }

    @Override
    public double getDiscountPrice() {
        return price * 0.95;
    }
}
