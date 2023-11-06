package Test;

import Menu.*;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean allow = true;
		do {
			Test.testDangNhap();
			System.out.println("hello");
		}while(allow);
	}
	public static void testTaiKhoan() {
		new MenuQuanLiTaiKhoan();
	}
	public static void testNhanVien() {
		new MenuQuanLiNhanVien();
	}
	public static void testMon() {
		new MenuQuanLiMon();
	}
	public static void testKhachHang() {
		new MenuQuanLiKhachHang();
	}
	public static void testHoaDon() {
		new MenuQuanLiHoaDon();
	}
	public static void testDangNhap() {
		new MenuDangNhap();
	}
	
}
