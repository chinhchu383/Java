package ArrayList;
import java.util.Scanner;
import java.util.ArrayList;
// import java.util.Collection;
// import java.util.Comparator;

public class demo1 {
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
        arrlistint.add(2, 5);
        System.out.println("-----------------------");
        for (int i = 0;i < arrlistint.size() ; i++) {
            System.out.println("phan tu trong mang: "+ arrlistint.get(i)) ;
        }
        arrlistint.set(0, 1);
        System.out.println("-----------------------");

        for (int i = 0;i < arrlistint.size() ; i++) {
            System.out.println("phan tu trong mang: "+ arrlistint.get(i)) ;
        }
        arrlistint.remove(1);
        System.out.println("-----------------------");

        for (int i = 0;i < arrlistint.size() ; i++) {
            System.out.println("phan tu trong mang: "+ arrlistint.get(i)) ;
        }
        arrlistint.removeLast();
        System.out.println("-----------------------");

        for (int i = 0;i < arrlistint.size() ; i++) {
            System.out.println("phan tu trong mang: "+ arrlistint.get(i)) ;
        }
        arrlistint.isEmpty();
        arrlistint.indexOf(5);
        arrlistint.contains(6);
        arrlistint.clear();
    }
}
