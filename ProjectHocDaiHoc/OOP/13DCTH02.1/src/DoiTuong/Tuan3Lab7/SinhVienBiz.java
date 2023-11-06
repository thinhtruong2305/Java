package DoiTuong.Tuan3Lab7;

public class SinhVienBiz extends SinhVienPoLy {
    //thuộc tính
	private double marketting;
	private double sales;
	//phương thức
	protected SinhVienBiz(String hoTen,double marketting,double sales) {
		super.setHoTen(hoTen);
		this.marketting=marketting;
		this.sales=sales;
	}
	protected SinhVienBiz() {
		
	}
	public void setMarketting(double marketting) {
		this.marketting=marketting;
	}
	public void setSales(double sales) {
		this.sales=sales;
	}
	public double getDiemMarketting() {
		return this.marketting;
	}
	public double getDiemSales() {
		return this.sales;
	}
	protected double getDiem() {
		return ((this.marketting*2)+this.sales)/3;
	}
	public void xuat() {
		System.out.println("Họ và tên: "+getHoTen());
    	System.out.println("Điểm: "+getDiem());
    	System.out.println("Học lực: "+getHocLuc(getDiem()));
    	System.out.println("Ngành: Kinh Tế");
	}
}
