package Human;

public abstract class Human {
	private String hoTen;
	private String diaChi;
	private static int soLuongNguoi;
	
	public Human() {
		
	}
	public Human(String hoTen,String diaChi) {
		this.setHoTen(hoTen);
		this.setDiaChi(diaChi);
	}
	
	public String getHoTen() {
		return this.hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen=hoTen;
	}
	
	public String getDiaChi() {
		return this.diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi=diaChi;
	}
	
	public static int getSoLuongNguoi() {
		return soLuongNguoi;
	}
	
	public String toString() {
		return "Họ tên: "+this.getHoTen()+"\nĐịa chỉ: "+this.getDiaChi()+"\nSố lượng người: "+Human.getSoLuongNguoi();
	}
}
