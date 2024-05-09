
import java.util.Scanner;

public class NhapSoNgay {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int ngay;
        System.out.print("nhap vao so ngay: "); ngay = sc.nextInt();
        switch (ngay) {
            case 1:
                System.out.println("thu 2");
                break;
            case 2:
                System.out.println("thu 3");
                break;
            case 3:
                System.out.println("thu 4");
                break;
            case 4:
                System.out.println("thu 5");
                break;
            case 5:
                System.out.println("thu 6");
                break;
            case 6:
                System.out.println("thu 7");
                break;
            case 7:
                System.out.println("chu nhat");
                break;
            default:
                System.out.print("nhap sai so ngay trong tuan");
                break;
        }
        sc.close();
    }
}
