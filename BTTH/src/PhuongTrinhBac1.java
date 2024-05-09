
import java.util.Scanner;
public class PhuongTrinhBac1 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        double a, b;
        System.out.print("nhap a:");a = sc.nextDouble();
        System.out.print("nhap b:");b = sc.nextDouble();
        if(a == 0){
            System.out.print("khong phai phuong trinh bac 1");
        }
        else{
            double x = -b/a;
            System.out.printf("x = %.2f",x);
        }

        sc.close();
    }
}

