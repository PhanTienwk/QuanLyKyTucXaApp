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
import model.ThongTinHoaDon;
import model.ThongTinHoaDonSV;

/**
 *
 * @author PhanTien
 */
public class ThongTinHoaDonDAO {

    public List<ThongTinHoaDonSV> getAllThongTinHoaDonSV() {
        List<ThongTinHoaDonSV> list = new ArrayList<ThongTinHoaDonSV>();
        Connection conn = KetNoiSQL.getConnection();
        String sql = "select * from hoadonsv order by ngayThang desc";
        try {

            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                ThongTinHoaDonSV hdsv = new ThongTinHoaDonSV();
                hdsv.setNgayThang(rs.getDate("ngayThang"));
                hdsv.setMaSV(rs.getString("maSV"));
                hdsv.setTienThanhToan(rs.getDouble("tienThanhToan"));
                hdsv.setTrangThai(rs.getByte("trangThai"));
                list.add(hdsv);
            }
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }

    public List<ThongTinHoaDonSV> getAllThongTinHoaDonSVChuaTT() {
        List<ThongTinHoaDonSV> list = new ArrayList<ThongTinHoaDonSV>();
        Connection conn = KetNoiSQL.getConnection();
        String sql = "select * from HoaDonSV where thanhToan='0'";
        try {

            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                ThongTinHoaDonSV hdsv = new ThongTinHoaDonSV();
                hdsv.setNgayThang(rs.getDate("ngayThang"));
                hdsv.setMaSV(rs.getString("maSV"));
                hdsv.setTienThanhToan(rs.getDouble("tienThanhToan"));
                hdsv.setTrangThai(rs.getByte("trangThai"));
                list.add(hdsv);
            }
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }

    public List<ThongTinHoaDonSV> getAllThongTinHoaDonSVTheoMaSV(String masv) {
        List<ThongTinHoaDonSV> list = new ArrayList<ThongTinHoaDonSV>();
        Connection conn = KetNoiSQL.getConnection();
        String sql = "select * from hoadonsv where maSV='" + masv + "'";
        try {

            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                ThongTinHoaDonSV hdsv = new ThongTinHoaDonSV();
                hdsv.setNgayThang(rs.getDate("ngayThang"));
                hdsv.setMaSV(rs.getString("maSV"));
                hdsv.setTienThanhToan(rs.getDouble("tienThanhToan"));
                hdsv.setTrangThai(rs.getByte("trangThai"));
                list.add(hdsv);
            }
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }

    public double TongTienHoaDon(int thanhtoan) {
        double soluong = 0;
        Connection con = KetNoiSQL.getConnection();
        String sql = "select sum(tienPhi) as soluong from HoaDonSV where thanhToan='" + thanhtoan + "'";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                soluong = rs.getDouble("soluong");
            }
            con.close();
        } catch (Exception e) {
        }
        return soluong;
    }

    public double TongSoDichVu(String dichvu) {

        double soluong = 0;
        Connection con = KetNoiSQL.getConnection();
        String sql = "select sum(" + dichvu + ") as soluong from HoaDonSV";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                soluong = rs.getDouble("soluong");
            }
            con.close();
        } catch (Exception e) {
        }
        return soluong;
    }

    public double SoNuocTheoPhong(String maphong) {
        double soluong = 0;
        Connection con = KetNoiSQL.getConnection();
        String sql = "select * from HoaDonSV where maPhong='" + maphong + "'";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                soluong = rs.getFloat("soNuocMoi") - rs.getFloat("soNuocCu");
            }
            con.close();
        } catch (Exception e) {
        }
        return soluong;
    }

    public double SoDienTheoPhong(String maphong) {
        double soluong = 0;
        Connection con = KetNoiSQL.getConnection();
        String sql = "select * from HoaDonSV where maPhong='" + maphong + "'";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                soluong = rs.getFloat("soDienMoi") - rs.getFloat("soDienCu");
            }
            con.close();
        } catch (Exception e) {
        }
        return soluong;
    }

    public List<ThongTinHoaDonSV> searchHoaDonSVAll(String tungay, String denngay, byte trangthai) {
        List<ThongTinHoaDonSV> list = new ArrayList<>();
        Connection conn = KetNoiSQL.getConnection();
        String sql = "select * from hoadonsv where ngayThang >= ? and ngayThang <= ? and trangThai = ? order by ngayThang desc";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, tungay);
            ps.setString(2, denngay);
            ps.setByte(3, trangthai);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                ThongTinHoaDonSV hdsv = new ThongTinHoaDonSV();
                hdsv.setNgayThang(rs.getDate("ngayThang"));
                hdsv.setMaSV(rs.getString("maSV"));
                hdsv.setTienThanhToan(rs.getDouble("tienThanhToan"));
                hdsv.setTrangThai(rs.getByte("trangThai"));
                list.add(hdsv);
            }
            ps.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }

    public List<ThongTinHoaDonSV> searchHoaDonSV(String tungay, String denngay, byte trangthai, String masv) {
        List<ThongTinHoaDonSV> list = new ArrayList<>();
        Connection conn = KetNoiSQL.getConnection();
        String sql = "select * from hoadonsv where ngayThang >= ? and ngayThang <= ? and trangThai = ? and maSV = ? order by ngayThang desc";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, tungay);
            ps.setString(2, denngay);
            ps.setByte(3, trangthai);
            ps.setString(4, masv);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                ThongTinHoaDonSV hdsv = new ThongTinHoaDonSV();
                hdsv.setNgayThang(rs.getDate("ngayThang"));
                hdsv.setMaSV(rs.getString("maSV"));
                hdsv.setTienThanhToan(rs.getDouble("tienThanhToan"));
                hdsv.setTrangThai(rs.getByte("trangThai"));
                list.add(hdsv);
            }

            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }

    public boolean KiemTraHoaDonSV(String masv, String ngayThang) {
        boolean kiemtra = false;
        Connection conn = KetNoiSQL.getConnection();
        String sql = "select * from hoadonsv where ngayThang = ? and maSV =?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, ngayThang);
            ps.setString(2, masv);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                kiemtra = true;
            }

            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return kiemtra;
    }

}
