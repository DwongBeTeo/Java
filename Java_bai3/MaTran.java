import java.util.Scanner;

public class MaTran {
    public static void main(String[] args) {
        int[][] a;
        int m, n, i, j;
        Scanner sc = new Scanner(System.in);
        System.out.println(" nhap  kich thuoc m*n cua ma tran: ");
        m = sc.nextInt();
        n = sc.nextInt();
        a = new int[m][n];
        System.out.println(" nhap gia tri phan tu cua ma tran");
        for (i = 0; i < m; i++)
            for (j = 0; j < n; j++) {
                System.out.printf(" a[%d][%d]:= ", i, j);
                a[i][j] = sc.nextInt();
            }
        // xuata ma tran vua nhap ra man hinh
        System.out.println("Ma tran vua nhap");
        for (int[] row : a) {
            for (int x : row) {
                System.out.printf(x + " ");
            }
            System.out.println();
        }
        // tinh tong tung dong cua ma tran
        // for(i=0;i<m;i++){
        // int total= 0;
        // for(int x:a[i])
        // total+=x;
        // System.out.printf("Tong cua dong %d la: %d \n ",i,total);
        // }
        // ma tran dao nguoc
        for (i = 0; i < m; i++) {
            int left = 0;
            int right = n - 1;
            while (left < right) {
                // tg: trung gian
                int tg = a[i][left];
                a[i][left] = a[i][right];
                a[i][right] = tg;
                left++;
                right--;
            }
        }
        // xuat ma tran vua dao nguoc ra man hinh
        System.out.println("Ma tran dao nguoc");
        for (int[] row : a) {
            for (int x : row) {
                System.out.printf(x + " ");
            }
            System.out.println();
        }
    }
}
