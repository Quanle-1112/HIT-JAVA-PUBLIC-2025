public class SinhVien extends Person{
    private int studentCode;
    private String school;


    public SinhVien(String name, int age, int studentCode, String school) {
        super(name, age);
        this.studentCode = studentCode;
        this.school = school;
    }
    public SinhVien(int studentCode, String school) {
        this.studentCode = studentCode;
        this.school = school;
    }



    public int getStudentCode() {
        return studentCode;
    }

    public void setStudentCode(int studentCode) {
        this.studentCode = studentCode;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }
}
