package Menu;

import java.util.*;
import Manage.QuanLiTaiKhoan;
import Object.TaiKhoan;

public class MenuQuanLiTaiKhoan {
	private QuanLiTaiKhoan quanLiTaiKhoan = new QuanLiTaiKhoan();
	static Scanner sc = new Scanner(System.in);
	
	//hàm tạo có hàm xử lý để khi dùng chỉ cần tạo đối tượng là chạy
	public MenuQuanLiTaiKhoan() {
		this.xuLy();
	}
	
	public QuanLiTaiKhoan getQuanLiTaiKhoan() {
		return quanLiTaiKhoan;
	}
	public void setQuanLiTaiKhoan(QuanLiTaiKhoan quanLiTaiKhoan) {
		this.quanLiTaiKhoan = quanLiTaiKhoan;
	}

	public void menuQuanLiTaiKhoan() {
		System.out.println("1. Thêm tài khoản");
		System.out.println("2. Xóa tài khoản");
		System.out.println("3. Cập nhật tài khoản");
		System.out.println("4. Tìm tài khoản");
		System.out.println("5. Xem thông tin tài khoản");
		System.out.println("6. Thoát");
		System.out.print("Nhập lựa chọn: ");
	}
	
	//Xử lý các lựa chọn của người dùng và có menu ở trong
	public void xuLy() {
		int luaChon = 0;
		do {
			this.menuQuanLiTaiKhoan();
			luaChon = Integer.parseInt(sc.nextLine());
			switch(luaChon) {
			case 1: this.themTaiKhoan();break;
			case 2: this.xoaTaiKhoan();break;
			case 3: this.capNhatTaiKhoan();break;
			case 4: this.timTaiKhoan();break;
			case 5: this.getQuanLiTaiKhoan().xuat();break;
			default: System.out.println("Bye");break;
			}
		}while(luaChon != 6 && luaChon < 6);
	}
	
	public void themTaiKhoan() {
		TaiKhoan taiKhoan = new TaiKhoan();
		taiKhoan.input();
		this.quanLiTaiKhoan.themTaiKhoan(taiKhoan);
		TaiKhoan.setCount(taiKhoan.getIdTaiKhoan());
	}
	
	public void xoaTaiKhoan() {
		this.getQuanLiTaiKhoan().xuat();
		System.out.print("Nhập ID tài khoản cần xóa: ");
		int ID = Integer.parseInt(sc.nextLine());
		this.getQuanLiTaiKhoan().xoaTaiKhoanTheoID(ID);
	}
	
	public void capNhatTaiKhoan() {
		this.getQuanLiTaiKhoan().xuat();
		System.out.print("Nhập ID tài khoản cần sủa: ");
		int ID = Integer.parseInt(sc.nextLine());
		this.getQuanLiTaiKhoan().suaThongTinTaiKhoanTheoID(ID);
	}
	
	public void timTaiKhoan() {
		this.getQuanLiTaiKhoan().xuat();
		System.out.print("Nhập ID tài khoản cần tìm: ");
		int ID = Integer.parseInt(sc.nextLine());
		Iterator<TaiKhoan> i = this.getQuanLiTaiKhoan().timTaiKhoanTheoID(ID);
		if(i.hasNext()) {
			TaiKhoan taiKhoan = (TaiKhoan)i.next();
			taiKhoan.display();
		}
	}
}
