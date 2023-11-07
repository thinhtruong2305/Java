package DoiTuong.Tuan6;

public class ChuyenXeNgoaiThanh extends ChuyenXe{
      //thuộc tính
	private String noiDen;
    private int soNgayDi;
      //phương thức
    protected ChuyenXeNgoaiThanh(int maSoChuyen,int soXe,String hoTenTaiXe,String noiDen,int soNgayDi) {
    	super(maSoChuyen,soXe,hoTenTaiXe);
    	this.noiDen=noiDen;
    	this.soNgayDi=soNgayDi;
    }
    protected ChuyenXeNgoaiThanh() {
    	
    }
	@Override
	protected double doanhThu() {
		// TODO Auto-generated method stub
		return 0;
	}
	public String getNoiDen() {
		return noiDen;
	}
	public void setNoiDen(String noiDen) {
		this.noiDen = noiDen;
	}
	public int getSoNgayDi() {
		return soNgayDi;
	}
	public void setSoNgayDi(int soNgayDi) {
		this.soNgayDi = soNgayDi;
	}
    public void xuat() {
    	super.xuat();
    	System.out.println("Nơi đến: "+getNoiDen());
    	System.out.println("Số ngày đi được: "+getSoNgayDi()+" ngày");
    }
}
