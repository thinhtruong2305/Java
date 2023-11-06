package HienThi;

import java.util.Scanner;
import ChucNang.DangNhapChucNang;

public class DangNhapHienThi {
	Scanner sc = new Scanner(System.in);
	private DangNhapChucNang dangNhapChucNang;
	private QuanLiHienThi quanLiHienThi;
	private BanHangHienThi banHangHienThi;
	
	public DangNhapHienThi() {
		this.setDangNhapChucNang(new DangNhapChucNang());
		this.setQuanLiHienThi(new QuanLiHienThi());
		this.setBanHangHienThi(new BanHangHienThi());
	}

	public DangNhapChucNang getDangNhapChucNang() {
		return dangNhapChucNang;
	}
	public void setDangNhapChucNang(DangNhapChucNang dangNhapChucNang) {
		this.dangNhapChucNang = dangNhapChucNang;
	}
	public QuanLiHienThi getQuanLiHienThi() {
		return quanLiHienThi;
	}
	public void setQuanLiHienThi(QuanLiHienThi quanLiHienThi) {
		this.quanLiHienThi = quanLiHienThi;
	}
	public BanHangHienThi getBanHangHienThi() {
		return banHangHienThi;
	}
	public void setBanHangHienThi(BanHangHienThi banHangHienThi) {
		this.banHangHienThi = banHangHienThi;
	}

	public void menu() {
		System.out.println("1. Đăng nhập");
		System.out.println("2. Thoát");
		System.out.print("Nhập lựa chọn: ");
	}
	
	//Dùng để người dùng đăng nhập và tự động kiểm tra và phân quyền sử dụng
	public void dangNhap() {
		System.out.print("Tên đăng nhập: ");
		String tenDangNhap = sc.nextLine();
		System.out.print("Mật khẩu: ");
		String matKhau = sc.nextLine();
		if(this.getDangNhapChucNang().kiemTraDangNhap(tenDangNhap, matKhau) == null) {
			System.out.println("sai mật khẩu hoặc tên đăng nhập");
		}else {
			if(this.getDangNhapChucNang().phanQuyen(this.getDangNhapChucNang().kiemTraDangNhap(tenDangNhap, matKhau)).equalsIgnoreCase("Quản lí")) {
				this.getQuanLiHienThi().xuLy();
			}else {
				this.getBanHangHienThi().xuLy();
			}
		}
	}
	
	//Xử lý các lựa chọn của người dùng và có menu ở trong
	public void xuLy() {
		int luaChon = 0;
		do {
			this.menu();
			luaChon = Integer.parseInt(sc.nextLine());
			switch(luaChon) {
			case 1: this.dangNhap();
			}
		} while (luaChon < 2);
	}
}
