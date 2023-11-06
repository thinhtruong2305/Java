package DoiTuong.BaiTap;

public class PhongMayTinh extends PhongHoc {
	private int soMayTinh;
	
	public PhongMayTinh() {
		
	}
	public PhongMayTinh(int maPhong, String dayNha, double dienTich, int soBongDen, int soMayTinh) {
		super(maPhong,dayNha,dienTich,soBongDen);
		this.soMayTinh=soMayTinh;
	}
	public void setSoMayTinh(int soMayTinh) {
		this.soMayTinh=soMayTinh;
	}
	public int getSoMayTinh() {
		return soMayTinh;
	}
	protected boolean kiemTraDatChuan() {
		int soMayTinhTheoDienTich= (int)(getDienTich()/1.5);
		if(this.kiemTraDoSang()==true && this.soMayTinh == soMayTinhTheoDienTich) {
			return true;
		}
		return false;
	}
	public void xuat() {
		System.out.println("Phòng Máy Tính");
		System.out.println("Số máy tính: "+this.soMayTinh);
		super.xuat();
	}
}
