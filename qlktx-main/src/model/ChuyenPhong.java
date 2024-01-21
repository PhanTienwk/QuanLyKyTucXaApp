
package model;

public class ChuyenPhong {
    private String MaSV;
    private String MaPhongHT;
    private String MaPhongChuyen;
    private String lyDoChuyen;
    private int trangThai;

    public ChuyenPhong() {
    }

    public ChuyenPhong(String MaSV, String MaPhongHT, String MaPhongChuyen, String lyDoChuyen, int trangThai) {
        this.MaSV = MaSV;
        this.MaPhongHT = MaPhongHT;
        this.MaPhongChuyen = MaPhongChuyen;
        this.lyDoChuyen = lyDoChuyen;
        this.trangThai = trangThai;
    }
    
    

    public int getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(int trangThai) {
        this.trangThai = trangThai;
    }

   

    public String getMaSV() {
        return MaSV;
    }

    public void setMaSV(String MaSV) {
        this.MaSV = MaSV;
    }

    public String getMaPhongHT() {
        return MaPhongHT;
    }

    public void setMaPhongHT(String MaPhongHT) {
        this.MaPhongHT = MaPhongHT;
    }

    public String getMaPhongChuyen() {
        return MaPhongChuyen;
    }

    public void setMaPhongChuyen(String MaPhongChuyen) {
        this.MaPhongChuyen = MaPhongChuyen;
    }

    public String getLyDoChuyen() {
        return lyDoChuyen;
    }

    public void setLyDoChuyen(String lyDoChuyen) {
        this.lyDoChuyen = lyDoChuyen;
    }
    
    
}
