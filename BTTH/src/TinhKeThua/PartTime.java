package TinhKeThua;
public class PartTime extends NhanVien {
    public int gioLamThem;
    public PartTime(String ten , int gioLamThem)
    {
        this.ten = ten;
        this.gioLamThem = gioLamThem;
    }
    @Override
    public String LoaiNhanVien()
    {
        return "nhan vien part time";
    }
    public void TinhLuong()
    {
        luong = configs.LuongNhanVienPartTime1Gio *gioLamThem;
    }
}
