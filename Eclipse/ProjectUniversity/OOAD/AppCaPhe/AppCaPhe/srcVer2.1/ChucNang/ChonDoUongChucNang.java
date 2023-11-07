package ChucNang;

import DanhMuc.*;
import Object.*;
import java.util.*;

public class ChonDoUongChucNang {
	DoUongChucNang doUongChucNang = new DoUongChucNang();
	private DanhSachDoUong danhSachDoUong;
	private DanhSachChonDoUong danhSachChonDoUong;
	
	public ChonDoUongChucNang() {
		this.setDanhSachChonDoUong(new DanhSachChonDoUong());
		this.setDanhSachDoUong(new DanhSachDoUong());
	}
	
	public DanhSachDoUong getDanhSachDoUong() {
		return danhSachDoUong;
	}
	public void setDanhSachDoUong(DanhSachDoUong danhSachDoUong) {
		this.danhSachDoUong = danhSachDoUong;
	}
	public DanhSachChonDoUong getDanhSachChonDoUong() {
		return danhSachChonDoUong;
	}
	public void setDanhSachChonDoUong(DanhSachChonDoUong danhSachChonDoUong) {
		this.danhSachChonDoUong = danhSachChonDoUong;
	}
	
	public void chonDoUong(int idHoaDon, ChonDoUong ...chonDoUongs) {
				this.getDanhSachChonDoUong().chonDoUong(idHoaDon, chonDoUongs);
	}
	
	public LoaiDoUong layLoaiDoUong(ChonDoUong chonDoUong) {
		return this.doUongChucNang.searchDoUong(chonDoUong.getDoUong().getTenDoUong()).getLoaiDoUong();
	}
	
	public boolean kiemTraLoai(LoaiDoUong loaiDoUong) {
		if(loaiDoUong.equals(LoaiDoUong.TRÀSỮA) || loaiDoUong.equals(LoaiDoUong.HỒNGTRÀ))
			return true;
		return false;
	}
	
	//Tính số tiền dựa trên giá tiền đồ uống đã có và số lượng đồ uống đó đã chọn
	public ChonDoUong[] tongSoTienChonDoUong(ChonDoUong ...chonDoUongs) {
		for(int i = 0; i < chonDoUongs.length; i++) {
			DoUong doUong = this.doUongChucNang.searchDoUong(chonDoUongs[i].getDoUong().getTenDoUong());
			if(doUong == null)
				continue;
			chonDoUongs[i].setSoTien(doUong.getGiaTien() * chonDoUongs[i].getSoLuong());
		}
		return chonDoUongs;
	}
	
	//Hiển thị danh sách chọn đồ uống
	public void xemDanhSachChonDoUong(int idHoaDon) {
		Iterator<ChonDoUong> i = this.getDanhSachChonDoUong().layDanhSachChonDoUong();
		if(i.hasNext()) {
			System.out.printf("\n%-3s %-35s %-15s %s\n","ID","Đồ uống","Số lượng","Số tiền");
			while(i.hasNext()) {
				ChonDoUong chonDoUong = (ChonDoUong)i.next();
				if(chonDoUong.getIdHoaDon() != idHoaDon)
					continue;
				chonDoUong.display();
			}
		}
	}
}
