package Xu_ly_ngoai_le;

public class TestFinallyBlock2 {
    public static void main(String[] args) {
        try {
            int data = 25 / 5;
        } catch (ArithmeticException e) {
            System.out.println(e);
        } finally {
            System.out.println("finally block is always execyted");
        }
        System.out.println("rest of the code...");
    }
}