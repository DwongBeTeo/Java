import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Mang {
    public static void main(String[] args) {
        int a[];
        int n,i;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so phan tu cua mang");
        n=sc.nextInt();
        a = new int[n];
        System.out.println("nhap gia tri cac phan tu cua mang");
        for (i=0;i<n;i++){
            System.out.printf("a{%d}= ",i);
            a[i]=sc.nextInt();
        }
        System.out.println("mang vua nhap");
        for (int x:a)
        System.out.print(x+" ");
        sc.close();
        //sắp xếp mảng theo chiều tăng dần
        Arrays.sort(a);
        //in mảng đã sắp xếp ra màn hình
        System.out.println("\n mang da sap xep: ");
        for (int x:a)
        System.out.print(x+" ");
        sc.close();
    }
}
