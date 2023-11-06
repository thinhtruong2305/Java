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
	
	//Chọn đồ uống và lưu vào danh sách
	public void chonDoUong(int idHoaDon, ChonDoUong ...chonDoUongs) {
		for(int i = 0; i < chonDoUongs.length; i++) {
			chonDoUongs[i].setIdHoaDon(idHoaDon);
			this.getDanhSachChonDoUong().add(chonDoUongs[i]);
			ChonDoUong.setCount(chonDoUongs[i].getID());
		}
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
