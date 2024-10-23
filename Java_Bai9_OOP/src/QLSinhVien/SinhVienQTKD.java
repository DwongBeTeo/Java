package QLSinhVien;

public class SinhVienQTKD extends SinhVien {
    private double diemMKT;
    private double diemSale;
    public SinhVienQTKD(double diemMKT,double diemSale, String hoTen,String nganh){
        super(hoTen, nganh);
        this.diemMKT=diemMKT;
        this.diemSale=diemSale;
    }
    //ghi de phuong thuc getDiem de tinh diem
    @Override
    public double getDiem(){
        return (diemMKT*2+diemSale)/3;
    }
}

