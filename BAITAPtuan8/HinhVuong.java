public class HinhVuong extends HinhChuNhat {
    public HinhVuong(float canh) {
        super(canh,canh); 
        this.ten = "Hinh vuong";
    }
    @Override
    void xuatTen() {
        System.out.println("Day la: " + ten);
    }
    @Override
    void inChuVi() {
        System.out.println("Chu vi hinh vuong: " + chuVi);
    }
    @Override
    void inDienTich() {
        System.out.println("Dien tich hinh vuong: " + dienTich);
    }
    @Override
    void inTheTich() {
        System.out.println("The tich (khong ap dung cho hinh vuong 2D): " + theTich);
    }
    public void nhapCanh() {
        System.out.println("Nhap canh: " + dai);
    }
}
