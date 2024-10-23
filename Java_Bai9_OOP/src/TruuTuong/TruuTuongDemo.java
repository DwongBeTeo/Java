package TruuTuong;

public class TruuTuongDemo {
    public static void main(String[] args) {
        HinhHoc hcn =new HinhChuNhat(6, 10);
        System.out.println("dien tich hinh chu nhat la: "+hcn.tinhDienTich());
        System.out.println("Chu vi hinh chu nhat la: "+hcn.tinhChuVi());
        HinhHoc hv =new HinhVuong(6);
        System.out.println("chu vi hinh vuong la: "+hv.tinhChuVi());
        System.out.println("dien tich hinh vuong la: "+hv.tinhDienTich());
    }
}
