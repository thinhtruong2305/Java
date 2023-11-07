package DoiTuong.Tuan6;

public abstract class ChuyenXe {
      //thuộc tính
	  private int maSoChuyen,soXe;
	  private String hoTenTaiXe;
	  //phương thức
	  protected abstract double doanhThu();
	  protected ChuyenXe() {
		  
	  }
	  protected ChuyenXe(int maSoChuyen,int soXe,String hoTenTaiXe) {
		  this.maSoChuyen=maSoChuyen;
		  this.soXe=soXe;
		  this.hoTenTaiXe=hoTenTaiXe;
	  }
	public int getMaSoChuyen() {
		return maSoChuyen;
	}
	public void setMaSoChuyen(int maSoChuyen) {
		this.maSoChuyen = maSoChuyen;
	}
	public int getSoXe() {
		return soXe;
	}
	public void setSoXe(int soXe) {
		this.soXe = soXe;
	}
	public String getHoTenTaiXe() {
		return hoTenTaiXe;
	}
	public void setHoTenTaiXe(String hoTenTaiXe) {
		this.hoTenTaiXe = hoTenTaiXe;
	}
	public void xuat() {
		System.out.println("Mã số chuyến: "+getMaSoChuyen());
		System.out.println("Số xe: "+getSoXe());
		System.out.println("Họ tên tài xế: "+getHoTenTaiXe());
	}
}
