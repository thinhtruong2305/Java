package DoiTuong;

import java.util.Date;

public class HoaDon {
	private String idHoaDon;
	private Date ngayGioThanhToan;
	
	public HoaDon() {
		
	}

	public HoaDon(String idHoaDon, Date ngayGioThanhToan) {
		super();
		this.idHoaDon = idHoaDon;
		this.ngayGioThanhToan = ngayGioThanhToan;
	}

	public String getIdHoaDon() {
		return idHoaDon;
	}

	public void setIdHoaDon(String idHoaDon) {
		this.idHoaDon = idHoaDon;
	}

	public Date getNgayGioThanhToan() {
		return ngayGioThanhToan;
	}

	public void setNgayGioThanhToan(Date ngayGioThanhToan) {
		this.ngayGioThanhToan = ngayGioThanhToan;
	}
	
}
