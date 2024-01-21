
package model;

import java.util.Date;


public class ThongTinHoaDonSV {
    private Date ngayThang;
    private String maSV;
    private double tienThanhToan;
    private byte trangThai;

    public ThongTinHoaDonSV() {
    }

    public ThongTinHoaDonSV(Date ngayThang, String maSV, double tienThanhToan, byte trangThai) {
        this.ngayThang = ngayThang;
        this.maSV = maSV;
        this.tienThanhToan = tienThanhToan;
        this.trangThai = trangThai;
    }

    public Date getNgayThang() {
        return ngayThang;
    }

    public void setNgayThang(Date ngayThang) {
        this.ngayThang = ngayThang;
    }

    

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public double getTienThanhToan() {
        return tienThanhToan;
    }

    public void setTienThanhToan(double tienThanhToan) {
        this.tienThanhToan = tienThanhToan;
    }

    public byte getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(byte trangThai) {
        this.trangThai = trangThai;
    }

   
    
    
    
    
}
