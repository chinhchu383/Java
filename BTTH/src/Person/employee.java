package Person;

import java.util.Scanner;

public class employee extends person {
    public float sogiolamviec;
    public String maNV;
    public void NhapThongTin()
    {
        super.NhapThongTin();
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap ma nhan vien: ");
        maNV = sc.nextLine();
        System.out.print("nhap so gio lam viec: ");
        sogiolamviec = sc.nextFloat();}
    public void XuatThongTin()
    {
        super.XuatThongTin();
        System.out.print("\nso gio lam viec: "+ sogiolamviec +"\nma nhan vien: "+ maNV);
    }
    
}
