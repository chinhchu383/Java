package BTchuong2;


import java.util.Scanner;

public class TongCacChuSo {
    public static void main(String[] args) {
        int n, T = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap so: "); n = sc.nextInt();
        while (n > 0) {
            int c = n % 10;
            T = T + c;
            n = n/10;
        }
        System.out.printf("tong cua cac chu so n la: %d", T);
        sc.close();
    }
}
