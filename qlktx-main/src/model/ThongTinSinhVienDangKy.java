package model;

import java.util.Date;

public class ThongTinSinhVienDangKy {
    private String maSV;
    private String tenSV;
    private String CCCD;
    private String gioiTinh;
    private Date ngaySinh;
    private String email;
    private String tenDangNhap;
    private String soDienThoai;
    private String queQuan;
    private String maLop;

    public ThongTinSinhVienDangKy() {
    }

    public ThongTinSinhVienDangKy(String maSV, String tenSV, String CCCD, String gioiTinh, Date ngaySinh, String email, String tenDangNhap, String soDienThoai, String queQuan, String maLop) {
        this.maSV = maSV;
        this.tenSV = tenSV;
        this.CCCD = CCCD;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.email = email;
        this.tenDangNhap = tenDangNhap;
        this.soDienThoai = soDienThoai;
        this.queQuan = queQuan;
        this.maLop = maLop;
    }

   

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getTenSV() {
        return tenSV;
    }

    public void setTenSV(String tenSV) {
        this.tenSV = tenSV;
    }

    public String getCCCD() {
        return CCCD;
    }

    public void setCCCD(String CCCD) {
        this.CCCD = CCCD;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTenDangNhap() {
        return tenDangNhap;
    }

    public void setTenDangNhap(String tenDangNhap) {
        this.tenDangNhap = tenDangNhap;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }

    public String getMaLop() {
        return maLop;
    }

    public void setMaLop(String maLop) {
        this.maLop = maLop;
    }

    
    
    
}
