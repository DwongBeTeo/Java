import java.util.Scanner;

public class Demo2908 {
    public static void main(String[] args) {
        int a[] ,n,i;
        Scanner sc =new Scanner(System.in);
        System.out.println("nhap so phan tu cua mang");
        n = sc.nextInt();
        a =new int[n];
        System.out.println("nhap gia tri cac phan tu:" );
        for( i=0;i<n;i++){
            System.out.printf("nhap a[%d]= ",i);
            a[i]=sc.nextInt();
        }
        System.out.println("mang vua nhap: ");
        for(int x:a)
            System.out.print(x+" ");
            //kiem tra xem k xuat hien bao nhieu lan o trong mang
            int k, count =0;
            System.out.println("nhap gia tri k:");
            k = sc.nextInt();
            for(i=0;i<n;i++){
                if(a[i]==k)
                    count++;}
                if(count==0)
                    System.out.println("k khong thuoc day tren");
                    else
                    System.out.printf("k xuat hien %d lan trong day ", count);
            
            sc.close();
    }
}
