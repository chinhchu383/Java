import java.util.Scanner;

/**
 * bt1
 */
public class bt1 {

    public static void main(String[] args) {
        float a, b;
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap a:");a = sc.nextFloat();
        System.out.print("nhap b:");b = sc.nextFloat();
        System.out.println("tong: "+ (a + b));
        System.out.println("hieu: "+ (a - b));
        System.out.println("tich: "+ a * b);
        System.out.println("thuong: "+ a / b);
        System.out.println("chia lay du: "+ a % b);
        System.out.println("-------------------");
        if(a > b)
            System.out.print("a lon hon b");
        else if(a == b)
            System.out.print("a bang b");
        else 
            System.out.print("a nho hon b");
        sc.close();
    }
}