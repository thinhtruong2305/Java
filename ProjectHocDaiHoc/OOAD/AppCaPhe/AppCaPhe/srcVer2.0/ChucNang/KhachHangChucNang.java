package ChucNang;

import java.util.*;
import DanhMuc.DanhSachKhachHang;
import Object.KhachHang;

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
	
	public void themKhachHang() {
		KhachHang khachHang = new KhachHang();
		khachHang.input();
		this.getDanhSachKhachHang().themKhachHang(khachHang);
		KhachHang.setCount(khachHang.getIdKhachHang());
	}
	public void xoaKhachHang() {
		System.out.print("Nhập tên khách hàng cần xóa: ");
		String ten = sc.nextLine();
		System.out.print("Nhập ngày sinh khách hàng cần xóa: ");
		String ngaySinh = sc.nextLine();
		this.getDanhSachKhachHang().xoaKhachHang(ten, ngaySinh);
	}
	
	//Cập nhật khách hàng bằng cách tìm và thay đổi trong danh sách đã lấy ra
	public void capNhatKhachHang() {
		System.out.print("Nhập tên khách hàng cần cập nhật: ");
		String ten = sc.nextLine();
		System.out.print("Nhập ngày sinh khách hàng cần cập nhật: ");
		String ngaySinh = sc.nextLine();
		Iterator<KhachHang> j = this.getDanhSachKhachHang().layDanhSachKhachHang();
		Iterator<KhachHang> i = this.getDanhSachKhachHang().timKhachHang(ten, ngaySinh);
		if(i.hasNext()) {
			KhachHang khachHangSoSanh = (KhachHang)i.next();
			for(;j.hasNext();) {
				KhachHang khachHang = (KhachHang)j.next();
				if(khachHang == khachHangSoSanh)
						khachHang.input();
			}
		}else {
			System.out.println("Không tìm thấy");
		}
	}
	public void timKhachHang() {
		System.out.print("Nhập tên khách hàng cần cập nhật: ");
		String ten = sc.nextLine();
		System.out.print("Nhập ngày sinh khách hàng cần cập nhật: ");
		String ngaySinh = sc.nextLine();
		Iterator<KhachHang> i = this.getDanhSachKhachHang().timKhachHang(ten, ngaySinh);
		if(i.hasNext()) {
			KhachHang khachHang = (KhachHang)i.next();
			System.out.printf("\n%-3s %-25s %-50s %-30s %s\n","ID","HỌ VÀ TÊN","ĐỊA CHỈ","EMAIL","NGÀY SINH");
			khachHang.display();
		}else {
			System.out.println("Không tìm thấy");
		}
	}
	
	//Hiển thị danh sách đã lấy ra
	public void xemDanhSachKhachHang() {
		Iterator<KhachHang> i = this.getDanhSachKhachHang().layDanhSachKhachHang();
		if(i.hasNext()) {
			System.out.printf("\n%-3s %-25s %-50s %-30s %s\n","ID","HỌ VÀ TÊN","ĐỊA CHỈ","EMAIL","NGÀY SINH");
			for(;i.hasNext();) {
				KhachHang khachHang = (KhachHang)i.next();
				khachHang.display();
			}
		}
	}
}
