package test;

import Connector.KetNoiSQL;
import dao.SinhVienDangKyDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.ThongTinDichVu;

public class NewClass {

    private static List<ThongTinDichVu> list = new ArrayList<>();

    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("");
       LocalDate date1 = LocalDate.now();
        System.out.println(date1);
    }
}
