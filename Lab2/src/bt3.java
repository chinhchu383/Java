import java.util.Scanner;
public class bt3 {
    public static void main(String[] args) {
        String name;
        int NamSinh;
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap Ten cua ban: "); name = sc.nextLine();
        System.out.print("nhap nam sinh: "); NamSinh = sc.nextInt();
        int tuoi = 2024 - NamSinh;
        if(tuoi <16)    
            System.out.println("ban "+name+ " o do tuoi vi thanh nien");
        else if(tuoi >=16 && tuoi < 18) 
            System.out.println("ban "+name+ " o do tuoi truong thanh");
        else
            System.out.println("ban "+name+ " da gia");
        sc.close();
    }
}
