import java.util.Scanner;

public class Demo {
    public static void main(String[] args) throws Exception {
        Scanner sc =new Scanner(System.in);
        //1.Nhập xâu họ tên
        System.out.println("Nhap ho va ten: ");
        String hoTen =sc.nextLine();
        // 2. In xâu đã nhập 
        System.out.println("Xau vua nhap: "+hoTen);
        // 3.Hiển thị độ dài của xâu
        System.out.println("Do dai cua ky tu la: "+hoTen.length());
        // 4.In ra màn hình họ tên viết hoa
        String ten;
        ten=hoTen.substring(hoTen.lastIndexOf(" ") +1);
        System.out.println("Phan ten duoc viet hoa: "+ten.toUpperCase());
        // 5.Tìm 1 từ trong xâu và thay thế bằng "HaNoi"
        System.out.println("Nhap tu can tim: ");
        String tuCanTim = sc.nextLine();
        if (hoTen.contains(tuCanTim)) {
            String hoTenMoi = hoTen.replace(tuCanTim, "HaNoi");
            System.out.println("Sau khi doi ten: "+hoTenMoi);
        }else{
            System.out.println("khong tim thay ky tu do!");
        }
        sc.close();
    }
}
