package DoiTuong;

import java.util.Date;

public abstract class Nguoi {
	private String ten;
	private Date ngaySinh;
	private String diaChi;
	private String email;
	
	public Nguoi() {
		
	}
	public Nguoi(String ten, String ngaySinh, String diaChi, String email) {
		this.setTen(ten);
		this.setNgaySinh(ThuVien.ChuyenDoiNgay.chuyenChuoiThanhNgay(ngaySinh));
		this.setDiaChi(diaChi);
		this.setEmail(email);
	}
	
	public String getTen() {
		return ten;
	}
	
	public void setTen(String ten) {
		this.ten = ten;
	}
	
	public Date getNgaySinh() {
		return ngaySinh;
	}
	
	public void setNgaySinh(Date ngaySinh) {
		this.ngaySinh = ngaySinh;
	}
	
	public String getDiaChi() {
		return diaChi;
	}
	
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
}
