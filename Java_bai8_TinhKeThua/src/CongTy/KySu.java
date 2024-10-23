package CongTy;

import java.util.Scanner;

public class KySu extends CanBo {
    private String nganhDaoTao;
    //Contructor 
    public KySu(){

    }
    public KySu(String maNV,String hoTen,int tuoi, String gioiTinh,String diaChi,String nganhDaoTao){
        super(maNV, hoTen, tuoi, gioiTinh, diaChi);
        this.nganhDaoTao=nganhDaoTao;
    }
    //getter va setter
    public String getNganhDaoTao(){
        return nganhDaoTao;
    }
    public void setNganhDaoTao(){
        this.nganhDaoTao=nganhDaoTao;
    }
    //Phuong thuc nhap xuat
    public void nhap(){
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.println("nganh dao tao: ");
        nganhDaoTao=sc.nextLine();
    }
    public void xuat(){
        super.xuat();
        System.out.print("nganh dao tao: "+nganhDaoTao);
    }
}
