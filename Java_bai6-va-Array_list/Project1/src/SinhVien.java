import java.util.Scanner;

class SinhVien  { 
    private String hoTen;
    private double diemTB;

    public SinhVien(){}

    public SinhVien(String hoTen, double diemTB) {
        this.hoTen = hoTen;
        this.diemTB = diemTB;
    }
//getter va setter
    public String getHoTen() {
        return hoTen;
    }
    public Double getDiemTB(){
        return diemTB;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }
    public void setDiemTB(double diemTB){
        this.diemTB=diemTB;
    }
    //phuong thuc nhap va xuat ds sinh vien
    public void nhapDuLieu(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ho ten SV: ");
        hoTen=sc.nextLine();
        System.out.println("Nhap diem TB cua sinh vien: ");
        diemTB=sc.nextDouble();
    }
    public void xuatDuLieu(){
        System.out.println("Ho ten SV: "+ hoTen+" diemTB: "+diemTB);
    }
}