package HienThi;

import java.util.Scanner;
import ChucNang.TaiKhoanChucNang;
import Object.TaiKhoan;

public class TaiKhoanHienThi {
	Scanner sc = new Scanner(System.in);
	NhanVienHienThi nhanVienHienThi = new NhanVienHienThi();
	private TaiKhoanChucNang taiKhoanChucNang;
	
	public TaiKhoanHienThi() {
		this.setTaiKhoanChucNang(new TaiKhoanChucNang());
	}

	public TaiKhoanChucNang getTaiKhoanChucNang() {
		return taiKhoanChucNang;
	}
	public void setTaiKhoanChucNang(TaiKhoanChucNang taiKhoanChucNang) {
		this.taiKhoanChucNang = taiKhoanChucNang;
	}
	
	public int menu() {
		this.getTaiKhoanChucNang().xemDanhSachTaiKhoan();
		System.out.println("\n1. Thêm tài khoản");
		System.out.println("2. Xóa tài khoản");
		System.out.println("3. Cập nhật tài khoản");
		System.out.println("4. Tìm tài khoản");
		System.out.println("5. Thoát");
		System.out.print("Nhập lựa chọn: ");
		return Integer.parseInt(sc.nextLine());
	}
	
	public void themTaiKhoan() {
		this.getTaiKhoanChucNang().nhapTaiKhoan(this.nhapTenDangNhap(), this.nhapMatKhau(), this.nhanVienHienThi.nhapHoVaTen());
	}
	
	public void xoaTaiKhoan() {
		String str = "Không tìm thấy";
		TaiKhoan taiKhoan = this.getTaiKhoanChucNang().searchTaiKhoan(this.nhapTenDangNhap());
		if(taiKhoan != null) {
			taiKhoan.inputNull();
			str = "";
		}
		System.out.println(str);
	}
	
	public void capNhatTaiKhoan() {
		String str = "Không tìm thấy";
		TaiKhoan taiKhoan = this.getTaiKhoanChucNang().searchTaiKhoan(this.nhapTenDangNhap());
		if(taiKhoan != null) {
			this.getTaiKhoanChucNang().nhapTaiKhoan(this.nhapTenDangNhap(), this.nhapMatKhau(), this.nhanVienHienThi.nhapHoVaTen());
			str = "";
		}
		System.out.println(str);
	}
	
	public void timTaiKhoan() {
		String str = "Không tìm thấy";
		TaiKhoan taiKhoan = this.getTaiKhoanChucNang().searchTaiKhoan(this.nhapTenDangNhap());
		if(taiKhoan != null) {
			System.out.printf("\n%-3s %-30s %-30s %s\n","ID","TÊN ĐĂNG NHẬP","MẬT KHẨU","HỌ VÀ TÊN");
			taiKhoan.display();
			str = "";
		}
		System.out.println(str);
	}
	
	//Xử lý các lựa chọn của người dùng và có menu ở trong
	public void xuLy() {
		//Hiển thị menu và chọn khi chọn xong thì trả một int cho luaChon
		int luaChon = this.menu();
		do {
			switch(luaChon) {
			case 1: this.themTaiKhoan();break;
			case 2: this.xoaTaiKhoan();break;
			case 3: this.capNhatTaiKhoan();break;
			case 4: this.timTaiKhoan();break;
			}
		}while(luaChon < 5);
	}
	
	public String nhapTenDangNhap() {
		System.out.print("Nhập tên đăng nhập: ");
		return sc.nextLine();
	}
	
	public String nhapMatKhau() {
		System.out.print("Nhập mật khẩu: ");
		return sc.nextLine();
	}
}
