import java.util.Scanner;
public class AppDiem {
    public static void main(String[] args) throws Exception {
        int n ;
        Scanner sc= new Scanner(System.in);
        //Nhap so luong diem toa do
        System.out.println("Nhap vao n diem: ");
        n=sc.nextInt();
        //Khai bao mang de luu tru danh sach cac diem
        Diem[] ds = new Diem[n];
        Double tongKhoangCach=0.0;
        Double khoanCachMin= Double.MAX_VALUE;
        Diem diemMin=null;
        //Nhap toa do cho cac diem toa do
        for(int i=0;i<n;i++){
            System.out.println("Nhap thong tin cho diem thu "+ (i+1)+":");
            ds[i]= new Diem();
            ds[i].nhaptoado();
            // Tính tổng khoảng cách các điểm đến gốc tọa độ
            Double khoangCach = ds[i].KhoangCachDiemGocToaDo();
            tongKhoangCach+= khoangCach;
            if(khoangCach<khoanCachMin){
                khoanCachMin=khoangCach;
                diemMin=ds[i];
            }
        }
        //in ra tong khoang cach tu cac diem den goc toa do
        System.out.printf("Tong khoang cach tu cac diem den goc toa do: %.2f \n",tongKhoangCach);
        //in ra thong tin cua diem gan goc toa do nhat
        System.out.println("Toa do diem gan goc toa do nhat la: ");
        diemMin.XuatDuLieu();
    }
}
