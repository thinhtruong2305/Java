package HienThi;

import java.util.Scanner;
import ChucNang.NhanVienChucNang;
import Object.NhanVien;

public class NhanVienHienThi extends NguoiHienThi {
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
	
	public int menu() {
		this.getNhanVienChucNang().xemDanhSachNhanVien();
		System.out.println("\n1. Thêm nhân viên");
		System.out.println("2. Xóa nhân viên");
		System.out.println("3. Cập nhật nhân viên");
		System.out.println("4. Tìm nhân viên");
		System.out.println("5. Thoát");
		System.out.print("Nhập lựa chọn: ");
		return Integer.parseInt(sc.nextLine());
	}
	
	public void themNhanVien() {
		this.getNhanVienChucNang().nhapNhanVien(this.nhapHoVaTen(), this.nhapDiaChi(), this.nhapEmail(), this.nhapSoDienThoai(), this.nhapNgaySinh(), this.nhapChucVu());
	}
	
	public void xoaNhanVien() {
		String str = "không tìm thấy";
		NhanVien nhanVien = this.getNhanVienChucNang().searchNhanVien(this.nhapHoVaTen(), this.nhapNgaySinh());
		if(nhanVien != null) {
			nhanVien.inputNull();
			str = "";
		}
		System.out.println(str);
	}
	
	public void capNhatNhanVien() {
		String str = "không tìm thấy";
		NhanVien nhanVien = this.getNhanVienChucNang().searchNhanVien(this.nhapHoVaTen(), this.nhapNgaySinh());
		if(nhanVien != null) {
			this.getNhanVienChucNang().nhapNhanVien(this.nhapHoVaTen(), this.nhapDiaChi(), this.nhapEmail(), this.nhapSoDienThoai(), this.nhapNgaySinh(), this.nhapChucVu());
			str = "";
		}
		System.out.println(str);
	}
	
	public void timNhanVien() {
		String str = "không tìm thấy";
		NhanVien nhanVien = this.getNhanVienChucNang().searchNhanVien(this.nhapHoVaTen(), this.nhapNgaySinh());
		if(nhanVien != null) {
			System.out.printf("\n%-3s %-25s %-50s %-30s %-15s %-15s %s\n","ID","HỌ VÀ TÊN","ĐỊA CHỈ","EMAIL","NGÀY SINH","SỐ ĐIỆN THOẠI","CHỨC VỤ");
			nhanVien.display();
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
			case 1: this.themNhanVien();break;
			case 2: this.xoaNhanVien();break;
			case 3: this.capNhatNhanVien();break;
			case 4: this.timNhanVien();break;
			}
		} while (luaChon < 5);
	}
	
	public String nhapChucVu() {
		System.out.println("Nhập chức vụ: ");
		return sc.nextLine();
	}
}
