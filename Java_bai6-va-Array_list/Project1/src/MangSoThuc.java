import java.util.ArrayList;
import java.util.Scanner;

public class MangSoThuc {
    public static void main(String[] args) {
        ArrayList <Double> a =new ArrayList<>();
        //nhap du lieu
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao day so thuc: (nhap 0 de ket thuc)");
        while (true) {
            double x = sc.nextDouble();
            if(x==0){
                break;
            }
            a.add(x);
        }
        //in ra man hinh day so vua nhap
        System.out.println("Day so vua nhap: " +a);
        System.out.println("Day so co so phan tu la: "+a.size());
        //chèn 1 số bất kỳ vào 1 vị trí nào đó
        System.out.println("Nhap so can chen: ");
        double soChen = sc.nextDouble();
        System.out.print("Nhap vao vi tri can chen: ");
        int viTriChen = sc.nextInt();
        a.add(viTriChen, soChen);
        System.out.print("Day so sau khi chen: "+ a);
        //xoa 1 số ở vị trí nào đó 
        System.out.println("\nNhap vi tri so can xoa: ");
        int viTriCanXoa =sc.nextInt();
        if(viTriCanXoa>a.size()||viTriCanXoa<0){
            System.out.print("Day so khong co vi tri day, xin hay nhap lai (vi tri can nho hon"+a.size()+"):");
            viTriCanXoa =sc.nextInt();
        }
        a.remove(viTriCanXoa);
        System.out.println("Day so sau khi xoa: "+a );
    }
}

