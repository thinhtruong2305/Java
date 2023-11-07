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
	
	public void themNhanVien() {
		NhanVien nhanVien = new NhanVien();
		nhanVien.input();
		this.getDanhSachNhanVien().themNhanVien(nhanVien);
		NhanVien.setCount(nhanVien.getIdNhanVien());
	}
	public void xoaNhanVien() {
		System.out.print("Nhập tên nhân viên cần xóa: ");
		String ten = sc.nextLine();
		System.out.print("Nhập ngày sinh nhân viên cần xóa: ");
		String ngaySinh = sc.nextLine();
		this.getDanhSachNhanVien().xoaNhanVien(ten, ngaySinh);
	}
	
	//Cập nhật nhân viên bằng cách tìm và thay đổi trong danh sách đã lấy ra
	public void capNhatNhanVien() {
		System.out.print("Nhập tên nhân viên cần cập nhật: ");
		String ten = sc.nextLine();
		System.out.print("Nhập ngày sinh nhân viên cần cập nhật: ");
		String ngaySinh = sc.nextLine();
		Iterator<NhanVien> j = this.getDanhSachNhanVien().layDanhSachNhanVien();
		Iterator<NhanVien> i = this.getDanhSachNhanVien().timNhanTheoTenVaNgaySinh(ten, ngaySinh);
		if(i.hasNext()) {
			NhanVien nhanVienSoSanh = (NhanVien)i.next();
			for(;j.hasNext();) {
				NhanVien nhanVien = (NhanVien)j.next();
				if(nhanVien == nhanVienSoSanh)
					nhanVien.input();
			}
		}else {
			System.out.println("Không tìm thấy");
		}
	}
	public void timNhanVien() {
		System.out.print("Nhập tên nhân viên cần tìm: ");
		String ten = sc.nextLine();
		System.out.print("Nhập ngày sinh nhân viên cần tìm: ");
		String ngaySinh = sc.nextLine();
		Iterator<NhanVien> i = this.getDanhSachNhanVien().timNhanTheoTenVaNgaySinh(ten, ngaySinh);
		if(i.hasNext()) {
			NhanVien nhanVien = (NhanVien)i.next();
			System.out.printf("\n%-3s %-25s %-50s %-30s %-15s %-15s %s\n","ID","HỌ VÀ TÊN","ĐỊA CHỈ","EMAIL","NGÀY SINH","SỐ ĐIỆN THOẠI","CHỨC VỤ");
			nhanVien.display();
		}
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
