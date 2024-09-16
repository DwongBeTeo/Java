import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so san pham");
        n= sc.nextInt();
        //khai báo lớp đối tượng
        SanPham[] sp =new SanPham[n];
        //nhap thong tin cho n san pham
        for(int i=0;i<n;i++){
            System.out.println("Nhap thong tin cho san pham thu"+(i+1)+":");
            sp[i]=new SanPham();
            sp[i].nhapDuLieu();
        }
        //in danh sach n san pham ra man hinh
        System.out.println("danh sach cac san pham da nhap:");
        for(int i=0;i<n;i++){
            sp[i].xuatDuLieu();
        }
        //tim cac sp co tien nam trong min max
        double min, max;
        System.out.println("Nhap khoang tien be nhat: ");
        min=sc.nextDouble();
        System.out.println("Nhap khoang tien lon nhat");
        max=sc.nextDouble();
        System.out.println("Danh sach co sp nam trong min max: ");
        for(int i=0;i<n;i++){
            if(sp[i].getThanhTien() >= min && sp[i].getThanhTien() <= max){
                // Thành tiền nằm trong khoảng min và max
                sp[i].xuatDuLieu();
            }
        }
    }
}
