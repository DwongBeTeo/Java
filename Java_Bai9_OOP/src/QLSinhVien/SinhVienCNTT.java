package QLSinhVien;

public class SinhVienCNTT extends SinhVien {
    private double diemJava;
    private double diemCSS;
    private double diemHTML;
    //constructor
    public SinhVienCNTT(String hoTen, String nganh, double diemJava,double diemCSS,double diemHTML){
        super(hoTen, nganh);
        this.diemJava=diemJava;
        this.diemCSS=diemCSS;
        this.diemHTML=diemHTML;
    }
    //ghe de phuong thuc getDiem de tinh diem
    @Override
    public double getDiem(){
        return (diemJava*2+diemCSS+diemHTML)/4;
    }
}
