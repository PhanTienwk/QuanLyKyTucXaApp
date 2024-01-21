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
import javax.swing.BorderFactory;
import java.awt.Dimension;

public class Thongbao extends javax.swing.JPanel {

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

    public Thongbao() {
        initComponents();
        displayDateTime();
        AddSearch();
        AddComboBox();
        showTable(currentPage);
        Model = (DefaultTableModel) tableTB.getModel();
        showTable();
        tableTB.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 12));
        tableTB.getTableHeader().setOpaque(false);
        tableTB.getTableHeader().setBackground(new Color(19, 90, 118));
        tableTB.getTableHeader().setForeground(new Color(225, 225, 225));
        tableTB.setBorder(BorderFactory.createLineBorder(Color.WHITE));
        tableTB.setShowGrid(false);
        tableTB.setIntercellSpacing(new Dimension(0, 0)); // Đặt khoảng cách giữa các ô là 0, 0

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField2 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        textField1 = new java.awt.TextField();
        textField3 = new java.awt.TextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel40 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        textField4 = new java.awt.TextField();
        textField5 = new java.awt.TextField();
        textField6 = new java.awt.TextField();
        textField2 = new java.awt.TextField();
        jButton2 = new javax.swing.JButton();
        bevelBorder1 = (javax.swing.border.BevelBorder)javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED);
        ThongTinThongBao = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        addTB = new javax.swing.JLabel();
        viewTB = new javax.swing.JLabel();
        editTB = new javax.swing.JLabel();
        deleteTB = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        txtSearch = new textfield.TextFieldSearchOption();
        loadTB = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableTB = new javax.swing.JTable();
        PreviousButton = new java.awt.Button();
        NextButton = new java.awt.Button();
        AddThongBaoQL = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        txtTieuDe = new javax.swing.JTextField();
        jLabel47 = new javax.swing.JLabel();
        txtNoiDung = new javax.swing.JTextField();
        jLabel48 = new javax.swing.JLabel();
        txtSoPhongTB = new javax.swing.JComboBox<>();
        btnAddTB = new javax.swing.JButton();
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
        UpdateThongBaoQL = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        txtUpSoPhongTB = new javax.swing.JComboBox<>();
        txtUpdateNoiDung = new javax.swing.JTextField();
        txtUpdateTieuDe = new javax.swing.JTextField();
        btnUpdateTB = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        txtUpdateNgayThongBao = new javax.swing.JTextField();

        jTextField2.setText("jTextField2");

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/delete_table.png"))); // NOI18N

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton1.setText("Gửi");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Phòng:");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setText("Nhập nội dung:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Nhập tiêu đề:");

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

        jLabel40.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(255, 255, 255));
        jLabel40.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel40.setText("Hệ thống quản lý ký túc xá sinh viên");

        jLabel45.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(255, 255, 255));
        jLabel45.setText("Họ nhân viên :");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(237, 50, 55));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Thông tin nhân viên");

        jTextField6.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/back_main.png"))); // NOI18N
        jLabel14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });

        jLabel49.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(19, 90, 118));
        jLabel49.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel49.setText("Hệ thống quản lý ký túc xá sinh viên");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(237, 50, 55));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Cập nhật thông tin nhân viên");

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(19, 90, 118));
        jLabel18.setText("Họ và tên nhân viên :");

        textField4.setText("textField2");

        textField5.setText("textField2");

        textField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textField6ActionPerformed(evt);
            }
        });

        jButton2.setText("jButton2");

        setLayout(new java.awt.CardLayout());

        ThongTinThongBao.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(237, 50, 55));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("THÔNG BÁO");
        jLabel1.setAlignmentY(0.0F);
        jLabel1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(19, 90, 118)));

        addTB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        addTB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/add_table.png"))); // NOI18N
        addTB.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                addTBAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        addTB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addTBMouseClicked(evt);
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

        editTB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        editTB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pencil_table.png"))); // NOI18N
        editTB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editTBMouseClicked(evt);
            }
        });

        deleteTB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        deleteTB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/delete_table.png"))); // NOI18N
        deleteTB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteTBMouseClicked(evt);
            }
        });

        jTextField1.setBorder(null);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        txtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchActionPerformed(evt);
            }
        });
        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
        });

        loadTB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        loadTB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/load.png"))); // NOI18N
        loadTB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loadTBMouseClicked(evt);
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
                "Ngày thông báo", "Phòng", "Tiêu đề", "Nội dung"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
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

        javax.swing.GroupLayout ThongTinThongBaoLayout = new javax.swing.GroupLayout(ThongTinThongBao);
        ThongTinThongBao.setLayout(ThongTinThongBaoLayout);
        ThongTinThongBaoLayout.setHorizontalGroup(
            ThongTinThongBaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ThongTinThongBaoLayout.createSequentialGroup()
                .addGroup(ThongTinThongBaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ThongTinThongBaoLayout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(loadTB, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(addTB, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(viewTB, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(editTB, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(deleteTB, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 417, Short.MAX_VALUE)
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ThongTinThongBaoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 929, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)))
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(80, Short.MAX_VALUE))
            .addGroup(ThongTinThongBaoLayout.createSequentialGroup()
                .addGroup(ThongTinThongBaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ThongTinThongBaoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1045, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ThongTinThongBaoLayout.createSequentialGroup()
                        .addGap(443, 443, 443)
                        .addComponent(PreviousButton, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(87, 87, 87)
                        .addComponent(NextButton, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ThongTinThongBaoLayout.setVerticalGroup(
            ThongTinThongBaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ThongTinThongBaoLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ThongTinThongBaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(editTB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addTB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(viewTB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(deleteTB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(ThongTinThongBaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField1)
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(loadTB, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ThongTinThongBaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ThongTinThongBaoLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                        .addComponent(NextButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(PreviousButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(66, 66, 66))
        );

        add(ThongTinThongBao, "card2");

        AddThongBaoQL.setBackground(new java.awt.Color(19, 90, 118));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/back_white.png"))); // NOI18N
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        jLabel41.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(255, 255, 255));
        jLabel41.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel41.setText("Hệ thống quản lý ký túc xá sinh viên");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 255, 0));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Thêm thông tin thông báo quản lý ký túc xá");

        jLabel46.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(255, 255, 255));
        jLabel46.setText("Tiêu đề:");

        txtTieuDe.setBackground(new java.awt.Color(19, 90, 118));
        txtTieuDe.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        txtTieuDe.setForeground(new java.awt.Color(255, 255, 255));
        txtTieuDe.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        txtTieuDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTieuDejHoTenSVActionPerformed(evt);
            }
        });

        jLabel47.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(255, 255, 255));
        jLabel47.setText("Nội Dung:");

        txtNoiDung.setBackground(new java.awt.Color(19, 90, 118));
        txtNoiDung.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        txtNoiDung.setForeground(new java.awt.Color(255, 255, 255));
        txtNoiDung.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        txtNoiDung.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtNoiDung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNoiDungjHoTenSVActionPerformed(evt);
            }
        });

        jLabel48.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(255, 255, 255));
        jLabel48.setText("Phòng:");

        txtSoPhongTB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        txtSoPhongTB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtSoPhongTBMouseClicked(evt);
            }
        });
        txtSoPhongTB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSoPhongTBActionPerformed(evt);
            }
        });

        btnAddTB.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAddTB.setForeground(new java.awt.Color(19, 90, 118));
        btnAddTB.setText("Lưu Thông Báo");
        btnAddTB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddTBMouseClicked(evt);
            }
        });
        btnAddTB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddTBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout AddThongBaoQLLayout = new javax.swing.GroupLayout(AddThongBaoQL);
        AddThongBaoQL.setLayout(AddThongBaoQLLayout);
        AddThongBaoQLLayout.setHorizontalGroup(
            AddThongBaoQLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddThongBaoQLLayout.createSequentialGroup()
                .addGroup(AddThongBaoQLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AddThongBaoQLLayout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addGroup(AddThongBaoQLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel48)
                            .addComponent(jLabel47)
                            .addComponent(jLabel46))
                        .addGap(48, 48, 48)
                        .addGroup(AddThongBaoQLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtTieuDe, javax.swing.GroupLayout.PREFERRED_SIZE, 733, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNoiDung, javax.swing.GroupLayout.PREFERRED_SIZE, 733, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(AddThongBaoQLLayout.createSequentialGroup()
                                .addComponent(txtSoPhongTB, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnAddTB))))
                    .addGroup(AddThongBaoQLLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(AddThongBaoQLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(AddThongBaoQLLayout.createSequentialGroup()
                                .addGap(86, 86, 86)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(AddThongBaoQLLayout.createSequentialGroup()
                                .addGap(172, 172, 172)
                                .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 581, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(165, Short.MAX_VALUE))
        );
        AddThongBaoQLLayout.setVerticalGroup(
            AddThongBaoQLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddThongBaoQLLayout.createSequentialGroup()
                .addGroup(AddThongBaoQLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AddThongBaoQLLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(AddThongBaoQLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTieuDe, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(AddThongBaoQLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNoiDung, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(AddThongBaoQLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddTB)
                    .addComponent(txtSoPhongTB, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(166, Short.MAX_VALUE))
        );

        add(AddThongBaoQL, "card3");

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

        add(ViewThongBaoQL, "card4");

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/back_main.png"))); // NOI18N
        jLabel16.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel16MouseClicked(evt);
            }
        });

        jLabel50.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(19, 90, 118));
        jLabel50.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel50.setText("Hệ thống quản lý ký túc xá sinh viên");

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(237, 50, 55));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Cập nhật thông báo");

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(19, 90, 118));
        jLabel19.setText("Tiêu đề:");

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(19, 90, 118));
        jLabel20.setText("Nội dung:");

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(19, 90, 118));
        jLabel21.setText("Phòng:");

        txtUpSoPhongTB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        txtUpSoPhongTB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtUpSoPhongTBMouseClicked(evt);
            }
        });
        txtUpSoPhongTB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUpSoPhongTBActionPerformed(evt);
            }
        });

        txtUpdateNoiDung.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        txtUpdateNoiDung.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtUpdateNoiDung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUpdateNoiDungActionPerformed(evt);
            }
        });

        txtUpdateTieuDe.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        txtUpdateTieuDe.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtUpdateTieuDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUpdateTieuDeActionPerformed(evt);
            }
        });

        btnUpdateTB.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnUpdateTB.setForeground(new java.awt.Color(19, 90, 118));
        btnUpdateTB.setText("Cập nhật Thông Báo");
        btnUpdateTB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnUpdateTBMouseClicked(evt);
            }
        });
        btnUpdateTB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateTBActionPerformed(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(19, 90, 118));
        jLabel22.setText("Ngày thông báo:");

        txtUpdateNgayThongBao.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        txtUpdateNgayThongBao.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtUpdateNgayThongBao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUpdateNgayThongBaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 823, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(190, 190, 190)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnUpdateTB)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel21)
                                    .addComponent(jLabel19)
                                    .addComponent(jLabel20)
                                    .addComponent(jLabel22))
                                .addGap(92, 92, 92)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtUpdateNoiDung, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtUpSoPhongTB, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtUpdateTieuDe, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtUpdateNgayThongBao, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 1065, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUpdateTieuDe, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUpdateNoiDung, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUpSoPhongTB, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUpdateNgayThongBao, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addComponent(btnUpdateTB)
                .addContainerGap(95, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout UpdateThongBaoQLLayout = new javax.swing.GroupLayout(UpdateThongBaoQL);
        UpdateThongBaoQL.setLayout(UpdateThongBaoQLLayout);
        UpdateThongBaoQLLayout.setHorizontalGroup(
            UpdateThongBaoQLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UpdateThongBaoQLLayout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        UpdateThongBaoQLLayout.setVerticalGroup(
            UpdateThongBaoQLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UpdateThongBaoQLLayout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        add(UpdateThongBaoQL, "card5");
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

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

    private void addTBAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_addTBAncestorAdded
        // TODO add your handling code here:

    }//GEN-LAST:event_addTBAncestorAdded

    private void addTBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addTBMouseClicked
        ThongTinThongBao.setVisible(false);
        AddThongBaoQL.setVisible(true);
    }//GEN-LAST:event_addTBMouseClicked

    //Xoá
    private void deleteTBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteTBMouseClicked
        // TODO add your handling code here:
        if (count == -1) {
            JOptionPane.showMessageDialog(null, "Vui lòng chọn thông báo để xóa!");
        } else {
            int test = JOptionPane.showConfirmDialog(null, "Bạn có chắc muốn xóa thông báo hay không !", "Thông báo", JOptionPane.YES_NO_OPTION);
            if (test == JOptionPane.YES_OPTION) {
                LayMaThongBao(count);
                ThongTinThongBao tb = listthongbao.get(count);
                deleteThongBao(tb);
            } else if (test == JOptionPane.NO_OPTION) {
                JOptionPane.showMessageDialog(null, "Bạn đã hủy xóa thông báo thành công");
            }
        }
    }//GEN-LAST:event_deleteTBMouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        ThongTinThongBao.setVisible(true);
        AddThongBaoQL.setVisible(false);
        UpdateThongBaoQL.setVisible(false);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void txtTieuDejHoTenSVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTieuDejHoTenSVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTieuDejHoTenSVActionPerformed

    private void txtNoiDungjHoTenSVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNoiDungjHoTenSVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNoiDungjHoTenSVActionPerformed

    private void btnAddTBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddTBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddTBActionPerformed

    private void btnAddTBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddTBMouseClicked
        // Lấy ngày và giờ hiện tại
        LocalDateTime now = LocalDateTime.now();

        String tieuDe = txtTieuDe.getText().trim();
        String noiDung = txtNoiDung.getText().trim();
        //String soPhong = (String) txtSoPhongTB.getSelectedItem();
        if (tieuDe.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Không để trống tiêu đề. Vui lòng điền thông tin đầy đủ!");
        } else if (noiDung.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Không để trống nội dung. Vui lòng điền thông tin đầy đủ!");
        } else {
            int test = JOptionPane.showConfirmDialog(null, "Bạn chắc có muốn thêm thông báo hay không !", "Thông báo", JOptionPane.YES_NO_OPTION);
            if (test == JOptionPane.YES_OPTION) {
                // Sử dụng now để có LocalDateTime hiện tại
                if (String.valueOf(txtSoPhongTB.getSelectedItem()).equals("Tất cả")) {
                    for (ThongTinPhong phong : listphong) {
                        AddThongBaoQL(now, phong.getMaPhong());
                    }
                } else {
                    AddThongBaoQL(now);
                    resetForm();
                }
            } else if (test == JOptionPane.NO_OPTION) {
                JOptionPane.showMessageDialog(this, "Bạn đã hủy thêm thông báo thành công");
            }
        }
    }//GEN-LAST:event_btnAddTBMouseClicked

    private void loadTBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loadTBMouseClicked
        // TODO add your handling code here:
        showTable();
        count = -1;
    }//GEN-LAST:event_loadTBMouseClicked

    private void viewTBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewTBMouseClicked
        // TODO add your handling code here:
        if (count == -1) {
            JOptionPane.showMessageDialog(null, "Vui lòng chọn thông báo để xem!");
        } else {
            ThongTinThongBao.setVisible(false);
            AddThongBaoQL.setVisible(false);
            ViewThongBaoQL.setVisible(true);
            UpdateThongBaoQL.setVisible(false);
            LayThongTinThongBaoView(count);
        }
    }//GEN-LAST:event_viewTBMouseClicked

    private void quaylaiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_quaylaiMouseClicked
        // TODO add your handling code here:
        ThongTinThongBao.setVisible(true);
        AddThongBaoQL.setVisible(false);
        ViewThongBaoQL.setVisible(false);
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

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void txtViewNgayThongBaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtViewNgayThongBaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtViewNgayThongBaoActionPerformed

    private void viewTBMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewTBMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_viewTBMouseEntered

    private void tableTBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableTBMouseClicked
        // TODO add your handling code here:
        count = tableTB.getSelectedRow();
        LayMaThongBao(count);
    }//GEN-LAST:event_tableTBMouseClicked

    private void editTBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editTBMouseClicked
        // TODO add your handling code here:
        if (count == -1) {
            JOptionPane.showMessageDialog(null, "Vui lòng chọn thông tin để update!");
        } else {
            ThongTinThongBao.setVisible(false);
            AddThongBaoQL.setVisible(false);
            ViewThongBaoQL.setVisible(false);
            UpdateThongBaoQL.setVisible(true);

            LayThongTinThongBaoUp(count);
        }
    }//GEN-LAST:event_editTBMouseClicked

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked

    }//GEN-LAST:event_jLabel14MouseClicked

    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked
        ThongTinThongBao.setVisible(true);
        AddThongBaoQL.setVisible(false);
        ViewThongBaoQL.setVisible(false);
        UpdateThongBaoQL.setVisible(false);
    }//GEN-LAST:event_jLabel16MouseClicked

    private void textField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textField6ActionPerformed

    private void txtUpdateNoiDungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUpdateNoiDungActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUpdateNoiDungActionPerformed

    private void txtUpdateTieuDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUpdateTieuDeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUpdateTieuDeActionPerformed

    private void btnUpdateTBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdateTBMouseClicked
        // TODO add your handling code here:
        String tieuDe = txtUpdateTieuDe.getText().trim();
        String noiDung = txtUpdateNoiDung.getText().trim();
        String soPhong = txtUpSoPhongTB.getSelectedItem().toString();
        String ngayThongBao = txtUpdateNgayThongBao.getText().toString();
        if (tieuDe.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Không để trống tiêu đề. Vui lòng điền thông tin đầy đủ!");
        } else if (noiDung.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Không để trống nội dung. Vui lòng điền thông tin đầy đủ!");
        } else {
            int test = JOptionPane.showConfirmDialog(null, "Bạn chắc có muốn cập nhật thông tin thông báo hay không !", "Thông báo đăng ký", JOptionPane.YES_NO_OPTION);
            if (test == JOptionPane.YES_OPTION) {
                LayTieuDeSinhVien(count);
                updateTB();
                JOptionPane.showMessageDialog(null, "Cập nhật thông báo thành công!");
                showTable();
                ThongTinThongBao.setVisible(true);
                AddThongBaoQL.setVisible(false);
                ViewThongBaoQL.setVisible(false);
                UpdateThongBaoQL.setVisible(false);
            } else if (test == JOptionPane.NO_OPTION) {
                JOptionPane.showMessageDialog(null, "Bạn đã hủy cập nhật thành công");
            }
        }
    }//GEN-LAST:event_btnUpdateTBMouseClicked

    private void btnUpdateTBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateTBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUpdateTBActionPerformed

    private void txtUpdateNgayThongBaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUpdateNgayThongBaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUpdateNgayThongBaoActionPerformed

    private void txtSoPhongTBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSoPhongTBActionPerformed
        // TODO add your handling code here:
        selectedSoPhong = (String) txtSoPhongTB.getSelectedItem();
    }//GEN-LAST:event_txtSoPhongTBActionPerformed

    private void txtSoPhongTBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtSoPhongTBMouseClicked
        // TODO add your handling code here:
        selectedSoPhong = (String) txtSoPhongTB.getSelectedItem();
    }//GEN-LAST:event_txtSoPhongTBMouseClicked

    private void txtUpSoPhongTBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtUpSoPhongTBMouseClicked
        // TODO add your handling code here:
        selectedUpSoPhong = (String) txtSoPhongTB.getSelectedItem();
    }//GEN-LAST:event_txtUpSoPhongTBMouseClicked

    private void txtUpSoPhongTBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUpSoPhongTBActionPerformed
        // TODO add your handling code here:
        selectedUpSoPhong = (String) txtSoPhongTB.getSelectedItem();
    }//GEN-LAST:event_txtUpSoPhongTBActionPerformed

    private void NextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NextButtonActionPerformed
        // TODO add your handling code here:
        currentPage++;
        showTable(currentPage);
    }//GEN-LAST:event_NextButtonActionPerformed

    private void PreviousButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PreviousButtonActionPerformed
        // TODO add your handling code here:
        if (currentPage > 1) {
            currentPage--;
            showTable(currentPage);
        }
    }//GEN-LAST:event_PreviousButtonActionPerformed

    private int getTotalPages() {
        int totalItems = listthongbao.size(); // Số lượng dữ liệu trong danh sách
        return (int) Math.ceil((double) totalItems / itemsPerPage);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AddThongBaoQL;
    private java.awt.Button NextButton;
    private java.awt.Button PreviousButton;
    private javax.swing.JPanel ThongTinThongBao;
    private javax.swing.JPanel UpdateThongBaoQL;
    private javax.swing.JPanel ViewThongBaoQL;
    private javax.swing.JLabel addTB;
    private javax.swing.border.BevelBorder bevelBorder1;
    private javax.swing.JButton btnAddTB;
    private javax.swing.JButton btnUpdateTB;
    private javax.swing.JLabel deleteTB;
    private javax.swing.JLabel editTB;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JLabel loadTB;
    private javax.swing.JLabel quaylai;
    private javax.swing.JTable tableTB;
    private java.awt.TextField textField1;
    private java.awt.TextField textField2;
    private java.awt.TextField textField3;
    private java.awt.TextField textField4;
    private java.awt.TextField textField5;
    private java.awt.TextField textField6;
    private javax.swing.JTextField txtNoiDung;
    private textfield.TextFieldSearchOption txtSearch;
    private javax.swing.JComboBox<String> txtSoPhongTB;
    private javax.swing.JTextField txtTieuDe;
    private javax.swing.JComboBox<String> txtUpSoPhongTB;
    private javax.swing.JTextField txtUpdateNgayThongBao;
    private javax.swing.JTextField txtUpdateNoiDung;
    private javax.swing.JTextField txtUpdateTieuDe;
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
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        for (ThongTinThongBao tb : listthongbao) {
            String formattedDateTime = tb.getNgayThongBao().format(formatter);
            Model.addRow(new Object[]{formattedDateTime, tb.getSoPhong(), tb.getTieuDe(), tb.getNoiDung()});
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

    private void showTable(String where, String text) {
        listthongbao = new QuanLiThongBaoDAO().getAllThongBaoSearch(where, text);
        Model.setRowCount(0);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        for (ThongTinThongBao tb : listthongbao) {
            String formattedDateTime = tb.getNgayThongBao().format(formatter);
            Model.addRow(new Object[]{formattedDateTime, tb.getSoPhong(), tb.getTieuDe(), tb.getNoiDung()});
        }
        count = -1;
    }

    private void AddThongBaoQL(LocalDateTime ngayThongBao) {
        Connection conn = KetNoiSQL.getConnection();
        String sql = "INSERT INTO ThongBao (tieuDe, noiDung, soPhong, ngayThongBao) VALUES (?, ?, ?, ?)";
        int row = 0;

        try {
            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setString(1, txtTieuDe.getText().trim());
            ps.setString(2, txtNoiDung.getText().trim());
            ps.setString(3, selectedSoPhong);

            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            String formattedNgayThongBao = ngayThongBao.format(formatter);
            Timestamp ngayThongBaoTimestamp = Timestamp.valueOf(formattedNgayThongBao);

            ps.setTimestamp(4, ngayThongBaoTimestamp);
            row = ps.executeUpdate();

            if (row > 0) {
                JOptionPane.showMessageDialog(null, "Thêm thông báo thành công");
                ThongTinThongBao.setVisible(true);
                AddThongBaoQL.setVisible(false);
                ViewThongBaoQL.setVisible(false);
                UpdateThongBaoQL.setVisible(false);
            } else {
                JOptionPane.showMessageDialog(this, "Thêm thông báo không thành công");
            }

            conn.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        showTable();
    }

    private void AddThongBaoQL(LocalDateTime ngayThongBao, String maPhong) {
        Connection conn = KetNoiSQL.getConnection();
        String sql = "INSERT INTO ThongBao (tieuDe, noiDung, soPhong, ngayThongBao) VALUES (?, ?, ?, ?)";
        int row = 0;

        try {
            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setString(1, txtTieuDe.getText().trim());
            ps.setString(2, txtNoiDung.getText().trim());
            ps.setString(3, maPhong);

            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            String formattedNgayThongBao = ngayThongBao.format(formatter);
            Timestamp ngayThongBaoTimestamp = Timestamp.valueOf(formattedNgayThongBao);

            ps.setTimestamp(4, ngayThongBaoTimestamp);
            row = ps.executeUpdate();

            if (row > 0) {
                ThongTinThongBao.setVisible(true);
                AddThongBaoQL.setVisible(false);
                ViewThongBaoQL.setVisible(false);
                UpdateThongBaoQL.setVisible(false);
            } else {
                JOptionPane.showMessageDialog(this, "Thêm thông báo không thành công");
            }

            conn.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        showTable();
    }

    private void resetForm() {
        txtTieuDe.setText("");
        txtNoiDung.setText("");
        txtSoPhongTB.setSelectedIndex(0);
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

    private void LayThongTinThongBaoUp(int count) {
        ThongTinThongBao tb = listthongbao.get(count);
        txtUpdateTieuDe.setText(tb.getTieuDe());
        txtUpdateNoiDung.setText(tb.getNoiDung());

        // Sử dụng DateTimeFormatter để định dạng ngày tháng
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedNgayThongBao = tb.getNgayThongBao().format(formatter);
        txtUpdateNgayThongBao.setText(formattedNgayThongBao);
        AddComboBox();
        String soPhong = tb.getSoPhong();
        //txtUpSoPhongTB.setSelectedItem(soPhong); 
        txtUpSoPhongTB.setSelectedItem(tb.getSoPhong());
        txtUpdateNgayThongBao.setEditable(false);
    }

    private void updateTB() {
        ThongTinThongBao tb = listthongbao.get(count);
        try {
            Connection conn = KetNoiSQL.getConnection();
            String sql = "UPDATE ThongBao SET tieuDe=?, noiDung=?, soPhong=?, ngayThongBao=? WHERE tieuDe=? and soPhong=? and ngayThongBao=?";
            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setString(1, txtUpdateTieuDe.getText().trim());
            ps.setString(2, txtUpdateNoiDung.getText().trim());
            ps.setString(3, txtUpSoPhongTB.getSelectedItem().toString());
            ps.setString(4, txtUpdateNgayThongBao.getText().toString());
            ps.setString(5, tb.getTieuDe());
            ps.setString(6, tb.getSoPhong());
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            String formattedNgayThongBao = ngayThongBao.format(formatter);
            Timestamp ngayThongBaoTimestamp = Timestamp.valueOf(formattedNgayThongBao);
            ps.setTimestamp(7, ngayThongBaoTimestamp);
            ps.executeUpdate();
            conn.close();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        showTable();
    }

    private void LayTieuDeSinhVien(int count) {
        ThongTinThongBao tb = listthongbao.get(count);
        tieuDe = tb.getTieuDe();
    }

    private void deleteThongBao(ThongTinThongBao tb) {
        Connection conn = KetNoiSQL.getConnection();
        String sql = "delete from ThongBao where tieuDe = ? and soPhong =? and ngayThongBao=?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, tb.getTieuDe());
            ps.setString(2, tb.getSoPhong());
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            String formattedNgayThongBao = tb.getNgayThongBao().format(formatter);
            Timestamp ngayThongBaoTimestamp = Timestamp.valueOf(formattedNgayThongBao);
            ps.setTimestamp(3, ngayThongBaoTimestamp);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Xoá thành công");
            conn.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Lỗi xoá không thành công");
        }
        showTable();
    }

    private void LayMaThongBao(int count) {
        ThongTinThongBao tb = listthongbao.get(count);
        tieuDe = tb.getTieuDe();
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

    private void displayDateTime() {
        LocalDateTime ngayThongBao = LocalDateTime.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDateTime = ngayThongBao.format(formatter);
        JLabel label = new JLabel("Ngày giờ hiện tại: " + formattedDateTime);

        Font labelFont = new Font("Segoe UI", Font.BOLD, 12);
        label.setFont(labelFont);

        setLayout(new FlowLayout());
        add(label);
    }

    void AddComboBox() {
        txtSoPhongTB.removeAllItems();
        txtUpSoPhongTB.removeAllItems();

        listphong = new PhongDAO().getAllThongTinPhong();

        txtSoPhongTB.addItem("Tất cả");

        for (ThongTinPhong phong : listphong) {
            txtSoPhongTB.addItem(phong.getMaPhong());
            txtUpSoPhongTB.addItem(phong.getMaPhong());

        }
    }

    private void showTable(int page) {
        // Tính toán index bắt đầu và kết thúc của dữ liệu trên trang
        int startIndex = (page - 1) * rowsPerPage;
        int endIndex;

        if (Model == null || listthongbao.isEmpty()) {
            return;
        }

        // Hiển thị dữ liệu của trang hiện tại
        Model.setRowCount(0);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        if (page == 1) {
            endIndex = Math.min(startIndex + rowsPerPage, Math.min(12, listthongbao.size())); // Chỉ hiển thị 12 dòng cho trang đầu tiên
        } else {
            endIndex = Math.min(startIndex + rowsPerPage, listthongbao.size()); // Hiển thị toàn bộ dữ liệu cho các trang khác
        }

        for (int i = startIndex; i < endIndex; i++) {  
            ThongTinThongBao tb = listthongbao.get(i);
            String formattedDateTime = tb.getNgayThongBao().format(formatter);
            Model.addRow(new Object[]{formattedDateTime, tb.getSoPhong(), tb.getTieuDe(), tb.getNoiDung()});
        }

        // Kiểm tra xem có đủ dữ liệu để tạo trang tiếp theo không
        boolean hasNextPage = endIndex < listthongbao.size();
    
        // Nếu có trang tiếp theo, cho phép người dùng chuyển trang
        NextButton.setEnabled(hasNextPage);
    }

}
