package Manage;

import java.util.*;
import Object.TaiKhoan;

public class QuanLiTaiKhoan {
	private List<TaiKhoan> quanLiTaiKhoan;
	
	public QuanLiTaiKhoan() {
		this.setQuanLiTaiKhoan(new ArrayList<TaiKhoan>());
	}

	public List<TaiKhoan> getQuanLiTaiKhoan() {
		return quanLiTaiKhoan;
	}
	public void setQuanLiTaiKhoan(List<TaiKhoan> quanLiTaiKhoan) {
		this.quanLiTaiKhoan = quanLiTaiKhoan;
	}
	
	public void themTaiKhoan(TaiKhoan taiKhoan) {
		this.getQuanLiTaiKhoan().add(taiKhoan);
	}
	
	//xóa tài khoản theo id
	public void xoaTaiKhoanTheoID(int ID) {
		for(Iterator<TaiKhoan> i = this.quanLiTaiKhoan.iterator();i.hasNext();) {
			TaiKhoan taiKhoan = (TaiKhoan)i.next();
			if(taiKhoan.getIdTaiKhoan() == ID) {
				i.remove();
			}
		}
	}
	
	//Cập nhật tài khoản theo id
	public void suaThongTinTaiKhoanTheoID(int idTaiKhoan) {
		for(Iterator<TaiKhoan> i = this.quanLiTaiKhoan.iterator();i.hasNext();) {
			TaiKhoan taiKhoan = (TaiKhoan)i.next();
			if(taiKhoan.getIdTaiKhoan() == idTaiKhoan) {
				taiKhoan.input();
				break;
			}
		}
	}
	
	//hiển thị danh sách
	public void xuat() {
		for(Iterator<TaiKhoan> i = this.quanLiTaiKhoan.iterator();i.hasNext();) {
			TaiKhoan taiKhoan = (TaiKhoan)i.next();
			taiKhoan.display();
		}
	}
	
	//Tìm tài khoản theo id có kiểu trả về là iterator
	public Iterator<TaiKhoan> timTaiKhoanTheoID(int ID) {
		List<TaiKhoan> danhSachTim = new ArrayList<TaiKhoan>();
		for(Iterator<TaiKhoan> i = this.quanLiTaiKhoan.iterator();i.hasNext();) {
			TaiKhoan taiKhoan = (TaiKhoan)i.next();
			if(taiKhoan.getIdTaiKhoan() != ID)
				continue;
			danhSachTim.add(taiKhoan);
			return danhSachTim.iterator();
		}
		return null;
	}
	
	//tìm tài khoản theo tên đăng nhập và mật khẩu cho đăng nhập
	public Iterator<TaiKhoan> timTaiKhoanChoDangNhap(String tenDangNhap, String matKhau) {
		List<TaiKhoan> danhSachTim = new ArrayList<TaiKhoan>();
		for(Iterator<TaiKhoan> i = this.quanLiTaiKhoan.iterator();i.hasNext();) {
			TaiKhoan taiKhoan = (TaiKhoan)i.next();
			if(!taiKhoan.getTenDangNhap().equalsIgnoreCase(tenDangNhap))
				continue;
			if(!taiKhoan.getMatKhau().equalsIgnoreCase(matKhau))
				continue;
			danhSachTim.add(taiKhoan);
			return danhSachTim.iterator();
		}
		return null;
	}
}
