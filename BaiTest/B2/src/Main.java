import java.util.*;

public class Main {
    public static void main(String[] args) {
        Manufacturer nokia = new Manufacturer("M01", "Nokia", "Korea", "Nokia@11.com");
        Manufacturer vinamilk = new Manufacturer("M02", "Vinamilk", "Vietnam", "vinamilk@12.com");
        Manufacturer polo = new Manufacturer("M03", "Polo", "Vietnam", "Vietnam@13.com");

        List<Product> products = new ArrayList<>();
        products.add(new ElectronicProduct("P01", "Phone", 1000, 10, nokia));
        products.add(new FoodProduct("P02", "Milk", 20, 100, vinamilk));
        products.add(new ClothingProduct("P03", "T-Shirt", 50, 30, polo));

        for (Product p : products) {
            p.displayInfo();
        }
    }
}
