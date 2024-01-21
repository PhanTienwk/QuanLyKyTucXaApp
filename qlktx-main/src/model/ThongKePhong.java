
package model;


public class ThongKePhong {
    private String maPhong;
    private String tenPhong;
    private int soLuongSinhVienPhong;

    public ThongKePhong(String maPhong, String tenPhong, int soLuongSinhVienPhong) {
        this.maPhong = maPhong;
        this.tenPhong = tenPhong;
        this.soLuongSinhVienPhong = soLuongSinhVienPhong;
    }

    public ThongKePhong() {
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

    public int getSoLuongSinhVienPhong() {
        return soLuongSinhVienPhong;
    }

    public void setSoLuongSinhVienPhong(int soLuongSinhVienPhong) {
        this.soLuongSinhVienPhong = soLuongSinhVienPhong;
    }
    
    
}
