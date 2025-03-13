
public class demo {
    public static void main(String[] args) {
        hinhtron ht = new hinhtron();
        ht.nhapbankinh();
        ht.tinhchuvi();
        ht.tinhdientich();
        ht.xuatten();
        System.out.println("Chu vi: " + ht.chuvi);
        System.out.println("Dien tich: " + ht.dientich);

        hinhchunhat hcn = new hinhchunhat();
        hcn.nhapChieuDai();
        hcn.nhapChieuRong();
        hcn.tinhchuvi();
        hcn.tinhdientich();
        hcn.xuatten();
        System.out.println("Chu vi: " + hcn.chuvi);
        System.out.println("Dien tich: " + hcn.dientich);

        hinhvuong hv = new hinhvuong();
        hv.nhapCanh();
        hv.tinhchuvi();
        hv.tinhdientich();
        hv.xuatten();
        System.out.println("Chu vi: " + hv.chuvi);
        System.out.println("Dien tich: " + hv.dientich);

        hinhtru htr = new hinhtru();
        htr.nhapbankinh();
        htr.nhapChieuCao();
        htr.tinhdientich();
        htr.tinhthetich();
        htr.xuatten();
        System.out.println("The tich: " + htr.thetich);
    }
}
