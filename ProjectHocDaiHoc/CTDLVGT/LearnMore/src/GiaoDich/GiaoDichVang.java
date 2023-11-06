package GiaoDich;

public class GiaoDichVang extends GiaoDich{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//THUỘC TÍNH
	private String loaiVang;
	private static int soLanGiaoDichVang = 0;
	//HÀM TẠO
	public GiaoDichVang() {
		super();
		GiaoDichVang.soLanGiaoDichVang++;
	}
	public GiaoDichVang(int maGiaoDich,String ngayGiaoDich,double donGia,int soLuong,String loaiVang) {
		super(maGiaoDich, ngayGiaoDich, donGia, soLuong);
		setLoaiVang(loaiVang);
		GiaoDichVang.soLanGiaoDichVang++;
	}
	//PHƯƠNG THỨC
	public void setLoaiVang(String loaiVang) {
		this.loaiVang = loaiVang;
	}
	public String getLoaiVang() {
		return this.loaiVang;
	}
	public static int getSoLanGiaoDichVang() {
		return GiaoDichVang.soLanGiaoDichVang;
	}
	public static void setSoLanGiaoDichVang(int soLanGiaoDichVang) {
		GiaoDichVang.soLanGiaoDichVang = soLanGiaoDichVang;
	}
	
	protected double thanhTien() {
		return this.getDonGia()*this.getSoLuong();
	}
	public String getLine() {
		return super.getLine()+","+this.loaiVang+"\n";
	}
	public void parse(String line) {
		String[] param = line.split(",");
		try {
			this.setMaGiaoDich(Integer.parseInt(param[0]));
			this.setNgayGiaoDich(param[1]);
			this.setDonGia(Double.parseDouble(param[2]));
			this.setSoLuong(Integer.parseInt(param[3]));
			this.setLoaiVang(param[4]);
		}catch(ArrayIndexOutOfBoundsException a) {
		}finally {
		}
	}
	public String toString() {
		return super.toString()+"\nLoại vàng: "+getLoaiVang()+
			   "\nThành tiền vàng: "+GiaoDich.dinhDang(thanhTien());
	}
}
