/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;

/**
 *
 * @author huuzinhh
 */
public class HopDongKTX {
    private String maSV;
    private String maPhong;
    private Date ngayHDBD;
    private Date ngayHDKT; 

    public HopDongKTX() {
    }

    public HopDongKTX(String maSV, String maPhong, Date ngayHDBD, Date ngayHDKT) {
        this.maSV = maSV;
        this.maPhong = maPhong;
        this.ngayHDBD = ngayHDBD;
        this.ngayHDKT = ngayHDKT;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getMaPhong() {
        return maPhong;
    }

    public void setMaPhong(String maPhong) {
        this.maPhong = maPhong;
    }

    public Date getNgayHDBD() {
        return ngayHDBD;
    }

    public void setNgayHDBD(Date ngayHDBD) {
        this.ngayHDBD = ngayHDBD;
    }

    public Date getNgayHDKT() {
        return ngayHDKT;
    }

    public void setNgayHDKT(Date ngayHDKT) {
        this.ngayHDKT = ngayHDKT;
    }
    
}
