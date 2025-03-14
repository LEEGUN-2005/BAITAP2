
abstract class HinhHoc {
    protected final float PI = 3.14f;
    protected String ten;
    protected float chuVi;
    protected float dienTich;
    protected float theTich;

    public HinhHoc() {
        this.ten = "Hinh hoc";
        this.chuVi = 0.0f;
        this.dienTich = 0.0f;
        this.theTich = 0.0f;
    }

    abstract void xuatTen();
    abstract void inChuVi();
    abstract void inDienTich();
    abstract void inTheTich();
}
