package TinhLuongChoNhanVien;

public class FullTime extends NhanVien {
    public int NgayLamThem;
    public int LoaiChucVu;
    public  FullTime(String ten)
    {
        this.ten = ten;
    }
    public FullTime(String ten, int NgayLamThem)
    {
        this.ten = ten;
        this.NgayLamThem = NgayLamThem;
    }
    public void setLoaiChucVu(int LoaiChucVu)
    {
        this.LoaiChucVu = LoaiChucVu;
    }
    public String LoaiNhanVien()
    {
        if(LoaiChucVu == 1)
            return "sep";
        else
            return "nhan vien full time";
    }
    public void TinhLuong()
    {
        if (LoaiChucVu == 1) {
            luong = configs.LuongNhanVienFullTimeSep*NgayLamThem;

        }else
            luong = configs.LuongNhanVienFullTimeLinh*NgayLamThem;
    }
}
