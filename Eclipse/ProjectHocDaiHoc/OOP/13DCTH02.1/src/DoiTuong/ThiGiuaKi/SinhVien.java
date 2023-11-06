package DoiTuong.ThiGiuaKi;

import java.util.List;

public class SinhVien {
    // thuộc tính
	private int maSV;
	private String hoTen;
	private float diemLT,diemTH;
	//phương thức
	public SinhVien() {
		
	}
	public SinhVien(int maSV,String hoTen, float diemLT, float diemTH) {
		this.maSV=maSV;
		this.hoTen=hoTen;
		this.diemLT=diemLT;
		this.diemTH=diemTH;
	}
	public int getMaSV() {
		return maSV;
	}
	public void setMaSV(int maSV) {
		this.maSV = maSV;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public float getDiemLT() {
		return diemLT;
	}
	public void setDiemLT(float diemLT) {
		this.diemLT = diemLT;
	}
	public float getDiemTH() {
		return diemTH;
	}
	public void setDiemTH(float diemTH) {
		this.diemTH = diemTH;
	}
	protected float diemTB() {
		return (this.diemLT+this.diemTH)/2;
	}
	protected String toString(List<SinhVien> dSSV) {
		return this.hoTen+" "+this.maSV+" "+"Điểm LT:"+this.diemLT+" "+"Điểm TH:"+this.diemTH+" "+"Điểm Trung bình:"+diemTB();	
	}
}
