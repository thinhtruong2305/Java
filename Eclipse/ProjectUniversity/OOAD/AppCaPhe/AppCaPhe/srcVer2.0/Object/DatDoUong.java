package Object;

import java.util.Scanner;

public class DatDoUong {
	private NhanVien nhanvien;
	private KhachHang khachHang;
	Scanner sc = new Scanner(System.in);
	
	public DatDoUong() {
		this.setKhachHang(new KhachHang());
		this.setNhanvien(new NhanVien());
	}
	public DatDoUong(KhachHang khachHang, NhanVien nhanVien,int ID) {
		this.setKhachHang(khachHang);
		this.setNhanvien(nhanVien);
	}
	
	public NhanVien getNhanvien() {
		return nhanvien;
	}
	public void setNhanvien(NhanVien nhanvien) {
		this.nhanvien = nhanvien;
	}
	public KhachHang getKhachHang() {
		return khachHang;
	}
	public void setKhachHang(KhachHang khachHang) {
		this.khachHang = khachHang;
	}
	
	//nhập thông tin
	public void input() {
		System.out.print("Nhập họ và tên khách hàng: ");
		this.getKhachHang().setTen(sc.nextLine());
		System.out.print("Nhập địa chỉ: ");
		this.getKhachHang().setDiaChi(sc.nextLine());
		System.out.print("Nhập số điện thoại: ");
		this.getKhachHang().setSoDienThoai(sc.nextLine());
		System.out.print("Nhập họ và tên nhân viên: ");
		this.getNhanvien().setTen(sc.nextLine());
	}
	
	//hiển thị
	public void display() {
		System.out.println("\n\n"+"Họ và tên khách hàng: "+this.getKhachHang().getTen());
		System.out.println("Địa chỉ khách hàng: "+this.getKhachHang().getDiaChi());
		System.out.println("Số điện thoại khách hàng: "+this.getKhachHang().getSoDienThoai());
		System.out.println("Họ và tên nhân viên phụ trách: "+this.getNhanvien().getTen()+"\n");
	}
}
