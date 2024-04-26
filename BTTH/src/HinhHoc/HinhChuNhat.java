package HinhHoc;

import java.util.Scanner;

public class HinhChuNhat extends HinhHoc {
    public float dai;
    public float rong;
    public void HinhChuNhat()
    {
        Ten = "Hinh Chu Nhat";
    }
    public void nhapChieuDai()
    {
        System.out.print("nhap chieu dai: ");
        Scanner sc = new Scanner(System.in);
        dai = sc.nextFloat();
    }
    public void nhapChieuRong()
    {
        System.out.print("nhap chieu rong: ");
        Scanner sc = new Scanner(System.in);
        rong = sc.nextFloat();
    }
    public float TinhChuVi()
    {
        ChuVi = (dai+rong)*2;
        return ChuVi;
    }
    public float TinhDienTich()
    {
        DienTich = dai*rong;
        return DienTich;
    }
}
