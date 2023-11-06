package DoiTuong.BaiTap;

public abstract class PhongHoc {
	private int maPhong;
	private String dayNha;
	private double dienTich;
	private int soBongDen;
	
	public PhongHoc() {

	}
	public PhongHoc(int maPhong, String dayNha, double dienTich, int soBongDen) {
		this.maPhong = maPhong;
		this.dayNha = dayNha;
		this.dienTich = dienTich;
		this.soBongDen = soBongDen;
	}
	public int getMaPhong() {
		return maPhong;
	}
	public void setMaPhong(int maPhong) {
		this.maPhong = maPhong;
	}
	public String getDayNha() {
		return dayNha;
	}
	public void setDayNha(String dayNha) {
		this.dayNha = dayNha;
	}
	public double getDienTich() {
		return dienTich;
	}
	public void setDienTich(double dienTich) {
		this.dienTich = dienTich;
	}
	public int getSoBongDen() {
		return soBongDen;
	}
	public void setSoBongDen(int soBongDen) {
		this.soBongDen = soBongDen;
	}
	protected abstract boolean kiemTraDatChuan();
	protected boolean kiemTraDoSang() {
		int soBongDenTheoDienTich = (int)(this.dienTich/10);
		if(this.soBongDen >= soBongDenTheoDienTich) {
			return true;
		}
		return false;
	}
	public void xuat() {
		String strChuan=null;
		System.out.print("Mã phòng: "+getMaPhong());
		System.out.print("Dãy nhà: "+getDayNha());
		System.out.print("Diện tích: "+getDienTich());
		System.out.print("Số bóng đèn: "+getSoBongDen());
		if(kiemTraDatChuan()==true) {
			strChuan="Phòng đạt chuẩn";
		}
			strChuan="Phòng Không đạt chuẩn";
		System.out.println(strChuan);
	}
}
