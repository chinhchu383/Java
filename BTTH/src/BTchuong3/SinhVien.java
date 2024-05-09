package BTchuong3;
import java.util.Scanner;

public class SinhVien {
    public String ten;
    public int tuoi;
    public String maSV, Lop;
    public float diemA, diemB, diemC;
    public void NhapThongTin()
    {
        System.out.println("nhap thong tin sinh vien");
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap ten: ");ten = sc.nextLine();
        System.out.print("nhap ma sinh vien: "); maSV = sc.nextLine();
        System.out.print("nhap lop: "); Lop = sc.nextLine();
        System.out.print("nhap tuoi:" );tuoi = sc.nextInt();
        
        System.out.print("Nhap diem A:"); diemA = sc.nextFloat();
        System.out.print("Nhap diem B:"); diemB = sc.nextFloat();
        System.out.print("Nhap diem C:"); diemC = sc.nextFloat();
    }
    public float TinhDiemTongKet()
    {
        return diemA*0.6f + diemB*0.3f + diemC*0.1f;
    }
    public void XuatThongTin()
    {
        System.out.println("Thong tin sinh vien: ");
        System.out.println("ten: "+ten+"\ntuoi: "+tuoi+"\nma sinh vien: "+maSV+"\nlop: "+Lop);
        System.out.println("diem tong ket: "+ TinhDiemTongKet());
    }

    
}
