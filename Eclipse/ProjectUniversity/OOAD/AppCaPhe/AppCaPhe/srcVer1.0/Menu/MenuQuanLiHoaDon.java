package Menu;

import java.util.*;
import Manage.QuanLiHoaDon;
import Object.*;

public class MenuQuanLiHoaDon {
	private QuanLiHoaDon quanLiHoaDon = new QuanLiHoaDon();
	Scanner sc = new Scanner(System.in);
	
	//Hàm tạo có hàm xử lý để khi dùng chỉ cần tạo đối tượng là chạy
	public MenuQuanLiHoaDon() {
		this.xuLy();
	}

	public QuanLiHoaDon getQuanLiHoaDon() {
		return quanLiHoaDon;
	}
	public void setQuanLiHoaDon(QuanLiHoaDon quanLiHoaDon) {
		this.quanLiHoaDon = quanLiHoaDon;
	}
	
	public void menuQuanLiHoaDon() {
		System.out.println("1. Thêm hóa đơn");
		System.out.println("2. Xóa hóa đơn");
		System.out.println("3. Tìm hóa đơn");
		System.out.println("4. Xem thông tin hóa đơn");
		System.out.println("5. thoát");
		System.out.print("Nhập lụa chọn: ");
	}
	
	//Xử lý các lựa chọn của người dùng và có menu ở trong
	public void xuLy() {
		int luaChon = 0;
		do {
			this.menuQuanLiHoaDon();
			luaChon = Integer.parseInt(sc.nextLine());
			switch(luaChon) {
			case 1: this.themHoaDon();break;
			case 2: this.xoaHoaDon();break;
			case 3: this.timHoaDon();break;
			case 4: this.getQuanLiHoaDon().xuat();break;
			default: System.out.println("Bye");break;
			}
		}while(luaChon != 5 && luaChon < 5);
	}
	public void themHoaDon() {
		HoaDon hoaDon = new HoaDon();
		KhachHang khachHang = new KhachHang();
		NhanVien nhanVien = new NhanVien();
		Mon mon = new Mon();
		khachHang.input();
		nhanVien.input();
		mon.input();
		hoaDon.input(khachHang,nhanVien,mon);
		this.getQuanLiHoaDon().themHoaDon(hoaDon);
		HoaDon.setCount(hoaDon.getIdHoaDon());
	}
	public void xoaHoaDon() {
		this.getQuanLiHoaDon().xuat();
		System.out.println("Nhập ID hóa đơn cần xóa: ");
		int ID = Integer.parseInt(sc.nextLine());
		this.getQuanLiHoaDon().xoaHoaDonTheoID(ID);
	}
	public void timHoaDon() {
		this.getQuanLiHoaDon().xuat();
		System.out.println("Nhập ID hóa đơn cần tìm: ");
		int ID = Integer.parseInt(sc.nextLine());
		Iterator<HoaDon> i = this.getQuanLiHoaDon().timHoaDonTheoID(ID);
		if(i.hasNext()) {
			HoaDon hoaDon = (HoaDon)i.next();
			hoaDon.display();
		}
	}
}
