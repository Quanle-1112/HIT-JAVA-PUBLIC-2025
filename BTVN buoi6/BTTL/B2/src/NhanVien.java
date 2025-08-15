public class NhanVien {
    private String maNV;
    private String name;
    private int age;
    private String email;
    private String soDienThoai;

    public NhanVien(String maSinhVien, String name, int age, String email, String soDienThoai) {
        this.maNV = maSinhVien;
        this.name = name;
        this.age = age;
        this.email = email;
        this.soDienThoai = soDienThoai;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }
    public double tinhLuong() {
        return 0;
    }

    @Override
    public String toString() {
        return "NhanVien{" +
                "maNV='" + maNV + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", soDienThoai='" + soDienThoai + '\'' +
                '}';
    }
}
