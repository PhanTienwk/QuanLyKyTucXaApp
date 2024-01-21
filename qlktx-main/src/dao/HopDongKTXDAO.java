/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import Connector.KetNoiSQL;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import model.ThongTinHopDong;
import model.ThongTinSinhVien;

/**
 *
 * @author DELL
 */
public class HopDongKTXDAO {

    public List<ThongTinHopDong> getallHopDong() {
        List<ThongTinHopDong> listhd = new ArrayList<>();
        // Date date=new Date();
        Connection con = KetNoiSQL.getConnection();
        String sql = "select * from HopDongKTX";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            // ps.setDate(1, new java.sql.Date (date.getTime()));
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                ThongTinHopDong tthd = new ThongTinHopDong();
                tthd.setMasv(rs.getString("maSV"));
                tthd.setMaphong(rs.getString("maPhong"));
                tthd.setNgayHDBD(rs.getDate("ngayHDBD"));
                tthd.setNgayHDKT(rs.getDate("ngayHDKT"));
                listhd.add(tthd);

            }
            ps.close();
            con.close();
        } catch (SQLException ex) {

        }
        return listhd;
    }

    public List<ThongTinHopDong> getallHopDong1() {
        List<ThongTinHopDong> listhd = new ArrayList<>();
        Date date = new Date();
        Connection con = KetNoiSQL.getConnection();
        String sql = "select * from HopDongKTX where ngayHDKT>?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setDate(1, new java.sql.Date(date.getTime()));
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                ThongTinHopDong tthd = new ThongTinHopDong();
                tthd.setMasv(rs.getString("maSV"));
                tthd.setMaphong(rs.getString("maPhong"));
                tthd.setNgayHDBD(rs.getDate("ngayHDBD"));
                tthd.setNgayHDKT(rs.getDate("ngayHDKT"));
                listhd.add(tthd);

            }
            ps.close();
            con.close();
        } catch (SQLException ex) {

        }
        return listhd;
    }

    public List<ThongTinHopDong> getallHopDong2() {
        List<ThongTinHopDong> listhd = new ArrayList<>();
        Date date = new Date();
        Connection con = KetNoiSQL.getConnection();
        String sql = "select * from HopDongKTX where ngayHDKT<?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setDate(1, new java.sql.Date(date.getTime()));
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                ThongTinHopDong tthd = new ThongTinHopDong();
                tthd.setMasv(rs.getString("maSV"));
                tthd.setMaphong(rs.getString("maPhong"));
                tthd.setNgayHDBD(rs.getDate("ngayHDBD"));
                tthd.setNgayHDKT(rs.getDate("ngayHDKT"));
                listhd.add(tthd);

            }
            ps.close();
            con.close();
        } catch (SQLException ex) {

        }
        return listhd;
    }

    public List<ThongTinHopDong> getallHopDongmasv(String where, String text, int k) {
        List<ThongTinHopDong> listhd = new ArrayList<>();
        Date date = new Date();
        Connection con = KetNoiSQL.getConnection();
        String sql = "";
        if (k == 0) {
            sql = "select * from HopDongKTX where maSV like ?";
        } else if (k == 1) {
            sql = "select * from HopDongKTX where ngayHDKT>? and maSV like ?";
        } else if (k == 2) {
            sql = "select * from HopDongKTX where ngayHDKT<? and maSV like ?";
        }

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            if (k == 1 || k == 2) {
                ps.setDate(1, new java.sql.Date(date.getTime()));
                ps.setString(2, "%" + text + "%");
            } else {
                ps.setString(1, "%" + text + "%");
            }

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {

                ThongTinHopDong tthd = new ThongTinHopDong();
                tthd.setMasv(rs.getString("maSV"));
                tthd.setMaphong(rs.getString("maPhong"));
                tthd.setNgayHDBD(rs.getDate("ngayHDBD"));
                tthd.setNgayHDKT(rs.getDate("ngayHDKT"));
                listhd.add(tthd);

            }
            ps.close();
            con.close();
        } catch (SQLException ex) {

        }
        return listhd;
    }

    public List<ThongTinHopDong> getallHopDongtensv(String where, String text, int k) {
        List<ThongTinHopDong> listhd = new ArrayList<>();
        Date date = new Date();
        Connection con = KetNoiSQL.getConnection();
        String sql = "";
        if (k == 0) {
            sql = "select * from HopDongKTX hd join SinhVien sv on hd.maSV=sv.maSV where " + where + " like ?";
        } else if (k == 1) {
            sql = "select * from HopDongKTX hd join SinhVien sv on hd.maSV=sv.maSV where ngayHDKT>? and " + where + " like ?";
        } else if (k == 2) {
            sql = "select * from HopDongKTX hd join SinhVien sv on hd.maSV=sv.maSV where ngayHDKT<? and " + where + " like ?";
        }

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            if (k == 1 || k == 2) {
                ps.setDate(1, new java.sql.Date(date.getTime()));
                ps.setString(2, "%" + text + "%");
            } else {
                ps.setString(1, "%" + text + "%");
            }

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                ThongTinHopDong tthd = new ThongTinHopDong();
                tthd.setMasv(rs.getString("maSV"));
                tthd.setMaphong(rs.getString("maPhong"));
                tthd.setNgayHDBD(rs.getDate("ngayHDBD"));
                tthd.setNgayHDKT(rs.getDate("ngayHDKT"));
                listhd.add(tthd);

            }
            ps.close();
            con.close();
        } catch (SQLException ex) {

        }
        return listhd;
    }

    public String laymaPhongtumaSV(String masv) {
        String k = "";
        String sql = "select * from HopDongKTX where maSV='" + masv + "'";
        Connection con = KetNoiSQL.getConnection();
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                k = rs.getString("maPhong");
            }
            ps.close();
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(SinhVienDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return k;
    }

    public String LayNgayBDTuMaSV(String masv) {
        SimpleDateFormat formatter1 = new SimpleDateFormat("MM/yyyy");
        Date ngay = null;
        String sql = "select * from HopDongKTX where maSV='" + masv + "'";
        Connection con = KetNoiSQL.getConnection();
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                ngay = rs.getDate("ngayHDBD");
            }
            ps.close();
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(SinhVienDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return formatter1.format(ngay);
    }

    public String LayNgayKTTuMaSV(String masv) {
        SimpleDateFormat formatter1 = new SimpleDateFormat("MM/yyyy");
        Date ngay = null;
        String sql = "select * from HopDongKTX where maSV='" + masv + "'";
        Connection con = KetNoiSQL.getConnection();
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                ngay = rs.getDate("ngayHDKT");
            }
            ps.close();
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(SinhVienDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return formatter1.format(ngay);
    }

     public void updateHopDongKTX(String masv, String maPhong, Date ngayHDKT,Date ngayHDBD) {
        Connection con = KetNoiSQL.getConnection();
        String sql = "update HopDongKTX set maPhong=?,ngayHDKT=?,ngayHDBD=? where maSV='" + masv + "'";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, maPhong);
            ps.setDate(2, new java.sql.Date(ngayHDKT.getTime()));
            ps.setDate(3, new java.sql.Date(ngayHDBD.getTime()));
            ps.executeUpdate();
            ps.close();
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(SinhVienDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void deleteDangkyPhong(String masv) {
        Connection conn = KetNoiSQL.getConnection();
        String sql = "delete from DangKyPhong where maSV=?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, masv);
            ps.executeUpdate();
            conn.close();
        } catch (SQLException ex) {
        }
    }

    public List<ThongTinHopDong> getallHopDong3() {
        List<ThongTinHopDong> listhd = new ArrayList<>();
        Date date = new Date();
        Connection con = KetNoiSQL.getConnection();
        String sql = "select * from HopDongKTX where ngayHDKT=null";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                if (rs.getDate("ngayHDBD") != null && rs.getDate("ngayHDKT") != null) {
                    ThongTinHopDong tthd = new ThongTinHopDong();
                    tthd.setMasv(rs.getString("maSV"));
                    tthd.setMaphong(rs.getString("maPhong"));
                    tthd.setNgayHDBD(rs.getDate("ngayHDBD"));
                    tthd.setNgayHDKT(rs.getDate("ngayHDKT"));
                    listhd.add(tthd);

                }
            }
            ps.close();
            con.close();
        } catch (SQLException ex) {

        }
        return listhd;
    }

    public Date layNgayHDBDtuDangKYPhong(String masv) {

        Date date = null;
        String sql = "select * from DangKyPhong where maSV='" + masv + "'";
        Connection con = KetNoiSQL.getConnection();
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                date = rs.getDate("ngayHDBD");
            }
            ps.close();
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(SinhVienDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return date;
    }

    public Date layNgayHDKTtuDangKYPhong(String masv) {

        Date date = null;
        String sql = "select * from DangKyPhong where maSV='" + masv + "'";
        Connection con = KetNoiSQL.getConnection();
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                date = rs.getDate("ngayHDKT");
            }
            ps.close();
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(SinhVienDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return date;
    }

    public Date layNgayHDKTTuHDKTX(String masv) {

        Date date = null;
        String sql = "select * from hopdongktx where maSV='" + masv + "'";
        Connection con = KetNoiSQL.getConnection();
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                date = rs.getDate("ngayHDKT");
            }
            ps.close();
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(SinhVienDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return date;
    }

    public List<String> LayMaSinhVienChuaCoHopDong() {
        List<String> listmasv = new ArrayList<>();
        Connection con = KetNoiSQL.getConnection();
        String sql = "Select * from SinhVien where trangThai=1 or trangThai=0";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                listmasv.add(rs.getString("maSV"));
            }
            ps.close();
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(HopDongKTXDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listmasv;
    }

    public ThongTinSinhVien getAllThongTinSVchuadangky(String masv) {
        ThongTinSinhVien sv = new ThongTinSinhVien();
        Connection conn = KetNoiSQL.getConnection();
        String sql = "select * from SinhVien where maSV='" + masv + "'";
        try {

            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {

                sv.setMaSV(rs.getString("maSV"));
                sv.setTenSV(rs.getString("tenSV"));
                sv.setCCCD(rs.getString("CCCD"));
                sv.setGioiTinh(rs.getString("gioiTinh"));
                sv.setNgaySinh(rs.getDate("ngaySinh"));
                sv.setEmail(rs.getString("email"));
                sv.setSoDienThoai(rs.getString("soDienThoai"));
                sv.setQueQuan(rs.getString("queQuan"));
                sv.setMaLop(rs.getString("maLop"));
                sv.setTrangThai(rs.getInt("trangThai"));
            }
            preparedStatement.close();
            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return sv;
    }

    public List<ThongTinSinhVien> getAllThongTinSVConHDTheoMaPhong(String ngaythang, String maphong) {
        List<ThongTinSinhVien> listsv = new ArrayList<>();
        Connection conn = KetNoiSQL.getConnection();
        String sql = "SELECT sv.maSV,sv.tenSV,sv.CCCD,sv.gioiTinh,sv.ngaySinh,sv.email,sv.soDienThoai,sv.queQuan,sv.maLop,sv.trangThai FROM sinhvien AS sv, hopdongktx AS hd WHERE sv.maSV = hd.maSV AND hd.ngayHDBD<='" + ngaythang + "' AND hd.ngayHDKT>'" + ngaythang + "' AND hd.maPhong='" + maphong + "'";
        try {

            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                ThongTinSinhVien sv = new ThongTinSinhVien();
                sv.setMaSV(rs.getString("maSV"));
                sv.setTenSV(rs.getString("tenSV"));
                sv.setCCCD(rs.getString("CCCD"));
                sv.setGioiTinh(rs.getString("gioiTinh"));
                sv.setNgaySinh(rs.getDate("ngaySinh"));
                sv.setEmail(rs.getString("email"));
                sv.setSoDienThoai(rs.getString("soDienThoai"));
                sv.setQueQuan(rs.getString("queQuan"));
                sv.setMaLop(rs.getString("maLop"));
                sv.setTrangThai(rs.getInt("trangThai"));
                listsv.add(sv);
            }
            preparedStatement.close();
            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return listsv;
    }

    public List<ThongTinSinhVien> getAllThongTinSVConHDTheoMaPhong(String ngaythang) {
        List<ThongTinSinhVien> listsv = new ArrayList<>();
        Connection conn = KetNoiSQL.getConnection();
        String sql = "SELECT sv.maSV,sv.tenSV,sv.CCCD,sv.gioiTinh,sv.ngaySinh,sv.email,sv.soDienThoai,sv.queQuan,sv.maLop,sv.trangThai FROM sinhvien AS sv, hopdongktx AS hd WHERE sv.maSV = hd.maSV AND hd.ngayHDBD<='" + ngaythang + "' AND hd.ngayHDKT>'" + ngaythang + "'";
        try {

            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                ThongTinSinhVien sv = new ThongTinSinhVien();
                sv.setMaSV(rs.getString("maSV"));
                sv.setTenSV(rs.getString("tenSV"));
                sv.setCCCD(rs.getString("CCCD"));
                sv.setGioiTinh(rs.getString("gioiTinh"));
                sv.setNgaySinh(rs.getDate("ngaySinh"));
                sv.setEmail(rs.getString("email"));
                sv.setSoDienThoai(rs.getString("soDienThoai"));
                sv.setQueQuan(rs.getString("queQuan"));
                sv.setMaLop(rs.getString("maLop"));
                sv.setTrangThai(rs.getInt("trangThai"));
                listsv.add(sv);
            }
            preparedStatement.close();
            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return listsv;
    }

    public double getTienPhongTheoMaSV(String masv) {
        double tienphong = 0;
        Connection conn = KetNoiSQL.getConnection();
        String sql = "SELECT ph.tienPhong AS tienphong FROM phong AS ph , hopdongktx AS hd , sinhvien AS sv WHERE ph.maPhong = hd.maPhong AND hd.maSV=sv.maSV AND sv.maSV='" + masv + "'";
        try {

            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                tienphong = rs.getDouble("tienphong");
            }
            preparedStatement.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return tienphong;
    }

    public ThongTinHopDong getAllThongTinHDTheoMaSV(String maSV) {
        ThongTinHopDong hd = new ThongTinHopDong();
        Connection conn = (Connection) KetNoiSQL.getConnection();
        String sql = "select * from HopDongKTX where maSV ='" + maSV + "'";
        try {
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                hd.setMasv(rs.getString("maSV"));
                hd.setMaphong(rs.getString("maPhong"));
                hd.setNgayHDBD(rs.getDate("ngayHDBD"));
                hd.setNgayHDKT(rs.getDate("ngayHDKT"));
            }
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return hd;
    }

    public String LayMPTuHD(String msv) {
        String mp = "";
        Connection conn = KetNoiSQL.getConnection();
        String sql = "select * from HopDongKTX where maSV ='" + msv + "'";
        try {

            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                mp = rs.getString("MaPhong");
            }

            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return mp;
    }
}
