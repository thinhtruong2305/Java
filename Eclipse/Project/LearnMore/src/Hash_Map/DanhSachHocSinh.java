package Hash_Map;

import java.util.*;

public class DanhSachHocSinh {
	private HashMap<String, HocSinh> danhSachHocSinh;
	
	public DanhSachHocSinh() {
		this.setDanhSachHocSinh(new HashMap<>());
	}
	
	public HashMap<String, HocSinh> getDanhSachHocSinh() {
		return danhSachHocSinh;
	}

	public void setDanhSachHocSinh(HashMap<String, HocSinh> danhSachHocSinh) {
		this.danhSachHocSinh = danhSachHocSinh;
	}

	public void themHocSinh(String ten, String ngaySinh, String diaChi, String email) {
		HocSinh hocSinh = new HocSinh("HSNTT"+ "0" + danhSachHocSinh.size(), ten, ngaySinh, diaChi, email);
		danhSachHocSinh.put(hocSinh.getMaHocSinh(), hocSinh);
	}
	 public void xoaHocSinh(String maHocSinh) {
		 danhSachHocSinh.remove(maHocSinh);
	 }
	 public HocSinh timHocSinh(String maHocSinh) {
		 return danhSachHocSinh.get(maHocSinh);
	 }
}
