package CongTy;

import java.util.Scanner;

public class AppCongTy {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so can bo cua Cty: ");
        n =sc.nextInt();
        CanBo[] dsCanBo = new CanBo[n];
        //nhap thong tin cho tung can bo
        for(int i=0;i<n;i++){
            System.out.println("Nhap thong tin cho can bo thu "+(i+1)+":");
            System.out.println("nguoi nay la Ky Su(1) hay NhanVien(2)?");
            int luaChon = sc.nextInt();
            if(luaChon==1){
                CanBo ks =new KySu();
                ks.nhap();
                dsCanBo[i]=ks;
            }else{
                CanBo nv = new NhanVien();
                nv.nhap();
                dsCanBo[i]=nv;
            }
        }
        //xuat thong tin
        System.out.println("-------------------------");
        for(int i =0;i<n;i++){
            dsCanBo[i].xuat();
        }
        sc.close();
    }
}
