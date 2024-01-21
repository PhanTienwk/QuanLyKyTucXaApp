package JFrameQuanLyKyTucXa;

import Connector.KetNoiSQL;
import dao.HopDongKTXDAO;
import dao.PhongDAO;
import dao.QuanLyNhanVienDAO;
import dao.SinhVienDAO;
import dao.SinhVienDangKyDAO;
import dao.TaiKhoanDAO;
import dao.ThongTinHoaDonDAO;
import java.awt.Color;
import java.awt.Font;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import model.ThongTinHoaDonSV;
import model.ThongTinPhong;
import model.ThongTinSinhVien;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;
import textfield.SearchOptinEvent;
import textfield.SearchOption;

/**
 *
 * @author PhanTien
 */
public class QuanLySV extends javax.swing.JPanel {

    private List<ThongTinSinhVien> listsinhvien;
    private List<ThongTinPhong> listphong;
    private DefaultTableModel Model;
    private int count = -1;
    private String maSV, tenDangNhap;
    private SinhVienDAO sinhviendao;
    private String selectedQueQuan = "An Giang", selectedUpQueQuan = "An Giang";
    private String selectedMaPhong, selectedUpMaPhong;
    private String gioitinh;
    private String cccd, sdt, email;
    private Date datecr = new Date();
    private int evcbbtt;

    public QuanLySV() {
        initComponents();
        UpdateSinhVien();
        this.hide_eye.setVisible(false);
        AddSearch();
        Model = (DefaultTableModel) tableSV.getModel();
        showTable();
        tableSV.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 12));
        tableSV.getTableHeader().setOpaque(false);
        tableSV.getTableHeader().setBackground(new Color(19, 90, 118));
        tableSV.getTableHeader().setForeground(new Color(225, 225, 225));

        AutoCompleteDecorator.decorate(txtUpQueQuanSV);
        AutoCompleteDecorator.decorate(txtQueQuanSV);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        QuanLyThongTinSV = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        ScrollPaneSV = new javax.swing.JScrollPane();
        tableSV = new javax.swing.JTable();
        addSV = new javax.swing.JLabel();
        viewSV = new javax.swing.JLabel();
        editSV = new javax.swing.JLabel();
        deleteSV = new javax.swing.JLabel();
        loadSV = new javax.swing.JLabel();
        txtSearch = new textfield.TextFieldSearchOption();
        cbbtrangthai = new javax.swing.JComboBox<>();
        UpdateSinhVien = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel48 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtUpEmail = new javax.swing.JTextField();
        rdUpNam = new javax.swing.JRadioButton();
        rdUpNu = new javax.swing.JRadioButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtUpTenSV = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtUpMaSoSV = new javax.swing.JTextField();
        txtUpMaLopSV = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        txtUpCCCD = new javax.swing.JTextField();
        btnUpdateSV = new javax.swing.JButton();
        txtUpNgaySinh = new com.toedter.calendar.JDateChooser();
        jLabel9 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        txtUpSoDienThoaiSV = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        txtUpQueQuanSV = new javax.swing.JComboBox<>();
        AddSinhVien = new javax.swing.JPanel();
        jLabel40 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        txtCCCDSV = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        rdNam = new javax.swing.JRadioButton();
        rdNu = new javax.swing.JRadioButton();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        txtTenSV = new javax.swing.JTextField();
        jLabel47 = new javax.swing.JLabel();
        txtMaSoSV = new javax.swing.JTextField();
        txtMaLopSV = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        txtTenDangNhapSV = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        txtMatKhauSV = new javax.swing.JPasswordField();
        txtNhapLaiMatKhauSV = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        btnAddSV = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNgaySinh = new com.toedter.calendar.JDateChooser();
        jLabel49 = new javax.swing.JLabel();
        txtSoDienThoaiSV = new javax.swing.JTextField();
        jLabel50 = new javax.swing.JLabel();
        txtQueQuanSV = new javax.swing.JComboBox<>();
        show_eye = new javax.swing.JLabel();
        hide_eye = new javax.swing.JLabel();
        ViewSinhVien = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        txtViewNgaySinhSV = new com.toedter.calendar.JDateChooser();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        txtViewMaSoSV = new javax.swing.JLabel();
        txtViewHoTenSV = new javax.swing.JLabel();
        txtViewCCCDSV = new javax.swing.JLabel();
        txtViewMaLopSV = new javax.swing.JLabel();
        txtViewSoDienThoaiSV = new javax.swing.JLabel();
        txtViewQueQuan = new javax.swing.JLabel();
        txtViewEmailSV = new javax.swing.JLabel();
        txtViewGioiTinh = new javax.swing.JLabel();

        setLayout(new java.awt.CardLayout());

        QuanLyThongTinSV.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(19, 90, 118));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Quản lý thông tin sinh viên");
        jLabel1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(19, 90, 118)));

        ScrollPaneSV.setBackground(new java.awt.Color(255, 255, 255));
        ScrollPaneSV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ScrollPaneSVMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ScrollPaneSVMouseExited(evt);
            }
        });

        tableSV.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tableSV.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã sinh viên", "Tên sinh viên", "CCCD", "Giới tính", "Ngày sinh", "Mã lớp ", "Số điện thoại", "Trạng thái"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tableSV.setFocusable(false);
        tableSV.setGridColor(new java.awt.Color(255, 255, 255));
        tableSV.setRowHeight(25);
        tableSV.setSelectionBackground(new java.awt.Color(19, 90, 118));
        tableSV.setSelectionForeground(new java.awt.Color(255, 255, 255));
        tableSV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableSVMouseClicked(evt);
            }
        });
        ScrollPaneSV.setViewportView(tableSV);

        addSV.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        addSV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/add_table.png"))); // NOI18N
        addSV.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addSV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addSVMouseClicked(evt);
            }
        });

        viewSV.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        viewSV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/eye_table.png"))); // NOI18N
        viewSV.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        viewSV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewSVMouseClicked(evt);
            }
        });

        editSV.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        editSV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pencil_table.png"))); // NOI18N
        editSV.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        editSV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editSVMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                editSVMouseEntered(evt);
            }
        });

        deleteSV.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        deleteSV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/delete_table.png"))); // NOI18N
        deleteSV.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        deleteSV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteSVMouseClicked(evt);
            }
        });

        loadSV.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        loadSV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/load.png"))); // NOI18N
        loadSV.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        loadSV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loadSVMouseClicked(evt);
            }
        });

        txtSearch.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(19, 90, 118)));
        txtSearch.setForeground(new java.awt.Color(19, 90, 118));
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

        cbbtrangthai.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tất cả", "Chưa đăng ký", "Đang chờ duyệt", "Đang ở", "Hết hợp đồng" }));
        cbbtrangthai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbtrangthaiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout QuanLyThongTinSVLayout = new javax.swing.GroupLayout(QuanLyThongTinSV);
        QuanLyThongTinSV.setLayout(QuanLyThongTinSVLayout);
        QuanLyThongTinSVLayout.setHorizontalGroup(
            QuanLyThongTinSVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(QuanLyThongTinSVLayout.createSequentialGroup()
                .addGroup(QuanLyThongTinSVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(QuanLyThongTinSVLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(loadSV, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(addSV, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(viewSV, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(editSV, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(deleteSV, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cbbtrangthai, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(QuanLyThongTinSVLayout.createSequentialGroup()
                        .addContainerGap(15, Short.MAX_VALUE)
                        .addComponent(ScrollPaneSV, javax.swing.GroupLayout.PREFERRED_SIZE, 975, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(82, Short.MAX_VALUE))
        );
        QuanLyThongTinSVLayout.setVerticalGroup(
            QuanLyThongTinSVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(QuanLyThongTinSVLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(QuanLyThongTinSVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(deleteSV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(viewSV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addSV, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                    .addComponent(editSV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(loadSV, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                    .addComponent(txtSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbbtrangthai))
                .addGap(23, 23, 23)
                .addComponent(ScrollPaneSV, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 95, Short.MAX_VALUE))
        );

        add(QuanLyThongTinSV, "card2");

        UpdateSinhVien.setPreferredSize(new java.awt.Dimension(1066, 507));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel48.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(19, 90, 118));
        jLabel48.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel48.setText("Hệ thống quản lý ký túc xá sinh viên");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(237, 50, 55));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Cập nhật thông tin sinh viên");

        txtUpEmail.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtUpEmail.setForeground(new java.awt.Color(19, 90, 118));
        txtUpEmail.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(19, 90, 118)));
        txtUpEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUpEmailActionPerformed1(evt);
            }
        });

        rdUpNam.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup2.add(rdUpNam);
        rdUpNam.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        rdUpNam.setForeground(new java.awt.Color(19, 90, 118));
        rdUpNam.setText("Nam");
        rdUpNam.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rdUpNamMouseClicked(evt);
            }
        });

        rdUpNu.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup2.add(rdUpNu);
        rdUpNu.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        rdUpNu.setForeground(new java.awt.Color(19, 90, 118));
        rdUpNu.setText("Nữ");
        rdUpNu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rdUpNuMouseClicked(evt);
            }
        });
        rdUpNu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdUpNuActionPerformed1(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(19, 90, 118));
        jLabel13.setText("Họ và tên sinh viên :");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(19, 90, 118));
        jLabel14.setText("Mã số sinh viên :");

        txtUpTenSV.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtUpTenSV.setForeground(new java.awt.Color(19, 90, 118));
        txtUpTenSV.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(19, 90, 118)));
        txtUpTenSV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUpTenSVActionPerformed1(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(19, 90, 118));
        jLabel15.setText("Căn cước công dân :");

        txtUpMaSoSV.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtUpMaSoSV.setForeground(new java.awt.Color(19, 90, 118));
        txtUpMaSoSV.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(19, 90, 118)));
        txtUpMaSoSV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUpMaSoSVActionPerformed1(evt);
            }
        });

        txtUpMaLopSV.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtUpMaLopSV.setForeground(new java.awt.Color(19, 90, 118));
        txtUpMaLopSV.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(19, 90, 118)));
        txtUpMaLopSV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUpMaLopSVActionPerformed1(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(19, 90, 118));
        jLabel16.setText("Ngày sinh :");

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(19, 90, 118));
        jLabel17.setText("Giới tính :");

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(19, 90, 118));
        jLabel18.setText("Email :");

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(19, 90, 118));
        jLabel19.setText("Mã lớp :");

        txtUpCCCD.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtUpCCCD.setForeground(new java.awt.Color(19, 90, 118));
        txtUpCCCD.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(19, 90, 118)));
        txtUpCCCD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUpCCCDActionPerformed1(evt);
            }
        });

        btnUpdateSV.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnUpdateSV.setForeground(new java.awt.Color(237, 50, 55));
        btnUpdateSV.setText("Lưu sinh viên");
        btnUpdateSV.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(237, 50, 55)));
        btnUpdateSV.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUpdateSV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnUpdateSVMouseClicked(evt);
            }
        });

        txtUpNgaySinh.setDateFormatString("dd-MM-yyyy");

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/back_main.png"))); // NOI18N
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });

        jLabel28.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(19, 90, 118));
        jLabel28.setText("Số điện thoại :");

        txtUpSoDienThoaiSV.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtUpSoDienThoaiSV.setForeground(new java.awt.Color(19, 90, 118));
        txtUpSoDienThoaiSV.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(19, 90, 118)));
        txtUpSoDienThoaiSV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUpSoDienThoaiSVActionPerformed1(evt);
            }
        });

        jLabel29.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(19, 90, 118));
        jLabel29.setText("Quê quán :");

        txtUpQueQuanSV.setForeground(new java.awt.Color(19, 90, 118));
        txtUpQueQuanSV.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "An Giang", "Bà Rịa – Vũng Tàu", "Bắc Giang", "Bắc Kạn", "Bạc Liêu", "Bắc Ninh", "Bến Tre", "Bình Định", "Bình Dương", "Bình Phước", "Bình Thuận", "Cà Mau", "Cần Thơ", "Cao Bằng", "Đà Nẵng", "Đắk Lắk", "Đắk Nông", "Điện Biên", "Đồng Nai", "Đồng Tháp", "Gia Lai", "Hà Giang", "Hà Nam", "Hà Nội", "Hà Tĩnh", "Hải Dương", "Hải Phòng", "Hậu Giang", "Hòa Bình", "Hưng Yên", "Khánh Hòa", "Kiên Giang", "Kon Tum", "Lai Châu", "Lâm Đồng", "Lạng Sơn", "Lào Cai", "Long An", "Nam Định", "Nghệ An", "Ninh Bình", "Ninh Thuận", "Phú Thọ", "Phú Yên", "Quảng Bình", "Quảng Nam", "Quảng Ngãi", "Quảng Ninh", "Quảng Trị", "Sóc Trăng", "Sơn La", "Tây Ninh", "Thái Bình", "Thái Nguyên", "Thanh Hóa", "Thừa Thiên Huế", "Tiền Giang", "TP Hồ Chí Minh", "Trà Vinh", "Tuyên Quang", "Vĩnh Long", "Vĩnh Phúc", "Yên Bái", "Khác" }));
        txtUpQueQuanSV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUpQueQuanSVActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel48, javax.swing.GroupLayout.DEFAULT_SIZE, 967, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(340, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtUpTenSV)
                            .addComponent(txtUpMaSoSV, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtUpNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(96, 96, 96))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel13)
                                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(36, 36, 36)
                                    .addComponent(txtUpCCCD, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(36, 36, 36)
                                    .addComponent(rdUpNam, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(rdUpNu, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(109, 109, 109)
                                        .addComponent(txtUpMaLopSV, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtUpSoDienThoaiSV, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtUpQueQuanSV, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(36, 36, 36)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtUpEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnUpdateSV, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(275, 275, 275))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                    .addComponent(jLabel48, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(txtUpTenSV, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtUpMaSoSV, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtUpCCCD, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUpNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUpMaLopSV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rdUpNam)
                    .addComponent(rdUpNu))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUpSoDienThoaiSV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUpQueQuanSV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUpEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58)
                .addComponent(btnUpdateSV, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout UpdateSinhVienLayout = new javax.swing.GroupLayout(UpdateSinhVien);
        UpdateSinhVien.setLayout(UpdateSinhVienLayout);
        UpdateSinhVienLayout.setHorizontalGroup(
            UpdateSinhVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        UpdateSinhVienLayout.setVerticalGroup(
            UpdateSinhVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        add(UpdateSinhVien, "card4");

        AddSinhVien.setBackground(new java.awt.Color(19, 90, 118));

        jLabel40.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(255, 255, 255));
        jLabel40.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel40.setText("Hệ thống quản lý ký túc xá sinh viên");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 255, 0));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Thêm thông tin sinh viên ở ký túc xá");

        jLabel41.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(255, 255, 255));
        jLabel41.setText("Ngày sinh :");

        jLabel42.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(255, 255, 255));
        jLabel42.setText("Giới tính :");

        jLabel43.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(255, 255, 255));
        jLabel43.setText("Email :");

        jLabel44.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(255, 255, 255));
        jLabel44.setText("Mã lớp :");

        txtCCCDSV.setBackground(new java.awt.Color(19, 90, 118));
        txtCCCDSV.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtCCCDSV.setForeground(new java.awt.Color(255, 255, 255));
        txtCCCDSV.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        txtCCCDSV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCanCuocSVActionPerformed(evt);
            }
        });

        txtEmail.setBackground(new java.awt.Color(19, 90, 118));
        txtEmail.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtEmail.setForeground(new java.awt.Color(255, 255, 255));
        txtEmail.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jEmailSVActionPerformed(evt);
            }
        });

        rdNam.setBackground(new java.awt.Color(19, 90, 118));
        buttonGroup1.add(rdNam);
        rdNam.setForeground(new java.awt.Color(255, 255, 255));
        rdNam.setSelected(true);
        rdNam.setText("Nam");
        rdNam.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rdNamMouseClicked(evt);
            }
        });

        rdNu.setBackground(new java.awt.Color(19, 90, 118));
        buttonGroup1.add(rdNu);
        rdNu.setForeground(new java.awt.Color(255, 255, 255));
        rdNu.setText("Nữ");
        rdNu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rdNuMouseClicked(evt);
            }
        });
        rdNu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        jLabel45.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(255, 255, 255));
        jLabel45.setText("Họ và tên sinh viên :");

        jLabel46.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(255, 255, 255));
        jLabel46.setText("Mã số sinh viên :");

        txtTenSV.setBackground(new java.awt.Color(19, 90, 118));
        txtTenSV.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtTenSV.setForeground(new java.awt.Color(255, 255, 255));
        txtTenSV.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        txtTenSV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jHoTenSVActionPerformed(evt);
            }
        });

        jLabel47.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(255, 255, 255));
        jLabel47.setText("Căn cước công dân :");

        txtMaSoSV.setBackground(new java.awt.Color(19, 90, 118));
        txtMaSoSV.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtMaSoSV.setForeground(new java.awt.Color(255, 255, 255));
        txtMaSoSV.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        txtMaSoSV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMaSoSVActionPerformed(evt);
            }
        });

        txtMaLopSV.setBackground(new java.awt.Color(19, 90, 118));
        txtMaLopSV.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtMaLopSV.setForeground(new java.awt.Color(255, 255, 255));
        txtMaLopSV.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        txtMaLopSV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMaLopSVActionPerformed(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(19, 90, 118));
        jPanel4.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 1, new java.awt.Color(255, 255, 255)));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 431, Short.MAX_VALUE)
        );

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Tên đăng nhập :");

        txtTenDangNhapSV.setBackground(new java.awt.Color(19, 90, 118));
        txtTenDangNhapSV.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtTenDangNhapSV.setForeground(new java.awt.Color(255, 255, 255));
        txtTenDangNhapSV.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        txtTenDangNhapSV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTenDangNhapSVActionPerformed(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Mật khẩu :");

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Nhập lại mật khẩu :");

        txtMatKhauSV.setBackground(new java.awt.Color(19, 90, 118));
        txtMatKhauSV.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtMatKhauSV.setForeground(new java.awt.Color(255, 255, 255));
        txtMatKhauSV.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        txtMatKhauSV.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        txtNhapLaiMatKhauSV.setBackground(new java.awt.Color(19, 90, 118));
        txtNhapLaiMatKhauSV.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtNhapLaiMatKhauSV.setForeground(new java.awt.Color(255, 255, 255));
        txtNhapLaiMatKhauSV.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        txtNhapLaiMatKhauSV.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 255, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Thông tin của sinh viên");

        btnAddSV.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAddSV.setForeground(new java.awt.Color(19, 90, 118));
        btnAddSV.setText("Lưu sinh viên");
        btnAddSV.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAddSV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddSVMouseClicked(evt);
            }
        });
        btnAddSV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddSVActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 255, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Thông tin tài khoản của sinh viên");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/back_white.png"))); // NOI18N
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        txtNgaySinh.setBackground(new java.awt.Color(19, 90, 118));
        txtNgaySinh.setDateFormatString("dd-MM-yyyy");

        jLabel49.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(255, 255, 255));
        jLabel49.setText("Số điện thoại :");

        txtSoDienThoaiSV.setBackground(new java.awt.Color(19, 90, 118));
        txtSoDienThoaiSV.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtSoDienThoaiSV.setForeground(new java.awt.Color(255, 255, 255));
        txtSoDienThoaiSV.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        txtSoDienThoaiSV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSoDienThoaiSVjMaLopSVActionPerformed(evt);
            }
        });

        jLabel50.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(255, 255, 255));
        jLabel50.setText("Quê quán :");

        txtQueQuanSV.setForeground(new java.awt.Color(19, 90, 118));
        txtQueQuanSV.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "An Giang", "Bà Rịa – Vũng Tàu", "Bắc Giang", "Bắc Kạn", "Bạc Liêu", "Bắc Ninh", "Bến Tre", "Bình Định", "Bình Dương", "Bình Phước", "Bình Thuận", "Cà Mau", "Cần Thơ", "Cao Bằng", "Đà Nẵng", "Đắk Lắk", "Đắk Nông", "Điện Biên", "Đồng Nai", "Đồng Tháp", "Gia Lai", "Hà Giang", "Hà Nam", "Hà Nội", "Hà Tĩnh", "Hải Dương", "Hải Phòng", "Hậu Giang", "Hòa Bình", "Hưng Yên", "Khánh Hòa", "Kiên Giang", "Kon Tum", "Lai Châu", "Lâm Đồng", "Lạng Sơn", "Lào Cai", "Long An", "Nam Định", "Nghệ An", "Ninh Bình", "Ninh Thuận", "Phú Thọ", "Phú Yên", "Quảng Bình", "Quảng Nam", "Quảng Ngãi", "Quảng Ninh", "Quảng Trị", "Sóc Trăng", "Sơn La", "Tây Ninh", "Thái Bình", "Thái Nguyên", "Thanh Hóa", "Thừa Thiên Huế", "Tiền Giang", "TP Hồ Chí Minh", "Trà Vinh", "Tuyên Quang", "Vĩnh Long", "Vĩnh Phúc", "Yên Bái", "Khác" }));
        txtQueQuanSV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQueQuanSVActionPerformed(evt);
            }
        });

        show_eye.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        show_eye.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/show_eye.png"))); // NOI18N
        show_eye.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                show_eyeMousePressed(evt);
            }
        });

        hide_eye.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hide_eye.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/hide_eye.png"))); // NOI18N
        hide_eye.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                hide_eyeMousePressed(evt);
            }
        });

        javax.swing.GroupLayout AddSinhVienLayout = new javax.swing.GroupLayout(AddSinhVien);
        AddSinhVien.setLayout(AddSinhVienLayout);
        AddSinhVienLayout.setHorizontalGroup(
            AddSinhVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(AddSinhVienLayout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel40, javax.swing.GroupLayout.DEFAULT_SIZE, 980, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AddSinhVienLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(AddSinhVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AddSinhVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel47, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(AddSinhVienLayout.createSequentialGroup()
                            .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(346, 346, 346)))
                    .addGroup(AddSinhVienLayout.createSequentialGroup()
                        .addGroup(AddSinhVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(AddSinhVienLayout.createSequentialGroup()
                                .addGroup(AddSinhVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(AddSinhVienLayout.createSequentialGroup()
                                        .addGroup(AddSinhVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(36, 36, 36))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AddSinhVienLayout.createSequentialGroup()
                                        .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(61, 61, 61)))
                                .addGap(82, 82, 82)
                                .addComponent(rdNu, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(AddSinhVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(AddSinhVienLayout.createSequentialGroup()
                                    .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(108, 108, 108)
                                    .addGroup(AddSinhVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(AddSinhVienLayout.createSequentialGroup()
                                            .addGap(2, 2, 2)
                                            .addGroup(AddSinhVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(txtMaLopSV, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txtEmail, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(rdNam, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txtSoDienThoaiSV, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txtQueQuanSV, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, AddSinhVienLayout.createSequentialGroup()
                                    .addGroup(AddSinhVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(AddSinhVienLayout.createSequentialGroup()
                                            .addComponent(jLabel45)
                                            .addGap(46, 46, 46))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AddSinhVienLayout.createSequentialGroup()
                                            .addComponent(jLabel46)
                                            .addGap(71, 71, 71)))
                                    .addGroup(AddSinhVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtMaSoSV, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(AddSinhVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtTenSV)
                                            .addGroup(AddSinhVienLayout.createSequentialGroup()
                                                .addComponent(txtCCCDSV, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE))))))
                            .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)))
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(AddSinhVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AddSinhVienLayout.createSequentialGroup()
                        .addGroup(AddSinhVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnAddSV, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(AddSinhVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(AddSinhVienLayout.createSequentialGroup()
                                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(36, 36, 36)
                                    .addComponent(txtNhapLaiMatKhauSV))
                                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(AddSinhVienLayout.createSequentialGroup()
                                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(36, 36, 36)
                                    .addGroup(AddSinhVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtTenDangNhapSV)
                                        .addComponent(txtMatKhauSV, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(18, 18, 18)
                        .addGroup(AddSinhVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(hide_eye, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(show_eye, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 532, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );
        AddSinhVienLayout.setVerticalGroup(
            AddSinhVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AddSinhVienLayout.createSequentialGroup()
                .addGroup(AddSinhVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AddSinhVienLayout.createSequentialGroup()
                        .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AddSinhVienLayout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)))
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(AddSinhVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AddSinhVienLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(AddSinhVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(AddSinhVienLayout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(AddSinhVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(AddSinhVienLayout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtTenSV, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(12, 12, 12)
                                .addGroup(AddSinhVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtMaSoSV, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(12, 12, 12)
                                .addGroup(AddSinhVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCCCDSV, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(AddSinhVienLayout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(AddSinhVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AddSinhVienLayout.createSequentialGroup()
                                        .addComponent(txtNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(8, 8, 8)))
                                .addGroup(AddSinhVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtMaLopSV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(AddSinhVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(rdNam)
                                    .addComponent(rdNu))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(AddSinhVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel49, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtSoDienThoaiSV, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(AddSinhVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtQueQuanSV)
                                    .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(AddSinhVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(AddSinhVienLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addGroup(AddSinhVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtTenDangNhapSV, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(AddSinhVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(AddSinhVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(AddSinhVienLayout.createSequentialGroup()
                                    .addComponent(txtMatKhauSV, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(1, 1, 1)))
                            .addGroup(AddSinhVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(hide_eye, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(show_eye, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(AddSinhVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(AddSinhVienLayout.createSequentialGroup()
                                .addComponent(txtNhapLaiMatKhauSV, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)))
                        .addGap(33, 33, 33)
                        .addComponent(btnAddSV, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        add(AddSinhVien, "card3");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel30.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(19, 90, 118));
        jLabel30.setText("Số điện thoại :");

        jLabel31.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(19, 90, 118));
        jLabel31.setText("Căn cước công dân :");

        jLabel32.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(19, 90, 118));
        jLabel32.setText("Quê quán :");

        jLabel33.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(19, 90, 118));
        jLabel33.setText("Ngày sinh :");

        jLabel34.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(19, 90, 118));
        jLabel34.setText("Giới tính :");

        jLabel35.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(19, 90, 118));
        jLabel35.setText("Email :");

        jLabel36.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(19, 90, 118));
        jLabel36.setText("Mã lớp :");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(237, 50, 55));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Thông tin sinh viên");

        jLabel51.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(19, 90, 118));
        jLabel51.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel51.setText("Hệ thống quản lý ký túc xá sinh viên");

        jLabel53.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel53.setForeground(new java.awt.Color(19, 90, 118));
        jLabel53.setText("Họ và tên sinh viên :");

        txtViewNgaySinhSV.setDateFormatString("dd-MM-yyyy");

        jLabel54.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel54.setForeground(new java.awt.Color(19, 90, 118));
        jLabel54.setText("Mã số sinh viên :");

        jLabel55.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel55.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/back_main.png"))); // NOI18N
        jLabel55.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel55.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel55MouseClicked(evt);
            }
        });

        txtViewMaSoSV.setBackground(new java.awt.Color(255, 255, 255));
        txtViewMaSoSV.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtViewMaSoSV.setForeground(new java.awt.Color(19, 90, 118));

        txtViewHoTenSV.setBackground(new java.awt.Color(255, 255, 255));
        txtViewHoTenSV.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtViewHoTenSV.setForeground(new java.awt.Color(19, 90, 118));

        txtViewCCCDSV.setBackground(new java.awt.Color(255, 255, 255));
        txtViewCCCDSV.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtViewCCCDSV.setForeground(new java.awt.Color(19, 90, 118));

        txtViewMaLopSV.setBackground(new java.awt.Color(255, 255, 255));
        txtViewMaLopSV.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtViewMaLopSV.setForeground(new java.awt.Color(19, 90, 118));

        txtViewSoDienThoaiSV.setBackground(new java.awt.Color(255, 255, 255));
        txtViewSoDienThoaiSV.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtViewSoDienThoaiSV.setForeground(new java.awt.Color(19, 90, 118));

        txtViewQueQuan.setBackground(new java.awt.Color(255, 255, 255));
        txtViewQueQuan.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtViewQueQuan.setForeground(new java.awt.Color(19, 90, 118));

        txtViewEmailSV.setBackground(new java.awt.Color(255, 255, 255));
        txtViewEmailSV.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtViewEmailSV.setForeground(new java.awt.Color(19, 90, 118));

        txtViewGioiTinh.setBackground(new java.awt.Color(255, 255, 255));
        txtViewGioiTinh.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtViewGioiTinh.setForeground(new java.awt.Color(19, 90, 118));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(285, 285, 285)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtViewCCCDSV, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtViewEmailSV, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtViewQueQuan, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtViewSoDienThoaiSV, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtViewMaLopSV, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtViewNgaySinhSV, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel53)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtViewHoTenSV, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel54)
                            .addGap(74, 74, 74)
                            .addComponent(txtViewMaSoSV, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(49, 49, 49)
                            .addComponent(txtViewGioiTinh, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel55, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 892, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 81, Short.MAX_VALUE))
            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel55, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                    .addComponent(jLabel51, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtViewHoTenSV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtViewMaSoSV, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtViewCCCDSV, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(txtViewNgaySinhSV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtViewMaLopSV, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(txtViewGioiTinh, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtViewSoDienThoaiSV, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtViewQueQuan, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtViewEmailSV, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(131, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout ViewSinhVienLayout = new javax.swing.GroupLayout(ViewSinhVien);
        ViewSinhVien.setLayout(ViewSinhVienLayout);
        ViewSinhVienLayout.setHorizontalGroup(
            ViewSinhVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        ViewSinhVienLayout.setVerticalGroup(
            ViewSinhVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ViewSinhVienLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        add(ViewSinhVien, "card5");
    }// </editor-fold>//GEN-END:initComponents

    private void addSVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addSVMouseClicked
        // TODO add your handling code here:
        AddSinhVien.setVisible(true);
        QuanLyThongTinSV.setVisible(false);
        UpdateSinhVien.setVisible(false);
        ViewSinhVien.setVisible(false);
    }//GEN-LAST:event_addSVMouseClicked

    private void txtTenDangNhapSVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTenDangNhapSVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTenDangNhapSVActionPerformed

    private void jMaLopSVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMaLopSVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMaLopSVActionPerformed

    private void jMaSoSVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMaSoSVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMaSoSVActionPerformed

    private void jHoTenSVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jHoTenSVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jHoTenSVActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jEmailSVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jEmailSVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jEmailSVActionPerformed

    private void jCanCuocSVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCanCuocSVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCanCuocSVActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        QuanLyThongTinSV.setVisible(true);
        AddSinhVien.setVisible(false);
        UpdateSinhVien.setVisible(false);
        ViewSinhVien.setVisible(false);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void btnAddSVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddSVMouseClicked
        // TODO add your handling code here:
        PhongDAO pd = new PhongDAO();

        String hotensv = txtTenSV.getText().trim();
        String masv = txtMaSoSV.getText().trim();
        String cccdsv = txtCCCDSV.getText().trim();
        Date ngaysinhsv = txtNgaySinh.getDate();
        String malopsv = txtMaLopSV.getText().trim();
        String sodienthoaisv = txtSoDienThoaiSV.getText().trim();
        String emailsv = txtEmail.getText().trim();
        String tendangnhapsv = txtTenDangNhapSV.getText().trim();
        String matkhau = txtMatKhauSV.getText().trim();
        String nhaplaimatkhau = txtNhapLaiMatKhauSV.getText().trim();

        // Ràng buộc điều kiện chi tiết
        String ycmasv = "[A-Z]{1}[0-9]{2}[A-Z]{4}[0-9]{3}";
        String ycsdt = "^[0]{1}[0-9]{9}";
        String yccccd = "^([0-9]{9})*([0-9]{12})*$";
        String ycmalop = "^[A-Z]{1}[0-9]{2}[A-Z]{4}[0-9]{2}";
        String yctandangnhap = "^[a-zA-Z0-9]+$";

        //Kiểm tra tài khoản, thông tin đã tồn tại hay chưa
        boolean kiemtramaso = new SinhVienDAO().KiemTraMaSoSV(masv);
        boolean kiemtracccd = new SinhVienDAO().KiemTraCCCDSV(cccdsv);
        boolean kiemtraemail = new SinhVienDAO().KiemTraEmailSV(emailsv);
        boolean kiemtrasdt = new SinhVienDAO().KiemTraSDTSV(sodienthoaisv);
        boolean kiemtratendn = new TaiKhoanDAO().KiemTraTenDNTK(tendangnhapsv);
        boolean kiemtracccdnhanvien = new QuanLyNhanVienDAO().KiemTraCCCDNV(cccdsv);
        boolean kiemtraemailnhanvien = new QuanLyNhanVienDAO().KiemTraEmailNV(emailsv);
        boolean kiemtrasdtnhanvien = new QuanLyNhanVienDAO().KiemTraSDTNV(sodienthoaisv);

        if (hotensv.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Không để trống họ tên sinh viên. Vui lòng điền thông tin đầy đủ!");
        } else if (masv.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Không để trống mã số sinh viên. Vui lòng điền thông tin đầy đủ!");
        } else if (cccdsv.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Không để trống căn cước công dân sinh viên. Vui lòng điền thông tin đầy đủ!");
        } else if (malopsv.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Không để trống mã lớp sinh viên. Vui lòng điền thông tin đầy đủ!");
        } else if (sodienthoaisv.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Không để trống số điện thoại sinh viên. Vui lòng điền thông tin đầy đủ!");
        } else if (emailsv.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Không để trống email sinh viên. Vui lòng điền thông tin đầy đủ!");
        } else if (tendangnhapsv.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Không để trống tên đăng nhập. Vui lòng điền thông tin đầy đủ!");
        } else if (matkhau.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Không để trống mật khẩu. Vui lòng điền thông tin đầy đủ!");
        } else if (nhaplaimatkhau.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Không để trống nhập lại mật khẩu. Vui lòng điền thông tin đầy đủ!");
        } else if (!masv.matches(ycmasv)) {
            JOptionPane.showMessageDialog(null, "Định dạng mã số sinh viên không dúng. Ví dụ : N21DCCN001");
        } else if (!cccdsv.matches(yccccd)) {
            JOptionPane.showMessageDialog(null, "Định dạng căn cước công dân không đúng. Vui lòng nhập lại!");
        } else if (!sodienthoaisv.matches(ycsdt)) {
            JOptionPane.showMessageDialog(null, "Định dạng số điện thoại không dúng. Ví dụ : 0827364857");
        } else if (!malopsv.matches(ycmalop)) {
            JOptionPane.showMessageDialog(null, "Định dạng mã lớp không dúng. Ví dụ : D21CQCN01");
        } else if (!emailsv.contains("@gmail.com")) {
            JOptionPane.showMessageDialog(null, "Định dạng gmail không đúng. Vui lòng nhập lại");
        } else if (!matkhau.equals(nhaplaimatkhau)) {
            JOptionPane.showMessageDialog(null, "Mật khẩu nhập lại không trùng với mật khẩu. Vui lòng nhập lại!");
        } else if (kiemtramaso) {
            JOptionPane.showMessageDialog(null, "Mã số sinh viên đã được đăng ký!");
        } else if (kiemtracccd || kiemtracccdnhanvien) {
            JOptionPane.showMessageDialog(null, "Căn cước sinh viên đã được đăng ký!");
        } else if (kiemtraemail || kiemtraemailnhanvien) {
            JOptionPane.showMessageDialog(null, "Email sinh viên đã được đăng ký!");
        } else if (kiemtrasdt || kiemtrasdtnhanvien) {
            JOptionPane.showMessageDialog(null, "Số điện thoại sinh viên đã được đăng ký!");
        } else if (kiemtratendn) {
            JOptionPane.showMessageDialog(null, "Tên đăng nhập sinh viên đã tồn tại!");
        } else if (!tendangnhapsv.matches(yctandangnhap)) {
            JOptionPane.showMessageDialog(null, "Tên đăng nhập sinh viên chỉ có số và chữ trong alphabet");
        } else {
            int test = JOptionPane.showConfirmDialog(null, "Bạn chắc có muốn thêm sinh viên hay không !", "Thông báo đăng ký", JOptionPane.YES_NO_OPTION);
            if (test == JOptionPane.YES_OPTION) {
                AddTaiKhoan();
                AddSinhVien();
                //resetForm();
            } else if (test == JOptionPane.NO_OPTION) {
                JOptionPane.showMessageDialog(null, "Bạn đã hủy thêm sinh viên thành công");
            }
        }


    }//GEN-LAST:event_btnAddSVMouseClicked

    private void deleteSVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteSVMouseClicked
        // TODO add your handling code here:
        if (count == -1) {
            JOptionPane.showMessageDialog(null, "Vui lòng chọn sinh viên để xóa!");
        } else {
            int test = JOptionPane.showConfirmDialog(null, "Bạn chắc có muốn xóa sinh viên hay không !", "Thông báo", JOptionPane.YES_NO_OPTION);
            if (test == JOptionPane.YES_OPTION) {
                LayMaSinhVien(count);
                new TaiKhoanDAO().XoaTaiKhoan(email);
            } else if (test == JOptionPane.NO_OPTION) {
                JOptionPane.showMessageDialog(null, "Bạn đã hủy xóa sinh viên thành công");
            }
        }
        showTable();
    }//GEN-LAST:event_deleteSVMouseClicked

    private void txtUpEmailActionPerformed1(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUpEmailActionPerformed1
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUpEmailActionPerformed1

    private void rdUpNuActionPerformed1(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdUpNuActionPerformed1
        // TODO add your handling code here:
    }//GEN-LAST:event_rdUpNuActionPerformed1

    private void btnUpdateSVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdateSVMouseClicked
        // TODO add your handling code here:
        ThongTinSinhVien sv = listsinhvien.get(count);
        String hotensv = txtUpTenSV.getText().trim();
        String masv = txtUpMaSoSV.getText().trim();
        String cccdsv = txtUpCCCD.getText().trim();
        Date ngaysinhsv = txtUpNgaySinh.getDate();
        String malopsv = txtUpMaLopSV.getText().trim();
        String sodienthoaisv = txtUpSoDienThoaiSV.getText().trim();
        String emailsv = txtUpEmail.getText().trim();

        // Ràng buộc điều kiện chi tiết
        String ycmasv = "[A-Z]{1}[0-9]{2}[A-Z]{4}[0-9]{3}";
        String ycsdt = "^[0]{1}[0-9]{9}";
        String yccccd = "^([0-9]{9})*([0-9]{12})*$";
        String ycmalop = "^[A-Z]{1}[0-9]{2}[A-Z]{4}[0-9]{2}";
        String yctandangnhap = "^[a-zA-Z0-9]+$";

        //Kiểm tra tài khoản, thông tin đã tồn tại hay chưa
        boolean kiemtramaso = new SinhVienDAO().UpKiemTraMaSoSV(masv, maSV);
        boolean kiemtracccd = new SinhVienDAO().UpKiemTraCCCDSV(cccdsv, cccd);
        boolean kiemtraemail = new SinhVienDAO().UpKiemTraEmailSV(emailsv, email);
        boolean kiemtrasdt = new SinhVienDAO().UpKiemTraSDTSV(sodienthoaisv, sdt);
        boolean kiemtramasonhanvien = new QuanLyNhanVienDAO().UpKiemTraEmailNV(masv, maSV);
        boolean kiemtracccdnhanvien = new QuanLyNhanVienDAO().UpKiemTraCCCDNV(cccdsv, cccd);
        boolean kiemtraemailnhanvien = new QuanLyNhanVienDAO().UpKiemTraEmailNV(emailsv, email);
        boolean kiemtrasdtnhanvien = new QuanLyNhanVienDAO().UpKiemTraSDTNV(sodienthoaisv, sdt);

        if (hotensv.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Không để trống họ tên sinh viên. Vui lòng điền thông tin đầy đủ!");
        } else if (masv.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Không để trống mã số sinh viên. Vui lòng điền thông tin đầy đủ!");
        } else if (cccdsv.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Không để trống căn cước công dân sinh viên. Vui lòng điền thông tin đầy đủ!");
        } else if (malopsv.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Không để trống mã lớp sinh viên. Vui lòng điền thông tin đầy đủ!");
        } else if (sodienthoaisv.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Không để trống số điện thoại sinh viên. Vui lòng điền thông tin đầy đủ!");
        } else if (emailsv.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Không để trống email sinh viên. Vui lòng điền thông tin đầy đủ!");
        } else if (!masv.matches(ycmasv)) {
            JOptionPane.showMessageDialog(null, "Định dạng mã số sinh viên không dúng. Ví dụ : N21DCCN001");
        } else if (!cccdsv.matches(yccccd)) {
            JOptionPane.showMessageDialog(null, "Định dạng căn cước công dân không đúng. Vui lòng nhập lại!");
        } else if (!sodienthoaisv.matches(ycsdt)) {
            JOptionPane.showMessageDialog(null, "Định dạng số điện thoại không dúng. Ví dụ : 0827364857");
        } else if (!malopsv.matches(ycmalop)) {
            JOptionPane.showMessageDialog(null, "Định dạng mã lớp không dúng. Ví dụ : D21CQCN01");
        } else if (!emailsv.contains("@gmail.com")) {
            JOptionPane.showMessageDialog(null, "Định dạng gmail không đúng. Vui lòng nhập lại");
        } else if (kiemtramaso || kiemtramasonhanvien) {
            JOptionPane.showMessageDialog(null, "Mã số sinh viên đã được đăng ký!");
        } else if (kiemtracccd || kiemtracccdnhanvien) {
            JOptionPane.showMessageDialog(null, "Căn cước sinh viên đã được đăng ký!");
        } else if (kiemtraemail || kiemtraemailnhanvien) {
            JOptionPane.showMessageDialog(null, "Email sinh viên đã được đăng ký!");
        } else if (kiemtrasdt || kiemtrasdtnhanvien) {
            JOptionPane.showMessageDialog(null, "Số điện thoại sinh viên đã được đăng ký!");
        } else {
            int test = JOptionPane.showConfirmDialog(null, "Bạn chắc có muốn cập nhật thông tin sinh viên hay không !", "Thông báo đăng ký", JOptionPane.YES_NO_OPTION);
            if (test == JOptionPane.YES_OPTION) {
                new TaiKhoanDAO().CapNhatEmail(sv.getEmail(), emailsv);
                updateSV(sv.getMaSV());
                QuanLyThongTinSV.setVisible(true);
                UpdateSinhVien.setVisible(false);
            } else if (test == JOptionPane.NO_OPTION) {
                JOptionPane.showMessageDialog(null, "Bạn đã hủy cập nhật thành công");
            }
        }
    }//GEN-LAST:event_btnUpdateSVMouseClicked

    private void editSVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editSVMouseClicked
        // TODO add your handling code here:
        if (count == -1) {
            JOptionPane.showMessageDialog(null, "Vui lòng chọn sinh viên để update!");
        } else {
            UpdateSinhVien.setVisible(true);
            QuanLyThongTinSV.setVisible(false);
            AddSinhVien.setVisible(false);
            ViewSinhVien.setVisible(false);

            LayThongTinSinhVienUp(count);
            LayMaSinhVien(count);

        }


    }//GEN-LAST:event_editSVMouseClicked

    private void btnAddSVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddSVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddSVActionPerformed

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        // TODO add your handling code here:
        QuanLyThongTinSV.setVisible(true);
        AddSinhVien.setVisible(false);
        UpdateSinhVien.setVisible(false);
        ViewSinhVien.setVisible(false);
    }//GEN-LAST:event_jLabel9MouseClicked

    private void txtSoDienThoaiSVjMaLopSVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSoDienThoaiSVjMaLopSVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSoDienThoaiSVjMaLopSVActionPerformed

    private void txtQueQuanSVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQueQuanSVActionPerformed
        // TODO add your handling code here:
        selectedQueQuan = (String) txtQueQuanSV.getSelectedItem();
    }//GEN-LAST:event_txtQueQuanSVActionPerformed

    private void txtUpQueQuanSVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUpQueQuanSVActionPerformed
        // TODO add your handling code here:
        selectedUpQueQuan = (String) txtUpQueQuanSV.getSelectedItem();
    }//GEN-LAST:event_txtUpQueQuanSVActionPerformed

    private void jLabel55MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel55MouseClicked
        // TODO add your handling code here:
        QuanLyThongTinSV.setVisible(true);
        AddSinhVien.setVisible(false);
        UpdateSinhVien.setVisible(false);
        ViewSinhVien.setVisible(false);
    }//GEN-LAST:event_jLabel55MouseClicked

    private void viewSVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewSVMouseClicked
        // TODO add your handling code here:
        if (count == -1) {
            JOptionPane.showMessageDialog(null, "Vui lòng chọn sinh viên để xem!");
        } else {
            QuanLyThongTinSV.setVisible(false);
            AddSinhVien.setVisible(false);
            UpdateSinhVien.setVisible(false);
            ViewSinhVien.setVisible(true);
            LayThongTinSinhVienView(count);
        }


    }//GEN-LAST:event_viewSVMouseClicked

    private void txtUpSoDienThoaiSVActionPerformed1(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUpSoDienThoaiSVActionPerformed1
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUpSoDienThoaiSVActionPerformed1

    private void txtUpMaLopSVActionPerformed1(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUpMaLopSVActionPerformed1
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUpMaLopSVActionPerformed1

    private void txtUpCCCDActionPerformed1(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUpCCCDActionPerformed1
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUpCCCDActionPerformed1

    private void txtUpMaSoSVActionPerformed1(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUpMaSoSVActionPerformed1
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUpMaSoSVActionPerformed1

    private void txtUpTenSVActionPerformed1(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUpTenSVActionPerformed1
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUpTenSVActionPerformed1

    private void loadSVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loadSVMouseClicked
        // TODO add your handling code here:
        UpdateSinhVien();
        showTable();
        count = -1;
    }//GEN-LAST:event_loadSVMouseClicked

    private void ScrollPaneSVMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ScrollPaneSVMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_ScrollPaneSVMouseExited

    private void ScrollPaneSVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ScrollPaneSVMouseClicked

    }//GEN-LAST:event_ScrollPaneSVMouseClicked

    private void tableSVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableSVMouseClicked
        // TODO add your handling code here:
        count = tableSV.getSelectedRow();
        LayMaSinhVien(count);
    }//GEN-LAST:event_tableSVMouseClicked

    private void show_eyeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_show_eyeMousePressed
        // TODO add your handling code here:
        show_eye.setVisible(false);
        hide_eye.setVisible(true);
        txtMatKhauSV.setEchoChar((char) 0);
        txtNhapLaiMatKhauSV.setEchoChar((char) 0);
    }//GEN-LAST:event_show_eyeMousePressed

    private void hide_eyeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hide_eyeMousePressed
        // TODO add your handling code here:
        hide_eye.setVisible(false);
        show_eye.setVisible(true);
        txtMatKhauSV.setEchoChar('*');
        txtNhapLaiMatKhauSV.setEchoChar('*');
    }//GEN-LAST:event_hide_eyeMousePressed

    private void rdNamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rdNamMouseClicked
        // TODO add your handling code here:
        if (rdNam.isSelected()) {
            gioitinh = "Nam";
        } else {
            gioitinh = "Nữ";
        }

    }//GEN-LAST:event_rdNamMouseClicked

    private void rdNuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rdNuMouseClicked
        // TODO add your handling code here:
        if (rdNam.isSelected()) {
            gioitinh = "Nam";
        } else {
            gioitinh = "Nữ";
        }
//      
    }//GEN-LAST:event_rdNuMouseClicked

    private void rdUpNamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rdUpNamMouseClicked
        // TODO add your handling code here:
        if (rdUpNam.isSelected()) {
            gioitinh = "Nam";
        } else {
            gioitinh = "Nữ";
        }
        String masv = txtUpMaSoSV.getText();
    }//GEN-LAST:event_rdUpNamMouseClicked

    private void rdUpNuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rdUpNuMouseClicked
        // TODO add your handling code here:
        if (rdUpNam.isSelected()) {
            gioitinh = "Nam";
        } else {
            gioitinh = "Nữ";
        }
        String masv = txtUpMaSoSV.getText();
    }//GEN-LAST:event_rdUpNuMouseClicked

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_txtSearchActionPerformed

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        // TODO add your handling code here:
        if (txtSearch.isSelected()) {
            int option = txtSearch.getSelectedIndex();
            String textsearch = txtSearch.getText().trim();
            if (evcbbtt == 0) {
                if (option == 0) {
                    showTable("maSV", textsearch);
                } else if (option == 1) {
                    showTable("tenSV", textsearch);
                } else if (option == 2) {
                    showTable("CCCD", textsearch);
                } else if (option == 3) {
                    showTable("maLop", textsearch);
                }
            } else if (evcbbtt == 1) {
                if (option == 0) {
                    showTableTT("maSV", textsearch, 0);
                } else if (option == 1) {
                    showTableTT("tenSV", textsearch, 0);
                } else if (option == 2) {
                    showTableTT("CCCD", textsearch, 0);
                } else if (option == 3) {
                    showTableTT("maLop", textsearch, 0);
                }
            } else if (evcbbtt == 2) {
                if (option == 0) {
                    showTableTT("maSV", textsearch, 1);
                } else if (option == 1) {
                    showTableTT("tenSV", textsearch, 1);
                } else if (option == 2) {
                    showTableTT("CCCD", textsearch, 1);
                } else if (option == 3) {
                    showTableTT("maLop", textsearch, 1);
                }
            } else if (evcbbtt == 3) {
                if (option == 0) {
                    showTableTT("maSV", textsearch, 2);
                } else if (option == 1) {
                    showTableTT("tenSV", textsearch, 2);
                } else if (option == 2) {
                    showTableTT("CCCD", textsearch, 2);
                } else if (option == 3) {
                    showTableTT("maLop", textsearch, 2);
                }
            } else if (evcbbtt == 4) {
                if (option == 0) {
                    showTableTT("maSV", textsearch, 3);
                } else if (option == 1) {
                    showTableTT("tenSV", textsearch, 3);
                } else if (option == 2) {
                    showTableTT("CCCD", textsearch, 3);
                } else if (option == 3) {
                    showTableTT("maLop", textsearch, 3);
                }
            }

        }
    }//GEN-LAST:event_txtSearchKeyReleased

    private void cbbtrangthaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbtrangthaiActionPerformed
        // TODO add your handling code here:
        String trangthai = "";
        evcbbtt = cbbtrangthai.getSelectedIndex();
        int k = cbbtrangthai.getSelectedIndex();
        SinhVienDAO svd = new SinhVienDAO();
        if (k == 0) {
            showTable();
        } else if (k == 1) {
            showTableTT(0);
        } else if (k == 2) {
            showTableTT(1);
        } else if (k == 3) {
            showTableTT(2);
        } else if (k == 4) {
            showTableTT(3);
        }
    }//GEN-LAST:event_cbbtrangthaiActionPerformed

    private void editSVMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editSVMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_editSVMouseEntered


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AddSinhVien;
    private javax.swing.JPanel QuanLyThongTinSV;
    private javax.swing.JScrollPane ScrollPaneSV;
    private javax.swing.JPanel UpdateSinhVien;
    private javax.swing.JPanel ViewSinhVien;
    private javax.swing.JLabel addSV;
    private javax.swing.JButton btnAddSV;
    private javax.swing.JButton btnUpdateSV;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JComboBox<String> cbbtrangthai;
    private javax.swing.JLabel deleteSV;
    private javax.swing.JLabel editSV;
    private javax.swing.JLabel hide_eye;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel loadSV;
    private javax.swing.JRadioButton rdNam;
    private javax.swing.JRadioButton rdNu;
    private javax.swing.JRadioButton rdUpNam;
    private javax.swing.JRadioButton rdUpNu;
    private javax.swing.JLabel show_eye;
    private javax.swing.JTable tableSV;
    private javax.swing.JTextField txtCCCDSV;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtMaLopSV;
    private javax.swing.JTextField txtMaSoSV;
    private javax.swing.JPasswordField txtMatKhauSV;
    private com.toedter.calendar.JDateChooser txtNgaySinh;
    private javax.swing.JPasswordField txtNhapLaiMatKhauSV;
    private javax.swing.JComboBox<String> txtQueQuanSV;
    private textfield.TextFieldSearchOption txtSearch;
    private javax.swing.JTextField txtSoDienThoaiSV;
    private javax.swing.JTextField txtTenDangNhapSV;
    private javax.swing.JTextField txtTenSV;
    private javax.swing.JTextField txtUpCCCD;
    private javax.swing.JTextField txtUpEmail;
    private javax.swing.JTextField txtUpMaLopSV;
    private javax.swing.JTextField txtUpMaSoSV;
    private com.toedter.calendar.JDateChooser txtUpNgaySinh;
    private javax.swing.JComboBox<String> txtUpQueQuanSV;
    private javax.swing.JTextField txtUpSoDienThoaiSV;
    private javax.swing.JTextField txtUpTenSV;
    private javax.swing.JLabel txtViewCCCDSV;
    private javax.swing.JLabel txtViewEmailSV;
    private javax.swing.JLabel txtViewGioiTinh;
    private javax.swing.JLabel txtViewHoTenSV;
    private javax.swing.JLabel txtViewMaLopSV;
    private javax.swing.JLabel txtViewMaSoSV;
    private com.toedter.calendar.JDateChooser txtViewNgaySinhSV;
    private javax.swing.JLabel txtViewQueQuan;
    private javax.swing.JLabel txtViewSoDienThoaiSV;
    private javax.swing.JLabel viewSV;
    // End of variables declaration//GEN-END:variables

    private void showTable() {
        listsinhvien = new SinhVienDAO().getAllThongTinSV();
        Model.setRowCount(0);
        String trangthai = null;
        for (ThongTinSinhVien sv : listsinhvien) {
            int k = sv.getTrangThai();
            if (k == 0) {
                trangthai = "Chưa đăng ký";
            } else if (k == 1) {
                trangthai = "Đang chờ duyệt";
            } else if (k == 2) {
                trangthai = "Đang ở";
            } else if (k == 3) {
                trangthai = "Hết hợp đồng";
            }

            Model.addRow(new Object[]{
                sv.getMaSV(), sv.getTenSV(), sv.getCCCD(), sv.getGioiTinh(), sv.getNgaySinh(), sv.getMaLop(), sv.getSoDienThoai(), trangthai
            });
        }
        count = -1;
    }

    private void showTable(String where, String text) {
        listsinhvien = new SinhVienDAO().getAllThongTinSVSearch(where, text);
        Model.setRowCount(0);

        for (ThongTinSinhVien sv : listsinhvien) {
            int k = sv.getTrangThai();
            String trangthai = null;
            if (k == 0) {
                trangthai = "Chưa đăng ký";
            } else if (k == 1) {
                trangthai = "Đang chờ duyệt";
            } else if (k == 2) {
                trangthai = "Đang ở";
            } else if (k == 3) {
                trangthai = "Hết hợp đồng";
            }
            Model.addRow(new Object[]{
                sv.getMaSV(), sv.getTenSV(), sv.getCCCD(), sv.getGioiTinh(), sv.getNgaySinh(), sv.getMaLop(), sv.getSoDienThoai(), trangthai
            });
        }
    }

    private void showTableTT(String where, String text, int trangthaii) {
        listsinhvien = new SinhVienDAO().getAllThongTinSVSearchTT(where, text, trangthaii);
        Model.setRowCount(0);

        for (ThongTinSinhVien sv : listsinhvien) {
            int k = sv.getTrangThai();
            String trangthai = null;
            if (k == 0) {
                trangthai = "Chưa đăng ký";
            } else if (k == 1) {
                trangthai = "Đang chờ duyệt";
            } else if (k == 2) {
                trangthai = "Đang ở";
            } else if (k == 3) {
                trangthai = "Hết hợp đồng";
            }
            Model.addRow(new Object[]{
                sv.getMaSV(), sv.getTenSV(), sv.getCCCD(), sv.getGioiTinh(), sv.getNgaySinh(), sv.getMaLop(), sv.getSoDienThoai(), trangthai
            });
        }
    }

    private void showTableTT(int trangthaii) {
        listsinhvien = new SinhVienDAO().getAllThongTinSVTrangThai(trangthaii);
        Model.setRowCount(0);

        for (ThongTinSinhVien sv : listsinhvien) {
            int k = sv.getTrangThai();
            String trangthai = null;
            if (k == 0) {
                trangthai = "Chưa đăng ký";
            } else if (k == 1) {
                trangthai = "Đang chờ duyệt";
            } else if (k == 2) {
                trangthai = "Đang ở";
            } else if (k == 3) {
                trangthai = "Hết hợp đồng";
            }
            Model.addRow(new Object[]{
                sv.getMaSV(), sv.getTenSV(), sv.getCCCD(), sv.getGioiTinh(), sv.getNgaySinh(), sv.getMaLop(), sv.getSoDienThoai(), trangthai
            });
        }
    }

    private void LayMaSinhVien(int count) {
        ThongTinSinhVien sv = listsinhvien.get(count);
        maSV = sv.getMaSV();
        gioitinh = sv.getGioiTinh();
        email = sv.getEmail();
    }

    private void LayThongTinSinhVienUp(int count) {
        ThongTinSinhVien sv = listsinhvien.get(count);
        txtUpTenSV.setText(sv.getTenSV());
        txtUpMaSoSV.setText(sv.getMaSV());
        if (sv.getGioiTinh().equals("Nam")) {
            rdUpNam.setSelected(true);
            gioitinh = "Nam";
        } else {
            rdUpNu.setSelected(true);
            gioitinh = "Nữ";
        }
        txtUpMaLopSV.setText(sv.getMaLop());
        txtUpSoDienThoaiSV.setText(sv.getSoDienThoai());
        txtUpNgaySinh.setDate(sv.getNgaySinh());
        txtUpCCCD.setText(sv.getCCCD());
        txtUpEmail.setText(sv.getEmail());
        txtUpQueQuanSV.setSelectedItem(sv.getQueQuan());

        email = sv.getEmail();
        sdt = sv.getSoDienThoai();
        cccd = sv.getCCCD();
    }

    private void LayThongTinSinhVienView(int count) {
        ThongTinSinhVien sv = listsinhvien.get(count);
        txtViewHoTenSV.setText(sv.getTenSV());
        txtViewMaSoSV.setText(sv.getMaSV());
        if (sv.getGioiTinh().equals("Nam")) {
            txtViewGioiTinh.setText("Nam");
        } else {
            txtViewGioiTinh.setText("Nữ");
        }
        txtViewMaLopSV.setText(sv.getMaLop());
        txtViewSoDienThoaiSV.setText(sv.getSoDienThoai());
        txtViewNgaySinhSV.setDate(sv.getNgaySinh());
        txtViewCCCDSV.setText(sv.getCCCD());
        txtViewEmailSV.setText(sv.getEmail());
        txtViewQueQuan.setText(sv.getQueQuan());

    }

    void AddSinhVien() {
        Connection conn = KetNoiSQL.getConnection();
        String sql = "insert into SinhVien (maSV, tenSV, CCCD, gioiTinh, ngaySinh, email, soDienThoai, queQuan, maLop,trangThai)"
                + "values(?,?,?,?,?,?,?,?,?,?)";
        int row = 0;

        try {
            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setString(1, txtMaSoSV.getText().trim());
            ps.setString(2, txtTenSV.getText().trim());
            ps.setString(3, txtCCCDSV.getText().trim());
            if (rdNam.isSelected()) {
                ps.setString(4, "Nam");
            } else {
                ps.setString(4, "Nữ");
            }
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String date = sdf.format(txtNgaySinh.getDate());
            ps.setString(5, date);
            ps.setString(6, txtEmail.getText().trim());
            ps.setString(7, txtSoDienThoaiSV.getText().trim());
            ps.setString(8, selectedUpQueQuan);
            ps.setString(9, txtMaLopSV.getText().trim());
            ps.setInt(10, 0);
            row = ps.executeUpdate();
            if (row > 0) {
                JOptionPane.showMessageDialog(null, "Thêm sinh viên thành công");
            } else {
                JOptionPane.showMessageDialog(null, "Thêm sinh viên không thành công");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    void AddTaiKhoan() {
        Connection conn = KetNoiSQL.getConnection();
        int row = 0;
        String sql1 = "insert into TaiKhoan (tenDangNhap, matKhau, email, phanQuyen) values(?,?,?,?)";
        try {
            PreparedStatement ps1 = conn.prepareStatement(sql1);

            String password = txtMatKhauSV.getText().trim();
            ps1.setString(1, txtTenDangNhapSV.getText().trim());
            ps1.setString(2, password);
            ps1.setString(3, txtEmail.getText().trim());
            ps1.setString(4, "Sinh Viên");

            row = ps1.executeUpdate();
            if (row > 0) {
                JOptionPane.showMessageDialog(null, "Thêm Tài khoản thành công");
            } else {
                JOptionPane.showMessageDialog(null, "Thêm Tài khoản không thành công");

            }
            conn.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }

    private void resetForm() {
        txtMaSoSV.setText("");
        txtTenSV.setText("");
        txtCCCDSV.setText("");
        txtEmail.setText("");
        txtMatKhauSV.setText("");
        txtTenDangNhapSV.setText("");
        txtNgaySinh.setDate(null);
        txtMatKhauSV.setText("");
        txtNhapLaiMatKhauSV.setText("");
        txtSoDienThoaiSV.setText("");
        txtMaLopSV.setText("");
        rdNam.setSelected(true);
    }

    private void updateSV(String masv) {
        try {
            Connection conn = KetNoiSQL.getConnection();
            String sql = "update SinhVien set tenSV=?,maSV=?, gioiTinh=?, ngaySinh=?, email=?, soDienThoai=?, queQuan=?, maLop=?,CCCD=? where maSV='" + masv + "'";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, txtUpTenSV.getText().trim());
            ps.setString(2, txtUpMaSoSV.getText().trim());
            if (rdUpNam.isSelected()) {
                ps.setString(3, "Nam");
            } else {
                ps.setString(3, "Nữ");
            }
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String date = sdf.format(txtUpNgaySinh.getDate());
            ps.setString(4, date);
            ps.setString(5, txtUpEmail.getText().trim());
            ps.setString(6, txtUpSoDienThoaiSV.getText().trim());
            ps.setString(7, selectedQueQuan);
            ps.setString(8, txtUpMaLopSV.getText().trim());
            ps.setString(9, txtUpCCCD.getText().trim());
            ps.executeUpdate();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(QuanLySV.class.getName()).log(Level.SEVERE, null, ex);
        }
        showTable();
    }

    void AddSearch() {
        txtSearch.addEventOptionSelected(new SearchOptinEvent() {
            @Override
            public void optionSelected(SearchOption option, int index) {
                txtSearch.setHint("Tìm kiếm " + option.getName() + "....");
            }
        });
        txtSearch.addOption(new SearchOption("mã SV", new ImageIcon(getClass().getResource("/img/user.png"))));
        txtSearch.addOption(new SearchOption("tên SV", new ImageIcon(getClass().getResource("/img/user.png"))));
        txtSearch.addOption(new SearchOption("CCCD SV", new ImageIcon(getClass().getResource("/img/email.png"))));
        txtSearch.addOption(new SearchOption("mã lớp", new ImageIcon(getClass().getResource("/img/address.png"))));
    }
    
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
