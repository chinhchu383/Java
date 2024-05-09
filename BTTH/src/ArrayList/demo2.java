package ArrayList;
import java.util.ArrayList;

import java.util.Scanner;

public class demo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("nhap n: ");
        n = sc.nextInt();
        
        ArrayList<Integer> arrlistint = new ArrayList<>();
        for (int i = 0; i < n ; i++) {
            int a;
            System.out.println("nhap phan tu: ");
            a = sc.nextInt();
            arrlistint.add(a);
        }
        for (int i = 0;i < arrlistint.size() ; i++) {
            System.out.println("phan tu trong mang: "+ arrlistint.get(i)) ;
        }
        int max = arrlistint.get(0);
        for (int i = 1; i < arrlistint.size(); i++) {
            if(arrlistint.get(i)>max)
                max = arrlistint.get(i);
        }
        System.out.println(max);
}
}