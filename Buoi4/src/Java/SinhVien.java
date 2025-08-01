package Java;

public class SinhVien {
    private String maSinhVien;
    public String name;
    public int age;
    int diem;

    public SinhVien(){

    }
    public SinhVien(String maSinhVien, String name, int age, int diem) {
        this.maSinhVien = maSinhVien;
        this.name = name;
        this.age = age;
        this.diem = diem;

    }

    public String getMaSinhVien() {
        return maSinhVien;
    }
    public void setMaSinhVien(String maSinhVien){
        this.maSinhVien = maSinhVien;
    }
}
