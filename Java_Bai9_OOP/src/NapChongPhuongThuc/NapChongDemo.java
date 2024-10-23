package NapChongPhuongThuc;

public class NapChongDemo {
    public static void main(String[] args) {
        PhepTinhJava pT = new PhepTinhJava();
        System.out.println("Tong cua 2 so nguyen la: "+pT.tong(10, 15));
        System.out.println("Tong cua 3 so nguyen la: "+pT.tong(15, 20, 25));
        System.out.println("Tong cua 2 so thuc la: "+ pT.tong(4.5, 5.6));
    }
}
