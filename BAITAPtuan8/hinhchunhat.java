import java.util.Scanner;
public class hinhchunhat extends hinhhoc {
    protected float dai, rong;

    public hinhchunhat() {
        super("Hinh Chu Nhat");
    }
    public void nhapChieuDai() {
        Scanner kb = new Scanner(System.in);
        System.out.print("Nhap chieu dai: ");
        dai = kb.nextFloat();
    }
    public void nhapChieuRong() {
        Scanner kb = new Scanner(System.in);
        System.out.print("Nhap chieu rong: ");
        rong = kb.nextFloat();
    }
    public void tinhchuvi() {
        chuvi = 2 * (dai + rong);
    }
    public void tinhdientich() {
        dientich = dai * rong;
    }
    public void tinhthetich() {
        thetich = 0;
    }
}
