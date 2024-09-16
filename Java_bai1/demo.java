package Java_bai1;

import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        // cau1
        // int a, b, c;
        // a=10;
        // b=20;
        // c=a+b;
        // System.out.println("tong cua hai so la: "+c);


        //cau2
        // String s;
        // Scanner sc=new Scanner(System.in);
        // System.out.println("nhap ho va ten");
        // s=sc.nextLine();
        // System.out.println("xin chao:"+s);
        // sc.close();
        

        //cau3
        // Scanner sc=new Scanner(System.in);
        // try {
        //     System.out.println("nhap vao 1 so nguyen");
        //     int n=sc.nextInt();

        // } catch (Exception e) {
               // TODO: handle exception
        //     System.out.println("hay nhap lai so nguyen");
        // }
        // sc.close();

        //cau4
        // int a,b;
        // Scanner sc=new Scanner(System.in);
        // System.out.println("nhap vao 2 so nguyen");
        // a=sc.nextInt();
        // b=sc.nextInt();
        // System.out.printf("gia tri lon nhat: %d", a>b?a:b);
        // sc.close();
        
        //cau5: giai phuong trinh bac 2
        Double a, b, c, x1, x2, delta;
        Scanner sc=new Scanner(System.in);
        System.out.println("nhap vao a =");
        a=sc.nextDouble();
        System.out.println("nhap vao b =");
        b=sc.nextDouble();
        System.out.println("nhap vao c =");
        c=sc.nextDouble();

        delta = Math.pow(b,2) -4*a*c;

        if (delta<0){
            //tinh huong delta <0 
            System.out.println("phuong trinh vo nghiem");
            
        }else if (delta==0){
            //tinh huong delta =0
            x1= -b/(2*a);
            x2= b/(2*a);
            System.out.println("Phuongtrinh co nghiem kep: "+ x1 +x2);
        }else{
            //tinh huong delta lon hon 0
            x1 = (-b - Math.sqrt(delta))/(2*a);
            x2 = (-b + Math.sqrt(delta))/(2*a);
            System.out.println("phuong trinh co nghiem");
            System.out.println("x1="+x1);
            System.out.println("x2="+ x2);
        }
    }
}
