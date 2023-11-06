package vn.edu.giadinh.tuan7;

import java.util.Scanner;

public class SanPham {
//thuộc tính
	String tenSP;
	double donGia,giamGia;
//phương thức
	
	public double thueNhapKhau() {
		return donGia * 0.1;
	}
	public void nhap() {
		Scanner nhap = new Scanner(System.in);
		System.out.println("Nhập tên sản phẩm: ");
		tenSP=nhap.nextLine();
		System.out.println("Nhập số giảm giá: ");
		giamGia=nhap.nextDouble();
		System.out.println("Nhập đơn giá gốc của sản phẩm: ");
		donGia=nhap.nextDouble();
	}
	public void xuat() {
	  System.out.println("Tên sản phẩm: "+tenSP);
	  System.out.println("số giá giảm: "+giamGia);
	  System.out.println("Đơn giá của sản phẩm khi dược tính: "+(donGia-giamGia+thueNhapKhau()));
	}
	public SanPham() {
		
	}
	public SanPham(String _tenSP,double _donGia) {
		tenSP = _tenSP;
		donGia = _donGia;
		giamGia = 0;
	}
	public SanPham(String _tenSP,double _donGia,double _giamGia) {
		tenSP = _tenSP;
		donGia = _donGia;
		giamGia = _giamGia;
	}
}
