import java.util.Scanner;
public class PhuongTrinhBac1 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        float a, b;
        System.out.print("nhap a:");a = sc.nextFloat();
        System.out.print("nhap b:");b = sc.nextFloat();
        if(a == 0){
            System.out.print("khong phai phuong trin bac 1");
        }
        else{
            float x = -b/a;
            System.out.printf("x = %.2f",x);
        }
}
}

