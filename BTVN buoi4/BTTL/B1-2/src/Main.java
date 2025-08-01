public class Main{

    public static void main(String[] args) {
        Student me = new Student("Khanh", 19);
        me.sayHello();
        System.out.println("Hello " + me.getName() + " ban " + me.getAge() + " tuoi phai khong ?");
        me.setName("Linh");
        me.setAge(20);
        System.out.println("Hello " + me.getName() + " ban " + me.getAge() + " tuoi phai khong ?");

        System.out.println();
    }
}