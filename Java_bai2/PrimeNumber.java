//tìm số nguyên tố

import java.util.Scanner;

public class PrimeNumber {
    public static boolean isPrime (int x){
        if (x<2){
            return false;
        }
        for (int i =2; i<= Math.sqrt(x);i++) {
            if( x%i ==0){
            return false;
            }
        }
        return true;
    }

    
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
        System.out.println("mang vua nhap: \n");
        for (int x:a)
        System.out.print(x+" ");
        //tìm và in ra màn hình các số nguyên tố trong dãy
        System.out.println("\n cac so nguyen to trong day: ");
        for(i=0;i<n;i++)
            if( isPrime(a[i]))
            System.out.print(a[i]+" ");
            sc.close();

    }
    
}
