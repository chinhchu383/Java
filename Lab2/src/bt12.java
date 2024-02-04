import java.util.Scanner;

public class bt12 {
    public static void main(String[] args) {
        int m,n;
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap so dong: ");m = sc.nextInt();
        System.out.print("nhap so cot :");n = sc.nextInt();
        int [][]a = new int[m][n];
        System.out.println("nhap phan tu: ");
        for (int i = 0; i < m; i++)
        {
            for(int j = 0; j < n;j++)
                {
                    System.out.print("nhap ma tran thu a["+i+"]["+j+"]: ");
                    a[i][j] = sc.nextInt();
                }
        }
        int max = a[0][0];
        for(int i = 0; i < m; i++) 
            for(int j = 0; j < n;j++)
                if(a[i][j] > max)
                {
                    max = a[i][j];
                }
        System.out.printf("so lon nhat la %d" , max);
        sc.close();
    }
}
