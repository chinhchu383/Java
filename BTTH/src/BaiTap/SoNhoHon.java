package BaiTap;
import java.util.Scanner;

public class SoNhoHon {
    public static void main(String[] args) {
        float a, b;
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap vao so thu 1: "); a = sc.nextFloat();
        System.out.print("nhap vao so thu 2: "); b = sc.nextFloat();
        System.out.printf("so nho hon trong 2 so la: %.2f",a<b?a:b );
        sc.close();
    }
}
