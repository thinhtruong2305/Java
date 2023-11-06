package GiaoDich;

import java.util.Date;

public class GiaoDichVang extends GiaoDich{
	//THUỘC TÍNH
	private String loaiVang;
	private static int soLanGiaoDichVang = 0;
	//HÀM TẠO
	public GiaoDichVang() {
		super();
		GiaoDichVang.soLanGiaoDichVang++;
	}
	public GiaoDichVang(int maGiaoDich,Date ngayGiaoDich,double donGia,int soLuong,String loaiVang) {
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
	public String toString() {
		return super.toString()+"\nLoại vàng: "+getLoaiVang()+
			   "\nThành tiền vàng: "+GiaoDich.dinhDang(thanhTien());
	}
}
