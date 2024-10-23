package CongTy;

import java.util.Scanner;

public class CanBo {
    private String maNV;
    private String hoTen;
    private int tuoi;
    private String gioiTinh;
    private String diaChi;

    // contructor
    public CanBo() {

    }

    public CanBo(String maNV, String hoTen, int tuoi, String gioiTinh, String diaChi) {
        this.maNV = maNV;
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
    }

    // getter va setter
    public String getmaNV() {
        return maNV;
    }

    public void setmaNV() {
        this.maNV = maNV;
    }

    // tuong tu vs cac thuoc tinh khac
    // get set hoTen
    public String gethoTen() {
        return hoTen;
    }

    public void sethoTen() {
        this.hoTen = hoTen;
    }

    // get set Tuoi
    public int gettuoi() {
        return tuoi;
    }

    public void settuoi() {
        this.tuoi = tuoi;
    }

    // get set gioiTinh
    public String getgioiTinh() {
        return gioiTinh;
    }

    public void setgioiTinh() {
        this.gioiTinh = gioiTinh;
    }

    // get set diaChi
    public String getdiaChi() {
        return diaChi;
    }

    public void setdiaChi() {
        this.diaChi = diaChi;
    }

    // phuong thuc nhap du lieu
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap maNv: ");
        maNV = sc.nextLine();
        System.out.println("Nhap Ho va ten: ");
        hoTen = sc.nextLine();
        System.out.print("Nhap tuoi: ");
        tuoi = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhap gioi tinh: ");
        gioiTinh = sc.nextLine();
        System.out.println("Nhap dia chi: ");
        diaChi = sc.nextLine();
    }

    public void xuat() {
        System.out.printf("\nMaNV    | HoTen    | Tuoi | GioiTinh | DiaChi \n");
        System.out.printf("--------|----------|------|----------|--------\n");

        // In dữ liệu
        System.out.printf("%-8s | %-8s | %-4s | %-8s | %-6s \n", maNV, hoTen, tuoi, gioiTinh, diaChi);
    }

}
