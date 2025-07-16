import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap ten cua ban: ");
        String ten= sc.nextLine();
        System.out.print("Nhap tuoi cua ban: ");
        int tuoi = sc.nextInt();
        System.out.print("Nhap chieu cao cua ban: ");
        double chieuCao =  sc.nextDouble();

        System.out.print("Xin chao " + ten + "," + " ban " + tuoi + " tuoi " + "va cao " + chieuCao + " met");

    }
}