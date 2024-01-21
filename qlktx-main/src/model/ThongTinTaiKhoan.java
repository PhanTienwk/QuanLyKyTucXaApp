
package model;

public class ThongTinTaiKhoan {
    private String tenDangNhap;
    private String matKhau;
    private String email;
    private String phanQuyen;

    public ThongTinTaiKhoan() {
    }

    public ThongTinTaiKhoan(String tenDangNhap, String matKhau, String email, String phanQuyen) {
        this.tenDangNhap = tenDangNhap;
        this.matKhau = matKhau;
        this.email = email;
        this.phanQuyen = phanQuyen;
    }

    

    public ThongTinTaiKhoan(String tenDangNhap, String matKhau) {
        this.tenDangNhap = tenDangNhap;
        this.matKhau = matKhau;
    }
    

    public String getTenDangNhap() {
        return tenDangNhap;
    }

    public void setTenDangNhap(String tenDangNhap) {
        this.tenDangNhap = tenDangNhap;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhanQuyen() {
        return phanQuyen;
    }

    public void setPhanQuyen(String phanQuyen) {
        this.phanQuyen = phanQuyen;
    }
    
    
}
