
package model;


public class ThongTinHoaDon {
    private String maPhong;
    private float soNuocCu;
    private float soNuocMoi;
    private float soDienCu;
    private float soDienMoi;
    private double tienThanhToan;

    public ThongTinHoaDon() {
    }

    public ThongTinHoaDon(String maPhong, float soNuocCu, float soNuocMoi, float soDienCu, float soDienMoi, double tienThanhToan) {
        this.maPhong = maPhong;
        this.soNuocCu = soNuocCu;
        this.soNuocMoi = soNuocMoi;
        this.soDienCu = soDienCu;
        this.soDienMoi = soDienMoi;
        this.tienThanhToan = tienThanhToan;
    }



    public ThongTinHoaDon(String maPhong, float soNuocCu, float soNuocMoi, float soDienCu, float soDienMoi) {
        this.maPhong = maPhong;
        this.soNuocCu = soNuocCu;
        this.soNuocMoi = soNuocMoi;
        this.soDienCu = soDienCu;
        this.soDienMoi = soDienMoi;
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

    public double getTienThanhToan() {
        return tienThanhToan;
    }

    public void setTienThanhToan(double tienThanhToan) {
        this.tienThanhToan = tienThanhToan;
    }

    
}
