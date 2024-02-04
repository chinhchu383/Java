import java.util.Scanner;

public class bt10 {
    public static void main(String[] args) {
        String str, k;
        char c;
        Scanner sc= new Scanner(System.in);
        do{
            System.out.println("nhap 1 chuoi: ");
            str = sc.nextLine();
        }while(str.length()>80);
        System.out.print("nhap 1 ky tu: ");
        k = sc.nextLine();
        c = k.charAt(0);
        int dem = 0;
        for (int i = 0; i < str.length(); i++) {
            if(c == str.charAt(i)){
                dem++;
            }
        }
        System.out.print("so lan xuat hien: "+ dem);
        sc.close();
    }
}
