package Person;

import java.util.Scanner;

public class person {
    public String ten;
    public int tuoi;
    public void NhapThongTin()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap ten: "); ten = sc.nextLine();
        System.out.print("nhap tuoi: "); tuoi = sc.nextInt();
    }
    public void XuatThongTin()
    {
        System.out.print("ten: " + ten + "\ntuoi: "+ tuoi);
    }
}
