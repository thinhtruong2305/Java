package OnTap;

import java.util.Date;

public abstract class GiaoDich {
	private int maGiaoDich;
	private Date ngayGiaoDich;
	private double donGia;
	private int dienTich;
	
	public GiaoDich() {
		
	}
	public GiaoDich(int maGiaoDich,Date ngayGiaoDich,double donGia,int dienTich) {
		this.maGiaoDich=maGiaoDich;
		this.ngayGiaoDich=ngayGiaoDich;
		this.donGia=donGia;
		this.dienTich=dienTich;
	}
	
	public int getMaGiaoDich() {
		return this.maGiaoDich;
	}
	public void setMaGiaoDich(int maGiaoDich) {
		this.maGiaoDich=maGiaoDich;
	}
	
	public Date getNgayGiaoDich() {
		return this.ngayGiaoDich;
	}
	public void setNgayGiaoDich(Date ngayGiaoDich) {
		this.ngayGiaoDich=ngayGiaoDich;
	}
	
	public double getDonGia() {
		return this.donGia;
	}
	public void setDonGia(double donGia) {
		this.donGia=donGia;
	}
	
	public int getDienTich() {
		return this.dienTich;
	}
	public void setDienTich(int dienTich) {
		this.dienTich=dienTich;
	}
	
	protected abstract double ThanhTien();
	
	public void xuat() {
		System.out.println("Mã giao dịch: "+getMaGiaoDich());
		System.out.println("Ngày giao dịch: "+getNgayGiaoDich());
		System.out.println("Đơn giá: "+getDonGia());
		System.out.println("Diện tích: "+getDienTich());
	}
}
