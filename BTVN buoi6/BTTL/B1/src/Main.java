import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){

        ArrayList<SinhVien> dsSinhVien = new ArrayList<>();

        LopHoc myLop = new LopHoc("01", "KTPM");
        SinhVien sv1 = new SinhVien("1" , "Le Cong Quan", 10, myLop);
        SinhVien sv2 = new SinhVien("2", "Doan Minh Quan", 9.5, myLop);
        SinhVien sv3 = new SinhVien("3", "Le Duc Xuan Quan", 9.8, myLop);

        dsSinhVien.add(sv1);
        dsSinhVien.add(sv2);
        dsSinhVien.add(sv3);

        double maxDiemTB = 0;
        String namemax = "";
        for (int i = 0; i < dsSinhVien.size(); i++){
            System.out.println(dsSinhVien.get(i).getHoTen());
            if (dsSinhVien.get(i).getDiemTB() > maxDiemTB){
                maxDiemTB = dsSinhVien.get(i).getDiemTB();
                namemax = dsSinhVien.get(i).getHoTen();
            }
        }

        System.out.println("Người có điểm trung bình cao nhất là: " + namemax);
    }
}