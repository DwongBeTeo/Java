import java.util.Scanner;

public class SinhVien {
    //khai bao thuoc tinh
    private String maSV;
    private  String hoTen;
    private double diemTB;
    //phuong thuc
    public void NhapDuLieu(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap Ma SInh Vien");
        maSV = sc.nextLine();
        System.out.println("Nhap Ho Ten SV");
        hoTen = sc.nextLine();
        System.out.println("nhap diem trung binh");
        diemTB = sc.nextDouble();
    }
    public void XuatDuLieu(){
        System.out.println("Ma SV: "+ maSV);
        System.out.println("Ho Va Ten: "+ hoTen);
        System.out.println("Diem Trung Binh: "+ diemTB);
        System.out.println("Xep Loai: "+ XepLoai());
    }
    public String XepLoai(){
        if(diemTB<5){
            return "yeu";
        }else if (diemTB >=5 && diemTB <7){
            return "trung binh";
        } else if ( diemTB >= 7 && diemTB<8){
            return "kha";
        } else if (diemTB >=8 && diemTB <9){
            return "gioi";
        }else {
            return "xuat sac";
        }
    }
}
