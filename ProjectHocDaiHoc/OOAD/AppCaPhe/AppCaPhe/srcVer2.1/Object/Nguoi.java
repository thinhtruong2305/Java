package Object;

import java.text.*;
import java.util.Date;

public class Nguoi {
	private String ten, diaChi, email;
	private Date ngaySinh;
	private String soDienThoai;
	SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
	
	public Nguoi() {
		
	}
	public Nguoi(String ten, String diaChi, String email, String ngaySinh, String soDienThoai) {
		this.setTen(ten);
		this.setDiaChi(diaChi);
		this.setEmail(email);
		this.setNgaySinh(ngaySinh);
		this.setSoDienThoai(soDienThoai);
	}
	
	public String getTen() {
		return this.ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public String getDiaChi() {
		return this.diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	public String getEmail() {
		return this.email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNgaySinh() {
		return this.df.format(ngaySinh);
	}
	public void setNgaySinh(String ngaySinh) {
		try {
			this.ngaySinh = df.parse(ngaySinh);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
	public String getSoDienThoai() {
		return this.soDienThoai;
	}
	public void setSoDienThoai(String soDienThoai) {
		this.soDienThoai = soDienThoai;
	}
}
