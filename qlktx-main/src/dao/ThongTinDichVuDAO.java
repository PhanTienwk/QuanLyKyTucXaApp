/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import Connector.KetNoiSQL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import model.ThongTinDichVu;
import model.ThongTinHoaDonSV;

/**
 *
 * @author PhanTien
 */
public class ThongTinDichVuDAO {
    
    public ThongTinDichVuDAO() {
        
    }
    
    public List<ThongTinDichVu> getAllThongTinDichVu() {
        List<ThongTinDichVu> list = new ArrayList<ThongTinDichVu>();
        Connection conn = KetNoiSQL.getConnection();
        String sql = "select * from dichvuphong order by ngayThang desc";
        try {
            
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                ThongTinDichVu dichvu = new ThongTinDichVu();
                dichvu.setNgayThang(rs.getDate("ngayThang"));
                dichvu.setMaPhong(rs.getString("maPhong"));
                dichvu.setSoDienCu(rs.getFloat("soDienCu"));
                dichvu.setSoDienMoi(rs.getFloat("soDienMoi"));
                dichvu.setSoNuocCu(rs.getFloat("soNuocCu"));
                dichvu.setSoNuocMoi(rs.getFloat("soNuocMoi"));
                list.add(dichvu);
            }
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return list;
    }
    
    public List<ThongTinDichVu> getAllThongTinSearch(String where, String text) {
        List<ThongTinDichVu> list = new ArrayList<ThongTinDichVu>();
        Connection conn = KetNoiSQL.getConnection();
        String sql = "select * from dichvuphong where " + where + " like N'%" + text + "%' order by ngayThang desc";
        try {
            
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                ThongTinDichVu dichvu = new ThongTinDichVu();
                dichvu.setNgayThang(rs.getDate("ngayThang"));
                dichvu.setMaPhong(rs.getString("maPhong"));
                dichvu.setSoDienCu(rs.getFloat("soDienCu"));
                dichvu.setSoDienMoi(rs.getFloat("soDienMoi"));
                dichvu.setSoNuocCu(rs.getFloat("soNuocCu"));
                dichvu.setSoNuocMoi(rs.getFloat("soNuocMoi"));
                list.add(dichvu);
            }
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return list;
    }
    
    
    public double SoNuocTheoPhong(String maphong,String ngayThang) {
        double soluong = 0;
        Connection con = KetNoiSQL.getConnection();
        String sql = "select * from hoadonphong where maPhong='" + maphong + "' and ngayThang='"+ngayThang+"'";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                soluong = rs.getFloat("soNuocTieuThu");
            }
            con.close();
        } catch (Exception e) {
        }
        return soluong;
    }
    
    public double SoDienTheoPhong(String maphong,String ngayThang) {
        double soluong = 0;
        Connection con = KetNoiSQL.getConnection();
        String sql = "select * from hoadonphong where maPhong='" + maphong + "' and ngayThang='"+ngayThang+"'";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                soluong = rs.getFloat("soDienTieuThu");
            }
            con.close();
        } catch (Exception e) {
        }
        return soluong;
    }
    
    public double SoTienDichVuTheoPhong(String maphong,String ngayThang) {
        double soluong = 0;
        Connection con = KetNoiSQL.getConnection();
        String sql = "select * from hoadonphong where maPhong='" + maphong + "' and ngayThang='"+ngayThang+"'";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                soluong = rs.getFloat("tongTien");
            }
            con.close();
        } catch (Exception e) {
        }
        return soluong;
    }
    
}
