package OnTap;

import java.util.Date;

public class GiaoDichDat extends GiaoDich {
	private String loaiDat;
	
	public GiaoDichDat() {
		
	}
	public GiaoDichDat(int maGiaoDich,Date ngayGiaoDich,double donGia,int dienTich,String loaiDat) {
		super(maGiaoDich,ngayGiaoDich,donGia,dienTich);
		this.loaiDat=loaiDat;
	}
	
	public String getLoaiDat() {
		return this.loaiDat;
	}
	public void setLoaiDat(String loaiDat) {
		this.loaiDat=loaiDat;
	}
	
	protected double ThanhTien() {
		double thanhTien=0;
		if(getLoaiDat()=="B"||getLoaiDat()=="C") {
			thanhTien=this.getDienTich()*this.getDonGia();
		}
			thanhTien=this.getDienTich()*this.getDonGia()*1.5;
			return thanhTien;
	}
	
	public void xuat() {
		super.xuat();
		System.out.println("Loại đất: "+getLoaiDat());
		System.out.println("Thành Tiền Đất:"+ThanhTien());
	}
}
