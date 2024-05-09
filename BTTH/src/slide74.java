
import java.util.Scanner;

public class slide74 {
    public static void main(String[] args) {
        int n, tong= 0;
        Scanner sc= new Scanner(System.in);
        System.out.print("nhap so phan tu cua mang");
        n = sc.nextInt();
        int a[]= new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("nhap phan tu thu "+(i-1)+": ");
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (a[i]%2==0) {
                tong += a[i];
            }
        }
        System.out.printf("tong cua cac so chan: %d", tong);
        sc.close();
    }
}
