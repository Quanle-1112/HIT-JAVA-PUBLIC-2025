public class ElectronicProduct extends Product {
    public ElectronicProduct(String id, String name, double price, int quantity, Manufacturer manufacturer) {
        super(id, name, price, quantity, "Electronics", manufacturer);
    }

    @Override
    public double getDiscountPrice() {
        return price * 0.9;
    }
}
