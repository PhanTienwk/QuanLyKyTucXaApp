/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import Connector.KetNoiSQL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import model.ThongTinGiaHan;

/**
 *
 * @author huuzinhh
 */
public class GiaHanDAO {

    public List<ThongTinGiaHan> getAllThongTinGiaHan() {
        List<ThongTinGiaHan> list = new ArrayList<ThongTinGiaHan>();
        Connection conn = KetNoiSQL.getConnection();
        String sql = "select * from GiaHan";
        try {
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                ThongTinGiaHan gh = new ThongTinGiaHan();
                gh.setMaSV(rs.getString("maSV"));
                gh.setNgayHDKT(rs.getDate("ngayKTHD"));
                gh.setThoiGianGiaHan(rs.getInt("thoiGianGH"));
                gh.setTrangThai(rs.getInt("trangThai"));
                list.add(gh);
            }
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }     
         public List<ThongTinGiaHan> getAllThongTinChuyenPhongSearch(String where, String text) {
        List<ThongTinGiaHan> listPhong = new ArrayList<ThongTinGiaHan>();
        Connection conn = KetNoiSQL.getConnection();
        String sql = "select * from GiaHan where " + where + " like N'%" + text + "%'";
        try {

            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                ThongTinGiaHan cphong = new ThongTinGiaHan();
                cphong.setMaSV(rs.getString("maSV"));
                cphong.setNgayHDKT(rs.getDate("ngayKTHD"));
                cphong.setThoiGianGiaHan( rs.getInt("thoiGianGH"));
                cphong.setTrangThai(rs.getInt("trangThai"));                
                listPhong.add(cphong);
            }
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return listPhong;
    }  
         public ThongTinGiaHan getAllThongTinGiaHanTheoMaSV(String msv){
             ThongTinGiaHan gh = new ThongTinGiaHan();
        Connection conn = KetNoiSQL.getConnection();
        String sql = "select * from GiaHan where maSV='" + msv +"' ";
        try {
            
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                gh.setMaSV(rs.getString("maSV"));
                gh.setNgayHDKT(rs.getDate("ngayKTHD"));
                gh.setThoiGianGiaHan( rs.getInt("thoiGianGH"));
                gh.setTrangThai(rs.getInt("trangThai"));
            }
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return gh;     
     }     
               public boolean KiemTraMaSV(String masv) {
        ThongTinGiaHan gh = new ThongTinGiaHan();
        Connection conn = KetNoiSQL.getConnection();
        String sql = "select * from GiaHan where maSV ='" + masv + "'";
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
