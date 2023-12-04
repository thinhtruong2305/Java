package OnTap;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import OnTap.GiaoDichDat;

public class QuanLyGiaoDich {
	private ArrayList<GiaoDich> quanLyGiaoDich;
	
	public QuanLyGiaoDich() {
		setQuanLyDanhSach(new ArrayList<GiaoDich>());
	}
	
	public void setQuanLyDanhSach(ArrayList<GiaoDich> quanLyGiaoDich) {
		this.quanLyGiaoDich=quanLyGiaoDich;
	}
	public ArrayList<GiaoDich> getQuanLyGiaoDich(){
		return this.quanLyGiaoDich;
	}
	
	public void nhap() throws ParseException {
		GiaoDich giaoDich;
		Scanner sc=new Scanner(System.in);
		SimpleDateFormat df=new SimpleDateFormat("dd/mm/yyyy");
		System.out.print("Nhập Mã Giao Dịch: ");
		int maGiaoDich=sc.nextInt();
		System.out.print("Nhập ngày giao dịch (dd/mm/yyyy): ");
		Date ngayGiaoDich=df.parse(sc.nextLine());
		System.out.print("Nhập đơn giá: ");
		double donGia=sc.nextDouble();
		System.out.print("Nhập diện tích: ");
		int dienTich=Integer.parseInt(sc.nextLine());
		System.out.print("Nhập (giao dịch đất/giao dịch nhà)");
		String phanLoai=sc.nextLine();
		if(phanLoai.equalsIgnoreCase("giao dịch đất")) {
			System.out.print("Nhập loại đất: ");
			String loaiDat=sc.nextLine();
			giaoDich=new GiaoDichDat(maGiaoDich, ngayGiaoDich, donGia, dienTich, loaiDat);
		}
			System.out.print("Nhập loại nhà (cao cấp/thường): ");
			String loaiNha=sc.nextLine();
			System.out.print("Nhập địa chỉ: ");
			String diaChi=sc.nextLine();
			giaoDich=new GiaoDichNha(maGiaoDich, ngayGiaoDich, donGia, dienTich, diaChi, loaiNha);
			this.quanLyGiaoDich.add(giaoDich);
	}
	public void xuat() {
		for(GiaoDich giaoDich: quanLyGiaoDich) {
			giaoDich.xuat();
		}
	}
	public void TinhTienTungLoai() {
		double tienGDD=0;
		double tienGDN=0;
		for(GiaoDich giaoDich : quanLyGiaoDich) {
			if(giaoDich instanceof GiaoDichDat) {
				tienGDD +=((GiaoDichDat) giaoDich).ThanhTien();
				System.out.println("Tiền Giao Dịch Đất: "+tienGDD);
			}else {
				try {
					tienGDN +=((GiaoDichNha) giaoDich).ThanhTien();
				}catch(ClassCastException cce) {
					System.out.println(cce.getMessage());
				}
				System.out.println("Tiền giao dịch nhà: "+tienGDN);
			}
		}
	}
	
}
