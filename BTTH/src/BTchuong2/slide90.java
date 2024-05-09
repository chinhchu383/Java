package BTchuong2;


import java.util.Scanner;

public class slide90 {
    public static void main(String[] args) {
        String c;
        char k;
        Scanner sc= new Scanner(System.in);
        System.out.print("nhap 1 chuoi tu ban phim: ");
        c = sc.nextLine();
        for (int i = 0; i < c.length(); i++) {
            k = c.charAt(i);
            System.out.println("ky tu:" + k);
        }
        sc.close();
    }
}
