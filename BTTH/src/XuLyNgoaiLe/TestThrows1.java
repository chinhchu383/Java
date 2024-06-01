package Xu_ly_ngoai_le;
import java.io.IOException;
public class TestThrows1 {
    void m() throws IOException{
        throw new IOException("Loi thiet bi")
    }
    void n() throws IOException {
        m();
    }
    void p(){
        try {
            n();
        } catch (Exception e) {
            System.out.println("Ngoai le dc xu ly");
        }
    }
    public static void main(String[] args) {
        TestThrows1 obj = new TestThrows1();
        obj.p();
        System.out.println("luong binh thuong...");
    }
}