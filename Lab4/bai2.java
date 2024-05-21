import java.util.LinkedList;
import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap n: ");
        int  n = sc.nextInt();
        int dem = 0, t = 0;
        for (int i = 0; i < n ; i++) {
            int c;
            c = sc.nextInt();
            if(c <= 0){
                continue ;
            }
            linkedList.add(c);
        }
        System.out.println(linkedList);
        for (int i = 0; i < linkedList.size(); i++) {
            if(linkedList.get(i)%2==0)
            {
                t += linkedList.get(i);
                dem++;
            }
        }
        System.out.println("trung binh cong cac so chan: "+t/dem);
        sc.close();
    }
}
