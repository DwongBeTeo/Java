import java.util.Scanner;

public class AppSinhVien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so sinh vien: ");
        int n = sc.nextInt();
        SinhVien[] dsSV = new SinhVien[n];
        //Nhap thong tin cua n sinh vien
        for(int i=0;i<n;i++){
            System.out.println("Nhap thong tin cua sinh vien thu "+(i+1));
            dsSV[i] = new SinhVien();
            dsSV[i].nhapDuLieu();
        }
        //xuat danh sach sv ra man hinh
        System.out.println("danh sach sinh vien da nhap la: ");
        for(int i=0;i<n;i++){
            dsSV[i].xuatDuLieu();
        }
        sc.close();
    }
}
