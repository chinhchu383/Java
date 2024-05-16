package TreeSet;

import java.util.Scanner;
import java.util.TreeSet;

public class treeset {
    public static void main(String[] args) {
        int num;
        TreeSet<Integer> tree = new TreeSet<>();
        Scanner sc = new Scanner(System.in);
        tree.add(0);
        tree.add(3);
        tree.add(1);
        tree.add(4);
        tree.add(2);
        tree.add(8);
        System.out.println("Cac phan tu: ");
        System.out.println(tree);
        System.out.println("Nhap phan tu can them ");
        num = sc.nextInt();

        if(tree.contains(num))
        {
            System.out.println("Phan tu "+ num + " da ton tai");
        }
        else
        {
            tree.add(num);
            System.out.println("Them thanh cong");
            System.out.println("Cac phan tu trong tree sau khi them");
            System.out.println(tree);
        }
        System.out.println("nhap phan tu can xoa: ");
        int t = sc.nextInt();
        if(tree.contains(t))
        {
            tree.remove(t);
            System.out.println("xoa thanh cong phan tu " );
            System.out.println("cac phan tu con lai: ");
            System.out.println(tree);
        }
        else
        {
            System.out.println("k ton tai phan tu");
        }
    }
}
