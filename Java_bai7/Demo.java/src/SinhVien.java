import java.util.Scanner;

public class SinhVien {
    private String hoTen;
    private String sdt;
    private String cccd;
    private String email;
    // bieu thuc chinh quy cho cac thuoc tinh tren
    private String sdtRegex = "0\\d{9}";
    private String cccdRegex = "\\d{12}";
    private String emailRegex = "\\w+@\\w+(\\.\\w+){1,2}";

    // phuong thuc nhap du lieu
    public void nhapDuLieu() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ho va ten: ");
        hoTen = sc.nextLine();
        while (true) {
            System.out.print("Nhap so dien thoai: ");
            sdt = sc.nextLine();
            if (sdt.matches(sdtRegex)) {
                break;
            } else {
                System.out.print("So dien thoai k hop le hay nhap lai!");
            }
        }
    }
    //xuat du lieu
    public void xuatDuLieu(){
        System.out.println("Ho va ten: "+hoTen);
        System.out.println("So dien thoai: "+sdt);
    }
}
