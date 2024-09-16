import java.util.Scanner;
public class Diem {
    //khai bao bien
    private Double hoanhDo;
    private Double tungDo;
    //ham tao khong co tham so
    public Diem(){
        this.hoanhDo=0.0;
        this.tungDo=0.0;
    }
    //ham tao co tham so
    public Diem(Double hoanhDo, Double tungDo){
        this.tungDo=tungDo;
        this.hoanhDo=hoanhDo;
    }
    //phuong thuc nhap toa do cua diem tu ban phim
    public void nhaptoado(){
        Scanner sc =new Scanner(System.in);
        System.out.println("Nhap hoanh do: ");
        hoanhDo=sc.nextDouble();
        System.out.println("Nhap tung do: ");
        tungDo=sc.nextDouble();
    }
    //phuong thuc tinh khoang cach tu 1 diem den goc toa do
    public Double KhoangCachDiemGocToaDo(){
        return Math.sqrt(hoanhDo*hoanhDo + tungDo*tungDo);
    }
    //phuong thuc tinh khoang cach giua 2 diem bat ky
    public Double KhoangCachHaiDiem(Diem d1, Diem d2){
        Double hieuX = d1.hoanhDo-d2.hoanhDo;
        Double hieuY = d1.tungDo-d2.tungDo;
        return Math.sqrt(hieuX*hieuX + hieuY*hieuY);
    }
    //phuong thuc xuat du lieu
    public void XuatDuLieu(){
        System.out.println("Hoanh Do: "+ hoanhDo +"Tung Do: "+ tungDo);
        System.out.println("Khoang Cach Den Goc Toa Do: "+ KhoangCachDiemGocToaDo());
    }
    public Double GetHoanhDo(){
        return hoanhDo;
    }
    public Double GetTungDo(){
        return tungDo;
    }
}
