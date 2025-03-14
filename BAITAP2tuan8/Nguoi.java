abstract class Nguoi{
    private String ten;
    private String diachi;

    public Nguoi(String ten, String diachi) {
        this.ten = ten;
        this.diachi = diachi;
    }

    public String getten() {
        return ten;
    }
    public void setten(String ten) {
        this.ten = ten;
    }
    public String getdiachi() {
        return diachi;
    }

    public void setdiachi(String diachi) {
        this.diachi = diachi;
    }
 
    abstract void hienthi();
}