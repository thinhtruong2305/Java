package ChucNang;

import java.util.*;
import DanhMuc.DanhSachKhachHang;
import Object.*;

public class KhachHangChucNang {
	Scanner sc = new Scanner(System.in);
	private DanhSachKhachHang danhSachKhachHang;
	
	public KhachHangChucNang() {
		this.setDanhSachKhachHang(new DanhSachKhachHang());
	}

	public DanhSachKhachHang getDanhSachKhachHang() {
		return danhSachKhachHang;
	}
	public void setDanhSachKhachHang(DanhSachKhachHang danhSachKhachHang) {
		this.danhSachKhachHang = danhSachKhachHang;
	}
	
	public void nhapKhachHang(String ten, String diaChi, String email, String soDienThoai, String ngaySinh) {
		KhachHang khachHang = new KhachHang(ten, diaChi, email, ngaySinh, soDienThoai);
		this.getDanhSachKhachHang().themKhachHang(khachHang);
		KhachHang.setCount(khachHang.getIdKhachHang());
	}
	
	public KhachHang searchKhachHang(String ten, String ngaySinh) {
		Iterator<KhachHang> i = this.getDanhSachKhachHang().layDanhSachKhachHang();
		while(i.hasNext()) {
			KhachHang khachHang = (KhachHang)i.next();
			if((!khachHang.getTen().equalsIgnoreCase(ten)) && (!khachHang.getNgaySinh().equalsIgnoreCase(ngaySinh)))
				continue;
			return khachHang;
		}
		return null;
	}
	
	//Hiển thị danh sách đã lấy ra
	public void xemDanhSachKhachHang() {
		Iterator<KhachHang> i = this.getDanhSachKhachHang().layDanhSachKhachHang();
		if(i.hasNext()) {
			System.out.printf("\n%-3s %-25s %-50s %-30s %s\n","ID","HỌ VÀ TÊN","ĐỊA CHỈ","EMAIL","NGÀY SINH");
			while(i.hasNext()) {
				KhachHang khachHang = (KhachHang)i.next();
				khachHang.display();
			}
		}
	}
}
