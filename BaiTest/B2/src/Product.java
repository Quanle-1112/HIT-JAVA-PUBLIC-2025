public abstract class Product {
    protected String id;
    protected String name;
    protected double price;
    protected int quantity;
    protected String category;
    protected Manufacturer manufacturer;

    public Product(String id, String name, double price, int quantity, String category, Manufacturer manufacturer) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.category = category;
        this.manufacturer = manufacturer;
    }

    public abstract double getDiscountPrice();

    public void displayInfo() {
        System.out.println("Product ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Category: " + category);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Discounted Price: " + getDiscountPrice());
        System.out.println("Manufacturer: " + manufacturer.getName());
        System.out.println("--------------------------");
    }
}
