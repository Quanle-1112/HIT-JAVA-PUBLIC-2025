public class ClothingProduct extends Product {
    public ClothingProduct(String id, String name, double price, int quantity, Manufacturer manufacturer) {
        super(id, name, price, quantity, "Clothing", manufacturer);
    }

    @Override
    public double getDiscountPrice() {
        return price * 0.8;
    }
}
