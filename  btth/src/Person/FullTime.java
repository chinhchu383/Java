package Person;

import java.util.Scanner;

public class FullTime extends employee {
    public final float LuongCung = 100f;
    public float TamUng;
    public float Luong;
    public float Thuong;
    public void FullTime()
    {
        System.out.println("FullTime");
    }
    public void NhapThongTin()
    {
        Scanner sc = new Scanner(System.in);
        super.NhapThongTin();
        System.out.print("nhap so tien thuong: ");Thuong = sc.nextFloat();
        System.out.print("nhap so tien tam ung ");TamUng = sc.nextFloat();
    }
    public float TinhLuong()
    {
        Luong = LuongCung + Thuong - TamUng;
        return Luong;
    }
    public void XuatThongTin()
    {
        System.out.println("---------------------------");
        super.XuatThongTin();
        System.out.println("\nso tieng luong: "+ Luong);
    }
}
