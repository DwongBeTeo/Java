import java.util.Scanner;

public class NhanVien {
    private String maNV;
    private String hoTen;
    private double heSoLuong;
     
    public void NhapDuLieu(){
        Scanner sc =new Scanner(System.in);
        System.out.println("Nhap ma nhan vien: ");
        maNV = sc.nextLine();
        System.out.println("Nhap ho va ten: ");
        hoTen = sc.nextLine();
        System.out.println("He so luong:");
        heSoLuong = sc.nextDouble();
    }
    public void XuatDuLieu(){
        System.out.println("Ma Nhan Vien la: "+ maNV);
        System.out.println("Ho va ten la: "+ hoTen);
        System.out.println("He So Luong: "+ heSoLuong);
        System.out.println("Luong thang nay cua ban la: "+ TinhLuong());
    }
    public double TinhLuong(){
        return heSoLuong * 1800000;
    }
}
