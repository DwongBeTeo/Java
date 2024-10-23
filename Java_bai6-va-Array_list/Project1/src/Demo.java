import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) throws Exception {
        //tạo 1 array list không định kiểu
        ArrayList a = new ArrayList<>();
        a.add(1);
        a.add("Hello");
        a.add(8.6);
        //in cac phan tu trong array list
        for(Object x:a){
            System.out.println(x);
        }
        //Lay gia tri -> ép kiểu
        int soNguyen =(int)a.get(0);
        System.out.println("Phan tu dau tien: "+soNguyen);
        String xau = (String)a.get(1);
        System.out.println("Phan tu thu 2: "+xau);
        Double soThuc = (Double)a.get(2);
        System.out.println("Phan tu thu 3 la: "+soThuc);
    }
}
