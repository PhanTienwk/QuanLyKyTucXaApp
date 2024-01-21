package dao;

import Connector.KetNoiSQL;
import JFrameQuanLyKyTucXa.DangKyPhong;
import java.util.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import model.ThongTinSinhVien;

public class SinhVienDAO {

    public SinhVienDAO() {
    }

    public List<ThongTinSinhVien> getAllThongTinSVdaduyet() {
        List<ThongTinSinhVien> listSinhVien = new ArrayList<ThongTinSinhVien>();
        Connection conn = KetNoiSQL.getConnection();
        String sql = "select sv.*,hd.maPhong,hd.ngayHDBD from SinhVien sv join HopDongKTX hd on sv.maSV=hd.maSV where sv.trangThai=1";
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
//                sv.setMaPhong(rs.getString("maPhong"));
                sv.setNgayBDHD(rs.getDate("ngayHDBD"));
                // sv.setMaPhong(rs.getString("maPhong"));
                sv.setSoDienThoai(rs.getString("soDienThoai"));
                sv.setQueQuan(rs.getString("queQuan"));
                sv.setMaLop(rs.getString("maLop"));
                listSinhVien.add(sv);

            }
            preparedStatement.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return listSinhVien;
    }

    public List<ThongTinSinhVien> getAllThongTinSV() {
        List<ThongTinSinhVien> listSinhVien = new ArrayList<ThongTinSinhVien>();
        Connection conn = KetNoiSQL.getConnection();
        String sql = "select * from (select *,Null as maPhong from (select * from SinhVien except SELECT sv.* FROM SinhVien sv JOIN HopDongKTX hd ON sv.maSV = hd.maSV) as k union all SELECT sv.*, hd.maPhong FROM SinhVien sv JOIN HopDongKTX hd ON sv.maSV = hd.maSV) as k2";
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
//                sv.setMaPhong(rs.getString("maPhong"));
                //   sv.setNgayBDHD(rs.getDate("ngayHDBD"));
                // sv.setMaPhong(rs.getString("maPhong"));
                sv.setSoDienThoai(rs.getString("soDienThoai"));
                sv.setQueQuan(rs.getString("queQuan"));
                sv.setMaLop(rs.getString("maLop"));
                sv.setTrangThai(rs.getInt("trangThai"));
                listSinhVien.add(sv);

            }
            preparedStatement.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return listSinhVien;
    }

    public List<ThongTinSinhVien> getAllThongTinSVTrangThai(int trangthai) {
        List<ThongTinSinhVien> listSinhVien = new ArrayList<ThongTinSinhVien>();
        Connection conn = KetNoiSQL.getConnection();
        // String sql = "select * from SinhVien where trangThai='"+trangthai+"'";
        String sql = "select * from (select *,Null as maPhong from (select * from SinhVien except SELECT sv.* FROM SinhVien sv JOIN HopDongKTX hd ON sv.maSV = hd.maSV) as k union all SELECT sv.*, hd.maPhong FROM SinhVien sv JOIN HopDongKTX hd ON sv.maSV = hd.maSV) as k2 where trangThai='" + trangthai + "' ";

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
                listSinhVien.add(sv);

            }
            preparedStatement.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return listSinhVien;
    }

    public List<ThongTinSinhVien> getAllThongTinSVTheoPhong(String maPhong) {
        LocalDate datelocal = LocalDate.now();
        SimpleDateFormat formatter1 = new SimpleDateFormat("yyyy-MM-dd");
        String strdatenow = String.valueOf(datelocal);
        Date datenow = null;
        try {
            datenow = formatter1.parse(strdatenow);
        } catch (Exception e) {
        }
        String ngayht = formatter1.format(datenow);

        List<ThongTinSinhVien> listSinhVien = new ArrayList<ThongTinSinhVien>();
        Connection conn = KetNoiSQL.getConnection();
        String sql = "select * from SinhVien join HopDongKTX on SinhVien.maSV=HopDongKTX.maSV where maPhong='" + maPhong + "' and ngayHDBD<='"+ngayht+"' and ngayHDKT>'"+ngayht+"'";
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
                listSinhVien.add(sv);

            }
            preparedStatement.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return listSinhVien;
    }

    public List<ThongTinSinhVien> getAllThongTinSVSearch(String where, String text) {
        List<ThongTinSinhVien> listSinhVien = new ArrayList<ThongTinSinhVien>();
        Connection conn = KetNoiSQL.getConnection();
        String sql = "select * from SinhVien where " + where + " like N'%" + text + "%' ";
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
                // sv.setMaPhong(rs.getString("maPhong"));
                // sv.setNgayBDHD(rs.getDate("ngayHDBD"));
                // sv.setMaPhong(rs.getString("maPhong"));
                sv.setSoDienThoai(rs.getString("soDienThoai"));
                sv.setQueQuan(rs.getString("queQuan"));
                sv.setMaLop(rs.getString("maLop"));
                sv.setTrangThai(rs.getInt("trangThai"));
                listSinhVien.add(sv);

            }
            preparedStatement.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return listSinhVien;
    }

    public List<ThongTinSinhVien> getAllThongTinSVSearchTT(String where, String text, int trangthai) {
        List<ThongTinSinhVien> listSinhVien = new ArrayList<ThongTinSinhVien>();
        Connection conn = KetNoiSQL.getConnection();
        String sql = "select * from SinhVien where " + where + " like N'%" + text + "%' and trangThai='" + trangthai + "'";
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
                listSinhVien.add(sv);

            }
            preparedStatement.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return listSinhVien;
    }

    public ThongTinSinhVien getAllThongTinSVTheoemail(String email) {
        ThongTinSinhVien sv = new ThongTinSinhVien();
        Connection conn = KetNoiSQL.getConnection();
        String sql = "select * from SinhVien where email ='" + email + "'";
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
//                sv.setMaPhong(rs.getString("maPhong"));
                sv.setSoDienThoai(rs.getString("soDienThoai"));
                sv.setQueQuan(rs.getString("queQuan"));
                sv.setMaLop(rs.getString("maLop"));

            }
            preparedStatement.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return sv;
    }

    public String LayThongTinGioiTinh(String tendangnhap) {
        String gioitinh = null;
        Connection conn = KetNoiSQL.getConnection();
        String sql = "select * from SinhVien where tenDangNhap ='" + tendangnhap + "'";
        try {

            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                gioitinh = rs.getString("gioiTinh");
            }

            preparedStatement.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return gioitinh;
    }

    public boolean KiemTraMaSoSV(String masv) {
        ThongTinSinhVien sv = new ThongTinSinhVien();
        Connection conn = KetNoiSQL.getConnection();
        String sql = "select * from SinhVien where maSV ='" + masv + "'";
        try {

            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                return true;
            }
            preparedStatement.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return false;

    }

    public boolean KiemTraCCCDSV(String cccd) {
        ThongTinSinhVien sv = new ThongTinSinhVien();
        Connection conn = KetNoiSQL.getConnection();
        String sql = "select * from SinhVien where CCCD ='" + cccd + "'";
        try {

            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                return true;
            }
            preparedStatement.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return false;

    }

    public boolean KiemTraEmailSV(String email) {
        ThongTinSinhVien sv = new ThongTinSinhVien();
        Connection conn = KetNoiSQL.getConnection();
        String sql = "select * from SinhVien where email ='" + email + "'";
        try {

            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                return true;
            }
            preparedStatement.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return false;

    }

    public boolean KiemTraSDTSV(String sodienthoai) {
        ThongTinSinhVien sv = new ThongTinSinhVien();
        Connection conn = KetNoiSQL.getConnection();
        String sql = "select * from SinhVien where soDienThoai ='" + sodienthoai + "'";
        try {

            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                return true;
            }
            preparedStatement.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return false;

    }

    public boolean KiemTraTenDN(String tendangnhap) {
        Connection conn = KetNoiSQL.getConnection();
        String sql = "select * from TaiKhoan where tenDangNhap ='" + tendangnhap + "'";
        try {
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                return true;
            }
            preparedStatement.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return false;
    }

    public boolean KiemTraDK(String maSV) {
        boolean t = false;
        Connection conn = KetNoiSQL.getConnection();
        String sql = "select * from SinhVien where maSV='" + maSV + "' and trangThai=0";
        try {

            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                t = true;
            }
            preparedStatement.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return t;

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

    public boolean UpKiemTraMaSoSV(String masv, String test) {
        ThongTinSinhVien sv = new ThongTinSinhVien();
        Connection conn = KetNoiSQL.getConnection();
        String sql = "select * from SinhVien where maSV ='" + masv + "'";
        try {
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                if (!test.equals(masv)) {
                    return true;
                }
            }
            preparedStatement.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return false;

    }

    public boolean UpKiemTraCCCDSV(String cccd, String test) {
        ThongTinSinhVien sv = new ThongTinSinhVien();
        Connection conn = KetNoiSQL.getConnection();
        String sql = "select * from SinhVien where CCCD ='" + cccd + "'";
        try {

            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                if (!test.equals(cccd)) {
                    return true;
                }
            }
            preparedStatement.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return false;

    }

    public boolean UpKiemTraEmailSV(String email, String test) {
        ThongTinSinhVien sv = new ThongTinSinhVien();
        Connection conn = KetNoiSQL.getConnection();
        String sql = "select * from SinhVien where email ='" + email + "'";
        try {

            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                if (!test.equals(email)) {
                    return true;
                }
            }
            preparedStatement.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return false;

    }

    public boolean UpKiemTraSDTSV(String sodienthoai, String test) {
        ThongTinSinhVien sv = new ThongTinSinhVien();
        Connection conn = KetNoiSQL.getConnection();
        String sql = "select * from SinhVien where soDienThoai ='" + sodienthoai + "'";
        try {

            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                if (!test.equals(sodienthoai)) {
                    return true;
                }
            }
            preparedStatement.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return false;

    }

//    public String layTenSinhVienTuTDN(String tdn) {
//        String k = "";
//        String sql = "select tenSV from SinhVien sv join TaiKhoan tk on sv.email=tk.email where tenDangNhap= '" + tdn + "'";
//        Connection con = KetNoiSQL.getConnection();
//        try {
//            PreparedStatement ps = con.prepareStatement(sql);
//            ResultSet rs = ps.executeQuery();
//            while (rs.next()) {
//                k = rs.getString("tenSV");
//            }
//            ps.close();
//            con.close();
//        } catch (SQLException ex) {
//            Logger.getLogger(SinhVienDAO.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        return k;
//    }
    public String layMaSinhVienTuEmail(String email) {
        String k = "";
        String sql = "select maSV from SinhVien where email= '" + email + "'";
        Connection con = KetNoiSQL.getConnection();
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                k = rs.getString("maSV");
            }
            ps.close();
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(SinhVienDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return k;
    }

    public String layGTSinhVienTuEmail(String email) {
        String k = "";
        String sql = "select gioiTinh from SinhVien where email= '" + email + "'";
        Connection con = KetNoiSQL.getConnection();
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                k = rs.getString("gioiTinh");
            }
            ps.close();
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(SinhVienDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return k;
    }

//    public String LayMaPhong(String tendangnhapSV, String gioitinh, String loaiphong) {
//        String k = layMaSinhVienTuTDN(tendangnhapSV);
//        String maphong = "";
//
//        Connection con = KetNoiSQL.getConnection();
//        String sql1 = "select top 1 maPhong from Phong where loaiPhong='" + loaiphong + "' and soLuongSVPhong>sinhVienTonTai and gioiTinh='" + gioitinh + "' ";
//        try {
//            PreparedStatement ps1 = con.prepareStatement(sql1);
//            ResultSet rs1 = ps1.executeQuery();
//            while (rs1.next()) {
//                maphong = rs1.getString("maPhong");
//            }
//            ps1.close();
//            con.close();
//            // System.out.println("maphongggg :"+maphong);
//        } catch (SQLException ex) {
//            Logger.getLogger(DangKyPhong.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        return maphong;
//    }
    public int layTrangThaiSinhVien(String masv) {
        int k = 0;
        String sql = "select trangThai from SinhVien where masv= '" + masv + "'";
        Connection con = KetNoiSQL.getConnection();
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                k = rs.getInt("trangThai");
            }
            ps.close();
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(SinhVienDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return k;
    }

    public String layLoaiPhong(String masv) {
        String k = "";
        String sql = "select loaiPhong from SinhVien sv join DangKyPhong dkp on sv.maSV=dkp.maSV where sv.maSV='" + masv + "'";
        Connection con = KetNoiSQL.getConnection();
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                k = rs.getString("loaiPhong");
            }
            ps.close();
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(SinhVienDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return k;
    }

    public void updateTrangThaiTheoTDN(String masv) {
        Connection con = KetNoiSQL.getConnection();
        String sql = "update SinhVien set trangThai=? where maSV='" + masv + "'";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, "1");
            ps.executeUpdate();
            ps.close();
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(SinhVienDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void updateDKthanhcong(String masv) {
        Connection con = KetNoiSQL.getConnection();
        String sql = "update SinhVien set trangThai=? where maSV='" + masv + "'";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, "2");
            ps.executeUpdate();
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(SinhVienDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void updateMaPhong(String masv, String maPhong) {
        Connection con = KetNoiSQL.getConnection();
        String sql = "update DangKyPhong set maPhong where maSV='" + masv + "'";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, maPhong);
            ps.executeUpdate();
            ps.close();
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(SinhVienDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

//    public List<String> getListMaSVDango() {
//        List<String> listmasv = new ArrayList<>();
//        Connection con = KetNoiSQL.getConnection();
//        String sql = "select sv.* from SinhVien sv join HopDongKTX hd on sv.maSV=hd.maSV";
//        try {
//            PreparedStatement ps = con.prepareStatement(sql);
//            ResultSet rs = ps.executeQuery();
//            while (rs.next()) {
//                listmasv.add(rs.getString("maSV"));
//            }
//        } catch (SQLException ex) {
//            Logger.getLogger(SinhVienDAO.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        return listmasv;
//
//    }
    public String laytenSVtuMaSV(String masv) {
        String k = "";
        String sql = "select * from SinhVien where maSV='" + masv + "'";
        Connection con = KetNoiSQL.getConnection();
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                k = rs.getString("tenSV");
            }
            ps.close();
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(SinhVienDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return k;
    }

    public String layGioiTinhSVtuMaSV(String masv) {
        String k = "";
        Connection con = KetNoiSQL.getConnection();
        String sql = "select * from SinhVien where maSV='" + masv + "'";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                k = rs.getString("gioiTinh");
            }
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(SinhVienDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return k;
    }

    public String LayThongTinGioiTinhTuMaSV(String msv) {
        String gioitinh = null;
        Connection conn = KetNoiSQL.getConnection();
        String sql = "select * from SinhVien where maSV ='" + msv + "'";
        try {

            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                gioitinh = rs.getString("gioiTinh");
            }

            preparedStatement.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return gioitinh;
    }

    public List<ThongTinSinhVien> getAllThongTinSVchuadangky(int trangthai) {
        List<ThongTinSinhVien> listSinhVien = new ArrayList<ThongTinSinhVien>();
        Connection conn = KetNoiSQL.getConnection();
        String sql = "select * from SinhVien where trangThai='" + trangthai + "'";
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
                listSinhVien.add(sv);

            }
            preparedStatement.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return listSinhVien;
    }

    public List<ThongTinSinhVien> getAllThongTinSVchuadangky(int trangthai, int trangthai1) {
        List<ThongTinSinhVien> listSinhVien = new ArrayList<ThongTinSinhVien>();
        Connection conn = KetNoiSQL.getConnection();
        String sql = "select * from SinhVien where trangThai='" + trangthai + "' or trangThai='" + trangthai1 + "' order by trangThai";
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
                //   sv.setMaPhong(rs.getString("maPhong"));
                //   sv.setNgayBDHD(rs.getDate("ngayHDBD"));
                // sv.setMaPhong(rs.getString("maPhong"));
                sv.setSoDienThoai(rs.getString("soDienThoai"));
                sv.setQueQuan(rs.getString("queQuan"));
                sv.setMaLop(rs.getString("maLop"));
                sv.setTrangThai(rs.getInt("trangThai"));
                listSinhVien.add(sv);

            }
            preparedStatement.close();
            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return listSinhVien;
    }

    public List<ThongTinSinhVien> getAllThongTinSVchuadangky(String where, String text, int trangthai) {
        List<ThongTinSinhVien> listSinhVien = new ArrayList<ThongTinSinhVien>();
        Connection conn = KetNoiSQL.getConnection();
        String sql = "select * from SinhVien where trangThai='" + trangthai + "' and " + where + " like N'%" + text + "%'";

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
                listSinhVien.add(sv);

            }
            preparedStatement.close();
            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return listSinhVien;
    }

    public int LayTrangThaiTheoEmail(String email) {
        int trangthai = 0;
        Connection conn = KetNoiSQL.getConnection();
        String sql = "select * from SinhVien where email ='" + email + "'";
        try {
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                trangthai = rs.getInt("trangThai");

            }
            preparedStatement.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return trangthai;
    }
}
