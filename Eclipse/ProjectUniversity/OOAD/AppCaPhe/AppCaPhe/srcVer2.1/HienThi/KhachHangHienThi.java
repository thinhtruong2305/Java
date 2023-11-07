package HienThi;

import java.util.*;
import ChucNang.KhachHangChucNang;
import Object.KhachHang;

public class KhachHangHienThi extends NguoiHienThi {
	Scanner sc = new Scanner(System.in);
	private KhachHangChucNang khachHangChucNang;
	
	public KhachHangHienThi() {
		this.setKhachHangChucNang(new KhachHangChucNang());
	}

	public KhachHangChucNang getKhachHangChucNang() {
		return khachHangChucNang;
	}
	public void setKhachHangChucNang(KhachHangChucNang khachHangChucNang) {
		this.khachHangChucNang = khachHangChucNang;
	}
	
	public int menu() {
		this.getKhachHangChucNang().xemDanhSachKhachHang();
		System.out.println("\n1. Thêm khách hàng");
		System.out.println("2. Xóa khách hàng");
		System.out.println("3. Cập nhật khách hàng");
		System.out.println("4. Tìm khách hàng");
		System.out.println("5. Thoát");
		System.out.print("Nhập lựa chọn: ");
		return Integer.parseInt(sc.nextLine());
	}
	
	public void themKhachHang() {
		this.getKhachHangChucNang().nhapKhachHang(this.nhapHoVaTen(), this.nhapDiaChi(), this.nhapEmail(), this.nhapSoDienThoai(), this.nhapNgaySinh());
	}
	
	public void xoaKhachHang() {
		String str = "Không tìm thấy";
		KhachHang khachHang = this.getKhachHangChucNang().searchKhachHang(this.nhapHoVaTen(), this.nhapNgaySinh());
		if(khachHang != null) {
			khachHang.inputNull();
			str = "";
		}
		System.out.println(str);
	}
	
	public void capNhatKhachHang() {
		String str = "Không tìm thấy";
		KhachHang khachHang = this.getKhachHangChucNang().searchKhachHang(this.nhapHoVaTen(), this.nhapNgaySinh());
		if(khachHang != null) {
			this.getKhachHangChucNang().nhapKhachHang(this.nhapHoVaTen(), this.nhapDiaChi(), this.nhapEmail(), this.nhapSoDienThoai(), this.nhapNgaySinh());
			str = "";
		}
		System.out.println(str);
	}
	
	public void timKhachHang() {
		String str = "Không tìm thấy";
		KhachHang khachHang = this.getKhachHangChucNang().searchKhachHang(this.nhapHoVaTen(), this.nhapNgaySinh());
		if(khachHang != null) {
			System.out.printf("\n%-3s %-25s %-50s %-30s %s\n","ID","HỌ VÀ TÊN","ĐỊA CHỈ","EMAIL","NGÀY SINH");
			khachHang.display();
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
			case 1: this.themKhachHang();break;
			case 2: this.xoaKhachHang();break;
			case 3: this.capNhatKhachHang();break;
			case 4: this.timKhachHang();break;
			}
		}while(luaChon < 5);
	}
}
