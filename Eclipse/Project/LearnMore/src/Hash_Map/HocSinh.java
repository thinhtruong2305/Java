package Hash_Map;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class HocSinh {
	private String ten;
	private Date ngaySinh;
	private String diaChi;
	private String email;
	private String maHocSinh;
	SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
	
	public HocSinh() {
		
	}
	public HocSinh(String maHocSinh, String ten, String ngaySinh, String diaChi, String email) {
		this.setMaHocSinh(maHocSinh);
		this.setTen(ten);
		this.setNgaySinh(ngaySinh);
		this.setDiaChi(diaChi);
		this.setEmail(email);
	}
	
	public String getMaHocSinh() {
		return maHocSinh;
	}
	public void setMaHocSinh(String maHocSinh) {
		this.maHocSinh = maHocSinh;
	}
	public String getNgaySinh() {
		return dateFormat.format(ngaySinh);
	}
	public void setNgaySinh(String ngaySinh) {
		try {
			this.ngaySinh = dateFormat.parse(ngaySinh);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
}
