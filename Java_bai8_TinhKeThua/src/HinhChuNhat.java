public class HinhChuNhat {
    private double dai;
    private double rong;
    //contructor cua lop HinhChuNhat
    public HinhChuNhat(double dai,double rong){
        this.dai=dai;
        this.rong=rong;
    }
    //tinh chu vi
    public double tinhChuVi(){
        return 2*(dai+rong);
    }
    public double tinhDienTich(){
        return dai*rong;
    }
    //phuong thuc xuat ket qua ra man hinh
    public void xuatDuLieu(){
        System.out.println("Chieu dai: "+dai+" Chieu rong: "+rong);
        System.out.println("Chu Vi= "+tinhChuVi());
        System.out.println("Dien Tich= "+tinhDienTich());
    }
}
