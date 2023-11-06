package DoiTuong.Tuan2;

import java.util.Scanner;

public class SanPham {
//thuộc tính
	private String tenSP;
	private double donGia, giamGia;
//phương thức
	 public void Nhap() {
		Scanner nhap = new Scanner(System.in);
		System.out.println("Nhập tên sản phẩm: ");
		tenSP=nhap.nextLine();
		System.out.println("Nhập đơn giá sản phẩm: ");
		donGia=nhap.nextDouble();
		System.out.println("Nhập giá giảm: ");
		giamGia=nhap.nextDouble();
	}
	public void Xuat() {
		System.out.println("Tên sản phẩm: "+tenSP);
		System.out.println("Đơn giá sản phẩm: "+donGia+"00");
		System.out.println("Giảm giá: "+(donGia-giamGia)+"00");
	}
	private double getThueNhapKhau() {
		return this.donGia*0.1;
	}
	public SanPham(String tenSP,double donGia,double giamGia) {
		this.tenSP=tenSP;
		this.donGia=donGia;
		this.giamGia=giamGia;
	}
	public SanPham(String tenSP,double donGia) {
		this(tenSP,donGia,0);
	}
	public SanPham() {
		
	}
	public String getTenSP() {
		return this.tenSP;
	}
	public void setTenSP(String tenSP) {
		this.tenSP=tenSP;
	}
	public double getDonGia() {
		return this.donGia;
	}
	public void setDonGia(double donGia) {
		this.donGia=donGia;
	}
	public double getGiamGia() {
		return this.giamGia;
	}
	public void setGiamGia(double giamGia) {
		this.giamGia=this.donGia-giamGia;
	}
}
