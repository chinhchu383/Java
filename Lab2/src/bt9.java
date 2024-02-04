import java.util.Scanner;

public class bt9 {
    public static void main(String[] args) {
        String chuoi;
        int demInHoa = 0, demThuong = 0, demSo = 0, i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao 1 chuoi bat ky: ");
        chuoi = sc.nextLine();
        for (i = 0; i < chuoi.length(); i++) {
            char kytu = chuoi.charAt(i);
            
            if (kytu >= '1' && kytu <= '9')
                demSo = demSo + 1;
            else if (kytu >= 'A' && kytu <= 'Z')
                demInHoa = demInHoa + 1;
            else if (kytu >= 'a' && kytu <='z')
                demThuong = demThuong + 1;
           
        }
        System.out.println("So ky tu so la " + demSo);
        System.out.println("So ky tu in hoa la " + demInHoa);
        System.out.println("So ky tu thuong la " + demThuong);
        sc.close();
    }
}
