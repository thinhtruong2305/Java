package Object;

import java.util.Scanner;

public class KhachHang extends Nguoi {
	private static int count = 0;
	Scanner sc = new Scanner(System.in);
	private int idKhachHang, soLanOrder;

	public KhachHang(){
		this.idKhachHang = ++count;
	}
	public KhachHang(String ten, String diaChi, String email, String ngaySinh, int soDienThoai, int soLanOrder) {
		super(ten, diaChi, email, ngaySinh, soDienThoai);
		this.idKhachHang = ++count;
		this.soLanOrder = soLanOrder;
	}
	
	public static int getCount() {
		return count;
	}
	public static void setCount(int count) {
		KhachHang.count = count;
	}
	public int getIdKhachHang() {
		return idKhachHang;
	}

	public void setIdKhachHang(int idKhachHang) {
		this.idKhachHang = idKhachHang;
	}

	public int getSoLanOrder() {
		return soLanOrder;
	}

	public void setSoLanOrder(int soLanOrder) {
		this.soLanOrder = soLanOrder;
	}

	@Override
	public String toString() {
		return super.toString() + "KhachHang [idKH=" + idKhachHang + ", soLanOder=" + soLanOrder + "]";
	}
	
	//hiển thị
	public void display() {
		System.out.println(this.toString());
	}
	
	//nhập thông tin
	public void input() {
		System.out.print("Nhập tên khách hàng: ");
		this.setTen(sc.nextLine());
		System.out.print("Nhập địa chỉ: ");
		this.setDiaChi(sc.nextLine());
		System.out.print("Nhập email: ");
		this.setEmail(sc.nextLine());
		System.out.print("Nhập số điện thoại: ");
		this.setSoDienThoai(Integer.parseInt(sc.nextLine()));
		System.out.print("Nhập ngày sinh: ");
		this.setNgaySinh(sc.nextLine());
	}
}
