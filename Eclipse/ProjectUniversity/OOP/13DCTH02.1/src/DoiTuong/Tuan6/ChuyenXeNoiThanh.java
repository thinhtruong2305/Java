package DoiTuong.Tuan6;

public class ChuyenXeNoiThanh extends ChuyenXe {
      //thuộc tính
	private int soTuyen,soKmDi;
	  // phương thức
	protected ChuyenXeNoiThanh(int maSoChuyen,int soXe,String hoTenTaiXe,int soTuyen,int soKmDi) {
		super(maSoChuyen,soXe,hoTenTaiXe);
		this.soTuyen=soTuyen;
		this.soKmDi=soKmDi;
	}
	protected ChuyenXeNoiThanh() {
		
	}
	@Override
	protected double doanhThu() {
		// TODO Auto-generated method stub
		return 0;
	}
	public int getSoTuyen() {
		return soTuyen;
	}
	public void setSoTuyen(int soTuyen) {
		this.soTuyen = soTuyen;
	}
	public int getSoKmDi() {
		return soKmDi;
	}
	public void setSoKmDi(int soKmDi) {
		this.soKmDi = soKmDi;
	}
    public void xuat() {
    	super.xuat();
    	System.out.println("Số tuyến: "+getSoTuyen());
    	System.out.println("Số km đi được: "+getSoKmDi());
    }
}
