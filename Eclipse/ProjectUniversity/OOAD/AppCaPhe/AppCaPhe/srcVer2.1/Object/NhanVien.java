package Object;

import java.util.Scanner;

public class NhanVien extends Nguoi{
	private static int count = 0;
	Scanner sc = new Scanner(System.in);
	private int idNhanVien;
	private String chucVu;
	
	public NhanVien() {
		this.setIdNhanVien(++count);
	}
	public NhanVien(String ten, String diaChi, String email, String ngaySinh, String soDienThoai, String chucVu) {
		super(ten, diaChi, email, ngaySinh, soDienThoai);
		this.setIdNhanVien(++count);
		this.setChucVu(chucVu);
	}
	
	public static int getCount() {
		return count;
	}
	public static void setCount(int count) {
		NhanVien.count = count;
	}
	public int getIdNhanVien() {
		return this.idNhanVien;
	}
	public void setIdNhanVien(int idNhanVien) {
		this.idNhanVien = idNhanVien;
	}
	public String getChucVu() {
		return this.chucVu;
	}
	public void setChucVu(String chucVu) {
		this.chucVu = chucVu;
	}
	
	//hiển thị
	public void display() {
		System.out.printf("%-3d %-25s %-50s %-30s %-15s %-15s %s\n",this.getIdNhanVien(),this.getTen(),this.getDiaChi(),this.getEmail(),this.getNgaySinh(),this.getSoDienThoai(),this.getChucVu());
	}
	
	//Chuyển thông tin thành null
	public void inputNull() {
		this.setTen(null);
		this.setDiaChi(null);
		this.setEmail(null);
		this.setSoDienThoai(null);
		this.setNgaySinh(null);
		this.setChucVu(null);
	}
}
