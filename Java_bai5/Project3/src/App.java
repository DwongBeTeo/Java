import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int n;
        Scanner sc =new Scanner(System.in);
        System.out.println("Nhap so luong Sinh vien: ");
        n=sc.nextInt();
        //tao danh sach sinh vien
        Sinhvien[] sv= new Sinhvien[n];
        //nhap thong tin cho n sinh vien
        for(int i=0;i<n;i++){
            System.out.println("Nhap thông tin cho sinh viên thu "+(i+1)+":");
            sv[i]=new Sinhvien();
            sv[i].nhapDuLieu();
        }
        //in danh sach sinh vien ra man hinh kèm xếp loại
        System.out.println("Danh sach sinh vien");
        for(int i=0;i<n;i++){
            sv[i].xuatDuLieu();
        }
        //Hiển thị ra màn hình danh sách sinh viên có xếp loại Khá có Họ tên bắt đầu bởi kí tự nhập vào từ bàn phím.
        // Nếu không có thì thông báo ra màn hình.
        String kiTu;
        boolean tontai=false;
        System.out.println("Nhap ki tu de kiem tra");
        kiTu = sc.next();
        for(int i =0;i<n;i++){
            if(sv[i].getXepLoai() == "Kha" && sv[i].getHoTen().charAt(0) == kiTu.charAt(0)){
                sv[i].xuatDuLieu();
                tontai=true;
            }
        }
        if(tontai==false){
            System.out.println("Khong co sinh vien nao ca");
        }
        //Sắp xếp danh sách theo chiều giảm dần của điểm thi.
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(sv[j].getDiemThi()>sv[i].getDiemThi()){
                    Sinhvien temp =sv[i];
                    sv[i]=sv[j];
                    sv[j]= temp;
                }
            }
        }
        System.out.println("Danh sach sinh vien sau khi sap xep giam dan la");
        for (Sinhvien sinhvien : sv) {
            sinhvien.xuatDuLieu();
        }
    }
}
