public class HinhChuNhat extends HinhHoc {
    protected float dai;
    protected float rong;

    public HinhChuNhat(float dai, float rong) {
        this.ten = "Hinh chu nhat";
        this.dai = dai;
        this.rong = rong;
        tinhChuVi();
        tinhDienTich();
    }

    @Override
    void xuatTen() {
        System.out.println("Day la: " + ten);
    }

    @Override
    void inChuVi() {
        System.out.println("Chu vi hcn: " + chuVi);
    }

    @Override
    void inDienTich() {
        System.out.println("Dien tich hinh chu nhat: " + dienTich);
    }

    @Override
    void inTheTich() {
        System.out.println("The tich : " + theTich);
    }

    protected void tinhChuVi() {
        this.chuVi = 2 * (dai + rong);
    }

    protected void tinhDienTich() {
        this.dienTich = dai * rong;
    }

    public void nhapChieuDai() {
        System.out.println("Nhap chieu dai: " + dai);
    }

    public void nhapChieuRong() {
        System.out.println("Nhap chieu rong: " + rong);
    }
}
