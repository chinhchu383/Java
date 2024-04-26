package LopTruuTuong;

abstract class Bike {
    abstract void run();
}
public class Honda4 extends Bike {
    void run()
    {
        System.out.println("running not safely");
    }
    public static void main(String[] args) {
        Bike a = new Honda4();
        a.run();
    }
    
}
