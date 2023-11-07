
package HienThi;

import java.util.Scanner;
import ChucNang.BanHangChucNang;

public class BanHangHienThi {
	Scanner sc = new Scanner(System.in);
	private BanHangChucNang banHangChucNang;
	
	public BanHangHienThi() {
		this.setBanHangChucNang(new BanHangChucNang());
	}

	public BanHangChucNang getBanHangChucNang() {
		return banHangChucNang;
	}
	public void setBanHangChucNang(BanHangChucNang banHangChucNang) {
		this.banHangChucNang = banHangChucNang;
	}	
	
	public void menu() {
		System.out.println("\n1. Chọn đồ uống");
		System.out.println("2. Đặt đồ uống");
		System.out.println("3. Thoát");
		System.out.print("Nhập lựa chọn: ");
	}
	
	//Xử lý các lựa chọn của người dùng và có menu ở trong
	public void xuLy() {
		int luaChon = 0;
		do {
			this.menu();
			luaChon = Integer.parseInt(sc.nextLine());
			switch(luaChon) {
			case 1: this.getBanHangChucNang().chonDoUong();break;
			case 2: this.getBanHangChucNang().datDoUong();break;
			}
		}while(luaChon < 3);
	}
}
