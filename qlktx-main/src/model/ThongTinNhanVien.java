
package model;

import java.util.Date;

public class ThongTinNhanVien {
    
    private String tenNV;
    private String CCCD;
    private String gioiTinh;
    private Date ngaySinh;
    private String email;
    private String tenDangNhap;
    private String soDienThoai;
    private String queQuan;
    private String chucVu;
    private String trangThai;
    public ThongTinNhanVien() {
    }

    public ThongTinNhanVien(String tenNV, String CCCD, String gioiTinh, Date ngaySinh, String email, String tenDangNhap, String soDienThoai, String queQuan, String chucVu, String trangThai) {
        this.tenNV = tenNV;
        this.CCCD = CCCD;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.email = email;
        this.tenDangNhap = tenDangNhap;
        this.soDienThoai = soDienThoai;
        this.queQuan = queQuan;
        this.chucVu = chucVu;
        this.trangThai = trangThai;
    }

    public String getTenNV() {
        return tenNV;
    }

    public void setTenNV(String tenNV) {
        this.tenNV = tenNV;
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

    public String getChucVu() {
        return chucVu;
    }

    public void setChucVu(String chucVu) {
        this.chucVu = chucVu;
    }
    
    public String getTrangThai() {
        return trangThai;
    }
    
    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }
   
}
