public class NhanVienFullTime extends NhanVien{
    private double luongCoBan;
    private double tienThuong;

    public NhanVienFullTime(double luongCoBan, double tienThuong) {
        this.luongCoBan = luongCoBan;
        this.tienThuong = tienThuong;
    }

    public double getLuongCoBan() {
        return luongCoBan;
    }

    public void setLuongCoBan(double luongCoBan) {
        this.luongCoBan = luongCoBan;
    }

    public double getTienThuong() {
        return tienThuong;
    }

    public void setTienThuong(double tienThuong) {
        this.tienThuong = tienThuong;
    }
    @Override
    public double tinhLuong() {
        return this.luongCoBan + this.tienThuong;
    }

    @Override
    public String toString() {
        return "NhanVienFullTime{" +
                "luongCoBan=" + luongCoBan +
                ", tienThuong=" + tienThuong +
                "loai FullTime"+
                '}';
    }
}
