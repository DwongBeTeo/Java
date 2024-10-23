package TruuTuong;

public class HinhChuNhat extends HinhHoc {
    protected double dai;
    protected double rong;
    //contructor
    public HinhChuNhat(double dai,double rong){
        this.dai=dai;
        this.rong=rong;
    }
    //phuong thuc tinh chu vi va dien tich
    @Override
    public double tinhChuVi(){
        return (dai+rong)*2;
    }
    @Override
    public double tinhDienTich(){
        return (dai*rong);
    }
}
