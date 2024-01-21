package dao;

import Connector.KetNoiSQL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import model.ThongTinNhanVien;
import model.ThongTinPhong;

public class QuanLyNhanVienDAO {

    public List<ThongTinNhanVien> getAllThongTinNV() {
        List<ThongTinNhanVien> listNhanVien = new ArrayList<ThongTinNhanVien>();
        Connection conn = KetNoiSQL.getConnection();
        String sql = "select * from NhanVien";
        try {
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                ThongTinNhanVien nv = new ThongTinNhanVien();
                nv.setTenNV(rs.getString("tenNV"));
                nv.setCCCD(rs.getString("CCCD"));
                nv.setGioiTinh(rs.getString("gioiTinh"));
                nv.setNgaySinh(rs.getDate("ngaySinh"));
                nv.setEmail(rs.getString("email"));
                nv.setSoDienThoai(rs.getString("soDienThoai"));
                nv.setQueQuan(rs.getString("queQuan"));
                nv.setChucVu(rs.getString("chucVu"));
                nv.setTrangThai(rs.getString("trangThai"));
                listNhanVien.add(nv);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listNhanVien;
    }

    public List<ThongTinNhanVien> getAllThongTinNVSearch(String where, String text) {
        List<ThongTinNhanVien> listNhanVien = new ArrayList<ThongTinNhanVien>();
        Connection conn = KetNoiSQL.getConnection();
        String sql = "select * from NhanVien where " + where + " like N'%" + text + "%'";
        try {

            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                ThongTinNhanVien nv = new ThongTinNhanVien();
                nv.setTenNV(rs.getString("tenNV"));
                nv.setCCCD(rs.getString("CCCD"));
                nv.setGioiTinh(rs.getString("gioiTinh"));
                nv.setNgaySinh(rs.getDate("ngaySinh"));
                nv.setSoDienThoai(rs.getString("soDienThoai"));
                nv.setChucVu(rs.getString("chucVu"));
                nv.setTrangThai(rs.getString("trangThai"));
                //nv.setEmail(rs.getString("email"));
                //nv.setTenDangNhap(rs.getString("tenDangNhap"));
                
                //nv.setQueQuan(rs.getString("queQuan"));
                listNhanVien.add(nv);
            }
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listNhanVien;
    }
    
    
    
    
    public ThongTinNhanVien getAllThongTinNVTheoTenDN(String tendn) {
        ThongTinNhanVien nv = new ThongTinNhanVien();
        Connection conn = KetNoiSQL.getConnection();
        String sql = "select * from NhanVien where tenDangNhap='" + tendn + "'";
        try {

            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                nv.setTenNV(rs.getString("tenNV"));
                nv.setCCCD(rs.getString("CCCD"));
                nv.setGioiTinh(rs.getString("gioiTinh"));
                nv.setNgaySinh(rs.getDate("ngaySinh"));
                nv.setEmail(rs.getString("email"));
                nv.setTenDangNhap(rs.getString("tenDangNhap"));
                nv.setSoDienThoai(rs.getString("soDienThoai"));
                nv.setQueQuan(rs.getString("queQuan"));
                nv.setChucVu(rs.getString("chucVu"));
                nv.setTrangThai(rs.getString("trangThai"));
            }
            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return nv;
    }
    
    public ThongTinNhanVien getAllThongTinNVTheoEmail(String email) {
        ThongTinNhanVien nv = new ThongTinNhanVien();
        Connection conn = KetNoiSQL.getConnection();
        String sql = "select * from NhanVien where email='" + email + "'";
        try {

            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                nv.setTenNV(rs.getString("tenNV"));
                nv.setCCCD(rs.getString("CCCD"));
                nv.setGioiTinh(rs.getString("gioiTinh"));
                nv.setNgaySinh(rs.getDate("ngaySinh"));
                nv.setEmail(rs.getString("email"));
                nv.setSoDienThoai(rs.getString("soDienThoai"));
                nv.setQueQuan(rs.getString("queQuan"));
                nv.setChucVu(rs.getString("chucVu"));
                nv.setTrangThai(rs.getString("trangThai"));
            }
            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return nv;
    }


    public boolean KiemTraCCCDNV(String cccd) {
        ThongTinNhanVien sv = new ThongTinNhanVien();
        Connection conn = KetNoiSQL.getConnection();
        String sql = "select * from NhanVien where CCCD ='" + cccd + "'";
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

    public boolean KiemTraEmailNV(String email) {
        ThongTinNhanVien sv = new ThongTinNhanVien();
        Connection conn = KetNoiSQL.getConnection();
        String sql = "select * from NhanVien where email ='" + email + "'";
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

    public boolean KiemTraSDTNV(String sodienthoai) {
        ThongTinNhanVien sv = new ThongTinNhanVien();
        Connection conn = KetNoiSQL.getConnection();
        String sql = "select * from NhanVien where soDienThoai ='" + sodienthoai + "'";
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

    public ThongTinNhanVien getAllThongTinNVTheoemail(String email) {
        ThongTinNhanVien sv = new ThongTinNhanVien();
        Connection conn = KetNoiSQL.getConnection();
        String sql = "select * from NhanVien where email ='" + email + "'";
        try {
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                sv.setTenNV(rs.getString("tenNV"));
                sv.setCCCD(rs.getString("CCCD"));
                sv.setGioiTinh(rs.getString("gioiTinh"));
                sv.setNgaySinh(rs.getDate("ngaySinh"));
                sv.setEmail(rs.getString("email"));
                sv.setSoDienThoai(rs.getString("soDienThoai"));
                sv.setQueQuan(rs.getString("queQuan"));
                sv.setChucVu(rs.getString("chucVu"));
                sv.setTrangThai(rs.getString("trangThai"));
            }
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return sv;
    }

    
    public boolean UpKiemTraEmailNV(String email,String test) {
        ThongTinNhanVien sv = new ThongTinNhanVien();
        Connection conn = KetNoiSQL.getConnection();
        String sql = "select * from NhanVien where email ='" + email + "'";
        try {

            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                 if (!test.equals(email)) {
                    return true;
                }
            }
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return false;

    }

    public boolean UpKiemTraCCCDNV(String cccd,String test) {
        ThongTinNhanVien nv = new ThongTinNhanVien();
        Connection conn = KetNoiSQL.getConnection();
        String sql = "select * from NhanVien where CCCD ='" + cccd + "'";
        try {

            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                 if (!test.equals(cccd)) {
                    return true;
                }
            }
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return false;

    }

    public boolean UpKiemTraSDTNV(String sodienthoai,String test) {
        ThongTinNhanVien sv = new ThongTinNhanVien();
        Connection conn = KetNoiSQL.getConnection();
        String sql = "select * from NhanVien where soDienThoai ='" + sodienthoai + "'";
        try {

            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                if (!test.equals(sodienthoai)) {
                    return true;
                }
            }
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return false;

    }
    
    
   
    
}
