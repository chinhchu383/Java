
import java.util.Scanner;

public class PhuongTrinhBac2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b, c, x1, x2, delta;
        System.out.print("nhap a:");a = sc.nextDouble();
        System.out.print("nhap b:");b = sc.nextDouble();
        System.out.print("nhap c:");c = sc.nextDouble();
        delta = b*b - 4*a*c;
        if(delta < 0)
        {
            System.out.print("phuong trinh vo nghiem");

        }else if(delta == 0)
        {
            x1 = -b / (2*a);
            System.out.printf("phuong trinh co nghiem kep x = %.2f", x1);
        }
        else
        {
            x1 = ((-b) + Math.sqrt(delta)) / (2*a);
            x2 = ((-b) - Math.sqrt(delta)) / (2*a);
            System.out.print("phuong trinh co 2 nghiem");
            System.out.printf("x1 = "+x1 + ", x2 ="+x2);
    }
    sc.close();
    }
}
