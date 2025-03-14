public class Nhanvien extends Nguoi {
    private int luong;

    public Nhanvien(String ten, String diachi, int luong) {
        super(ten, diachi);
        this.luong = luong;
    }
    @Override
    void hienthi() {
        System.out.println("Nhan vien: Ten = " + getten() + ", Dia chi = " + getdiachi() + ", Luong = " + luong);
    }
}
