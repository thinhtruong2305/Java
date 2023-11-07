package Object;

import java.text.*;
import java.util.Date;

public class Nguoi {
	private String ten, diaChi, email;
	private Date ngaySinh;
	private int soDienThoai;
	SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
	
	public Nguoi() {
		
	}
	public Nguoi(String ten, String diaChi, String email, String ngaySinh, int soDienThoai) {
		this.ten = ten;
		this.diaChi = diaChi;
		this.email = email;
		this.setNgaySinh(ngaySinh);
		this.soDienThoai = soDienThoai;
	}
	
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
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
	public Date getNgaySinh() {
		return ngaySinh;
	}
	public void setNgaySinh(String ngaySinh) {
		try {
			this.ngaySinh = df.parse(ngaySinh);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
	public int getSoDienThoai() {
		return soDienThoai;
	}
	public void setSoDienThoai(int soDienThoai) {
		this.soDienThoai = soDienThoai;
	}
	
	@Override
	public String toString() {
		return "Nguoi [ten=" + ten + ", diaChi=" + diaChi + ", email=" + email + ", ngaySinh=" + df.format(ngaySinh)
				+ ", soDienThoai=" + soDienThoai + "]";
	}
}
