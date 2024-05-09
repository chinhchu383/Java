package btchuong4;

import java.util.Scanner;

public class person {
    public String ID;
    public String ten;
    public void NhapThongTin()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap ten");
        ten = sc.nextLine();
        System.out.println("id: ");
        ID = sc.nextLine();
    }
    public void XuatThongTin()
    {
        System.out.println("ten: "+ ten + "\tid: "+ ID);
    }
}
