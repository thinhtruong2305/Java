
package ChucNang;

import java.util.*;
import DanhMuc.DanhSachDoUong;
import Object.*;

public class DoUongChucNang {
	Scanner sc = new Scanner(System.in);
	private DanhSachDoUong danhSachDoUong;
	
	public DoUongChucNang() {
		this.setDanhSachDoUong(new DanhSachDoUong());
	}

	public DanhSachDoUong getDanhSachDoUong() {
		return danhSachDoUong;
	}
	public void setDanhSachDoUong(DanhSachDoUong danhSachDoUong) {
		this.danhSachDoUong = danhSachDoUong;
	}
	
	//Nhập đồ uống và lưu vào danh sách
	public void nhapDoUong(String tenDoUong, double giaTien, LoaiDoUong loaiDoUong) {
		DoUong doUong = new DoUong(tenDoUong, giaTien, loaiDoUong);
		this.getDanhSachDoUong().themDoUong(doUong);
		DoUong.setCount(doUong.getIdDoUong());
	}
	
	//Tìm và kiểm tra có đồ uống hợp với tên và trả về DoUong
	public DoUong searchDoUong(String ten) {
		Iterator<DoUong> i = this.getDanhSachDoUong().layDanhSachDoUong();
		while(i.hasNext()) {
			DoUong doUong = (DoUong)i.next();
			if(!doUong.getTenDoUong().equals(ten))
				continue;
			return doUong;
		}
		return null;
	}
	
	//Hiển thị danh sách đã lấy ra
	public void xemDanhSachDoUong() {
		Iterator<DoUong> i = this.getDanhSachDoUong().layDanhSachDoUong();
		if(i.hasNext()) {
			System.out.printf("\n%-3s %-30s %-15s %s","ID","TÊN","LOẠI","GIÁ");
			while(i.hasNext()) {
				DoUong doUong = (DoUong)i.next();
				doUong.display();
			}
		}
	}
	
	public void xemDanhSachTheoLoaiDoUong(LoaiDoUong loaiDoUong) {
		Iterator<DoUong> i = this.getDanhSachDoUong().boLoc(loaiDoUong);
		if(i.hasNext()) {
			System.out.printf("\n%-3s %-35s %-15s %s\n","ID","Đồ uống","Số lượng","Số tiền");
			while(i.hasNext()) {
				DoUong doUong = (DoUong)i.next();
				doUong.display();
			}
		}
	}
}
