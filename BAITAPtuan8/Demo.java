public class Demo {
    public static void main(String[] args) {
   
        HinhTron hinhTron = new HinhTron(5.0f);
        hinhTron.xuatTen();
        hinhTron.nhapBanKinh();
        hinhTron.inChuVi();
        hinhTron.inDienTich();
        hinhTron.inTheTich();

        System.out.println("----------------");

        HinhChuNhat hinhChuNhat = new HinhChuNhat(4.0f, 6.0f);
        hinhChuNhat.xuatTen();
        hinhChuNhat.nhapChieuDai();
        hinhChuNhat.nhapChieuRong();
        hinhChuNhat.inChuVi();
        hinhChuNhat.inDienTich();
        hinhChuNhat.inTheTich();

        System.out.println("----------------");

        HinhTru hinhTru = new HinhTru(5.0f, 10.0f);
        hinhTru.xuatTen();
        hinhTru.nhapBanKinh();
        hinhTru.nhapChieuCao();
        hinhTru.inChuVi();
        hinhTru.inDienTich();
        hinhTru.inTheTich();

        System.out.println("----------------");

        HinhVuong hinhVuong = new HinhVuong(5.0f);
        hinhVuong.xuatTen();
        hinhVuong.nhapCanh();
        hinhVuong.inChuVi();
        hinhVuong.inDienTich();
        hinhVuong.inTheTich();
    }
}
