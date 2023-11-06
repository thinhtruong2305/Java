package ChucNang;

import java.util.*;
import DanhMuc.DanhSachNhanVien;
import Object.NhanVien;

public class NhanVienChucNang {
	Scanner sc = new Scanner(System.in);
	private DanhSachNhanVien danhSachNhanVien;
	
	public NhanVienChucNang() {
		this.setDanhSachNhanVien(new DanhSachNhanVien());
	}

	public DanhSachNhanVien getDanhSachNhanVien() {
		return danhSachNhanVien;
	}
	public void setDanhSachNhanVien(DanhSachNhanVien danhSachNhanVien) {
		this.danhSachNhanVien = danhSachNhanVien;
	}
	
	public void nhapNhanVien(String ten, String diaChi, String email, String soDienThoai, String ngaySinh, String chucVu) {
		NhanVien nhanVien = new NhanVien(ten, diaChi, email, ngaySinh, soDienThoai, chucVu);
		this.getDanhSachNhanVien().themNhanVien(nhanVien);
		NhanVien.setCount(nhanVien.getIdNhanVien());
	}
	
	public NhanVien searchNhanVien(String ten, String ngaySinh) {
		Iterator<NhanVien> i = this.getDanhSachNhanVien().layDanhSachNhanVien();
		while(i.hasNext()) {
			NhanVien nhanVien = (NhanVien)i.next();
			if((!nhanVien.getTen().equals(ten)) && (!nhanVien.getNgaySinh().equalsIgnoreCase(ngaySinh)))
				continue;
			return nhanVien;
		}
		return null;
	}
	
	//Hiển thị danh sách đã lấy ra
	public void xemDanhSachNhanVien() {
		Iterator<NhanVien> i = this.getDanhSachNhanVien().layDanhSachNhanVien();
		if(i.hasNext()) {
			System.out.printf("\n%-3s %-25s %-50s %-30s %-15s %-15s %s\n","ID","HỌ VÀ TÊN","ĐỊA CHỈ","EMAIL","NGÀY SINH","SỐ ĐIỆN THOẠI","CHỨC VỤ");
			for(;i.hasNext();) {
				NhanVien nhanVien = (NhanVien)i.next();
				nhanVien.display();
			}
		}
	}
}
