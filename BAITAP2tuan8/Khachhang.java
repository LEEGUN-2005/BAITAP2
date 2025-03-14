public class Khachhang extends Nguoi {
    private int sodu;

public Khachhang(String ten,String diachi,int sodu){
    super(ten,diachi);
    this.sodu=sodu;

}
public void setsdt(int sodu) {
    this.sodu = sodu;
}
@Override
void hienthi(){
    System.out.println("khach hang:ten ="+getten()+",dia chi ="+getdiachi()+",so du ="+sodu);
}


    
}
