
package model;

public class ThongTinPhong {
    private String maPhong;
    private String tenPhong;
    private String loaiPhong;
    private String gioiTinh;
    private int soLuongSVPhong;
    private double tienPhong;

    public ThongTinPhong() {
    }

    public ThongTinPhong(String maPhong, String tenPhong, String loaiPhong, String gioiTinh, int soLuongSVPhong, double tienPhong) {
        this.maPhong = maPhong;
        this.tenPhong = tenPhong;
        this.loaiPhong = loaiPhong;
        this.gioiTinh = gioiTinh;
        this.soLuongSVPhong = soLuongSVPhong;
        this.tienPhong = tienPhong;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getMaPhong() {
        return maPhong;
    }

    public void setMaPhong(String maPhong) {
        this.maPhong = maPhong;
    }

    public String getTenPhong() {
        return tenPhong;
    }

    public void setTenPhong(String tenPhong) {
        this.tenPhong = tenPhong;
    }

    public String getLoaiPhong() {
        return loaiPhong;
    }

    public void setLoaiPhong(String loaiPhong) {
        this.loaiPhong = loaiPhong;
    }

   
    public int getSoLuongSVPhong() {
        return soLuongSVPhong;
    }

    public void setSoLuongSVPhong(int soLuongSVPhong) {
        this.soLuongSVPhong = soLuongSVPhong;
    }

    public double getTienPhong() {
        return tienPhong;
    }

    public void setTienPhong(double tienPhong) {
        this.tienPhong = tienPhong;
    }
    
    
    
}
