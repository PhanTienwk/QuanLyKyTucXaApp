package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.time.LocalDateTime;

import java.sql.Timestamp;


public class ThongTinThongBao {
    private String tieuDe;
    private String noiDung;
    private String soPhong;
    //private Date ngayThongBao;
    private LocalDateTime ngayThongBao;

    public ThongTinThongBao() {
    }

    public ThongTinThongBao(String tieuDe, String noiDung, String soPhong, LocalDateTime ngayThongBao) {
        this.tieuDe = tieuDe;
        this.noiDung = noiDung;
        this.soPhong = soPhong;
        this.ngayThongBao = ngayThongBao;
    }

    public String getTieuDe() {
        return tieuDe;
    }

    public void setTieuDe(String tieuDe) {
        this.tieuDe = tieuDe;
    }

    public String getNoiDung() {
        return noiDung;
    }

    public void setNoiDung(String noiDung) {
        this.noiDung = noiDung;
    }

    public String getSoPhong() {
        return soPhong;
    }

    public void setSoPhong(String soPhong) {
        this.soPhong = soPhong;
    }

    public LocalDateTime getNgayThongBao() {
        return ngayThongBao;
    }

    public void setNgayThongBao(LocalDateTime ngayThongBao) {
        this.ngayThongBao = ngayThongBao;
    }

}
