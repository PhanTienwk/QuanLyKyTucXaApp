package dao;

import Connector.KetNoiSQL;
import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.HoaDonPhong;

public class HoaDonPhongDAO {

    public HoaDonPhongDAO() {

    }

    public List<HoaDonPhong> getAllHoaDonPhong() {
        List<HoaDonPhong> list = new ArrayList<>();

        try {
            Connection conn = KetNoiSQL.getConnection();
            String sql = "select * from hoadonphong order by ngayThang desc";
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                HoaDonPhong hdphong = new HoaDonPhong();
                hdphong.setNgayThang(rs.getDate("ngayThang"));
                hdphong.setMaPhong(rs.getString("maPhong"));
                hdphong.setSoNuocTieuThu(rs.getFloat("soNuocTieuThu"));
                hdphong.setSoDienTieuThu(rs.getFloat("soDienTieuThu"));
                hdphong.setTongTien(rs.getDouble("tongTien"));
                hdphong.setTrangThai(rs.getByte("trangThai"));
                list.add(hdphong);
            }
            conn.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return list;
    }
    
    public List<HoaDonPhong> getAllHoaDonPhongTheoMaPhong(String maPhong,String ngaybd,String ngaykt) {
        List<HoaDonPhong> list = new ArrayList<>();
        try {
            Connection conn = KetNoiSQL.getConnection();
            String sql = "select * from hoadonphong where maPhong='"+maPhong+"' and  ngayThang >= '"+ngaybd+"' and ngayThang <= '"+ngaykt+"' order by ngayThang desc";
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                HoaDonPhong hdphong = new HoaDonPhong();
                hdphong.setNgayThang(rs.getDate("ngayThang"));
                hdphong.setMaPhong(rs.getString("maPhong"));
                hdphong.setSoNuocTieuThu(rs.getFloat("soNuocTieuThu"));
                hdphong.setSoDienTieuThu(rs.getFloat("soDienTieuThu"));
                hdphong.setTongTien(rs.getDouble("tongTien"));
                hdphong.setTrangThai(rs.getByte("trangThai"));
                list.add(hdphong);
            }
            conn.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return list;
    }

    public List<HoaDonPhong> searchHoaDonPhong(String tungay, String denngay, byte trangthai, String maphong) {
        List<HoaDonPhong> list = new ArrayList<>();
        Connection conn = KetNoiSQL.getConnection();
        String sql = "select * from hoadonphong where ngayThang >= ? and ngayThang <= ? and trangThai = ? and maPhong = ? order by ngayThang desc";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, tungay);
            ps.setString(2, denngay);
            ps.setByte(3, trangthai);
            ps.setString(4, maphong);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                HoaDonPhong hdphong = new HoaDonPhong();
                hdphong.setNgayThang(rs.getDate("ngayThang"));
                hdphong.setMaPhong(rs.getString("maPhong"));
                hdphong.setSoNuocTieuThu(rs.getFloat("soNuocTieuThu"));
                hdphong.setSoDienTieuThu(rs.getFloat("soDienTieuThu"));
                hdphong.setTongTien(rs.getDouble("tongTien"));
                hdphong.setTrangThai(rs.getByte("trangThai"));
                list.add(hdphong);
            }

            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }

    public List<HoaDonPhong> searchHoaDonPhongAll(String tungay, String denngay, byte trangthai) {
        List<HoaDonPhong> list = new ArrayList<>();
        Connection conn = KetNoiSQL.getConnection();
        String sql = "select * from hoadonphong where ngayThang >= ? and ngayThang <= ? and trangThai = ? order by ngayThang desc";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, tungay);
            ps.setString(2, denngay);
            ps.setByte(3, trangthai);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                HoaDonPhong hdphong = new HoaDonPhong();
                hdphong.setNgayThang(rs.getDate("ngayThang"));
                hdphong.setMaPhong(rs.getString("maPhong"));
                hdphong.setSoNuocTieuThu(rs.getFloat("soNuocTieuThu"));
                hdphong.setSoDienTieuThu(rs.getFloat("soDienTieuThu"));
                hdphong.setTongTien(rs.getDouble("tongTien"));
                hdphong.setTrangThai(rs.getByte("trangThai"));
                list.add(hdphong);
            }
            ps.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }

}
