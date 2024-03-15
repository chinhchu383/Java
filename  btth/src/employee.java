import java.util.Scanner;

public class employee {
    public String ten;
    public int tuoi;
    public int Luong, TroCap;

    public void NhapTT()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("NHAP THONG TIN :");
        System.out.print("nhap ten: "); ten = sc.nextLine();
        System.out.print("nhap tuoi: ");tuoi = sc.nextInt();
        System.out.print("nhap Luong 1 ngay: ");Luong = sc.nextInt();
        System.out.print("nhap Tro Cap: ");TroCap = sc.nextInt();
    }
    public float TinhLuong()
    {
        return Luong*30f + TroCap;
    }
    public void XuatTT()
    {
        System.out.println("Thong tin: ");
        System.out.println("ten: "+ten+"\ntuoi: "+tuoi);
        System.out.println("luong 1 thang: "+ TinhLuong());
    }
}
