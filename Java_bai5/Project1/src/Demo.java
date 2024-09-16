public class Demo {
    private String maSV;
    private Double diemTB;

    //Constructor
    public Demo (String masv, Double diemTB){
        this.maSV=maSV;
        if(diemTB >=0 && diemTB <=10)
        this.diemTB=diemTB;
        else{
            System.out.println("DiemTB khong hop le ");
            this.diemTB=0.0;
        }
    }
    public String getMaSV(){
        return maSV;
    }
    public Double getDiemTB(){
        return diemTB;
    }
    public void setDiemTB(Double diemTB){
        if(diemTB>=0 && diemTB<=10)
        this.diemTB=diemTB;
    }
}
