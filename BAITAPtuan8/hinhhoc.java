abstract class hinhhoc{
public static final float PI=3.14f;
protected String ten; 
protected float dientich;
 protected  float thetich; 
 protected float chuvi;

public hinhhoc(){
    this.ten=ten;
   this.dientich=0;
   this.thetich=0;
   this.chuvi=0;
   
}
public void xuatten() {
    System.out.println("Hinh: " + ten);
}
abstract void tinhdientich();
abstract void tinhchuvi();
abstract void tinhthetich();

}
