package DanhMuc;

import java.util.*;
import Object.DoUong;
import Object.LoaiDoUong;

public class DanhSachDoUong {
	private List<DoUong> danhSachDoUong;

	public DanhSachDoUong() {
		this.setDanhSachDoUong(new ArrayList<DoUong>());
		this.khoiTaoDoUong();
	}

	public List<DoUong> getDanhSachDoUong() {
		return danhSachDoUong;
	}

	public void setDanhSachDoUong(List<DoUong> danhSachDoUong) {
		this.danhSachDoUong = danhSachDoUong;
	}

	public void themDoUong(DoUong ...doUong) {
		for(int i = 0; i < doUong.length; i++) {
			this.getDanhSachDoUong().add(doUong[i]);
		}
	}

	//lấy danh sách ra có kiểu trả về là iterator
	public Iterator<DoUong> layDanhSachDoUong() {
		List<DoUong> danhSach = new ArrayList<DoUong>();
		for (Iterator<DoUong> i = this.getDanhSachDoUong().iterator(); i.hasNext();) {
			DoUong doUong = (DoUong) i.next();
			danhSach.add(doUong);
		}
		return danhSach.iterator();
	}
	
	public Iterator<DoUong> boLoc(LoaiDoUong loaiDoUong){
		List<DoUong> danhSach = new ArrayList<DoUong>();
		for(Iterator<DoUong> i = this.getDanhSachDoUong().iterator();i.hasNext();) {
			DoUong doUong = (DoUong)i.next();
			if(!doUong.getLoaiDoUong().equals(loaiDoUong))
				continue;
			danhSach.add(doUong);
		}
		return danhSach.iterator();
	}
	
	//Khởi tạo đồ uống
	public void khoiTaoDoUong() {
		this.themDoUong(new DoUong("Bạc xỉu", 23.000, LoaiDoUong.CÀPHÊ),new DoUong("Cà phê đen đá", 15.000, LoaiDoUong.CÀPHÊ),
						new DoUong("Cà phê Fhin", 17.000, LoaiDoUong.CÀPHÊ),new DoUong("Cà phê sữa đá", 20.000, LoaiDoUong.CÀPHÊ),
						new DoUong("Cà phê sữa nóng", 18.000, LoaiDoUong.CÀPHÊ),new DoUong("Trà sữa bạc hà", 15.000, LoaiDoUong.TRÀSỮA),
						new DoUong("Trà sữa dâu", 15.000, LoaiDoUong.TRÀSỮA),new DoUong("Trà sữa dưa gang", 15.000, LoaiDoUong.TRÀSỮA),
						new DoUong("Trà sữa đào", 15.000, LoaiDoUong.TRÀSỮA),new DoUong("Hồng trà đào", 15.000, LoaiDoUong.HỒNGTRÀ),
						new DoUong("Sinh tố dâu", 15.000, LoaiDoUong.SINHTỐ),new DoUong("Sinh tố dừa", 15.000, LoaiDoUong.SINHTỐ),
						new DoUong("Sinh tố bơ", 15.000, LoaiDoUong.SINHTỐ),new DoUong("Đá xay siro dâu", 13.000, LoaiDoUong.ĐÁXAY),
						new DoUong("Đá xay siro bạc hà", 13.000, LoaiDoUong.ĐÁXAY),new DoUong("Chân trâu", 1.000, LoaiDoUong.TOPPING),
						new DoUong("Thạch trái cây", 1.000, LoaiDoUong.TOPPING));
	}
}
