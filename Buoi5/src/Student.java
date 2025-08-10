public class Student {
    private String name;
    private int age;
    static int dem;
    address address;
    Diem diem;

    public Student() {

    }

    public Student(int age, String name, address address, Diem diem) {
        this.age = age;
        this.name = name;
        this.address = address;
        dem +=1;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
}
