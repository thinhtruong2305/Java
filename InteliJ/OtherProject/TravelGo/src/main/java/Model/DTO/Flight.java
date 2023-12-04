package Model.DTO;

import java.time.LocalDateTime;

public class Flight {
    private String hang;
    private String maChuyenBay;
    private LocalDateTime ngayDen;
    private LocalDateTime ngayDi;

    public Flight() {
    }

    public Flight(String hang, String maChuyenBay, LocalDateTime ngayDen, LocalDateTime ngayDi) {
        this.hang = hang;
        this.maChuyenBay = maChuyenBay;
        this.ngayDen = ngayDen;
        this.ngayDi = ngayDi;
    }

    public String getHang() {
        return hang;
    }

    public void setHang(String hang) {
        this.hang = hang;
    }

    public String getMaChuyenBay() {
        return maChuyenBay;
    }

    public void setMaChuyenBay(String maChuyenBay) {
        this.maChuyenBay = maChuyenBay;
    }

    public LocalDateTime getNgayDen() {
        return ngayDen;
    }

    public void setNgayDen(LocalDateTime ngayDen) {
        this.ngayDen = ngayDen;
    }

    public LocalDateTime getNgayDi() {
        return ngayDi;
    }

    public void setNgayDi(LocalDateTime ngayDi) {
        this.ngayDi = ngayDi;
    }
}
