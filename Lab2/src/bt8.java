import java.util.Scanner;

/**
 * bt8
 */
public class bt8 {

    public static void main(String[] args) {
        float n, tong = 0,t;
        System.out.print("nhap so luong so can nhap: ");
        Scanner sc = new Scanner(System.in); n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.printf("nhap so thu %d:", i+1);
            t = sc.nextInt();
            tong += t;
        }
        float tbc = tong/n;
        System.out.printf("%.2f", tbc);
        sc.close();
    }
}