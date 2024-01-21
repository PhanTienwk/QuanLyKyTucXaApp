
package model;

import java.util.Date;

public class HoaDonPhong {
    private Date ngayThang;
    private String maPhong;
    private float soNuocTieuThu;
    private float soDienTieuThu;
    private double tongTien;
    private byte trangThai;

    public HoaDonPhong(Date ngayThang, String maPhong, float soNuocTieuThu, float soDienTieuThu, double tongTien, byte trangThai) {
        this.ngayThang = ngayThang;
        this.maPhong = maPhong;
        this.soNuocTieuThu = soNuocTieuThu;
        this.soDienTieuThu = soDienTieuThu;
        this.tongTien = tongTien;
        this.trangThai = trangThai;
    }

    public HoaDonPhong() {
    }

    public Date getNgayThang() {
        return ngayThang;
    }

    public void setNgayThang(Date ngayThang) {
        this.ngayThang = ngayThang;
    }

    public String getMaPhong() {
        return maPhong;
    }

    public void setMaPhong(String maPhong) {
        this.maPhong = maPhong;
    }

    public float getSoNuocTieuThu() {
        return soNuocTieuThu;
    }

    public void setSoNuocTieuThu(float soNuocTieuThu) {
        this.soNuocTieuThu = soNuocTieuThu;
    }

    public float getSoDienTieuThu() {
        return soDienTieuThu;
    }

    public void setSoDienTieuThu(float soDienTieuThu) {
        this.soDienTieuThu = soDienTieuThu;
    }

    public double getTongTien() {
        return tongTien;
    }

    public void setTongTien(double tongTien) {
        this.tongTien = tongTien;
    }

    public byte getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(byte trangThai) {
        this.trangThai = trangThai;
    }
    
    
}
