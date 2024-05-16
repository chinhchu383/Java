package hashset;

import java.util.HashSet;
import java.util.Scanner;

import Person.person;

public class hs {
    public static void main(String[] args) {
        HashSet<person> hashSetPerson = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        person ps = new person();
        System.out.println("nhap so luong can nhap: ");
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            
            ps.NhapThongTin();
            hashSetPerson.add(ps);
            hashSetPerson.contains(ps);
        }
        System.out.println("--------------------------");

        for(person i : hashSetPerson){
            ps.XuatThongTin();
        }
    }
        
}
