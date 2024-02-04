import java.util.Scanner;

/**
 * bt11
 */
public class bt11 {

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap so phan tu: ");
        n = sc.nextInt();
        int a[] = new int[n];
        System.out.print("nhap mang: ");
        for(int i = 0; i < n; i++)
        {
            a[i]= sc.nextInt();
        }
        System.out.print("MANG TRUOC KHI SAP XEP");
        for(int i = 0; i < n; i++)
        {
            System.out.printf("    a["+i+"]: "+ a[i]);
        }
        System.out.println("");
        System.out.print("MANG SAU KHI SAP XEP");
        for(int i = 0; i < n-1; i ++)
            for(int j = i+1; j < n; j++)
                if (a[i] > a[j])
                {
                    int c = a[j];
                    a[j] = a[i];
                    a[i] = c;
                }
        for(int i = 0; i < n; i++)
        {
            System.out.printf("     a["+i+"]: "+ a[i]);
        }
        sc.close();
    }
}