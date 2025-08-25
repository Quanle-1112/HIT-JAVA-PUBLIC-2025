abstract public class Animal {

    private int age;

    public Animal(int age) {
        this.age = age;
    }

    public Animal() {

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public abstract void eat();
    public void sleep() {
        System.out.println("I am sleep");
    }
}
