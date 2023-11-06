package KindOfHuman;

import Human.Human;

public class NhanVien extends Human {
	private float heSoLuong;
	
	public NhanVien() {
		
	}
	public NhanVien(String hoTen,String diaChi,float heSoLuong) {
		super(hoTen, diaChi);
		setHeSoLuong(heSoLuong);
	}
	
	public float getHeSoLuong() {
		return this.heSoLuong;
	}
	public void setHeSoLuong(float heSoLuong) {
		this.heSoLuong=heSoLuong;
	}
	
	protected float tinhLuong() {
		return getHeSoLuong()*1500000;
	}
	public String toSring() {
		return super.toString()+"\nHệ số lương: "+this.heSoLuong+"\nLương: "+this.tinhLuong();
	}
}
