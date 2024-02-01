import java.util.Scanner;

public class bt5 {

    public static void main(String[] args) {
        int n, T = 0;
        String str = "";
        
        Scanner sc= new Scanner(System.in);

        while (T <= 100) {
            System.out.print("nhap so nguyen: "); n = sc.nextInt();
            T += n;
            str = str + n + " + ";
        }
        
        System.out.printf(str.substring(0,str.length()-2) + " = "+T);
        sc.close();
    }
}