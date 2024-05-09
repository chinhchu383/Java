package LopTruuTuong;
abstract class printable {
    abstract void run();
}
public class A6 implements printable {
    public void print(){
        System.out.println("Hello ");
    }
    public static void main(String[] args) {
        A6 b = new A6();
        b.print();
    }
}

