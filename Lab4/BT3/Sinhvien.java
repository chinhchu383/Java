package BT3;
import java.util.ArrayList;
import java.util.Scanner;

public class Sinhvien {
    private String ID;
    private float diem;
    private String ten;
    Scanner sc = new Scanner(System.in);
    

    public void NhapThongTin(ArrayList<Sinhvien> arrList)
    {
        
        System.out.println("nhap ten: ");
        ten = sc .nextLine();
        System.out.println("nhap ID: ");
        ID = sc.nextLine();
        System.out.println("nhap diem: ");
        diem = sc.nextFloat();
        
    }
    public void XuatThongTin(ArrayList<Sinhvien> arrList){
        for(var i: arrList)
        {
            System.out.println("---------");
            System.out.println("ten: "+ i.ten);
            System.out.println("diem: "+i.diem);
            System.out.println("ID: "+i.ID);
        }

    }
    public void XuatThongTin(){
        
        
            System.out.println("---------");
            System.out.println("ten: "+ ten);
            System.out.println("diem: "+diem);
            System.out.println("ID: "+ID);
        

    }
    public void ThemThongTin(ArrayList<Sinhvien> arrList)
    {
        
        Sinhvien s = new Sinhvien();
        s.NhapThongTin(arrList);
        arrList.add(s);
    }
    public void SuaThongTin(ArrayList<Sinhvien> arrList)
    {
        System.out.print("nhap ID: ");
        String std = sc.nextLine();
        for(int i=0; i<arrList.size();i++)
        {
            if(arrList.get(i).ID.equals(std)){
                arrList.get(i).ID = std;
                System.out.println("nhap ten muon chinh sua: ");
                String name = sc.nextLine();
                arrList.get(i).ten = name;
                System.out.println("nhap diem muon chinh sua: ");
                float d = sc.nextFloat();
                arrList.get(i).diem = d;
            }else
                System.out.println("ID k ton tai!!!!");
                
        }
    }
    public void XoaThongTin(ArrayList<Sinhvien> arrList)
    {
        System.out.print("nhap ID: ");
        String std = sc.nextLine();
        for(int i=0; i<arrList.size();i++)
        {
            if(arrList.get(i).ID.equals(std)){
                arrList.remove(i);
                System.out.println("xoa thanh cong!!!");
            }else
                System.out.println("ID k ton tai!!!!");
                
        }
    }
    public void TimKiem(ArrayList<Sinhvien> arrList)
    {
        System.out.print("nhap ID: ");
        String std = sc.nextLine();
        
        for(int i = 0; i< arrList.size();i++){
            if(arrList.get(i).ID.equals(std))
            {
                System.out.println("THONG TIN SINH VIEN DA TIM KIEM: ");
                Sinhvien a = arrList.get(i);
                a.XuatThongTin();
                
            }else
                System.out.println("ID k ton tai!!!!");
        }
    }
}
