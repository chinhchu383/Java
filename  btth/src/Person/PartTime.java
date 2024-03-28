package Person;

import java.util.Scanner;

/**
 * PartTime
 */
public class PartTime extends employee {
    public final float Luong1h = 20f;
    public float TamUng;
    public float Luong;
    public float Thuong;
    public void PartTime()
    {
        System.out.println("PartTime");
    }
    public void NhapThongTin()
    {
        super.NhapThongTin();
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap so tien thuong: ");Thuong = sc.nextFloat();
        System.out.print("nhap so tien tam ung ");TamUng = sc.nextFloat();
    }
    public float TinhLuong()
    {
        Luong = Luong1h*sogiolamviec + Thuong - TamUng;
        return Luong;
    }
    public void XuatThongTin()
    {
        System.out.println("---------------------------");
        super.XuatThongTin();
        System.out.println("\nso tieng luong: "+ Luong);
    }
}