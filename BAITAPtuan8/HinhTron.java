class HinhTron extends HinhHoc {
    protected float banKinh;

    public HinhTron(float banKinh) {
        this.ten = "Hinh tron";
        this.banKinh = banKinh;
        tinhChuVi();
        tinhDienTich();
    }
    @Override
    void xuatTen() {
        System.out.println("Day la: " + ten);
    }
    @Override
    void inChuVi() {
        System.out.println("Chu vi hinh tron: " + chuVi);
    }
    @Override
    void inDienTich() {
        System.out.println("Dien tich hinh tron: " + dienTich);
    }
    @Override
    void inTheTich() {
        System.out.println("The tich : " + theTich);
    }
    protected void tinhChuVi() {
        this.chuVi = 2 * PI * banKinh;
    }
    protected void tinhDienTich() {
        this.dienTich = PI * banKinh * banKinh;
    }
    public void nhapBanKinh() {
        System.out.println("Nhap ban kinh: " + banKinh);
    }
}
