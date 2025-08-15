public class NhanVienPartTime extends NhanVien{
    private int soGioLam;
    private double luongTheoGio;

    public NhanVienPartTime(String maSinhVien, String name, int age, String email, String soDienThoai, int soGioLam, double luongTheoGio) {
        super(maSinhVien, name, age, email, soDienThoai);
        this.soGioLam = soGioLam;
        this.luongTheoGio = luongTheoGio;
    }

    public int getSoGioLam() {
        return soGioLam;
    }

    public void setSoGioLam(int soGioLam) {
        this.soGioLam = soGioLam;
    }

    public double getLuongTheoGio() {
        return luongTheoGio;
    }

    public void setLuongTheoGio(double luongTheoGio) {
        this.luongTheoGio = luongTheoGio;
    }

    @Override
    public double tinhLuong() {
        return this.soGioLam * this.luongTheoGio;
    }

    @Override
    public String toString() {
        return "NhanVienPartTiem{" +
                "soGioLam=" + soGioLam +
                ", luongTheoGio=" + luongTheoGio +
                "loai PartTime"+
                '}';
    }
}
