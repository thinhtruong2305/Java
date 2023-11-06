package DanhMuc;

import java.util.*;
import Object.HoaDon;

public class DanhSachHoaDon {
	private List<HoaDon> danhSachHoaDon;
	
	public DanhSachHoaDon() {
		this.setDanhSachHoaDon(new ArrayList<HoaDon>());
	}
	
	public List<HoaDon> getDanhSachHoaDon() {
		return danhSachHoaDon;
	}
	public void setDanhSachHoaDon(List<HoaDon> danhSachHoaDon) {
		this.danhSachHoaDon = danhSachHoaDon;
	}
	
	public void themHoaDon(HoaDon ...hoaDons) {
		for(int i = 0; i < hoaDons.length; i++) {
			this.getDanhSachHoaDon().add(hoaDons[i]);
			HoaDon.setCount(hoaDons[i].getIdHoaDon());
		}
	}
	
	public Iterator<HoaDon> layDanhSachHoaDon(){
		List<HoaDon> danhSach = new ArrayList<HoaDon>();
		for(Iterator<HoaDon> i = this.getDanhSachHoaDon().iterator();i.hasNext();) {
			HoaDon hoaDon = (HoaDon)i.next();
			danhSach.add(hoaDon);
		}
		return danhSach.iterator();
	}
}
