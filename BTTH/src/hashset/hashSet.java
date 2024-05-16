package hashset;
import java.util.HashSet;
import java.util.Scanner;


public class hashSet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> hashsetInt = new HashSet<>();
        hashsetInt.add(1);
        hashsetInt.add(2);
        hashsetInt.add(9);
        hashsetInt.add(7);
        hashsetInt.add(10);
        System.out.println("cac phan tu: ");
        System.out.println(hashsetInt);
        System.out.print("nhap phan tu can them: ");
        int number = sc.nextInt();
        if(!hashsetInt.contains(number))
        {
            hashsetInt.add(number);
            System.out.println("da them thanh cong! ");
            System.out.println("cac phan tu sau khi them: ");
            System.out.println(hashsetInt);
        }
        else
        {
            System.out.println("phan tu " + number +" da ton tai");
        }
        System.out.print("nhap gia tri can xoa");
        int a = sc.nextInt();
        if(hashsetInt.contains(a)){
            hashsetInt.remove(a);
            System.out.println("cac phan tu sau khi xoa: ");
            System.out.println(hashsetInt);
        }
        else
            System.out.println("gia tri k co trong mang");
        

    }
}
