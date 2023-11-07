package Object;

import java.util.Scanner;

public class KhachHang extends Nguoi {
	private static int count = 0;
	Scanner sc = new Scanner(System.in);
	private int idKhachHang, soLanOrder;

	public KhachHang(){
		this.setIdKhachHang(++count);
	}
	public KhachHang(String ten, String diaChi, String email, String ngaySinh, String soDienThoai) {
		super(ten, diaChi, email, ngaySinh, soDienThoai);
		this.setIdKhachHang(++count);
	}
	public KhachHang(String ten, String diaChi, String email, String ngaySinh, String soDienThoai, int soLanOrder) {
		super(ten, diaChi, email, ngaySinh, soDienThoai);
		this.setIdKhachHang(++count);
		this.setSoLanOrder(soLanOrder);
	}
	
	public static int getCount() {
		return count;
	}
	public static void setCount(int count) {
		KhachHang.count = count;
	}
	public int getIdKhachHang() {
		return this.idKhachHang;
	}

	public void setIdKhachHang(int idKhachHang) {
		this.idKhachHang = idKhachHang;
	}

	public int getSoLanOrder() {
		return this.soLanOrder;
	}

	public void setSoLanOrder(int soLanOrder) {
		this.soLanOrder = soLanOrder;
	}

	//hiển thị
	public void display() {
		System.out.printf("\n%-3d %-25s %-50s %-30s %s\n",this.getIdKhachHang(),this.getTen(),this.getDiaChi(),this.getEmail(),this.getNgaySinh());
	}
	
	//nhập thông tin
	public void input() {
		System.out.print("Nhập họ và tên: ");
		this.setTen(sc.nextLine());
		System.out.print("Nhập địa chỉ: ");
		this.setDiaChi(sc.nextLine());
		System.out.print("Nhập email: ");
		this.setEmail(sc.nextLine());
		System.out.print("Nhập số điện thoại: ");
		this.setSoDienThoai(sc.nextLine());
		System.out.print("Nhập ngày sinh: ");
		this.setNgaySinh(sc.nextLine());
	}
}
