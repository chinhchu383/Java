package LopTruuTuong;
abstract class Bike {
    abstract void run();

}class Honda4 extends bike {
    void run()
    {
        System.out.println("running not safely");
    }
    public static void main(String[] args) {
        bike a = new Honda4();
        a.run();
    }
    
}