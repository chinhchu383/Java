package HinhHoc;

import java.util.Scanner;

public class HinhTru extends HinhTron  {
    public float chieucao;
    public void HinhTru()
    {
        Ten = "Hinh Tru";
    }
    public void NhapChieuCao()
    {
        NhapBanKinh();
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap chieu cao: ");
        chieucao = sc.nextFloat();
    }
    public void TinhTheTich()
    {
        TheTich = PI*bk*bk*chieucao;
        System.out.println(bk);
    }
}
