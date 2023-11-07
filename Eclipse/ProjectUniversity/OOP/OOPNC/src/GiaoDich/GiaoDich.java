package GiaoDich;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class GiaoDich {
	//THUỘC TÍNH
	private int maGiaoDich;
	private Date ngayGiaoDich;
	private double donGia;
	private int soLuong;
	private static int soLanGiaoDich = 0;
	private static SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyyy");
	//HÀM TẠO
	public GiaoDich() {
		GiaoDich.soLanGiaoDich++;
	}
	public GiaoDich(int maGiaoDich,Date ngayGiaoDich,double donGia,int soLuong) {
		setMaGiaoDich(maGiaoDich);
		setNgayGiaoDich(ngayGiaoDich);
		setDonGia(donGia);
		setSoLuong(soLuong);
		GiaoDich.soLanGiaoDich++;
	}
	//PHƯƠNG THỨC
	public void setMaGiaoDich(int maGiaoDich) {
			this.maGiaoDich = maGiaoDich;
	}
	public int getMaGiaoDich() {
		return this.maGiaoDich;
	}
	public void setNgayGiaoDich(Date ngayGiaoDich) {
		this.ngayGiaoDich = ngayGiaoDich;
	}
	public Date getNgayGiaoDich() {
		return this.ngayGiaoDich;
	}
	public void setDonGia(double donGia) {
		this.donGia = donGia;
	}
	public double getDonGia() {
		return this.donGia;
	}
	public void setSoLuong(int soLuong) {
			this.soLuong = soLuong;
	}
	public int getSoLuong() {
		return this.soLuong;
	}
	public static int getSoLanGiaoDich() {
		return soLanGiaoDich;
	}
	public static void setSoLanGiaoDich(int soLanGiaoDich) {
		GiaoDich.soLanGiaoDich = soLanGiaoDich;
	}
	
	protected abstract double thanhTien();
	public String toString() {
		return "Mã giao dịch: "+getMaGiaoDich()+
			   "\nNgày giao dịch: "+date.format(getNgayGiaoDich())+
			   "\nĐơn giá: "+dinhDang(getDonGia())+
			   "\nSố lượng "+getSoLuong();
	}
	protected static String dinhDang(double so) {
		if(so >= 1000000000000.0) {
			return String.format("%.2f nghìn tỷ", so/1000000000000.0);
		}
		if(so >= 1000000000.0) {
			return String.format("%.2f tỷ", so/1000000000.0);
		}
		if(so >= 1000000.0) {
			return String.format("%.2f triệu", so/1000000.0);
		}
		if(so >= 1000.0) {
			return String.format("%.2f nghìn", so/1000.0);
		}
		return String.valueOf(so);
	}
	protected static Date dinhDangNgay(String date) {
		Date day = null;
		try {
			day = GiaoDich.date.parse(date);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return day;
	}
}
