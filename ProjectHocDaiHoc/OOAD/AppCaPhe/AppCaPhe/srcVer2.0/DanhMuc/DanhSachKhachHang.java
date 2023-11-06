package DanhMuc;

import java.util.*;
import Object.KhachHang;

public class DanhSachKhachHang {
	private List<KhachHang> danhSachKhachHang;
	
	public DanhSachKhachHang() {
		this.setDanhSachKhachHang(new ArrayList<KhachHang>());
		this.khoiTaoKhachHang();
	}

	public List<KhachHang> getDanhSachKhachHang() {
		return danhSachKhachHang;
	}
	public void setDanhSachKhachHang(List<KhachHang> danhSachKhachHang) {
		this.danhSachKhachHang = danhSachKhachHang;
	}
	
	public void themKhachHang(KhachHang khachHang) {
		this.getDanhSachKhachHang().add(khachHang);
	}
	
	// xóa khách hàng theo tên nhưng để tránh trùng tên nên yêu cầu thêm ngày sinh
	public void xoaKhachHang(String ten, String ngaySinh) {
		String str = "";
		for(Iterator<KhachHang> i = this.getDanhSachKhachHang().iterator();i.hasNext();) {
			KhachHang khachHang = (KhachHang)i.next();
			if(khachHang.getTen().equalsIgnoreCase(ten)) {
				if(khachHang.getNgaySinh().equals(ngaySinh)) {
					i.remove();
					str = "";break;
				}else {
					str = "Không tìm thấy";
				}
			}
		}
		System.out.println(str);
	}
	
	// tìm khách hàng theo tên nhưng để tránh trùng tên nên yêu cầu thêm ngày sinh
	public Iterator<KhachHang> timKhachHang(String ten, String ngaySinh) {
		List<KhachHang> danhSachTim = new ArrayList<KhachHang>();
		for(Iterator<KhachHang> i = this.getDanhSachKhachHang().iterator();i.hasNext();) {
			KhachHang khachHang = (KhachHang)i.next();
			if(!khachHang.getTen().equalsIgnoreCase(ten))
				continue;
			if(!khachHang.getNgaySinh().equals(ngaySinh))
				continue;
			danhSachTim.add(khachHang);
			return danhSachTim.iterator();
		}
		return null;
	}
	
	//lấy danh sách ra có kiểu trả về là iterator
	public Iterator<KhachHang> layDanhSachKhachHang() {
		List<KhachHang> danhSach = new ArrayList<KhachHang>();
		for(Iterator<KhachHang> i = this.getDanhSachKhachHang().iterator();i.hasNext();) {
			KhachHang khachHang = (KhachHang)i.next();
			danhSach.add(khachHang);
		}
		return danhSach.iterator();
	}
	
	//Khởi tạo khách hàng
	public void khoiTaoKhachHang() {
		KhachHang thinh = new KhachHang("Trương Văn Tiến Thịnh", "122 Âm Binh, Phường Cô hồn, Quận Các Đảng", "thinh@gmail.com", "23/05/2001", "123456789");
		this.themKhachHang(thinh);
		KhachHang truong = new KhachHang("Phan Nhựt Trường", "16 Bông Mai, Phường Bông Đào, Quận Chợ Bông", "truong@gmail.com", "11/02/2001", "244466666");
		this.themKhachHang(truong);
		KhachHang viet = new KhachHang("Nguyễn Lê Việt", "24 Cây cỏ, Phường Gió Mây, Quận Đồi Núi", "viet@gmail.com", "21/09/2001", "222211119");
		this.themKhachHang(viet);
		KhachHang thu = new KhachHang("Phạm Tân Thư", "35 Lười, Phường Đi Làm, Quận Lắm Chuyện", "thu@gmail.com", "10/01/2001", "74040740");
		this.themKhachHang(thu);
		KhachHang giang = new KhachHang("Nguyễn Thị Quỳnh Giang", "15 Đa Nhiệm, Phường GPU, Quận Card Màn Hình", "giang@gmail.com", "28/02/2001", "370370370");
		this.themKhachHang(giang);
	}
}
