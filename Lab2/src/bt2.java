import java.util.Scanner;

public class bt2 {
    public static void main(String[] args) {
        float a;
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap a: "); a = sc.nextFloat();
        if (a%2 == 0) {
            System.out.print(a +" la so chan");
        }else{
            System.out.print(a +" la so le");

        }
        sc.close();
    }
}
