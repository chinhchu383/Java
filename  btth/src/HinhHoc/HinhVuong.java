package HinhHoc;

import java.util.Scanner;

public class HinhVuong extends HinhChuNhat {
    public void HinhVuong()
    {
       Ten = "hinh Vuong";
    }
    public void NhapCanh()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap canh hinh vuong: ");
        dai = rong = sc.nextFloat();
    }
    
}
