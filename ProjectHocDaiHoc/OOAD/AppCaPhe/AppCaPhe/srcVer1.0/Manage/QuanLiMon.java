package Manage;

import java.util.*;
import Object.*;

public class QuanLiMon {
	private List<Mon> quanLiMon;
	
	public QuanLiMon() {
		this.setQuanLiMon(new ArrayList<Mon>());
	}

	public List<Mon> getQuanLiMon() {
		return quanLiMon;
	}
	public void setQuanLiMon(List<Mon> quanLiMon) {
		this.quanLiMon = quanLiMon;
	}
	
	public void themMon(Mon mon) {
		this.getQuanLiMon().add(mon);
	}
	
	//xóa món theo id
	public void xoaMonTheoID(int ID) {
		for(Iterator<Mon> i = this.getQuanLiMon().iterator();i.hasNext();) {
			Mon mon = (Mon)i.next();
			if(mon.getIdMon() == ID) {
				i.remove();
			}
		}
	}
	
	//cập nhật món theo id
	public void suaThongTinMonTheoID(int ID) {
		for(Iterator<Mon> i = this.quanLiMon.iterator();i.hasNext();) {
			Mon mon = (Mon)i.next();
			if(mon.getIdMon() == ID) {
				mon.input();
				break;
			}
		}
	}
	
	//hiển thị danh sách
	public void xuat() {
		for(Iterator<Mon> i = this.getQuanLiMon().iterator();i.hasNext();) {
			Mon mon = (Mon)i.next();
			mon.display();
		}
	}
	
	//tìm món theo id có kiểu trả về là một iterator
	public Iterator<Mon> timMonTheoID(int ID){
		List<Mon> danhSachTim = new ArrayList<Mon>();
		for(Iterator<Mon> i = this.quanLiMon.iterator();i.hasNext();) {
			Mon mon = (Mon)i.next();
			if(mon.getIdMon() != ID)
				continue;
			danhSachTim.add(mon);
			return danhSachTim.iterator();
		}
		return null;
	}
}
