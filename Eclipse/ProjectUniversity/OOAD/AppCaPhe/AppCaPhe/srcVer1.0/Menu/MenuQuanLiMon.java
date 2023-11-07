package Menu;

import java.util.*;
import Manage.QuanLiMon;
import Object.Mon;

public class MenuQuanLiMon {
	private QuanLiMon quanLiMon = new QuanLiMon();
	Scanner sc = new Scanner(System.in);
	
	//Hàm tạo có hàm xử lý để khi dùng chỉ cần tạo đối tượng là chạy
	public MenuQuanLiMon() {
		this.xuLy();
	}

	public QuanLiMon getQuanLiMon() {
		return quanLiMon;
	}
	public void setQuanLiMon(QuanLiMon quanLiMon) {
		this.quanLiMon = quanLiMon;
	}
	
	public void menuQuanLiMon() {
		System.out.println("1. Thêm món");
		System.out.println("2. Xóa món");
		System.out.println("3. Cập nhật món");
		System.out.println("4. Tìm món");
		System.out.println("5. Xem thông tin món");
		System.out.println("6. Thoát");
		System.out.print("Nhập lựa chọn: ");
	}
	
	//Xử lý các lựa chọn của người dùng và có menu ở trong
	public void xuLy() {
		int luaChon = 0;
		do {
			this.menuQuanLiMon();
			luaChon = Integer.parseInt(sc.nextLine());
			switch(luaChon) {
			case 1: this.themMon();break;
			case 2: this.xoaMon();break;
			case 3: this.capNhatMon();break;
			case 4: this.timMon();break;
			case 5: this.getQuanLiMon().xuat();break;
			default: System.out.println("Bye");break;
			}
		}while(luaChon != 6 && luaChon < 6);
	}
	public void themMon() {
		Mon mon = new Mon();
		mon.input();
		this.getQuanLiMon().themMon(mon);
		Mon.setCount(mon.getIdMon());
	}
	public void xoaMon() {
		this.getQuanLiMon().xuat();
		System.out.print("Nhập ID món cần xóa: ");
		int ID = Integer.parseInt(sc.nextLine());
		this.getQuanLiMon().xoaMonTheoID(ID);
	}
	public void capNhatMon() {
		this.getQuanLiMon().xuat();
		System.out.print("Nhập ID món cần sửa: ");
		int ID = Integer.parseInt(sc.nextLine());
		this.getQuanLiMon().suaThongTinMonTheoID(ID);
	}
	public void timMon() {
		this.getQuanLiMon().xuat();
		System.out.print("Nhập ID món cần tìm: ");
		int ID = Integer.parseInt(sc.nextLine());
		Iterator<Mon> i = this.getQuanLiMon().timMonTheoID(ID);
		if(i.hasNext()) {
			Mon mon = (Mon)i.next();
			mon.display();
		}
	}
}
