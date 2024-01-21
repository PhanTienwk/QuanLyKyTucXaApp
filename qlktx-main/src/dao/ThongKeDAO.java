package dao;

import Connector.KetNoiSQL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Phan Tien
 */
public class ThongKeDAO {

    public int SoLuongSVTheoTrangThai(int trangThai) {
        int soluongsv = 0;
        Connection con = KetNoiSQL.getConnection();
        String sql = "select count(*) as soluongSV from SinhVien where trangThai=" + trangThai;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                soluongsv = rs.getInt("soluongSV");
            }
            ps.close();
            con.close();
        } catch (Exception e) {
        }
        return soluongsv;
    }

    public int SoLuongSVTheoGioiTinh(String gioitinh) {
        int soluongsv = 0;
        Connection con = KetNoiSQL.getConnection();
        String sql = "select count(*) as soluongSV from SinhVien where gioiTinh='" + gioitinh + "'";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                soluongsv = rs.getInt("soluongSV");
            }
            ps.close();
            con.close();
        } catch (Exception e) {
        }
        return soluongsv;
    }

    public int SoLuongPhongTheoGioiTinh(String gioitinh) {
        int soluong = 0;
        Connection con = KetNoiSQL.getConnection();
        String sql = "select count(*) as soluongSV from phong where gioiTinh='" + gioitinh + "'";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                soluong = rs.getInt("soluongSV");
            }
            con.close();
        } catch (Exception e) {
        }
        return soluong;
    }

    public int SoLuongSVKTX() {
        int soluongsv = 0;
        Connection con = KetNoiSQL.getConnection();
        String sql = "select count(*) as soluongSV from SinhVien";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                soluongsv = rs.getInt("soluongSV");
            }
            ps.close();
            con.close();
        } catch (Exception e) {
        }
        return soluongsv;
    }

    public int SoLuongPhong() {
        int soluongsv = 0;
        Connection con = KetNoiSQL.getConnection();
        String sql = "select count(*) as soluongSV from Phong";
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

    public int SoLuongPhong(String gioitinh) {
        int soluongsv = 0;
        Connection con = KetNoiSQL.getConnection();
        String sql = "select count(*) as soluongSV from Phong where gioiTinh='" + gioitinh + "'";
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

    public int SoLuongNV() {
        int soluongsv = 0;
        Connection con = KetNoiSQL.getConnection();
        String sql = "select count(*) as soluongSV from nhanvien";
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

    public int SoLuongNV(String gioitinh) {
        int soluongsv = 0;
        Connection con = KetNoiSQL.getConnection();
        String sql = "select count(*) as soluongSV from nhanvien where gioiTinh='" + gioitinh + "'";
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
    
    public int SoLuongNVTrangThai(String trangthai) {
        int soluongsv = 0;
        Connection con = KetNoiSQL.getConnection();
        String sql = "select count(*) as soluongSV from nhanvien where trangThai='" + trangthai + "'";
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
    
    
}
