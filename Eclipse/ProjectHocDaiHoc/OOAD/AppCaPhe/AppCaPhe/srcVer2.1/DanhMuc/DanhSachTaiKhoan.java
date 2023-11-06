package DanhMuc;

import java.util.*;
import Object.TaiKhoan;

public class DanhSachTaiKhoan {
	private List<TaiKhoan> danhSachTaiKhoan;
	
	public DanhSachTaiKhoan() {
		this.setDanhSachTaiKhoan(new ArrayList<TaiKhoan>());
		this.khoiTaoTaiKhoan();
	}

	public List<TaiKhoan> getDanhSachTaiKhoan() {
		return danhSachTaiKhoan;
	}
	public void setDanhSachTaiKhoan(List<TaiKhoan> danhSachTaiKhoan) {
		this.danhSachTaiKhoan = danhSachTaiKhoan;
	}
	
	public void themTaiKhoan(TaiKhoan ...taiKhoan) {
		for(int i = 0; i < taiKhoan.length; i++) {
			this.getDanhSachTaiKhoan().add(taiKhoan[i]);
		}
	}
	
	//lấy danh sách ra có kiểu trả về là iterator
	public Iterator<TaiKhoan> layDanhSachTaiKhoan() {
		List<TaiKhoan> danhSach = new ArrayList<TaiKhoan>();
		for(Iterator<TaiKhoan> i = this.getDanhSachTaiKhoan().iterator();i.hasNext();) {
			TaiKhoan taiKhoan = (TaiKhoan)i.next();
			danhSach.add(taiKhoan);
		}
		return danhSach.iterator();
	}
	
	//Khởi tạo các tài khoản 
	public void khoiTaoTaiKhoan() {
		this.themTaiKhoan(	new TaiKhoan("TruongVanTienThinh", "TVTT", "Trương Văn Tiến Thịnh"),
							new TaiKhoan("PhanNhutTruong", "PNT", "Phan Nhựt Trường"),
							new TaiKhoan("NguyenThiQuynhGiang", "NTQG", "Nguyễn Thị Quỳnh Giang"),
							new TaiKhoan("NguyenLeViet", "NLV", "Nguyễn Lê Việt"),
							new TaiKhoan("PhamTanThu", "PTT", "Phạm Tân Thư"));
	}
}
