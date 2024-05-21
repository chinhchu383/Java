package BT3;
import java.util.ArrayList;
import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) 
    {
        ArrayList<Sinhvien> sv = new ArrayList<>();
        Sinhvien Sv = new Sinhvien();
        while(true)
        {
        System.out.println("1.Them sinh vien: ");
        System.out.println("2.Sua du lieu sinh vien: ");
        System.out.println("3.Xoa sinh vien: ");
        System.out.println("4.Tim Kiem thong tin sinh vien: ");
        System.out.println("5.Hien thi thong tin sinh vien: ");
        System.out.println("0.Thoat ");
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap lua chon: ");
        int  n = sc.nextInt();
        if(n == 0){

            return;
        }else{
            switch (n) {
                case 1:
                    Sv.ThemThongTin(sv);
                    break;
                case 2:
                    Sv.SuaThongTin(sv);
                    break;
                case 3:
                    Sv.XoaThongTin(sv);
                    break;
                case 4:
                    Sv.TimKiem(sv);
                    break;
                case 5:
                    Sv.XuatThongTin(sv);
                    break;
                default:
                    System.out.println("nhap k hop le");
                    break;
            }
            System.out.println("-------------------");
            }
        }
    }
}
