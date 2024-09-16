import java.util.Scanner;

public class SanPham {
    //khai bao bien
    private String maSP;
    private String tenSP;
    private String hangSX;
    private int soLuong;
    private double donGia;
    //ham tao khong co tham so
    public SanPham(){

    }
    //ham tao co tham so truyen vao
    public SanPham(String maSP,String tenSP,String hangSX,int soLuong,double donGia){
        this.maSP=maSP;
        this.tenSP=tenSP;
        this.hangSX=hangSX;
        this.soLuong=soLuong;
        this.donGia=donGia;
    }
    public void nhapDuLieu(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhap ma san pham:");
        maSP= sc.nextLine();
        System.out.println("Nhap ten san pham:");
        tenSP=sc.nextLine();
        System.out.println("Nhap hang san xuat:");                                             
        hangSX=sc.nextLine();
        System.out.println("Nhap so luong:");
        soLuong=sc.nextInt();
        System.out.println("Nhap don gia:");
        donGia=sc.nextDouble();
    }
    public void xuatDuLieu(){
        System.out.println("MaSP:"+maSP+" TenSP:"+tenSP+" HangSX:"+hangSX+" SoLuong:"+soLuong+" DonGia:"+donGia+" ThanhTien:"+tinhThanhTien());
    }
    //phuong thuc tinh thanh tien
    public double tinhThanhTien(){
        return soLuong*donGia;
    }
    // Getter để lấy thành tiền (dùng cho sắp xếp và tìm kiếm)
    public Double getThanhTien(){
        return tinhThanhTien();
    }
}
