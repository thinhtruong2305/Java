package GiaoDich;

import java.util.Date;

public class GiaoDichTienTe extends GiaoDich{
	//THUỘC TÍNH
	private double tiGia;
	private String loaiTienTe;
	private static int soLanGiaoDichTienTe = 0;
	//HÀM TẠO
	public GiaoDichTienTe() {
		super();
		GiaoDichTienTe.soLanGiaoDichTienTe++;
	}
	public GiaoDichTienTe(int maGiaoDich,Date ngayGiaoDich,double donGia,int soLuong,double tiGia,String loaiTienTe) {
		super(maGiaoDich, ngayGiaoDich, donGia, soLuong);
		setLoaiTienTe(loaiTienTe);
		setTiGia(tiGia);
		GiaoDichTienTe.soLanGiaoDichTienTe++;
	}
	//PHƯƠNG THỨC
	public void setTiGia(double tiGia) {
		this.tiGia = tiGia;
	}
	public double getTiGia() {
		return this.tiGia;
	}
	public void setLoaiTienTe(String loaiTienTe) {
		this.loaiTienTe = loaiTienTe;
	}
	public String getLoaiTienTe() {
		return this.loaiTienTe;
	}
	public static int getSoLanGiaoDichTienTe() {
		return GiaoDichTienTe.soLanGiaoDichTienTe;
	}
	public static void setSoLanGiaoDichTienTe(int soLanGiaoDichTienTe) {
		GiaoDichTienTe.soLanGiaoDichTienTe = soLanGiaoDichTienTe;
	}
	
	protected double thanhTien() {
		if(this.getLoaiTienTe().equalsIgnoreCase(("Việt Nam"))) {
			return this.getDonGia()*this.getSoLuong();
		}
	    	return this.getDonGia()*this.getSoLuong()*this.getTiGia();
	}
	public String toString() {
		return super.toString()+"\nTỉ giá: "+getTiGia()+"\nLoại tiền tệ: "+getLoaiTienTe()+"\nThành tiền tệ: "+GiaoDich.dinhDang(thanhTien());
	}
}
