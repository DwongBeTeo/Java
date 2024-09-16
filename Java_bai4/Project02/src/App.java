import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so nhan vien: ");
        n =sc.nextInt();
        NhanVien[] dsNV = new NhanVien[n];
        for (int i=0;i<n;i++){
            System.out.printf("Nhap thong tin cua nhan vien thu: %d \n",i+1);
            dsNV[i] = new NhanVien();
            dsNV[i].NhapDuLieu();
        }
        for (int i=0;i<n;i++){
            System.out.printf("Thong tin cua nhan vien thu: %d \n",i+1);
            dsNV[i].XuatDuLieu();
        }
        sc.close();
    }
}
