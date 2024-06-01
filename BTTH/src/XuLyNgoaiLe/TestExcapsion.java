package Xu_ly_ngoai_le;

public class TestExcapsion {
    public static void main(String[] args) {
        try {
            try {
                System.out.println("phoep chia");
                int b = 39 / 0;
            } catch (ArithmeticException e) {
                System.out.println(e);
            }
            try {
                int a[] =new int[5];
                a[5] = 4;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(e);
            }
            System.out.println("khoi lenh khac!");
        }catch (Exception e) {
            System.out.println("Xu ly ngoai le!");
        }
        System.out.println("tiep tuc!");
        }
    }