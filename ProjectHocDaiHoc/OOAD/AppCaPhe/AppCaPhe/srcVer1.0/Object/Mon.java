package Object;

import java.util.Scanner;

public class Mon {
	private static int count = 0;
	Scanner sc = new Scanner(System.in);
	private int idMon;
	private String tenMon;
	private Double giaTien;
	
	public Mon() {
		this.idMon = ++count;
	}
	public Mon(String tenMon, Double giaTien) {
		this.idMon = ++count;
		this.tenMon = tenMon;
		this.giaTien = giaTien;
	}
	
	public static int getCount() {
		return count;
	}
	public static void setCount(int count) {
		Mon.count = count;
	}
	public int getIdMon() {
		return idMon;
	}
	public void setIdMon(int idMon) {
		this.idMon = idMon;
	}
	public String getTenMon() {
		return tenMon;
	}
	public void setTenMon(String tenMon) {
		this.tenMon = tenMon;
	}
	public Double getGiaTien() {
		return giaTien;
	}
	public void setGiaTien(Double giaTien) {
		this.giaTien = giaTien;
	}
	
	@Override
	public String toString() {
		return "Mon [idMon=" + idMon + ", tenMon=" + tenMon + ", giaTien=" + giaTien + "]";
	}
	
	//hiển thị
	public void display() {
		System.out.println(this.toString());
	}
	
	//nhập thông tin
	public void input() {
		System.out.print("Nhập tên món: ");
		this.setTenMon(sc.nextLine());
		System.out.print("Nhập giá tiền: ");
		this.setGiaTien(Double.parseDouble(sc.nextLine()));
	}
}
