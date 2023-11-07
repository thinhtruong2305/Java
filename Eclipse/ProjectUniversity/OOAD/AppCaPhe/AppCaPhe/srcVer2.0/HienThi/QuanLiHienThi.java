package HienThi;

import java.util.Scanner;

public class QuanLiHienThi {
	Scanner sc = new Scanner(System.in);
	private DoUongHienThi doUongHienThi;
	private KhachHangHienThi khachHangHienThi;
	private NhanVienHienThi nhanVienHienThi;
	private TaiKhoanHienThi taiKhoanHienThi;
	
	public QuanLiHienThi() {
		this.setDoUongHienThi(new DoUongHienThi());
		this.setKhachHangHienThi(new KhachHangHienThi());
		this.setNhanVienHienThi(new NhanVienHienThi());
		this.setTaiKhoanHienThi(new TaiKhoanHienThi());
	}

	public DoUongHienThi getDoUongHienThi() {
		return doUongHienThi;
	}
	public void setDoUongHienThi(DoUongHienThi doUongHienThi) {
		this.doUongHienThi = doUongHienThi;
	}
	public KhachHangHienThi getKhachHangHienThi() {
		return khachHangHienThi;
	}
	public void setKhachHangHienThi(KhachHangHienThi khachHangHienThi) {
		this.khachHangHienThi = khachHangHienThi;
	}
	public NhanVienHienThi getNhanVienHienThi() {
		return nhanVienHienThi;
	}
	public void setNhanVienHienThi(NhanVienHienThi nhanVienHienThi) {
		this.nhanVienHienThi = nhanVienHienThi;
	}
	public TaiKhoanHienThi getTaiKhoanHienThi() {
		return taiKhoanHienThi;
	}
	public void setTaiKhoanHienThi(TaiKhoanHienThi taiKhoanHienThi) {
		this.taiKhoanHienThi = taiKhoanHienThi;
	}
	
	public void menu() {
		System.out.println("\n1. Quản lí món");
		System.out.println("2. Quản lí khách hàng");
		System.out.println("3. Quản lí nhân viên");
		System.out.println("4. Quản lí tài khoản");
		System.out.println("5. thoát");
		System.out.print("Nhập lựa chọn: ");
	}
	
	//Xử lý các lựa chọn của người dùng và có menu ở trong
	public void xuLy() {
		int luaChon = 0;
		do {
			this.menu();
			luaChon = Integer.parseInt(sc.nextLine());
			switch(luaChon) {
			case 1: this.getDoUongHienThi().xuLy();break;
			case 2: this.getKhachHangHienThi().xuLy();break;
			case 3: this.getNhanVienHienThi().xuLy();break;
			case 4: this.getTaiKhoanHienThi().xuLy();break;
			}
		}while(luaChon < 5);
	}
}
