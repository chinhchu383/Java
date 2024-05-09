
import HinhHoc.HinhHoc;
import HinhHoc.HinhChuNhat;
import HinhHoc.HinhTron;
import HinhHoc.HinhTru;
import HinhHoc.HinhVuong;

public class MainHinhHoc {
    public static void main(String[] args) {
        HinhHoc hh = new HinhHoc();
        hh.XuatTen();
        hh.InChuVi();
        hh.InDienTich();
        hh.InTheTich();
        System.out.println("----------------------------");

        HinhTron ht = new HinhTron();
        ht.HinhTron();
        ht.XuatTen();
        ht.NhapBanKinh();
        ht.TinhChuVi();
        ht.InChuVi();
        System.out.println("----------------------------");

        HinhChuNhat hcn = new HinhChuNhat();
        hcn.HinhChuNhat();
        hcn.XuatTen();
        hcn.nhapChieuDai();
        hcn.nhapChieuRong();
        hcn.TinhChuVi();
        hcn.TinhDienTich();
        hcn.InChuVi();
        hcn.InDienTich();
        System.out.println("----------------------------");

        HinhTru HT = new HinhTru();
        HT.HinhTru();
        HT.XuatTen();
        HT.NhapChieuCao();
        HT.TinhTheTich();
        HT.InTheTich();
        
        System.out.println("----------------------------");
        HinhVuong hv = new HinhVuong();
        hv.HinhVuong();
        hv.XuatTen();
        hv.NhapCanh();
        hv.TinhChuVi();
        hv.TinhDienTich();
        hv.InChuVi();
        hv.InDienTich();
    }
}
