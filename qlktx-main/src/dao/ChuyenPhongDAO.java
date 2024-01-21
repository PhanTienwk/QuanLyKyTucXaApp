/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import Connector.KetNoiSQL;
import model.ChuyenPhong;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class ChuyenPhongDAO {

    public List<ChuyenPhong> getAllThongTinChuyenPhong() {
        List<ChuyenPhong> listPhong = new ArrayList<ChuyenPhong>();
        Connection conn = KetNoiSQL.getConnection();
        String sql = "select * from ChuyenPhong";
        try {

            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                ChuyenPhong cphong = new ChuyenPhong();
                cphong.setMaSV(rs.getString("maSV"));
                cphong.setMaPhongHT(rs.getString("maPhongHT"));
                cphong.setMaPhongChuyen(rs.getString("maPhongChuyen"));
                cphong.setLyDoChuyen(rs.getString("lyDoChuyen"));
                cphong.setTrangThai(rs.getInt("trangThai"));
                listPhong.add(cphong);
            }
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return listPhong;
    } 
     public List<ChuyenPhong> getAllThongTinChuyenPhongSearch(String where, String text) {
        List<ChuyenPhong> listPhong = new ArrayList<ChuyenPhong>();
        Connection conn = KetNoiSQL.getConnection();
        String sql = "select * from ChuyenPhong where " + where + " like N'%" + text + "%'";
        try {

            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                ChuyenPhong cphong = new ChuyenPhong();
                cphong.setMaSV(rs.getString("maSV"));
                cphong.setMaPhongHT(rs.getString("maPhongHT"));
                cphong.setMaPhongChuyen( rs.getString("maPhongChuyen"));
                cphong.setLyDoChuyen(rs.getString("lyDoChuyen"));
                cphong.setTrangThai(rs.getInt("trangThai"));                
                listPhong.add(cphong);
            }
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return listPhong;
    }  

     public ChuyenPhong getAllThongTinChuyenPhongTheoMaSV(String msv){
            ChuyenPhong cphong = new ChuyenPhong();
        Connection conn = KetNoiSQL.getConnection();
        String sql = "select * from ChuyenPhong where MaSV='" + msv +"' ";
        try {

            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                cphong.setMaSV(rs.getString("maSV"));
                cphong.setMaPhongHT(rs.getString("maPhongHT"));
                cphong.setMaPhongChuyen( rs.getString("maPhongChuyen"));
                cphong.setLyDoChuyen(rs.getString("lyDoChuyen"));
                cphong.setTrangThai(rs.getInt("trangThai"));
            }
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return cphong;     
     }

     
         public boolean KiemTraMaSV(String masv) {
       ChuyenPhong sv = new ChuyenPhong();
        Connection conn = KetNoiSQL.getConnection();
        String sql = "select * from ChuyenPhong where maSV ='" + masv + "'";
        try {

            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                return true;
            }
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return false;

    }
}
