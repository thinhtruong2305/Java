package Manage;

import java.util.*;
import Object.*;

public class QuanLiNhanVien {
	private List<NhanVien> quanLiNhanVien;
	
	public QuanLiNhanVien() {
		this.setQuanLiNhanVien(new ArrayList<NhanVien>());
	}

	public List<NhanVien> getQuanLiNhanVien() {
		return quanLiNhanVien;
	}
	public void setQuanLiNhanVien(List<NhanVien> quanLiNhanVien) {
		this.quanLiNhanVien = quanLiNhanVien;
	}
	
	public void themNhanVien(NhanVien nhanVien) {
		this.getQuanLiNhanVien().add(nhanVien);
	}
	
	//xóa nhân viên theo id
	public void xoaNhanVienTheoID(int ID) {
		for(Iterator<NhanVien> i = this.quanLiNhanVien.iterator();i.hasNext();) {
			NhanVien nhanVien = (NhanVien)i.next();
			if(nhanVien.getIdNhanVien() == ID) {
				i.remove();
			}
		}
	}
	
	//Cập nhật nhân viên theo id
	public void suaThongTinNhanVienTheoID(int ID) {
		for(Iterator<NhanVien> i = this.quanLiNhanVien.iterator();i.hasNext();) {
			NhanVien nhanVien = (NhanVien)i.next();
			if(nhanVien.getIdNhanVien() == ID) {
				nhanVien.input();
				break;
			}
		}
	}
	
	//hiển thị danh sách
	public void xuat() {
		for(Iterator<NhanVien> i = this.getQuanLiNhanVien().iterator();i.hasNext();) {
			NhanVien nhanVien = (NhanVien)i.next();
			nhanVien.display();
		}
	}
	
	//tìm nhân viên theo id có kiểu trả về là iterator
	public Iterator<NhanVien> timNhanVienTheoID(int ID){
		List<NhanVien> danhSachTim = new ArrayList<NhanVien>();
		for(Iterator<NhanVien> i = this.quanLiNhanVien.iterator();i.hasNext();) {
			NhanVien nhanVien = (NhanVien)i.next();
			if(nhanVien.getIdNhanVien() != ID)
				continue;
			danhSachTim.add(nhanVien);
			return danhSachTim.iterator();
		}
		return null;
	}
}
