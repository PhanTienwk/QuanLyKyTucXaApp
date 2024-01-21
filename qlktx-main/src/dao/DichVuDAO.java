/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import Connector.KetNoiSQL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author PhanTien
 */
public class DichVuDAO {
    public double getTienDien(){
        double number=0;
        Connection conn = KetNoiSQL.getConnection();
        String sql = "select * from dichvu where ID =1";
        try {
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            while(rs.next()){
                number = rs.getDouble("tienDien");
            }
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return number;
    }
    
    public double getTienNuoc(){
        double number=0;
        Connection conn = KetNoiSQL.getConnection();
        String sql = "select * from dichvu where ID = 1";
        try {
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            while(rs.next()){
                number = rs.getDouble("tienNuoc");
            }
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return number;
    }
    
    public double getTienMang(){
        double number=0;
        Connection conn = KetNoiSQL.getConnection();
        String sql = "select * from dichvu where ID = 1";
        try {
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            while(rs.next()){
                number = rs.getDouble("tienMang");
            }
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return number;
    }
    
    
}
