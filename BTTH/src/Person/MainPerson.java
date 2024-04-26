package Person;

public class MainPerson {
    public static void main(String[] args) {
        FullTime ft = new FullTime();
        ft.FullTime();
        ft.NhapThongTin();
        ft.TinhLuong();
        ft.XuatThongTin();
        PartTime pt = new PartTime();
        System.out.println("-------------------------");
        pt.PartTime();
        pt.NhapThongTin();
        pt.TinhLuong();
        pt.XuatThongTin();
    }
}
