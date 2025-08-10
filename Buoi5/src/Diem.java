public class Diem {
    private double diemtx1;
    private double diemtx2;
    private double diemgk;
    private double diemTB;

    public Diem() {

    }



    public Diem(double diemtx1, double diemtx2, double diemgk, double diemTB) {
        this.diemtx1 = diemtx1;
        this.diemtx2 = diemtx2;
        this.diemgk = diemgk;
    }

    public void setDiemtx1(double diemtx1) {
        this.diemtx1 = diemtx1;
    }

    public void setDiemtx2(double diemtx2) {
        this.diemtx2 = diemtx2;
    }

    public void setDiemgk(double diemgk) {
        this.diemgk = diemgk;
    }

    public double getDiemtx1() {
        return diemtx1;
    }

    public double getDiemtx2() {
        return diemtx2;
    }

    public double getDiemgk() {
        return diemgk;
    }
}
