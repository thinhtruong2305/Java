package Object;

import java.util.*;

public class ChonDoUong {
	private DoUong doUong;
	private int soLuong;
	private int iD;
	private double soTien;
	private static int count = 0;
	Scanner sc = new Scanner(System.in);
	
	public ChonDoUong() {
		this.setID(++count);
		this.setDoUong(new DoUong());
	}
	public ChonDoUong(DoUong doUong, int soLuong) {
		this.setID(++count);
		this.setDoUong(doUong);
		this.setSoLuong(soLuong);
	}
	public ChonDoUong(DoUong doUong, int soLuong, int ID) {
		this.setID(++count);
		this.setDoUong(doUong);
		this.setSoLuong(soLuong);
	}
	
	public double getSoTien() {
		return soTien;
	}
	public void setSoTien(double soTien) {
		this.soTien = soTien;
	}
	public static int getCount() {
		return count;
	}
	public static void setCount(int count) {
		ChonDoUong.count = count;
	}
	public DoUong getDoUong() {
		return doUong;
	}
	public void setDoUong(DoUong doUong) {
		this.doUong = doUong;
	}
	public int getSoLuong() {
		return soLuong;
	}
	public void setSoLuong(int soLuong) {
		if(soLuong == 0)
			this.soLuong = 1;
		this.soLuong = soLuong;
	}
	public int getID() {
		return iD;
	}
	public void setID(int iD) {
		this.iD = iD;
	}
	
	//nhập thông tin
	public void input() {
		System.out.print("Đồ uống: ");
		this.getDoUong().setTenDoUong(sc.nextLine());
		System.out.print("Số lượng: ");
		this.setSoLuong(Integer.parseInt(sc.nextLine()));
	}
	//Hiển thị
	public void display() {
		System.out.printf("\n%-3d %-35s %-15d %.3f",this.getID(),this.getDoUong().getTenDoUong(),this.getSoLuong(),this.getSoTien());
	}
}
