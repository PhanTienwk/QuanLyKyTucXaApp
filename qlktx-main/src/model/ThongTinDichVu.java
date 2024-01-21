package model;

import java.util.Date;

public class ThongTinDichVu {

    private Date ngayThang;
    private String maPhong;
    private float soNuocCu;
    private float soNuocMoi;
    private float soDienCu;
    private float soDienMoi;

    public ThongTinDichVu() {
    }

    public ThongTinDichVu(Date ngayThang, String maPhong, float soNuocCu, float soNuocMoi, float soDienCu, float soDienMoi) {
        this.ngayThang = ngayThang;
        this.maPhong = maPhong;
        this.soNuocCu = soNuocCu;
        this.soNuocMoi = soNuocMoi;
        this.soDienCu = soDienCu;
        this.soDienMoi = soDienMoi;
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

    public float getSoNuocCu() {
        return soNuocCu;
    }

    public void setSoNuocCu(float soNuocCu) {
        this.soNuocCu = soNuocCu;
    }

    public float getSoNuocMoi() {
        return soNuocMoi;
    }

    public void setSoNuocMoi(float soNuocMoi) {
        this.soNuocMoi = soNuocMoi;
    }

    public float getSoDienCu() {
        return soDienCu;
    }

    public void setSoDienCu(float soDienCu) {
        this.soDienCu = soDienCu;
    }

    public float getSoDienMoi() {
        return soDienMoi;
    }

    public void setSoDienMoi(float soDienMoi) {
        this.soDienMoi = soDienMoi;
    }
}
