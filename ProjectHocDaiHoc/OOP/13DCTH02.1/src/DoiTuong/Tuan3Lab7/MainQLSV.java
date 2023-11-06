package DoiTuong.Tuan3Lab7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainQLSV {
    static Scanner nhap=new Scanner(System.in);
    static List<SinhVienPoLy> dSSVGD = new ArrayList<SinhVienPoLy>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(true) {
			nhapDSSV();
			System.out.println("bạn có muốn nhập tiếp không");
			System.out.println("Y nhập tiếp/ N là không");
			nhap.nextLine();
			if(nhap.nextLine().equalsIgnoreCase("N")) {
				xuatDSSV();
				break;
			}
		}
	}
	static void addDSSVGD(SinhVienPoLy sVGD) {
		dSSVGD.add(sVGD);
	}
	static void xuatDSSV() {
		for (SinhVienPoLy sinhVienPoLy : dSSVGD) {
			sinhVienPoLy.xuat();
		}
	}
	static void nhapDSSV() {
		String hoTen;
		String nganh;
		SinhVienPoLy sVGD;
		System.out.println("Nhập họ tên: ");
		hoTen=nhap.nextLine();
		System.out.println("Nhập ngành(IT/KT): ");
		nganh=nhap.nextLine();
		if(nganh.equalsIgnoreCase("IT")) {
			System.out.println("Nhập điểm java: ");
			double diemJava=nhap.nextDouble();
			System.out.println("Nhập điểm Css: ");
			double diemCSS=nhap.nextDouble();
			System.out.println("Nhập điểm Html: ");
			double diemHTML=nhap.nextDouble();
			sVGD=new SinhVienIT(hoTen, diemHTML, diemCSS, diemJava);
		}else {
			System.out.println("Nhập điểm marketting: ");
			double marketting=nhap.nextDouble();
			System.out.println("Nhập điểm Sales: ");
			double sales=nhap.nextDouble();
			sVGD=new SinhVienBiz(hoTen, marketting, sales);
		}
		addDSSVGD(sVGD);
	}
}
