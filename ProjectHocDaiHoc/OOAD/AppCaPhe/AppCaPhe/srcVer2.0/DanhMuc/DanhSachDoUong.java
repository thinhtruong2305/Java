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

	public void themDoUong(DoUong doUong) {
		this.getDanhSachDoUong().add(doUong);
	}

	// xóa đồ uống theo tên
	public void xoaDoUongTheoTen(String tenDoUong) {
		String str = "";
		for(Iterator<DoUong> i = this.getDanhSachDoUong().iterator();i.hasNext();) {
			DoUong doUong = (DoUong)i.next();
			if(doUong.getTenDoUong().equalsIgnoreCase(tenDoUong)) {
				i.remove();
				str = "";break;
			}else {
				str = "Không tìm thấy";
			}
		}
		System.out.println(str);
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

	// tìm đồ uống theo tên có kiểu trả về là một iterator
	public Iterator<DoUong> timDoUongTheoTen(String tenDoUong) {
		List<DoUong> danhSachTim = new ArrayList<DoUong>();
		for (Iterator<DoUong> i = this.getDanhSachDoUong().iterator(); i.hasNext();) {
			DoUong doUong = (DoUong) i.next();
			if (!doUong.getTenDoUong().equalsIgnoreCase(tenDoUong))
				continue;
			danhSachTim.add(doUong);
			return danhSachTim.iterator();
		}
		return null;
	}
	
	//Khởi tạo đồ uống
	public void khoiTaoDoUong() {
		DoUong bacXiu = new DoUong("Bạc xỉu", 23.000, LoaiDoUong.CÀPHÊ);
		this.themDoUong(bacXiu);
		DoUong caPheDenDa = new DoUong("Cà phê đen đá", 15.000, LoaiDoUong.CÀPHÊ);
		this.themDoUong(caPheDenDa);
		DoUong caPheFhin = new DoUong("Cà phê Fhin", 17.000, LoaiDoUong.CÀPHÊ);
		this.themDoUong(caPheFhin);
		DoUong caPheSuaDa = new DoUong("Cà phê sữa đá", 20.000, LoaiDoUong.CÀPHÊ);
		this.themDoUong(caPheSuaDa);
		DoUong caPheSuaNong = new DoUong("Cà phê sữa nóng", 18.000, LoaiDoUong.CÀPHÊ);
		this.themDoUong(caPheSuaNong);
		DoUong traSuaBacHa = new DoUong("Trà sữa bạc hà", 15.000, LoaiDoUong.TRÀSỮA);
		this.themDoUong(traSuaBacHa);
		DoUong traSuaDau = new DoUong("Trà sữa dâu", 15.000, LoaiDoUong.TRÀSỮA);
		this.themDoUong(traSuaDau);
		DoUong traSuaDuaGang = new DoUong("Trà sữa dưa gang", 15.000, LoaiDoUong.TRÀSỮA);
		this.themDoUong(traSuaDuaGang);
		DoUong traSuaDao = new DoUong("Trà sữa đào", 15.000, LoaiDoUong.TRÀSỮA);
		this.themDoUong(traSuaDao);
		DoUong hongTraDao = new DoUong("Hồng trà đào", 15.000, LoaiDoUong.HỒNGTRÀ);
		this.themDoUong(hongTraDao);
		DoUong sinhToDau = new DoUong("Sinh tố dâu", 15.000, LoaiDoUong.SINHTỐ);
		this.themDoUong(sinhToDau);
		DoUong sinhToDua = new DoUong("Sinh tố dừa", 15.000, LoaiDoUong.SINHTỐ);
		this.themDoUong(sinhToDua);
		DoUong sinhToBo = new DoUong("Sinh tố bơ", 15.000, LoaiDoUong.SINHTỐ);
		this.themDoUong(sinhToBo);
		DoUong daXaySiroDau = new DoUong("Đá xay siro dâu", 13.000, LoaiDoUong.ĐÁXAY);
		this.themDoUong(daXaySiroDau);
		DoUong daXaySiroBacHa = new DoUong("Đá xay siro bạc hà", 13.000, LoaiDoUong.ĐÁXAY);
		this.themDoUong(daXaySiroBacHa);
		DoUong chanTrau = new DoUong("Chân trâu", 1.000, LoaiDoUong.TOPPING);
		this.themDoUong(chanTrau);
		DoUong thachTraiCay = new DoUong("Thạch trái cây", 1.000, LoaiDoUong.TOPPING);
		this.themDoUong(thachTraiCay);
	}
}
