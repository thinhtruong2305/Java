package OnTap;

import java.util.Date;

public class GiaoDichNha extends GiaoDich{
	private String diaChi;
	private String loaiNha;
	
	public GiaoDichNha() {
		
	}
	
	public GiaoDichNha(int maGiaoDich,Date ngayGiaoDich,double donGia,int dienTich,String diaChi,String loaiNha) {
		super(maGiaoDich, ngayGiaoDich, donGia, dienTich);
		this.diaChi=diaChi;
		this.loaiNha=loaiNha;
	}
	
	public String getDiaChi() {
		return this.diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi=diaChi;
	}
	
	public String getLoaiNha() {
		return this.loaiNha;
	}
	public void setLoaiNha(String loaiNha) {
		this.loaiNha=loaiNha;
	}
	
	protected double ThanhTien() {
		double thanhTien=0;
		if(getLoaiNha().equalsIgnoreCase("Cao Cấp")) {
			thanhTien=getDonGia()*getDienTich();
		}
			thanhTien=getDonGia()*getDienTich()*0.9;
			return thanhTien;
	}
	
	public void xuat() {
		super.xuat();
		System.out.println("Loại nhà: "+getLoaiNha());
		System.out.println("Địa chỉ: "+getDiaChi());
		System.out.println("Thành tiền nhà: "+ThanhTien());
	}
}
