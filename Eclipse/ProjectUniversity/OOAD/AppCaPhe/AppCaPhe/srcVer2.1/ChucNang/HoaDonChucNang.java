package ChucNang;

import java.util.Iterator;
import DanhMuc.DanhSachHoaDon;
import Object.HoaDon;

public class HoaDonChucNang {
	private DanhSachHoaDon danhSachHoaDon;
	
	public HoaDonChucNang() {
		this.setDanhSachHoaDon(new DanhSachHoaDon());
	}
	
	public DanhSachHoaDon getDanhSachHoaDon() {
		return danhSachHoaDon;
	}
	public void setDanhSachHoaDon(DanhSachHoaDon danhSachHoaDon) {
		this.danhSachHoaDon = danhSachHoaDon;
	}
	
	public void themHoaDon(HoaDon ...hoaDon) {
		this.getDanhSachHoaDon().themHoaDon(hoaDon);
	}
	
	public void xemDanhSachHoaDon(int idHoaDon) {
		Iterator<HoaDon> i = this.getDanhSachHoaDon().layDanhSachHoaDon();
		while(i.hasNext()) {
			HoaDon hoaDon = (HoaDon)i.next();
			if(hoaDon.getIdHoaDon() != idHoaDon)
				continue;
			hoaDon.display();
		}
	}
}
