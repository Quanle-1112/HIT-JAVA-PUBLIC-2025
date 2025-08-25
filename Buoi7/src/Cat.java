public class Cat extends Animal {
    private String keu;

    public Cat(int age, String keu) {
        super(age);
        this.keu = keu;
    }

    @Override
    public void eat() {
        System.out.println("I am eating");
    }

    public String getKeu() {
        return keu;
    }

    public void setKeu(String keu) {
        this.keu = keu;
    }
}
