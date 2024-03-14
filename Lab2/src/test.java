import java.util.Scanner;

public class test {
    public String name;
    public int tuoi;
    public void nhap()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap ten = "); name = sc.nextLine();
        System.out.println("nhap tuoi = "); tuoi = sc.nextInt();
    }
    public void xuat()
    {
        System.out.println(name + " "+ tuoi);
    }
    
}
public class mainclass {

    public static void main(String[] args) 
    {
        test a = new test();
        a.nhap();
        a.xuat();
    }
}





