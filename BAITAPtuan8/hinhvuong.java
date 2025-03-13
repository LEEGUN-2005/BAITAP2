import java.util.Scanner;
public class hinhvuong extends hinhchunhat {
    public hinhvuong() {
        super();
        ten = "Hinh Vuong";
    }
    public void nhapCanh() {
        Scanner kb = new Scanner(System.in);
        System.out.print("Nhap do dai canh: ");
        dai = rong = kb.nextFloat();
    }
}

