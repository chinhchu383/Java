package BaiTap;
import java.util.Scanner;

/**
 * MainClass
 */
public class MainClass {

    public static void main(String[] args) {
        HinhTron a = new HinhTron();
        a.nhap();
        a.TinhChuVi(0);
        a.TinhDienTich(0);
        a.xuat();
        if(a.VongTronLon())
            System.out.println("hinh tron co bk: "+ a.r);
        else    
            System.out.println("chu vi cua hinh tron: "+ a.TinhChuVi(a.r));
        
        
        
        
        HinhTron1 b = new HinhTron1();
        ToaDo toaDo = new ToaDo();
        System.out.println(" Hay nhap vao ban kinh hinh tron: ");
        Scanner sc = new Scanner(System.in);
        float r = sc.nextInt();
        b.setBanKinh(r);
        System.out.println("Nhap vao toan do hinh tron: ");
        System.out.println("x = ");
        toaDo.x = sc.nextInt();
        System.out.println("y = ");
        toaDo.y = sc.nextInt();
        b.setBanKinh(0);
        b.setToaDo(toaDo.x, toaDo.y);
        b.xuatBanKinh();
        b.xuatToaDo();
    }
}