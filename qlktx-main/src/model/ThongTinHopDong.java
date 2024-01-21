/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;

/**
 *
 * @author DELL
 */
public class ThongTinHopDong {
    private String maphong;
    private String masv;
    private Date ngayLapHopDong;
    private Date ngayHDBD;
    private Date ngayHDKT;

    public String getMaphong() {
        return maphong;
    }

    public String getMasv() {
        return masv;
    }

    public Date getNgayLapHopDong() {
        return ngayLapHopDong;
    }

    public Date getNgayHDBD() {
        return ngayHDBD;
    }

    public Date getNgayHDKT() {
        return ngayHDKT;
    }

    public void setMaphong(String maphong) {
        this.maphong = maphong;
    }

    public void setMasv(String masv) {
        this.masv = masv;
    }

    public void setNgayLapHopDong(Date ngayLapHopDong) {
        this.ngayLapHopDong = ngayLapHopDong;
    }

    public void setNgayHDBD(Date ngayHDBD) {
        this.ngayHDBD = ngayHDBD;
    }

    public void setNgayHDKT(Date ngayHDKT) {
        this.ngayHDKT = ngayHDKT;
    }
    
    
}
