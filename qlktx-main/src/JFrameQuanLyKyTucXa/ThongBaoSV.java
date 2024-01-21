package JFrameQuanLyKyTucXa;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import Connector.KetNoiSQL;
import dao.QuanLiThongBaoDAO;
import dao.SinhVienDAO;
import dao.SinhVienDangKyDAO;
import dao.TaiKhoanDAO;
import java.awt.Color;
import java.awt.Font;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.ThongTinThongBao;
import model.ThongTinNhanVien;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;
import textfield.SearchOptinEvent;
import textfield.SearchOption;
import java.util.ArrayList;
import java.time.LocalDateTime;
import java.sql.Timestamp;
import java.time.format.DateTimeFormatter;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import model.ThongTinPhong;
import dao.PhongDAO;
import java.util.Collections;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableColumnModel;
import javax.swing.JTable;

public class ThongBaoSV extends javax.swing.JPanel {

    private List<ThongTinThongBao> listthongbao;
    private String tieuDe;
    private String noiDung;
    //private String soPhong;
    private LocalDateTime ngayThongBao;
    private int count = -1;
    private DefaultTableModel Model;
    private String selectedSoPhong, selectedUpSoPhong;
    private List<ThongTinPhong> listphong;
    private int currentPage = 1;
    private int rowsPerPage = 12;
    private int itemsPerPage = 12;

    public ThongBaoSV() {
        initComponents();
        AddSearch();
        showTable(currentPage);
        Model = (DefaultTableModel) tableTB.getModel();
        tableTB.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 12));
        tableTB.getTableHeader().setOpaque(false);
        tableTB.getTableHeader().setBackground(new Color(19, 90, 118));
        tableTB.getTableHeader().setForeground(new Color(225, 225, 225));
        Font boldFont = new Font("Segoe UI", Font.BOLD, 13);
        showTable();
        DefaultTableCellRenderer headerRenderer = new DefaultTableCellRenderer();
        headerRenderer.setForeground(new Color(19, 90, 118));
//        tableTB.getTableHeader().setDefaultRenderer(headerRenderer);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        loadTB = new javax.swing.JLabel();
        PreviousButton = new java.awt.Button();
        NextButton = new java.awt.Button();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        loadTB1 = new javax.swing.JLabel();
        viewTB = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableTB = new javax.swing.JTable();
        PreviousButton1 = new java.awt.Button();
        NextButton1 = new java.awt.Button();
        txtSearch = new textfield.TextFieldSearchOption();
        ViewThongBaoSV = new javax.swing.JPanel();
        ViewThongBaoQL = new javax.swing.JPanel();
        jLabel51 = new javax.swing.JLabel();
        quaylai = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtViewNoiDung = new javax.swing.JTextField();
        txtViewTieuDe = new javax.swing.JTextField();
        txtViewSoPhong = new javax.swing.JTextField();
        txtViewNgayThongBao = new javax.swing.JTextField();

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(237, 50, 55));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("THÔNG BÁO");
        jLabel1.setAlignmentY(0.0F);
        jLabel1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(19, 90, 118)));

        loadTB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        loadTB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/load.png"))); // NOI18N
        loadTB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loadTBMouseClicked(evt);
            }
        });

        PreviousButton.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        PreviousButton.setForeground(new java.awt.Color(19, 90, 118));
        PreviousButton.setLabel("<<<<");
        PreviousButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PreviousButtonActionPerformed(evt);
            }
        });

        NextButton.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        NextButton.setForeground(new java.awt.Color(19, 90, 118));
        NextButton.setLabel(">>>>");
        NextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NextButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setLayout(new java.awt.CardLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(237, 50, 55));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("THÔNG BÁO");
        jLabel2.setAlignmentY(0.0F);
        jLabel2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(19, 90, 118)));

        loadTB1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        loadTB1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/load.png"))); // NOI18N
        loadTB1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loadTB1MouseClicked(evt);
            }
        });

        viewTB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        viewTB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/eye_table.png"))); // NOI18N
        viewTB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewTBMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                viewTBMouseEntered(evt);
            }
        });

        tableTB.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        tableTB.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Tiêu đề", "Nội dung", "Phòng", "Ngày thông báo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tableTB.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tableTB.setRowHeight(25);
        tableTB.setSelectionBackground(new java.awt.Color(19, 90, 118));
        tableTB.setSelectionForeground(new java.awt.Color(255, 255, 255));
        tableTB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableTBMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableTB);

        PreviousButton1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        PreviousButton1.setForeground(new java.awt.Color(19, 90, 118));
        PreviousButton1.setLabel("<<<<");
        PreviousButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PreviousButton1ActionPerformed(evt);
            }
        });

        NextButton1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        NextButton1.setForeground(new java.awt.Color(19, 90, 118));
        NextButton1.setLabel(">>>>");
        NextButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NextButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1045, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addComponent(loadTB1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(viewTB, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(124, 124, 124))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(89, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(PreviousButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(121, 121, 121)
                        .addComponent(NextButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(435, 435, 435))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 929, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(113, 113, 113))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(viewTB, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(loadTB1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(NextButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PreviousButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61))
        );

        add(jPanel1, "card2");

        jLabel51.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(19, 90, 118));
        jLabel51.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel51.setText("Hệ thống quản lý ký túc xá sinh viên");

        quaylai.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        quaylai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/back_main.png"))); // NOI18N
        quaylai.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        quaylai.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                quaylaiMouseClicked(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(237, 50, 55));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Thông tin thông báo");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(19, 90, 118));
        jLabel3.setText("Tiêu đề:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(19, 90, 118));
        jLabel4.setText("Nội dung:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(19, 90, 118));
        jLabel5.setText("Số phòng:");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(19, 90, 118));
        jLabel13.setText("Ngày thông báo:");

        txtViewNoiDung.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        txtViewNoiDung.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtViewNoiDung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtViewNoiDungActionPerformed(evt);
            }
        });

        txtViewTieuDe.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        txtViewTieuDe.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtViewTieuDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtViewTieuDeActionPerformed(evt);
            }
        });

        txtViewSoPhong.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        txtViewSoPhong.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtViewSoPhong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtViewSoPhongActionPerformed(evt);
            }
        });

        txtViewNgayThongBao.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        txtViewNgayThongBao.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtViewNgayThongBao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtViewNgayThongBaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ViewThongBaoQLLayout = new javax.swing.GroupLayout(ViewThongBaoQL);
        ViewThongBaoQL.setLayout(ViewThongBaoQLLayout);
        ViewThongBaoQLLayout.setHorizontalGroup(
            ViewThongBaoQLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ViewThongBaoQLLayout.createSequentialGroup()
                .addComponent(quaylai, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 892, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 140, Short.MAX_VALUE))
            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(ViewThongBaoQLLayout.createSequentialGroup()
                .addGap(230, 230, 230)
                .addGroup(ViewThongBaoQLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(jLabel13))
                .addGap(52, 52, 52)
                .addGroup(ViewThongBaoQLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtViewNgayThongBao, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtViewSoPhong, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtViewTieuDe, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtViewNoiDung, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(255, Short.MAX_VALUE))
        );
        ViewThongBaoQLLayout.setVerticalGroup(
            ViewThongBaoQLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ViewThongBaoQLLayout.createSequentialGroup()
                .addGroup(ViewThongBaoQLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(quaylai, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(ViewThongBaoQLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ViewThongBaoQLLayout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jLabel3))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ViewThongBaoQLLayout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(txtViewTieuDe, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(37, 37, 37)
                .addGroup(ViewThongBaoQLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ViewThongBaoQLLayout.createSequentialGroup()
                        .addGroup(ViewThongBaoQLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtViewNoiDung, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addComponent(jLabel5))
                    .addComponent(txtViewSoPhong, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(ViewThongBaoQLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel13)
                    .addComponent(txtViewNgayThongBao, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 266, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout ViewThongBaoSVLayout = new javax.swing.GroupLayout(ViewThongBaoSV);
        ViewThongBaoSV.setLayout(ViewThongBaoSVLayout);
        ViewThongBaoSVLayout.setHorizontalGroup(
            ViewThongBaoSVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1131, Short.MAX_VALUE)
            .addGroup(ViewThongBaoSVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(ViewThongBaoSVLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(ViewThongBaoQL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        ViewThongBaoSVLayout.setVerticalGroup(
            ViewThongBaoSVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 640, Short.MAX_VALUE)
            .addGroup(ViewThongBaoSVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(ViewThongBaoSVLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(ViewThongBaoQL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        add(ViewThongBaoSV, "card3");
    }// </editor-fold>//GEN-END:initComponents

    private void loadTBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loadTBMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_loadTBMouseClicked

    private void loadTB1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loadTB1MouseClicked
        // TODO add your handling code here:
        showTable();
        count = -1;
    }//GEN-LAST:event_loadTB1MouseClicked

    private void viewTBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewTBMouseClicked
        if (count == -1) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn thông báo để xem!");
        } else {
            jPanel1.setVisible(false);
            ViewThongBaoSV.setVisible(true);
            LayThongTinThongBaoView(count);
        }
    }//GEN-LAST:event_viewTBMouseClicked

    private void viewTBMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewTBMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_viewTBMouseEntered

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchActionPerformed

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        if (txtSearch.isSelected()) {
            int option = txtSearch.getSelectedIndex();
            String textsearch = txtSearch.getText().trim();
            if (option == 0) {
                showTable("tieuDe", textsearch);
            } else if (option == 1) {
                showTable("noiDung", textsearch);
            } else if (option == 2) {
                showTable("soPhong", textsearch);
            } else if (option == 3) {
                showTable("ngayThongBao", textsearch);
            }
        }
    }//GEN-LAST:event_txtSearchKeyReleased

    private void tableTBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableTBMouseClicked
        // TODO add your handling code here:
        count = tableTB.getSelectedRow();
        LayMaThongBao(count);
    }//GEN-LAST:event_tableTBMouseClicked

    private void PreviousButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PreviousButtonActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_PreviousButtonActionPerformed

    private void NextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NextButtonActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_NextButtonActionPerformed

    private void PreviousButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PreviousButton1ActionPerformed
        // TODO add your handling code here:
        if (currentPage > 1) {
            currentPage--;
            showTable(currentPage);
        }
    }//GEN-LAST:event_PreviousButton1ActionPerformed

    private void NextButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NextButton1ActionPerformed
        // TODO add your handling code here:
        currentPage++;
        showTable(currentPage);
    }//GEN-LAST:event_NextButton1ActionPerformed

    private void quaylaiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_quaylaiMouseClicked
        // TODO add your handling code here:
        jPanel1.setVisible(true);
        ViewThongBaoSV.setVisible(false);
    }//GEN-LAST:event_quaylaiMouseClicked

    private void txtViewNoiDungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtViewNoiDungActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtViewNoiDungActionPerformed

    private void txtViewTieuDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtViewTieuDeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtViewTieuDeActionPerformed

    private void txtViewSoPhongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtViewSoPhongActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtViewSoPhongActionPerformed

    private void txtViewNgayThongBaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtViewNgayThongBaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtViewNgayThongBaoActionPerformed

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
        // TODO add your handling code here:
        jPanel1.setVisible(true);
        ViewThongBaoSV.setVisible(false);
    }//GEN-LAST:event_jPanel1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button NextButton;
    private java.awt.Button NextButton1;
    private java.awt.Button PreviousButton;
    private java.awt.Button PreviousButton1;
    private javax.swing.JPanel ViewThongBaoQL;
    private javax.swing.JPanel ViewThongBaoSV;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel loadTB;
    private javax.swing.JLabel loadTB1;
    private javax.swing.JLabel quaylai;
    private javax.swing.JTable tableTB;
    private textfield.TextFieldSearchOption txtSearch;
    private javax.swing.JTextField txtViewNgayThongBao;
    private javax.swing.JTextField txtViewNoiDung;
    private javax.swing.JTextField txtViewSoPhong;
    private javax.swing.JTextField txtViewTieuDe;
    private javax.swing.JLabel viewTB;
    // End of variables declaration//GEN-END:variables

    private void showTable() {
        listthongbao = new QuanLiThongBaoDAO().getAllThongTinTB();

        Collections.sort(listthongbao, (tb1, tb2) -> tb2.getNgayThongBao().compareTo(tb1.getNgayThongBao()));

        Model.setRowCount(0);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        for (ThongTinThongBao tb : listthongbao) {
            String formattedDateTime = tb.getNgayThongBao().format(formatter);
            Model.addRow(new Object[]{tb.getTieuDe(), tb.getNoiDung(), tb.getSoPhong(), formattedDateTime});
        }
        // Căn lề tất cả các cột về bên trái
        setLeftAlignmentForTableColumns(tableTB);
        count = -1;
    }

    private void setLeftAlignmentForTableColumns(JTable table) {
        DefaultTableCellRenderer leftRenderer = new DefaultTableCellRenderer();
        leftRenderer.setHorizontalAlignment(DefaultTableCellRenderer.LEFT);

        TableColumnModel columnModel = table.getColumnModel();
        for (int columnIndex = 0; columnIndex < columnModel.getColumnCount(); columnIndex++) {
            columnModel.getColumn(columnIndex).setCellRenderer(leftRenderer);
        }
    }

    private void showTable(int page) {
        // Tính toán index bắt đầu và kết thúc của dữ liệu trên trang
        int startIndex = (page - 1) * rowsPerPage;
        int endIndex;
        if (Model == null) {
            return;
        }

        // Hiển thị dữ liệu của trang hiện tại
        Model.setRowCount(0);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        if (page == 1) {
            endIndex = Math.min(startIndex + rowsPerPage, 12); // Chỉ hiển thị 12 dòng cho trang đầu tiên
        } else {
            endIndex = Math.min(startIndex + rowsPerPage, listthongbao.size()); // Hiển thị toàn bộ dữ liệu cho các trang khác
        }

        for (int i = startIndex; i < endIndex; i++) {
            ThongTinThongBao tb = listthongbao.get(i);
            String formattedDateTime = tb.getNgayThongBao().format(formatter);
            Model.addRow(new Object[]{tb.getTieuDe(), tb.getNoiDung(), tb.getSoPhong(), formattedDateTime});
        }
    }

    void AddSearch() {
        txtSearch.addEventOptionSelected(new SearchOptinEvent() {
            @Override
            public void optionSelected(SearchOption option, int index) {
                txtSearch.setHint("Tìm kiếm " + option.getName() + "....");
            }
        });
        txtSearch.addOption(new SearchOption("Tiêu đề", new ImageIcon(getClass().getResource("/img/user.png"))));
        txtSearch.addOption(new SearchOption("Nội dung", new ImageIcon(getClass().getResource("/img/user.png"))));
        txtSearch.addOption(new SearchOption("Số phòng", new ImageIcon(getClass().getResource("/img/email.png"))));
        txtSearch.addOption(new SearchOption("Ngày thông báo", new ImageIcon(getClass().getResource("/img/address.png"))));
    }

    private void LayThongTinThongBaoView(int count) {
        ThongTinThongBao tb = listthongbao.get(count);
        txtViewTieuDe.setText(tb.getTieuDe());
        txtViewNoiDung.setText(tb.getNoiDung());
        txtViewSoPhong.setText(tb.getSoPhong());

        // Sử dụng DateTimeFormatter để định dạng ngày tháng
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedNgayThongBao = tb.getNgayThongBao().format(formatter);
        txtViewNgayThongBao.setText(formattedNgayThongBao);

        // Khoá các ô nhập liệu
        txtViewTieuDe.setEditable(false);
        txtViewNoiDung.setEditable(false);
        txtViewSoPhong.setEditable(false);
        txtViewNgayThongBao.setEditable(false);
    }

    private void LayMaThongBao(int count) {
        ThongTinThongBao tb = listthongbao.get(count);
        tieuDe = tb.getTieuDe();
    }

    private void showTable(String where, String text) {
        listthongbao = new QuanLiThongBaoDAO().getAllThongBaoSearch(where, text);
        Model.setRowCount(0);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        for (ThongTinThongBao tb : listthongbao) {
            String ngayThongBaoString = tb.getNgayThongBao().format(formatter);
            Model.addRow(new Object[]{
                tb.getTieuDe(), tb.getNoiDung(), tb.getSoPhong(), ngayThongBaoString
            });
        }
        count = -1;
    }

}