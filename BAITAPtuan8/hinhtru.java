
import java.util.Scanner;

public class hinhtru extends hinhtron{
    private float chieucao;
    public hinhtru() {
        super();
        ten = "Hinh Tru";
    }
    public void nhapChieuCao() {
        Scanner kb = new Scanner(System.in);
        System.out.print("Nhap chieu cao: ");
        chieucao = kb.nextFloat();
    }
    public void tinhthetich() {
        thetich = dientich * chieucao;
    }
}
