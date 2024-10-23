package QLSinhVien;
import java.util.Scanner;
import java.util.ArrayList;

public class SinhVienDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<SinhVien> dsSV = new ArrayList<>();
        
        System.out.println("Nhap danh sach sinh vien: ");  
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.println("Nhap thong tin cua sinh vien thu "+(i+1)+":");
            System.out.print("Nhap ho ten: ");
            System.out.println("Nguoi nay la sinh vien khoa CNTT(1)hay QTKD(2)?");
            int luaChon = sc.nextInt();
            if(luaChon ==1){
                
            }
        }
    }
}
