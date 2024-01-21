/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import Connector.KetNoiSQL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.ThongTinTaiKhoan;

/**
 *
 * @author PhanTien
 */
public class TaiKhoanDAO {

    public List<ThongTinTaiKhoan> getAllThongTinTKSearch(String where, String text) {
        List<ThongTinTaiKhoan> listtk = new ArrayList<ThongTinTaiKhoan>();
        Connection conn = KetNoiSQL.getConnection();
        String sql = "select * from taikhoan where " + where + " like N'%" + text + "%'";
        try {

            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                ThongTinTaiKhoan tk = new ThongTinTaiKhoan();
                tk.setTenDangNhap(rs.getString("tenDangNhap"));
                tk.setMatKhau(rs.getString("matKhau"));
                tk.setEmail(rs.getString("email"));
                tk.setPhanQuyen(rs.getString("phanQuyen"));
                listtk.add(tk);
            }
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return listtk;
    }

    public ThongTinTaiKhoan getAllThongTinTKEmail(String email) {
        ThongTinTaiKhoan tk = new ThongTinTaiKhoan();
        Connection conn = KetNoiSQL.getConnection();
        String sql = "select * from taikhoan where email ='" + email + "'";
        try {

            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                tk.setTenDangNhap(rs.getString("tenDangNhap"));
                tk.setMatKhau(rs.getString("matKhau"));
                tk.setEmail(rs.getString("email"));
                tk.setPhanQuyen(rs.getString("phanQuyen"));
            }

            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return tk;
    }

    public boolean KiemTraTenDNTK(String tendangnhap) {
        ThongTinTaiKhoan tk = new ThongTinTaiKhoan();
        Connection conn = KetNoiSQL.getConnection();
        String sql = "select * from taikhoan where tenDangNhap ='" + tendangnhap + "'";
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

    public int SoLuongQL() {
        int soluongsv = 0;
        Connection con = KetNoiSQL.getConnection();
        String sql = "select count(*) as soluongSV from taikhoan where phanQuyen='Quan Ly'";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                soluongsv = rs.getInt("soluongSV");
            }
            con.close();
        } catch (Exception e) {
        }
        return soluongsv;
    }

    public String LayEmail(String tenDangNhap) {
        String email = null;
        Connection conn = KetNoiSQL.getConnection();
        String sql = "select * from taikhoan where tenDangNhap ='" + tenDangNhap + "'";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                email = rs.getString("email");
            }
            ps.close();
            conn.close();
        } catch (Exception e) {
        }
        return email;
    }

    public boolean KiemTraEmail(String email) {
        Connection conn = KetNoiSQL.getConnection();
        String sql = "select * from taikhoan where email ='" + email + "'";
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
    
    public void CapNhatEmail(String email,String text){
         Connection con = KetNoiSQL.getConnection();
        String sql = "update taikhoan set email=? where email='" + email + "'";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, text);
            ps.executeUpdate();
            ps.close();
            con.close();
        } catch (SQLException ex) {
        }
    }
    
    public void XoaTaiKhoan(String email){
        Connection con = KetNoiSQL.getConnection();
        String sql = "delete from taikhoan where email=?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, email);
            ps.executeUpdate();
            ps.close();
            con.close();
        } catch (Exception e) {
        }
    }
}
