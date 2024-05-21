import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        ArrayList<Integer> arrList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap n: ");
        int  n = sc.nextInt();
        for (int i = 0; i < n ; i++) {
            int c;
            c = sc.nextInt();
            arrList.add(c);
        }
        System.out.println(arrList.size());
        int max = arrList.get(0);
        for (int i=0; i< arrList.size(); i++ ) {
            if(max < arrList.get(i)){
                max = arrList.get(i);
            }
        }
        System.out.println("so lon nhat la: "+ max);
        int d;
        System.out.println("nhap phan tu can xoa: ");
        d = sc.nextInt();
        for (int i = arrList.size()-1; i >=0; i--) {
            if(d == arrList.get(i))
            {
                arrList.remove(i);
                System.out.println("xoa thanh cong!!!!!!!!!!");                
            }
            
    }   
        System.out.println("cac phan tu con lai: ");
        System.out.println(arrList);
        arrList.sort(Comparator.comparing(o->o));
        System.out.println("mang sau khi sap xep: ");
        System.out.println(arrList);
        sc.close();
    }
    
    }

