package DoiTuong.Tuan3Lab7;

import java.util.Comparator;

public class SinhVienIT extends SinhVienPoLy {
    //thuộc tính
	private double diemHTML;
	private double diemCSS;
	private double diemJava;
	//phương thức
	public SinhVienIT(String hoTen,double diemHTML, double diemCSS,double diemJava) {
		super.setHoTen(hoTen);
		this.diemCSS=diemCSS;
		this.diemHTML=diemHTML;
		this.diemJava=diemJava;
	}
	protected SinhVienIT() {
		
	}
	public void setDiemHTML(double diemHTML) {
		this.diemHTML=diemHTML;
	}
	public double getDiemHTML() {
		return this.diemHTML;
	}
	public double getDiemJava() {
		return this.diemJava;
	}
	public double getDiemCSS() {
		return this.diemCSS;
	}
	public void setDiemCSS(double diemCSS) {
		this.diemCSS=diemCSS;
	}
	public void setDiemJava(double diemJava) {
		this.diemJava=diemJava;
	}
	protected double getDiem() {
		return (this.diemCSS+this.diemHTML+(this.diemJava*2))/4;
	}
	public void xuat() {
		System.out.println("Họ và tên: "+getHoTen());
    	System.out.println("Điểm: "+getDiem());
    	System.out.println("Học lực: "+getHocLuc(getDiem()));
    	System.out.println("Ngành: IT");
	}
}
