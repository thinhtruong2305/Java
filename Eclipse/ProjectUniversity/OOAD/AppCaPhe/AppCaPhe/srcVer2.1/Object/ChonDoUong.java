package Object;

public class ChonDoUong {
	private DoUong doUong = new DoUong();
	private int soLuong;
	private int iD;
	private double soTien;
	private int idHoaDon;
	private static int count = 0;
	
	public ChonDoUong() {
		this.setID(++count);
		this.setDoUong(new DoUong());
	}
	public ChonDoUong(String tenDoUong, int soLuong) {
		this.setID(++count);
		this.getDoUong().setTenDoUong(tenDoUong+"");
		this.setSoLuong(soLuong);
	}
	public ChonDoUong(String tenDoUong, int soLuong, int idHoaDon) {
		this.setID(++count);
		this.getDoUong().setTenDoUong(tenDoUong+"");
		this.setSoLuong(soLuong);
		this.setIdHoaDon(idHoaDon);
	}
	
	public int getIdHoaDon() {
		return idHoaDon;
	}
	public void setIdHoaDon(int idHoaDon) {
		this.idHoaDon = idHoaDon;
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
		this.soLuong = soLuong;
	}
	public int getID() {
		return iD;
	}
	public void setID(int iD) {
		this.iD = iD;
	}
	
	//nhập thông tin
	public void inputNull() {
		this.getDoUong().setTenDoUong(null);
		this.setSoLuong(0);
	}
	//Hiển thị
	public void display() {
		System.out.printf("%-3d %-35s %-15d %.3f\n",this.getID(),this.getDoUong().getTenDoUong(),this.getSoLuong(),this.getSoTien());
	}
}
