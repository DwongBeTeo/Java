public class App {
    public static void main(String[] args) throws Exception {
        Demo d=new Demo(  " SV01",9.5);
        System.out.println("MaSV: "+d.getMaSV());  
        System.out.println("DiemTB: "+d.getDiemTB());
        d.setDiemTB(7.0);
        System.out.println("DiemTB: "+ d.getDiemTB());
    }
}
