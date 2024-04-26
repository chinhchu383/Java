package HinhHoc;

import java.util.Scanner;

public class HinhTron extends HinhHoc {
    public float bk;
    public void HinhTron()
    {
        Ten = "Hinh tron";
    }
    public void NhapBanKinh()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap ban kinh: ");
        bk = sc.nextFloat();
    }
    public float TinhChuVi()
    {
        ChuVi = bk*PI*2;
        return ChuVi;
    }
    public float TinhDienTich()
    {
        DienTich = bk*bk*PI;
        return DienTich;
    }
}
