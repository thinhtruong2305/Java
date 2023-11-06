package HienThi;

import java.util.Scanner;
import ChucNang.KhachHangChucNang;

public class KhachHangHienThi {
	Scanner sc = new Scanner(System.in);
	private KhachHangChucNang khachHangChucNang;
	
	public KhachHangHienThi() {
		this.setKhachHangChucNang(new KhachHangChucNang());
	}

	public KhachHangChucNang getKhachHangChucNang() {
		return khachHangChucNang;
	}
	public void setKhachHangChucNang(KhachHangChucNang khachHangChucNang) {
		this.khachHangChucNang = khachHangChucNang;
	}
	
	public void menu() {
		this.getKhachHangChucNang().xemDanhSachKhachHang();
		System.out.println("\n1. Thêm khách hàng");
		System.out.println("2. Xóa khách hàng");
		System.out.println("3. Cập nhật khách hàng");
		System.out.println("4. Tìm khách hàng");
		System.out.println("5. Thoát");
		System.out.print("Nhập lựa chọn: ");
	}
	
	//Xử lý các lựa chọn của người dùng và có menu ở trong
	public void xuLy() {
		int luaChon = 0;
		do {
			this.menu();
			luaChon = Integer.parseInt(sc.nextLine());
			switch(luaChon) {
			case 1: this.getKhachHangChucNang().themKhachHang();break;
			case 2: this.getKhachHangChucNang().xoaKhachHang();break;
			case 3: this.getKhachHangChucNang().capNhatKhachHang();break;
			case 4: this.getKhachHangChucNang().timKhachHang();break;
			}
		}while(luaChon < 5);
	}
}
