public class Staff extends Person{
    private double salary;

    public Staff(double salary) {
        this.salary = salary;
    }

    public Staff(String name, int age, double salary) {
        super(name, age);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
