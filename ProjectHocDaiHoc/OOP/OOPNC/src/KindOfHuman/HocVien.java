package KindOfHuman;

import Human.Human;

public class HocVien extends Human {
	private float diemMonHoc1;
	private float diemMonHoc2;
	private static int soLuongHocVien;
	
	public HocVien() {
		
	}
	public HocVien(String hoTen,String diaChi,float diemMonHoc1,float diemMonHoc2) {
		super(hoTen,diaChi);
		setDiemMonHoc1(diemMonHoc1);
		setDiemMonHoc2(diemMonHoc2);
		HocVien.soLuongHocVien++;
	}
	
	public float getDiemMonHoc1() {
		return this.diemMonHoc1;
	}
	public void setDiemMonHoc1(float diemMonHoc1) {
		this.diemMonHoc1=diemMonHoc1;
	}
	
	public float getDiemMonHoc2() {
		return this.diemMonHoc2;
	}
	public void setDiemMonHoc2(float diemMonHoc2) {
		this.diemMonHoc2=diemMonHoc2;
	}
	
	public static int getSoLuongHocVien() {
		return HocVien.soLuongHocVien;
	}
	
	protected float diemTrungBinh() {
		return (this.getDiemMonHoc1()+this.getDiemMonHoc2())/2;
	}
	public String toString() {
		return super.toString()+"\nĐiểm môn học 1: "+this.getDiemMonHoc1()+"\nĐiểm môn học 2: "+this.diemMonHoc2+"\nĐiểm trung bình: "+this.diemTrungBinh()+"\nSố lượng học viên: "+HocVien.getSoLuongHocVien();
	}
}
