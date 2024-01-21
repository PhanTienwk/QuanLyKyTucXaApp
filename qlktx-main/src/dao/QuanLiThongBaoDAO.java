package dao;

import Connector.KetNoiSQL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import model.ThongTinThongBao;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class QuanLiThongBaoDAO {
    
    public List<ThongTinThongBao> getAllThongTinTB() {
        List<ThongTinThongBao> listThongBao = new ArrayList<>();
        Connection conn = KetNoiSQL.getConnection();
        String sql = "select * from ThongBao";
        try {
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                ThongTinThongBao tb = new ThongTinThongBao();
                tb.setTieuDe(rs.getString("tieuDe"));
                tb.setNoiDung(rs.getString("noiDung"));
                tb.setSoPhong(rs.getString("soPhong"));
                tb.setNgayThongBao(rs.getTimestamp("ngayThongBao").toLocalDateTime());
                listThongBao.add(tb);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listThongBao;
    }
    
    
    public List<ThongTinThongBao> getAllThongTinTBTheoPhong(String maPhong) {
        List<ThongTinThongBao> listThongBao = new ArrayList<>();
        Connection conn = KetNoiSQL.getConnection();
        String sql = "select * from ThongBao where maPhong='"+maPhong+"'";
        try {
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                ThongTinThongBao tb = new ThongTinThongBao();
                tb.setTieuDe(rs.getString("tieuDe"));
                tb.setNoiDung(rs.getString("noiDung"));
                tb.setSoPhong(rs.getString("soPhong"));
                tb.setNgayThongBao(rs.getTimestamp("ngayThongBao").toLocalDateTime());
                listThongBao.add(tb);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listThongBao;
    }
    
//    public List<ThongTinThongBao> getAllThongBaoSearch(String where, String text) {
//        List<ThongTinThongBao> listThongBao = new ArrayList<ThongTinThongBao>();
//        Connection conn = KetNoiSQL.getConnection();
//        String sql = "select * from ThongBao where " + where + " like N'%" + text + "%'";
//        try {
//
//            PreparedStatement preparedStatement = conn.prepareStatement(sql);
//            ResultSet rs = preparedStatement.executeQuery();
//            while (rs.next()) {
//                ThongTinThongBao tb = new ThongTinThongBao();
//                tb.setTieuDe(rs.getString("tieuDe"));
//                tb.setNoiDung(rs.getString("noiDung"));
//                tb.setSoPhong(rs.getString("soPhong"));
//                tb.setNgayThongBao(rs.getTimestamp("ngayThongBao").toLocalDateTime());
//                listThongBao.add(tb);
//            }
//            conn.close();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return listThongBao;
//    }
        
    public List<ThongTinThongBao> getAllThongBaoSearch(String where, String text) {
        List<ThongTinThongBao> listThongBao = new ArrayList<>();
        Connection conn = KetNoiSQL.getConnection();

        try {
            if ("ngayThongBao".equals(where)) {
                String sql = "SELECT * FROM ThongBao WHERE CONVERT(NVARCHAR, " + where + ", 120) LIKE N'%" + text + "%'";

                PreparedStatement preparedStatement = conn.prepareStatement(sql);
                ResultSet rs = preparedStatement.executeQuery();

                while (rs.next()) {
                    ThongTinThongBao tb = new ThongTinThongBao();
                    tb.setTieuDe(rs.getString("tieuDe"));
                    tb.setNoiDung(rs.getString("noiDung"));
                    tb.setSoPhong(rs.getString("soPhong"));
                    tb.setNgayThongBao(rs.getTimestamp("ngayThongBao").toLocalDateTime());
                    listThongBao.add(tb);
                }
            } else {
                String sql = "SELECT * FROM ThongBao WHERE " + where + " LIKE N'%" + text + "%'";

                PreparedStatement preparedStatement = conn.prepareStatement(sql);
                ResultSet rs = preparedStatement.executeQuery();
                
                while (rs.next()) {
                    ThongTinThongBao tb = new ThongTinThongBao();
                    tb.setTieuDe(rs.getString("tieuDe"));
                    tb.setNoiDung(rs.getString("noiDung"));
                    tb.setSoPhong(rs.getString("soPhong"));
                    tb.setNgayThongBao(rs.getTimestamp("ngayThongBao").toLocalDateTime());
                    listThongBao.add(tb);
                }
            }
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listThongBao;
    }

    
}
