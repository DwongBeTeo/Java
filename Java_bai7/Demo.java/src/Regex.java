import java.util.Scanner;

public class Regex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so dien thoai bat ky(10so): ");
        String sdt = sc.nextLine();
        // bieu thuc chinh quy cho sdt
        String sdtRegex = "0\\d{9}";
        // kiem tra xem co khop nhau k
        if (sdt.matches(sdtRegex)) {
            System.out.println("SDT hop le");
        } else {
            System.out.println("Sdt khong hop le");
        }
        sc.close();
    }
}
