package TinhLuongChoNhanVien;

public class main {
    public static void main(String[] args) {
        FullTime sep = new FullTime("sep", 3);
        sep.setLoaiChucVu(configs.NhanVienSep);
        FullTime linh1 = new FullTime("Nguyen Van A", 4);
        FullTime linh2 = new FullTime("Nguyen Van B", 2);
        PartTime nvmoi = new PartTime("Nguyen Van C", 10);
        sep.TinhLuong();
        linh1.TinhLuong();
        linh2.TinhLuong();
        nvmoi.TinhLuong();
        sep.XuatThongTin();
        linh1.XuatThongTin();
        linh2.XuatThongTin();
        nvmoi.XuatThongTin();

    }    
}
