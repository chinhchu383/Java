
import java.util.Scanner;

public class HinhTron extends ToaDo
{
    final float PI = 3.14f;
    public float r, cv, dt;
    
    public void nhap()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap vao ban kinh: ");
        r = sc.nextFloat();
    }

    public float TinhChuVi(float r)
    {
        
        return r*PI*2;
    }
    public float TinhDienTich(float r)
    {
        return r*PI*r;
    }
    public void xuat()
    {
        
        System.out.println("chu vi: "+ TinhChuVi(r) + " - dien tich: "+ TinhDienTich(r));
        
    }
    public boolean VongTronLon()
    {
        if(r>10)
            return true;
        else 
            return false;
    }


}
