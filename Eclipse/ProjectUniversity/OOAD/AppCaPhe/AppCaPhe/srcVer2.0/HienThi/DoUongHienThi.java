package HienThi;

import java.util.Scanner;
import ChucNang.DoUongChucNang;

public class DoUongHienThi {
	Scanner sc = new Scanner(System.in);
	private DoUongChucNang doUongChucNang;
	
	public DoUongHienThi() {
		this.setDoUongChucNang(new DoUongChucNang());
	}

	public DoUongChucNang getDoUongChucNang() {
		return doUongChucNang;
	}
	public void setDoUongChucNang(DoUongChucNang doUongChucNang) {
		this.doUongChucNang = doUongChucNang;
	}
	
	public void menu() {
		this.getDoUongChucNang().xemDanhSachDoUong();
		System.out.println("\n1. Thêm đồ uống");
		System.out.println("2. Xóa đồ uống");
		System.out.println("3. Cập nhật đồ uống");
		System.out.println("4. Tìm đồ uống");
		System.out.println("5. Thoát");
		System.out.print("Nhập lựa chọn: ");
	}
	
	//Hiển thị loại đồ uống để thêm
	public void hienThiLoaiDoUong() {
		System.out.println("1. Cà phê");
		System.out.println("2. Sinh tố");
		System.out.println("3. Đá xay");
		System.out.println("4. Hồng trà");
		System.out.println("5. Trà sữa");
		System.out.println("6. Topping");
		System.out.print("Nhập lựa chọn: ");
	}
	
	//Xử lý các lựa chọn của người dùng và có menu ở trong
	public void xuLy() {
		int luaChon = 0;
		do {
			this.menu();
			luaChon = Integer.parseInt(sc.nextLine());
			switch(luaChon) {
			case 1:
				this.hienThiLoaiDoUong();
				this.getDoUongChucNang().themDoUong();break;
			case 2: this.getDoUongChucNang().xoaDoUong();break;
			case 3: this.getDoUongChucNang().capNhatDoUong();break;
			case 4: this.getDoUongChucNang().timDoUong();break;
			}
		}while(luaChon < 5);
	}
}
