package KindOfHuman;

import Human.Human;

public class KhachHang extends Human{
	private String tenCongTy;
	private double triGiaHoaDon;
	
	public KhachHang() {
		
	}
	public KhachHang(String hoTen,String diaChi,String tenCongTy,double triGiaHoaDon){
		super(hoTen, diaChi);
		setTenCongTy(tenCongTy);
		setTriGiaHoaDon(triGiaHoaDon);
	}
	
	public String getTenCongTy() {
		return this.tenCongTy;
	}
	public void setTenCongTy(String tenCongTy) {
		this.tenCongTy=tenCongTy;
	}
	
	public double getTriGiaHoaDon() {
		return this.triGiaHoaDon;
	}
	public void setTriGiaHoaDon(double triGiaHoaDon) {
		this.triGiaHoaDon=triGiaHoaDon;
	}
	
	public String toString() {
		return super.toString()+"\nTên công ty: "+this.tenCongTy+"\nGiá trị hóa đơn: "+this.triGiaHoaDon;
	}
}