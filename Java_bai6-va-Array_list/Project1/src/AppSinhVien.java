import java.util.ArrayList;
import java.util.Scanner;

public class AppSinhVien {

    public static void main(String[] args) {
        ArrayList<SinhVien> dsSV = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int chon = sc.nextInt();
        String hTen = sc.nextLine();
        boolean timThay = false;
        switch (chon) {
            case 1:
                // 1 nhap danh sach sinh vien
                System.out.print("Nhap danh sach sinh vien: ");
                int n = sc.nextInt();
                for (int i = 0; i < n; i++) {
                    System.out.println("Nhap thong tin cua sinh vien thu" + (i + 1) + ":");
                    SinhVien sv = new SinhVien();
                    sv.nhapDuLieu();
                    dsSV.add(sv);

                }
                break;
            case 2:
                // 2 xuat ds sinh vien da nhap
                System.out.println("danh sach sinh vien da nhap");
                for (SinhVien x : dsSV) {
                    x.xuatDuLieu();
                }
                break;
            case 3:
                // 3 xuat danh sach sinh vien theo khoang diem

                System.out.print("Nhap diem min: ");
                double min = sc.nextDouble();
                System.out.print("Nhap diem max: ");
                double max = sc.nextDouble();
                sc.nextLine();// bỏ cái dòng trống sau khi nhập dữ liệu kiểu số
                System.out.println("Danh sach cac sinh vien co diem nam trong khoang: " + min + " va " + max);
                for (SinhVien x : dsSV) {
                    if (x.getDiemTB() >= min && x.getDiemTB() <= max) {
                        x.xuatDuLieu();
                    }
                }
                break;
            case 4:
                // 4 tim sinh vien theo ho ten
                System.out.println("Nhap ho ten sinh vien can tim: ");
                
                for (SinhVien x : dsSV) {
                    if (x.getHoTen().equals(hTen.toLowerCase())) {
                        x.xuatDuLieu();
                        timThay = true;
                    }
                }
                if (!timThay) {
                    System.out.println("Khong tim thay sinh vien trong danh sach!");
                }
                break;
            case 5:

                // 5 tim va sua diem cua sinh vien theo ho ten\
                if (timThay) {
                    System.out.print("Nhap diem can sua:");
                    double diemSua = sc.nextDouble();
                    sc.nextLine();
                    for (SinhVien x : dsSV) {
                        if (x.getHoTen().charAt(0) == hTen.charAt(0)) {
                            x.setDiemTB(diemSua);
                            System.out.print("Thong tin sinh vien sau khi sua: ");
                            x.xuatDuLieu();
                        }
                    }
                }
                break;
            case 6:
                // 6 Tim va xoa theo ho ten

                System.out.println("Nhap ho ten can xoa: ");
                String tenXoa = sc.nextLine();
                boolean isExist = false;
                for (int i = 0; i < dsSV.size(); i++) {
                    if (dsSV.get(i).getHoTen().equals(tenXoa)) {
                        isExist = !isExist;
                        dsSV.remove(i);
                    }
                }
                if (isExist) {
                    for (SinhVien sinhVien : dsSV) {
                        sinhVien.xuatDuLieu();
                    }
                } else {
                    System.out.println("deo co");
                }
                break;
            default:
                break;
        }

    }
}
