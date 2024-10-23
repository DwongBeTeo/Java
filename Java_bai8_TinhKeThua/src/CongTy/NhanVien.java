package CongTy;

import java.util.Scanner;

public class NhanVien extends CanBo{
    private String congViec;
    public NhanVien(){

    }
    public NhanVien(String maNV,String hoTen,int tuoi, String gioiTinh,String diaChi,String congViec){
        super(maNV, hoTen, tuoi, gioiTinh, diaChi);
        this.congViec=congViec;
    }
    //getter va setter
    public String getCongViec(){
        return congViec;
    }
    public void setCongViec(){
        this.congViec=congViec;
    }
    //phuong thuc nhap xuat
    public void nhap(){
        super.nhap();
        Scanner sc =new Scanner(System.in);
        System.out.print("Cong Viec: ");
        congViec=sc.nextLine();
    }
    public void xuat(){
        super.xuat();
        System.out.print("Cong Viec: "+congViec);
    }
}
