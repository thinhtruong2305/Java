package DoiTuong.BaiTap;

public class PhongHocLyThuyet extends PhongHoc{
	private boolean mayChieu;
	
	public PhongHocLyThuyet() {
		
	}
	public PhongHocLyThuyet(int maPhong, String dayNha, double dienTich, int soBongDen, boolean mayChieu) {
		super(maPhong,dayNha,dienTich,soBongDen);
		this.mayChieu=mayChieu;
	}
	public void setMayChieu(boolean mayChieu) {
		this.mayChieu=mayChieu;
	}
	public boolean isMayChieu() {
		return mayChieu;
	}
	@Override
	protected boolean kiemTraDatChuan() {
		if(this.kiemTraDoSang()==true && mayChieu==true) {
			return true;
		}
		return false;
	}
	public void xuat() {
		System.out.println("Phòng Lý Thuyết");
		String strMayChieu=null;
		if(this.mayChieu==true) {
			strMayChieu="Có máy chiếu";
		}
			strMayChieu="Không có máy chiếu";
			System.out.println(strMayChieu);
		super.xuat();
	}
}
