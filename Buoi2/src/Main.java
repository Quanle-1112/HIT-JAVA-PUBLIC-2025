//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void Nhapso() {
        System.out.println("Nhap gia tri a va b: ");
    }
    public static void tinh(int a, int b) {

        int sum = a + b;
        System.out.println("Tong cua 2 so la: " + sum);
    }

    public static void main(String[] args) {
        int a;
        int b;
        int sum;
        Nhapso();
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        tinh(a, b);
    }
}