package ChucNang;

import java.util.*;
import DanhMuc.DanhSachTaiKhoan;
import Object.TaiKhoan;

public class TaiKhoanChucNang {
	Scanner sc = new Scanner(System.in);
	private DanhSachTaiKhoan danhSachTaiKhoan;

	public TaiKhoanChucNang() {
		this.setDanhSachTaiKhoan(new DanhSachTaiKhoan());
	}
	
	public DanhSachTaiKhoan getDanhSachTaiKhoan() {
		return danhSachTaiKhoan;
	}
	public void setDanhSachTaiKhoan(DanhSachTaiKhoan danhSachTaiKhoan) {
		this.danhSachTaiKhoan = danhSachTaiKhoan;
	}
	
	//Muốn thêm tài khoản thì tên đăng nhập và mật khẩu không được trùng
	public void themTaiKhoan() {
		TaiKhoan taiKhoan = new TaiKhoan();
		do {
			taiKhoan.input();
		}while(this.kiemTraTrung(taiKhoan.getTenDangNhap(), taiKhoan.getMatKhau()));
		this.getDanhSachTaiKhoan().themTaiKhoan(taiKhoan);
		TaiKhoan.setCount(taiKhoan.getIdTaiKhoan());
	}
	public void xoaTaiKhoan() {
		System.out.print("Nhập tên đăng nhập cần xóa: ");
		String tenDangNhap = sc.nextLine();
		this.getDanhSachTaiKhoan().xoaTaiKhoanTheoTenDangNhap(tenDangNhap);
	}
	
	//Cập nhật bằng cách tìm và thay đổi trong danh sách đã lấy ra. Để phục vụ đúng thì lấy hàm thêm và xóa
	public void capNhatTaiKhoan() {
		TaiKhoan taiKhoan = null;
		System.out.print("Nhập tên đăng nhập cần cập nhật: ");
		String tenDangNhap = sc.nextLine();
		Iterator<TaiKhoan> j = this.getDanhSachTaiKhoan().layDanhSachTaiKhoan();
		Iterator<TaiKhoan> i = this.getDanhSachTaiKhoan().timTaiKhoanTheoTenDangNhap(tenDangNhap);
		if(i.hasNext()) {
			TaiKhoan taiKhoanSoSanh = (TaiKhoan)i.next();
				for(;j.hasNext();) {
					taiKhoan = (TaiKhoan)j.next();
					TaiKhoan.setCount(taiKhoan.getIdTaiKhoan()-1);
					if(taiKhoan == taiKhoanSoSanh) {
						this.getDanhSachTaiKhoan().xoaTaiKhoanTheoTenDangNhap(tenDangNhap);
						this.themTaiKhoan();
					}
				}		
		}else {
			System.out.println("Không tìm thấy");
		}
	}
	public void timTaiKhoan() {
		System.out.print("Nhập tên đăng nhập cần tìm: ");
		String tenDangNhap = sc.nextLine();
		Iterator<TaiKhoan> i = this.getDanhSachTaiKhoan().timTaiKhoanTheoTenDangNhap(tenDangNhap);
		if(i.hasNext()) {
			TaiKhoan taiKhoan = (TaiKhoan)i.next();
			System.out.printf("\n%-3s %-30s %-30s %s\n","ID","TÊN ĐĂNG NHẬP","MẬT KHẨU","HỌ VÀ TÊN");
			taiKhoan.display();
		}else {
			System.out.println("Không tìm thấy");
		}
	}
	
	//Hiển thị danh sách đã lấy ra
	public void xemDanhSachTaiKhoan() {
		Iterator<TaiKhoan> i = this.getDanhSachTaiKhoan().layDanhSachTaiKhoan();
		if(i.hasNext()) {
			System.out.printf("\n%-3s %-30s %-30s %s\n","ID","TÊN ĐĂNG NHẬP","MẬT KHẨU","HỌ VÀ TÊN");
			for(;i.hasNext();) {
				TaiKhoan taiKhoan = (TaiKhoan)i.next();
				taiKhoan.display();
			}
		}
	}
	public boolean kiemTraTrung(String tenDangNhap, String matKhau) {
		Iterator<TaiKhoan> i = this.getDanhSachTaiKhoan().layDanhSachTaiKhoan();
		for(;i.hasNext();) {
			TaiKhoan taiKhoan = (TaiKhoan)i.next();
			if(!taiKhoan.getTenDangNhap().equals(tenDangNhap))
				continue;
			if(!taiKhoan.getMatKhau().equals(matKhau))
				continue;
			return true;
		}
		return false;
	}
}
