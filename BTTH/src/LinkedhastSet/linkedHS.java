package LinkedhastSet;


import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;



public class linkedHS {
    public static void main(String[] args) {
        Set<String> a = new LinkedHashSet<String>();
        a.add("java");
        a.add("C#");
        a.add("HTML");
        a.add("PHP");
        System.out.println(a);
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap vao phan tu can xoa: ");
        String c = sc.nextLine();
        if(a.contains(c))
        {
            a.remove(c);
            System.out.println("xoa thanh cong phan tu "+ c );
            System.out.println("cac phan tu con lai: ");
            System.out.println(a);
        }
        else
        {
            System.out.println("k ton tai phan tu");
        }
    }
    
    
}
