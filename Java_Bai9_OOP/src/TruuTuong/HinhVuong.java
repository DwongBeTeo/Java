package TruuTuong;

public class HinhVuong extends HinhChuNhat{
    //contructor cho HinhVuong
    public HinhVuong(double canh){
        super(canh, canh);
    }
    //ghi de phuong thuc
    @Override
    public double tinhChuVi(){
        return dai*4;
    }
    public double tinhDienTich(){
        return dai*rong;
    }
}
