package HienThi;

import java.util.Scanner;
import ChucNang.NhanVienChucNang;

public class NhanVienHienThi {
	Scanner sc = new Scanner(System.in);
	private NhanVienChucNang nhanVienChucNang;
	
	public NhanVienHienThi() {
		this.setNhanVienChucNang(new NhanVienChucNang());
	}

	public NhanVienChucNang getNhanVienChucNang() {
		return nhanVienChucNang;
	}
	public void setNhanVienChucNang(NhanVienChucNang nhanVienChucNang) {
		this.nhanVienChucNang = nhanVienChucNang;
	}
	
	public void menu() {
		this.getNhanVienChucNang().xemDanhSachNhanVien();
		System.out.println("\n1. Thêm nhân viên");
		System.out.println("2. Xóa nhân viên");
		System.out.println("3. Cập nhật nhân viên");
		System.out.println("4. Tìm nhân viên");
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
			case 1: this.getNhanVienChucNang().themNhanVien();break;
			case 2: this.getNhanVienChucNang().xoaNhanVien();break;
			case 3: this.getNhanVienChucNang().capNhatNhanVien();break;
			case 4: this.getNhanVienChucNang().timNhanVien();break;
			}
		} while (luaChon < 5);
	}
}
