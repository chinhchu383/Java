package TinhLuongChoNhanVien;

public class NhanVien {
    public String ten;
    public float luong;
    public void NhanVien()
    {
        
    }
    public void NhanVien(String ten)
    {
        this.ten = ten;
    }
    public String LoaiNhanVien()
    {
        return "";
    }
    public void XuatThongTin()
    {
        System.out.println("ten: " + ten + " \n luong: "+luong + " \n chuc vu: "+ LoaiNhanVien()) ;
    }
}
