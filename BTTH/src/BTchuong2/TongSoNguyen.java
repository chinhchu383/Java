package BTchuong2;

import java.util.Scanner;

/**
 * TongSoNguyen
 */
public class TongSoNguyen {

    public static void main(String[] args) {
        int n, T = 0;
        Scanner sc= new Scanner(System.in);
        while (T < 100) {
            System.out.print("nhap so nguyen: "); n = sc.nextInt();
            T += n;
        }
        System.out.printf("tong cua cac so vua nhap: "+T);
        sc.close();
    }
}