import java.util.Scanner;



public class MangVaLenhLap {
    public static String calculateGrade (double i){
        if(i <5){
            return "yeu";
        }
        if(i>=5 && i<6.5){
            return "trung binh";
        }
        if(i>=6.5 && i<7.5){
            return "kha";
        }
        if(i>=7.5 && i<9){
            return "gioi";
        }
        return "xuat sac";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao so luong sinh vien");
        int n = sc.nextInt();
        String[] name = new String[n];
        Double[] score = new Double[n];
        String[] grade = new String[n];

        for (int i=0;i<n;i++){
            System.out.println("nhap vao ten sinh vien thu" + (i+1));
            name[i] = sc.next();
            System.out.println("nhap diem cua sinh vien ten " + name[i]);
            score[i] = sc.nextDouble();
            grade[i] = calculateGrade(score[i]);
        }
        System.out.println("sanh sach sinh vien");
        for (int i=0;i<n;i++){
            System.out.println((i+1)+ "|"+ name[i] +"|" + score[i] + "|" + grade[i]);
        }
        for (int i=0;i<n;i++){
            for( int j= i+1; j<n;j++){
                if(score[i]>score[j]){
                    //sap xep diem 
                    double score1 = score[i];
                    double score2 = score[j];
                    score[i] = score2;
                    score[j] = score1;
                    //sap xep ten
                    String name1 = name[i];
                    String name2 = name[j];
                    name[i] = name2;
                    name[j] = name1;
                    //xap sep hoc luc
                    String grade1 = grade[i];
                    String grade2 = grade[j];
                    grade[i] = grade2;
                    grade[j] = grade1;
                }
            }
        }
        System.out.println("danh sach sau khi da xap sep theo diem la");
        for (int i=0;i<n;i++){
            System.out.println((i+1)+ "|"+ name[i] +"|" + score[i] + "|" + grade[i]);
        }
    }
}
