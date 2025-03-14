public class HinhTru extends HinhTron {
    private float chieuCao;

    public HinhTru(float banKinh, float chieuCao) {
        super(banKinh);
        this.ten = "Hinh tru";
        this.chieuCao = chieuCao;
        tinhChuVi();
        tinhDienTich();
        tinhTheTich();
    }
    @Override
    void xuatTen() {
        System.out.println("Day la: " + ten);
    }
    @Override
    void inChuVi() {
        System.out.println("Chu vi day hinh tru: " + chuVi);
    }
    @Override
    void inDienTich() {
        float dienTichXungQuanh = chuVi * chieuCao;
        float dienTichToanPhan = 2 * dienTich + dienTichXungQuanh;
        System.out.println("Dien tich toan phan hinh tru: " + dienTichToanPhan);
    }
    @Override
    void inTheTich() {
        System.out.println("The tich hinh tru: " + theTich);
    }
    private void tinhTheTich() {
        this.theTich = dienTich * chieuCao;
    }
    public void nhapChieuCao() {
        System.out.println("Nhap chieu cao: " + chieuCao);
    }
}
