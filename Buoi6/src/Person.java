public class Person {

    private String name;
    private int age;
    private static int totalGate;




    public Person() {

    }
    public void eat() {
        System.out.println(name +"dang an" );
    }
    public  void sleep() {
        System.out.println("Toi dang ngu");
    }
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
