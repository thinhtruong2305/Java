package DanhMuc;

import java.util.*;
import Object.*;

public class DanhSachChonDoUong {
	private List<ChonDoUong> danhSachChonDoUong;
	
	public DanhSachChonDoUong() {
		this.setDanhSachChonDoUong(new ArrayList<ChonDoUong>());
	}
	
	public List<ChonDoUong> getDanhSachChonDoUong() {
		return danhSachChonDoUong;
	}
	public void setDanhSachChonDoUong(List<ChonDoUong> danhSachChonDoUong) {
		this.danhSachChonDoUong = danhSachChonDoUong;
	}
	
	//Thêm 1 lần chọn vào danh sách
	public void chonDoUong(ChonDoUong chonDoUong) {
		this.getDanhSachChonDoUong().add(chonDoUong);
	}
	
	//Xóa hết danh sách
	public void xoaChonDoUong() {
		this.getDanhSachChonDoUong().clear();
	}
	
	//lấy danh sách có kiểu trả về là một iterator
	public Iterator<ChonDoUong> layDanhSachChonDoUong(){
		List<ChonDoUong> danhSach = new ArrayList<ChonDoUong>();
		for(Iterator<ChonDoUong> i = this.getDanhSachChonDoUong().iterator();i.hasNext();) {
			ChonDoUong chonDoUong = (ChonDoUong)i.next();
			danhSach.add(chonDoUong);
		}
		return danhSach.iterator();
	}
}
