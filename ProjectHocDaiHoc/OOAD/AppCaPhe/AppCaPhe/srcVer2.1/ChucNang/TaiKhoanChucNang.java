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
	public void nhapTaiKhoan(String tenDangNhap, String matKhau, String ten) {
		TaiKhoan taiKhoan = new TaiKhoan(tenDangNhap, matKhau, ten);
		this.getDanhSachTaiKhoan().themTaiKhoan(taiKhoan);
		TaiKhoan.setCount(taiKhoan.getIdTaiKhoan());
	}

	public TaiKhoan searchTaiKhoan(String tenDangNhap) {
		Iterator<TaiKhoan> i = this.getDanhSachTaiKhoan().layDanhSachTaiKhoan();
		while(i.hasNext()) {
			TaiKhoan taiKhoan = (TaiKhoan)i.next();
			if(!taiKhoan.getTenDangNhap().equals(tenDangNhap))
				continue;
			return taiKhoan;
		}
		return null;
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
	public boolean kiemTra(String tenDangNhap, String matKhau) {
		Iterator<TaiKhoan> i = this.getDanhSachTaiKhoan().layDanhSachTaiKhoan();
		for(;i.hasNext();) {
			TaiKhoan taiKhoan = (TaiKhoan)i.next();
			if((!taiKhoan.getTenDangNhap().equals(tenDangNhap)) && (!taiKhoan.getMatKhau().equals(matKhau)))
				continue;
			return true;
		}
		return false;
	}
}
