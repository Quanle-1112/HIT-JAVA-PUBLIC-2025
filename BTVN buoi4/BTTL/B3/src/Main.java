public class Main{

    public static void main(String[] args){
        Car xe = new Car("Lamborgini", 100);
        xe.run();
        xe.setBrand("VinFast");
        xe.setMaxSpeed(200);
        xe.run();
        System.out.println("Day la xe " + xe.getBrand() + " co toc do " + xe.getMaxSpeed());

        System.out.println();

        xe.checkSpeed();
    }
}