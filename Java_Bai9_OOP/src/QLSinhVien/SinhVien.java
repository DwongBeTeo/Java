package QLSinhVien;

abstract public class SinhVien {
    protected String hoTen;
    protected String nganh;
    //constructor
    public SinhVien(String hoTen, String nganh){
        this.hoTen=hoTen;
        this.nganh=nganh;
    }
    //phuong thuc truu tuong de lay diem
    public abstract double getDiem();
    //phuong thuc xep loai hoc luc
    public String getHocLuc(){
        double diem=getDiem();
        if(diem<5){
            return "yeu";
        }else if(diem<6.5){
            return "trung binh";
        } else if(diem<7.5){
            return "kha";
        } else if(diem<9){
            return "gioi";
        } else
        return "xuat xac";
    }
    public void xuat(){
        System.out.println("HoTen: "+hoTen +" Nganh: "+nganh+" Diem: "+getDiem()+" hoc luc: "+getHocLuc());
        
    }
}
