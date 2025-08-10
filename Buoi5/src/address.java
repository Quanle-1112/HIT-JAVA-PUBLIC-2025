public class address {
    private String diaChi;
    private int soNha;

    public address(){

    }

    public address(String diaChi, int soNha) {
        this.diaChi = diaChi;
        this.soNha = soNha;
    }

    public String getDiaChi() {
        return diaChi;
    }
    public void setDiaChi() {
        this.diaChi = diaChi;
    }
    public int getSoNha(){
        return soNha;
    }
    public void setSoNha(){
        this.soNha = soNha;
    }
}
