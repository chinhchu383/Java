package MAP;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Hashmap {
    public static void main(String[] args) {
        HashMap< String, String> hm = new HashMap<>();
        //nhap vao
        hm.put("CSLT", "Co So Lap Trinh");
        hm.put("HTML", "HTML");
        hm.put("C#", "C#");
        hm.put("Java", "Java");
        //hien thi cac entry
        Set <Map.Entry<String, String >> setHashmap = hm.entrySet();
        
        System.out.println("hien thi cac entry: ");
        System.out.println(hm);
        //tim kiem khi biet khoa
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao khoa: ");
        String TK = sc.nextLine();
        if(hm.containsKey(TK))
            System.out.println("co thong tin: " + hm.get(TK));
        else{
            System.out.println("k co thong tin");
            return;
        }
            
        System.out.println("tien hanh xoa!!");
        hm.remove(TK);
        System.out.println("cac entry con lai: ");
        System.out.println(hm);
    }
}
