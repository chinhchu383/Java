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
        return "Chu Van Chinh";
    }
    public void XuatThongTin()
    {
        System.out.println("Ten nhan vien: "+ ten) ;
        System.out.println("Luong: "+ luong+" VND");
        System.out.println("Chuc vu: "+ LoaiNhanVien());
        System.out.println("-------------------------");
    }
}
