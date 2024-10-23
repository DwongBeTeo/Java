import java.util.ArrayList;
import java.util.Scanner;

public class TinhTong {
    public static void main(String[] args) {
        ArrayList <Double> a= new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        double tong =0;
        String ques ="Y";
        while (ques.equals("Y")||ques.equals("y")) {
            System.out.print("Nhap 1 so bat ky:");
            double x =sc.nextDouble();
            sc.nextLine();
            a.add(x);
            tong +=x;
            System.out.print("Ban co muon nhap tiep khong? (Y/N):");
            ques=sc.nextLine();
            if(ques.equals("N")||ques.equals("n")){
                break;
            }
        }
        System.out.print("Danh sach cac phan tu da nhap: ");
        for(Double x:a){
            System.out.print(x +" ");
        }
        System.out.println("\nTong day tren: "+tong);
    }
}
