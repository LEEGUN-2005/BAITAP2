public class Demo{
    public static void main(String[] args) {
     
        Nhanvien nhanVien = new Nhanvien("Nguyen khanh an", "1 To Ky , Quan 12 , TPHCM", 5000);
        nhanVien.hienthi();

        System.out.println("----------------");

        Khachhang khachHang = new Khachhang("Tran yen phuong", "21/6e Nguyen Tri Phuong, Quan 10 , TPHCM", 20000);
        khachHang.hienthi();
    }
}