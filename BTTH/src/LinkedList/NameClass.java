package LinkedList;
import java.util.LinkedList;
import java.util.Scanner;
public class NameClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> linkedlist = new LinkedList<>();
        int n;
        System.out.println("nhap n: ");
        n = sc.nextInt();
        
        for (int i = 0; i < n; i++) {
            int a;
            System.out.println("nhap phan tu: ");
            a = sc.nextInt();
            linkedlist.add(a);
        }
        
        for (int i = 0; i <= linkedlist.size(); i++) {
            System.out.println(linkedlist.get(i));
        }

    }

    }

