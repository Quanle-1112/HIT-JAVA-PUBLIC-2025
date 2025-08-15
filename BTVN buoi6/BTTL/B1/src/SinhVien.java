public class SinhVien {
    private String maSv;
    private String hoTen;
    private double diemTB;
    LopHoc lop;

    public SinhVien(String maSv, String hoTen, double diemTB, LopHoc lop) {
        this.maSv = maSv;
        this.hoTen = hoTen;
        this.diemTB = diemTB;
        this.lop = lop;
    }

    public String getMaSv() {
        return maSv;
    }

    public void setMaSv(String maSv) {
        this.maSv = maSv;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public double getDiemTB() {
        return diemTB;
    }

    public void setDiemTB(double diemTB) {
        this.diemTB = diemTB;
    }

    public LopHoc getLop() {
        return lop;
    }

    public void setLop(LopHoc lop) {
        this.lop = lop;
    }

    @Override
    public String toString() {
        return "SinhVien{" +
                "maSv='" + maSv + '\'' +
                ", hoTen='" + hoTen + '\'' +
                ", diemTB=" + diemTB +
                ", lop=" + lop +
                '}';
    }

    public void setDiemTB(int diemTB) {
        this.diemTB = diemTB;
    }
}
