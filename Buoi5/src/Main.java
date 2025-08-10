public class Main {
    public static void main(String[] args) {
        Student studentA = new Student(19, "Quan",new address("Nghe an", 22), new Diem(10,10,10));
        System.out.println(studentA.getName() + ' ' + studentA.getAge());
        System.out.println(studentA.address.getDiaChi());
        System.out.println();

    }
}