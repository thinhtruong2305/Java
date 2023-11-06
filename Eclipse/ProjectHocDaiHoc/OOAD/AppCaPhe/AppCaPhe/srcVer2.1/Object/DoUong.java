package Object;

import java.util.Scanner;

public class DoUong {
	private static int count = 0;
	Scanner sc = new Scanner(System.in);
	private int idDoUong;
	private String tenDoUong;
	private LoaiDoUong loaiDoUong;
	private Double giaTien;
	
	public DoUong() {
		this.setIdDoUong(++count);
	}
	public DoUong(LoaiDoUong loaiDoUong) {
		this.setIdDoUong(++count);
		this.setLoaiDoUong(loaiDoUong);
	}
	public DoUong(String tenDoUong, Double giaTien, LoaiDoUong loaiDoUong) {
		this.setIdDoUong(++count);
		this.setTenDoUong(tenDoUong);
		this.setGiaTien(giaTien);
		this.setLoaiDoUong(loaiDoUong);
	}
	
	public static int getCount() {
		return count;
	}
	public static void setCount(int count) {
		DoUong.count = count;
	}
	public int getIdDoUong() {
		return idDoUong;
	}
	public void setIdDoUong(int idDoUong) {
		this.idDoUong = idDoUong;
	}
	public String getTenDoUong() {
		return tenDoUong;
	}
	public void setTenDoUong(String tenDoUong) {
		this.tenDoUong = tenDoUong;
	}
	public Double getGiaTien() {
		return giaTien;
	}
	public void setGiaTien(Double giaTien) {
		this.giaTien = giaTien;
	}
	public LoaiDoUong getLoaiDoUong() {
		return loaiDoUong;
	}
	public void setLoaiDoUong(LoaiDoUong loaiDoUong) {
		this.loaiDoUong = loaiDoUong;
	}
	
	//hiển thị
	public void display() {
		System.out.printf("%-3d %-30s %-15s %.3f\n", this.getIdDoUong(),this.getTenDoUong(),this.getLoaiDoUong(),this.getGiaTien());
	}
	
	//Chuyển thông tin thành null
	public void inputNull() {
		this.setTenDoUong(null);
		this.setGiaTien(0.0);
		this.setLoaiDoUong(LoaiDoUong.EMPTY);
	}
}
