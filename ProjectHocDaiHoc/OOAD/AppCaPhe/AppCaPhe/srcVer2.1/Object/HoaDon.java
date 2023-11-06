package Object;

import java.text.*;
import java.util.*;

public class HoaDon {
	private static int count = 0;
	private int idHoaDon;
	private Date ngayLapHoaDon;
	SimpleDateFormat df = new SimpleDateFormat("dd/MM/yy");
	
	public HoaDon() {
		this.setIdHoaDon(++count);
		this.setNgayLapHoaDon(new Date());
	}
	
	public static int getCount() {
		return count;
	}
	public static void setCount(int count) {
		HoaDon.count = count;
	}
	public int getIdHoaDon() {
		return idHoaDon;
	}
	public void setIdHoaDon(int idHoaDon) {
		this.idHoaDon = idHoaDon;
	}
	public String getNgayLapHoaDon() {
		return df.format(ngayLapHoaDon);
	}
	public void setNgayLapHoaDon(Date ngayLapHoaDon) {
		this.ngayLapHoaDon = ngayLapHoaDon;
	}
	
	public void display() {
		System.out.printf("%-40d %s",this.getIdHoaDon(),this.getNgayLapHoaDon());
	}
}
