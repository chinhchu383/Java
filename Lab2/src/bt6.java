import java.util.Scanner;

public class bt6 {
    public static void main(String[] args) {
        int n,i=1;
        int t = 1;
        Scanner sc = new Scanner(System.in);
        do{
        System.out.print("nhap 1 so nguyen duong: ");
        n = sc.nextInt();
        }while(n<0);
        do{
            t *= i;
            i++;
        }while(i<=n);
        System.out.printf("%d", t);
        sc.close();
    }
}
