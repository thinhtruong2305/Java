package ChucNang;

import java.util.*;
import DanhMuc.DanhSachDatDoUong;
import Object.DatDoUong;

public class DatDoUongChucNang {
	private DanhSachDatDoUong danhSachDatDoUong;
	
	public DatDoUongChucNang() {
		this.setDanhSachDatDoUong(new DanhSachDatDoUong());
	}

	public DanhSachDatDoUong getDanhSachDatDoUong() {
		return danhSachDatDoUong;
	}
	public void setDanhSachDatDoUong(DanhSachDatDoUong danhSachDatDoUong) {
		this.danhSachDatDoUong = danhSachDatDoUong;
	}
	
	public void datDoUong() {
		DatDoUong datDoUong = new DatDoUong();
		datDoUong.input();
		this.getDanhSachDatDoUong().datDoUong(datDoUong);
	}
	
	//Xóa hết danh sách đặt
	public void xoaDatDoUong() {
		this.getDanhSachDatDoUong().xoaDatDoUong();
	}
	
	//Hiển thị danh sách đặt đồ uống
	public void hienThiDatDoUong() {
		Iterator<DatDoUong> i = this.getDanhSachDatDoUong().layDanhSachDatDoUong();
		if(i.hasNext()) {
			DatDoUong datDoUong = (DatDoUong)i.next();
			datDoUong.display();
		}else {
			System.out.println("Không tìm thấy");
		}
	}
}
