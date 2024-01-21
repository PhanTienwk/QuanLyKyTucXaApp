/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package JFrameQuanLyKyTucXa;

import Connector.KetNoiSQL;
import dao.HopDongKTXDAO;
import dao.SinhVienDAO;
import dao.ThongTinDichVuDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import model.ThongTinSinhVien;

/**
 *
 * @author PhanTien
 */
public class Main_USER extends javax.swing.JFrame {

    String masv;
    private String emailsv;

    /**
     * Creates new form Main_USER
     */
    public Main_USER() {
        initComponents();
        UpdateSinhVien();
    }

    void setEmail(String email) {
        this.emailsv = email;
        Connection conn = KetNoiSQL.getConnection();
        String sql = "select * from sinhvien where email='" + email + "'";
        try {
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                txtnameuser.setText(rs.getString("tenSV"));
                masv = rs.getString("maSV");
            }
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel1212 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtnameuser = new javax.swing.JLabel();
        txtdkp = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanelTrangChu = new JFrameQuanLyKyTucXa.TrangChu();
        jPanelThongTinTaiKhoan = new JFrameQuanLyKyTucXa.ThongTinTaiKhoan();
        jPanelCaiDatTaiKhoan = new JFrameQuanLyKyTucXa.CaiDatTaiKhoan();
        jPanelDangKyPhong = new JFrameQuanLyKyTucXa.DangKyPhong();
        jPanelKetQua = new JFrameQuanLyKyTucXa.KetQua();
        jPanelKhoanPhi = new JFrameQuanLyKyTucXa.KhoanPhi_USER();
        jPanelGiaHan = new JFrameQuanLyKyTucXa.JpanelGiaHanChuyenPhong();
        jPanelKhoanPhiKQ = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanelGiaHanKQ = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanelThongBao = new JFrameQuanLyKyTucXa.ThongBaoSV();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(5, 20));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1212.setBackground(new java.awt.Color(19, 90, 118));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Logo Học Viện Công Nghệ Bưu Chính Viễn Thông - PTIT(Simple).png"))); // NOI18N

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("UserName:");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Menu:");

        txtnameuser.setForeground(new java.awt.Color(255, 255, 255));
        txtnameuser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtnameuser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/user_name.png"))); // NOI18N
        txtnameuser.setText("Phan Van Tien");

        txtdkp.setForeground(new java.awt.Color(255, 255, 255));
        txtdkp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtdkp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pencil.png"))); // NOI18N
        txtdkp.setText("Đăng ký phòng");
        txtdkp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtdkp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtdkpMouseClicked(evt);
            }
        });

        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/user.png"))); // NOI18N
        jLabel13.setText("Thông tin tài khoản");
        jLabel13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });

        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/home.png"))); // NOI18N
        jLabel15.setText("Trang chủ");
        jLabel15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });

        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/out.png"))); // NOI18N
        jLabel16.setText("LogOut");
        jLabel16.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel16MouseClicked(evt);
            }
        });

        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/setting.png"))); // NOI18N
        jLabel14.setText("Cài lại mật khẩu");
        jLabel14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });

        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/home.png"))); // NOI18N
        jLabel12.setText("Gia hạn và chuyển phòng");
        jLabel12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });

        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/money_bag.png"))); // NOI18N
        jLabel17.setText("Các khoản phí");
        jLabel17.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel17MouseClicked(evt);
            }
        });

        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/setting.png"))); // NOI18N
        jLabel18.setText("Thông báo");
        jLabel18.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel18MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1212Layout = new javax.swing.GroupLayout(jPanel1212);
        jPanel1212.setLayout(jPanel1212Layout);
        jPanel1212Layout.setHorizontalGroup(
            jPanel1212Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(txtnameuser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(txtdkp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1212Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1212Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1212Layout.createSequentialGroup()
                        .addGroup(jPanel1212Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 150, Short.MAX_VALUE))
                    .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1212Layout.setVerticalGroup(
            jPanel1212Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1212Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtnameuser, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtdkp, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cancelmenu.png"))); // NOI18N
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo_ptit.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new java.awt.CardLayout());
        jPanel4.add(jPanelTrangChu, "card2");
        jPanel4.add(jPanelThongTinTaiKhoan, "card3");
        jPanel4.add(jPanelCaiDatTaiKhoan, "card4");
        jPanel4.add(jPanelDangKyPhong, "card5");
        jPanel4.add(jPanelKetQua, "card6");
        jPanel4.add(jPanelKhoanPhi, "card7");
        jPanel4.add(jPanelGiaHan, "card8");

        jPanelKhoanPhiKQ.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(237, 50, 55));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/thongbao.png"))); // NOI18N
        jLabel4.setText("Thông báo ");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(19, 90, 118));
        jLabel5.setText("Bạn không có bất kỳ chi phí nào cần chi trả");

        javax.swing.GroupLayout jPanelKhoanPhiKQLayout = new javax.swing.GroupLayout(jPanelKhoanPhiKQ);
        jPanelKhoanPhiKQ.setLayout(jPanelKhoanPhiKQLayout);
        jPanelKhoanPhiKQLayout.setHorizontalGroup(
            jPanelKhoanPhiKQLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelKhoanPhiKQLayout.createSequentialGroup()
                .addGroup(jPanelKhoanPhiKQLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelKhoanPhiKQLayout.createSequentialGroup()
                        .addGap(197, 197, 197)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelKhoanPhiKQLayout.createSequentialGroup()
                        .addGap(245, 245, 245)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(574, Short.MAX_VALUE))
        );
        jPanelKhoanPhiKQLayout.setVerticalGroup(
            jPanelKhoanPhiKQLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelKhoanPhiKQLayout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(469, Short.MAX_VALUE))
        );

        jPanel4.add(jPanelKhoanPhiKQ, "card9");

        jPanelGiaHanKQ.setBackground(new java.awt.Color(255, 255, 255));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(237, 50, 55));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/thongbao.png"))); // NOI18N
        jLabel6.setText("Thông báo ");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(19, 90, 118));
        jLabel7.setText("Bạn chỉ chuyển phòng và gia hạn phòng khi đang ở trong KTX");

        javax.swing.GroupLayout jPanelGiaHanKQLayout = new javax.swing.GroupLayout(jPanelGiaHanKQ);
        jPanelGiaHanKQ.setLayout(jPanelGiaHanKQLayout);
        jPanelGiaHanKQLayout.setHorizontalGroup(
            jPanelGiaHanKQLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelGiaHanKQLayout.createSequentialGroup()
                .addGroup(jPanelGiaHanKQLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelGiaHanKQLayout.createSequentialGroup()
                        .addGap(197, 197, 197)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelGiaHanKQLayout.createSequentialGroup()
                        .addGap(245, 245, 245)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(545, Short.MAX_VALUE))
        );
        jPanelGiaHanKQLayout.setVerticalGroup(
            jPanelGiaHanKQLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelGiaHanKQLayout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(469, Short.MAX_VALUE))
        );

        jPanel4.add(jPanelGiaHanKQ, "card9");
        jPanel4.add(jPanelThongBao, "card11");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel1212, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1212, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        // TODO add your handling code here:
        jPanelTrangChu.setVisible(false);
        jPanelThongTinTaiKhoan.setVisible(true);
        jPanelCaiDatTaiKhoan.setVisible(false);
        jPanelDangKyPhong.setVisible(false);
        jPanelKetQua.setVisible(false);
        jPanelKhoanPhi.setVisible(false);
        jPanelGiaHan.setVisible(false);
        jPanelKhoanPhiKQ.setVisible(false);
        jPanelGiaHanKQ.setVisible(false);
        jPanelThongBao.setVisible(false);

        setEmail(emailsv);
        this.jPanelThongTinTaiKhoan.showViewTaiKhoanEmail(emailsv);
    }//GEN-LAST:event_jLabel13MouseClicked

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
        // TODO add your handling code here:
        jPanelTrangChu.setVisible(true);
        jPanelThongTinTaiKhoan.setVisible(false);
        jPanelCaiDatTaiKhoan.setVisible(false);
        jPanelDangKyPhong.setVisible(false);
        jPanelKetQua.setVisible(false);
        jPanelKhoanPhi.setVisible(false);
        jPanelGiaHan.setVisible(false);
        jPanelKhoanPhiKQ.setVisible(false);
        jPanelGiaHanKQ.setVisible(false);
        jPanelThongBao.setVisible(false);

        setEmail(emailsv);
    }//GEN-LAST:event_jLabel15MouseClicked

    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked
        // TODO add your handling code here:

        int test = JOptionPane.showConfirmDialog(null, "Bạn chắc có muốn đăng xuất hay không !", "Thông báo đăng nhập", JOptionPane.YES_NO_OPTION);
        if (test == JOptionPane.YES_OPTION) {
            dispose();
            Login login = new Login();
            login.show();
        } else if (test == JOptionPane.NO_OPTION) {
            JOptionPane.showMessageDialog(this, "Bạn đã hủy đăng xuất");
        }
    }//GEN-LAST:event_jLabel16MouseClicked

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
        // TODO add your handling code here:
        jPanelTrangChu.setVisible(false);
        jPanelThongTinTaiKhoan.setVisible(false);
        jPanelCaiDatTaiKhoan.setVisible(true);
        jPanelDangKyPhong.setVisible(false);
        jPanelKetQua.setVisible(false);
        jPanelKhoanPhi.setVisible(false);
        jPanelGiaHan.setVisible(false);
        jPanelKhoanPhiKQ.setVisible(false);
        jPanelGiaHanKQ.setVisible(false);
        jPanelThongBao.setVisible(false);

        setEmail(emailsv);
    }//GEN-LAST:event_jLabel14MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jLabel9MouseClicked

    private void txtdkpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtdkpMouseClicked
        // TODO add your handling code here:
        jPanelTrangChu.setVisible(false);
        jPanelThongTinTaiKhoan.setVisible(false);
        jPanelCaiDatTaiKhoan.setVisible(false);
        jPanelDangKyPhong.setVisible(false);
        jPanelKetQua.setVisible(false);
        jPanelKhoanPhi.setVisible(false);
        jPanelGiaHan.setVisible(false);
        jPanelKhoanPhiKQ.setVisible(false);
        jPanelGiaHanKQ.setVisible(false);
        jPanelThongBao.setVisible(false);

        int trangthai = new SinhVienDAO().LayTrangThaiTheoEmail(emailsv);
        if (trangthai == 0 || trangthai == 5) {
            jPanelDangKyPhong.setVisible(true);
            jPanelDangKyPhong.LayEmail(emailsv);
        } else {
            jPanelKetQua.setVisible(true);
        }
    }//GEN-LAST:event_txtdkpMouseClicked

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        // TODO add your handling code here:
        jPanelTrangChu.setVisible(false);
        jPanelThongTinTaiKhoan.setVisible(false);
        jPanelCaiDatTaiKhoan.setVisible(false);
        jPanelDangKyPhong.setVisible(false);
        jPanelKetQua.setVisible(false);
        jPanelKhoanPhi.setVisible(false);
        jPanelGiaHan.setVisible(false);
        jPanelKhoanPhiKQ.setVisible(false);
        jPanelGiaHanKQ.setVisible(false);
        jPanelThongBao.setVisible(false);

        int trangthai = new SinhVienDAO().LayTrangThaiTheoEmail(emailsv);
        if (trangthai == 2) {
            jPanelGiaHan.setVisible(true);
            jPanelGiaHan.showViewTaiKhoanEmail(emailsv);
        } else {
            jPanelGiaHanKQ.setVisible(true);
        }
    }//GEN-LAST:event_jLabel12MouseClicked

    private void jLabel17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseClicked
        // TODO add your handling code here:
        jPanelTrangChu.setVisible(false);
        jPanelThongTinTaiKhoan.setVisible(false);
        jPanelCaiDatTaiKhoan.setVisible(false);
        jPanelDangKyPhong.setVisible(false);
        jPanelKetQua.setVisible(false);
        jPanelKhoanPhi.setVisible(false);
        jPanelGiaHan.setVisible(false);
        jPanelKhoanPhiKQ.setVisible(false);
        jPanelGiaHanKQ.setVisible(false);
        jPanelThongBao.setVisible(false);
        int trangthai = new SinhVienDAO().LayTrangThaiTheoEmail(emailsv);
        if (trangthai == 2 || trangthai == 3) {
            jPanelKhoanPhi.setVisible(true);
            jPanelKhoanPhi.setEmail(emailsv);
        } else {
            jPanelKhoanPhiKQ.setVisible(true);
        }
    }//GEN-LAST:event_jLabel17MouseClicked

    private void jLabel18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MouseClicked
        // TODO add your handling code here:
        jPanelTrangChu.setVisible(false);
        jPanelThongTinTaiKhoan.setVisible(false);
        jPanelCaiDatTaiKhoan.setVisible(false);
        jPanelDangKyPhong.setVisible(false);
        jPanelKetQua.setVisible(false);
        jPanelKhoanPhi.setVisible(false);
        jPanelGiaHan.setVisible(false);
        jPanelKhoanPhiKQ.setVisible(false);
        jPanelGiaHanKQ.setVisible(false);
        jPanelThongBao.setVisible(true);
    }//GEN-LAST:event_jLabel18MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main_USER.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main_USER.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main_USER.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main_USER.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main_USER().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel1212;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private JFrameQuanLyKyTucXa.CaiDatTaiKhoan jPanelCaiDatTaiKhoan;
    private JFrameQuanLyKyTucXa.DangKyPhong jPanelDangKyPhong;
    private JFrameQuanLyKyTucXa.JpanelGiaHanChuyenPhong jPanelGiaHan;
    private javax.swing.JPanel jPanelGiaHanKQ;
    private JFrameQuanLyKyTucXa.KetQua jPanelKetQua;
    private JFrameQuanLyKyTucXa.KhoanPhi_USER jPanelKhoanPhi;
    private javax.swing.JPanel jPanelKhoanPhiKQ;
    private JFrameQuanLyKyTucXa.ThongBaoSV jPanelThongBao;
    private JFrameQuanLyKyTucXa.ThongTinTaiKhoan jPanelThongTinTaiKhoan;
    private JFrameQuanLyKyTucXa.TrangChu jPanelTrangChu;
    private javax.swing.JLabel txtdkp;
    private javax.swing.JLabel txtnameuser;
    // End of variables declaration//GEN-END:variables

    public void UpdateSinhVien() {
        List<ThongTinSinhVien> listsv = new SinhVienDAO().getAllThongTinSVTrangThai(2);
        for (ThongTinSinhVien sv : listsv) {
            LocalDate datelocal = LocalDate.now();
            SimpleDateFormat formatter1 = new SimpleDateFormat("yyyy-MM-dd");
            String strdatenow = String.valueOf(datelocal);
            Date datenow = null;
            try {
                datenow = formatter1.parse(strdatenow);
            } catch (Exception e) {
            }
            Date ngayHetHD = new HopDongKTXDAO().layNgayHDKTTuHDKTX(sv.getMaSV());
            if (ngayHetHD.compareTo(datenow) <= 0) {
                try {
                    Connection conn = KetNoiSQL.getConnection();
                    String sql = "update SinhVien set trangThai=? where maSV='" + sv.getMaSV() + "'";
                    PreparedStatement ps = conn.prepareStatement(sql);
                    ps.setInt(1, 3);
                    ps.executeUpdate();
                    ps.close();
                    conn.close();
                } catch (SQLException ex) {
                }
            }

        }
    }
}
