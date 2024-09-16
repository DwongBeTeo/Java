import java.util.Scanner;

public class Demo2208 {
    public static void main(String[] args) {
          int n,i;
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap vao so can kiem tra:");
        n=sc.nextInt();
        while (n<2) {
            System.out.println("Hay nhap lai n>=2") ;
            n=sc.nextInt();
        }
        if (n==2)
        System.out.println("Day la SNT");
        else{
            for (i=2; i<=Math.sqrt(n);i++)
            if (n%i==0)
            {
                System.out.println("day khong la snt");
                sc.close();
                System.exit(0);
            }
            System.out.println("day la snt");
        }
        sc.close();
    }
}
