package Menu;

import java.util.*;
import Manage.QuanLiTaiKhoan;
import Object.TaiKhoan;

public class MenuDangNhap {
	private QuanLiTaiKhoan quanLiTaiKhoan = new QuanLiTaiKhoan();
	Scanner sc = new Scanner(System.in);
	
	//Hàm tạo có hàm xử lý để khi dùng chỉ cần tạo đối tượng là chạy
	public MenuDangNhap() {
		this.xuLy();
	}
	
	public QuanLiTaiKhoan getQuanLiTaiKhoan() {
		return quanLiTaiKhoan;
	}
	public void setQuanLiTaiKhoan(QuanLiTaiKhoan quanLiTaiKhoan) {
		this.quanLiTaiKhoan = quanLiTaiKhoan;
	}

	public void menuDangNhap() {
		System.out.println("1. Đăng nhập");
		System.out.println("2. Thoát");
		System.out.print("Nhập lựa chọn: ");
	}
	
	//Xử lý các lựa chọn của người dùng và có menu ở trong
	public void xuLy() {
		int luaChon = 0;
		do {
			this.menuDangNhap();
			luaChon = Integer.parseInt(sc.nextLine());
			switch(luaChon) {
			case 1: this.dangNhap();break;
			default: System.out.println("Bye");break;
			}
		}while(luaChon != 2 && luaChon < 2);
	}
	public void dangNhap(){
		this.khoiTaoTaiKhoan(quanLiTaiKhoan);
		boolean allow = true;
		do {
			System.out.print("Tên đăng nhập: ");
			String tenDangNhap = sc.nextLine();
			System.out.print("Mật khẩu: ");
			String matKhau = sc.nextLine();
			allow = this.kiemTra(tenDangNhap, matKhau);
		}while(allow);
		new MenuChinh();
	}
	public boolean kiemTra(String tenDangNhap, String matKhau) {
		for(int ID = 0;ID < TaiKhoan.getCount();ID++) {
			Iterator<TaiKhoan> i = this.getQuanLiTaiKhoan().timTaiKhoanChoDangNhap(tenDangNhap, matKhau);
			if(i.hasNext()) {
				return false;
			}
		}
		return true;
	}
	public void khoiTaoTaiKhoan(QuanLiTaiKhoan quanLiTaiKhoan) {
		TaiKhoan.setCount(0);
		TaiKhoan taiKhoan = new TaiKhoan("t", "t", "t");
		quanLiTaiKhoan.themTaiKhoan(taiKhoan);
		TaiKhoan taiKhoan1 = new TaiKhoan("h","h","h");
		quanLiTaiKhoan.themTaiKhoan(taiKhoan1);
		TaiKhoan taiKhoan2 = new TaiKhoan("y", "y", "y");
		quanLiTaiKhoan.themTaiKhoan(taiKhoan2);
	}
}
