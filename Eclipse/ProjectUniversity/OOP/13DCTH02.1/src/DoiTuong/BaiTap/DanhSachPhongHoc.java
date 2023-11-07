package DoiTuong.BaiTap;

import java.util.ArrayList;
import java.util.Scanner;

public class DanhSachPhongHoc {
	private ArrayList<PhongHoc> danhSachPhongHoc;
	public DanhSachPhongHoc() {
		setDanhSachPhongHoc(new ArrayList<PhongHoc>());
	}
	public void setDanhSachPhongHoc(ArrayList<PhongHoc> danhSachPhongHoc) {
		this.danhSachPhongHoc=danhSachPhongHoc;
	}
	public ArrayList<PhongHoc> getDanhSachPhongHoc(){
		return this.danhSachPhongHoc;
	}
	public void themPhong() {
		PhongHoc phongHoc = null;
		Scanner nhap = new Scanner(System.in);
		boolean nhapTiep;
		int maPhong=0,soBongDen=0;
		String dayNha=null;
		double dienTich=0.0;
			try {
			 nhapTiep=true;
		     System.out.println("Nhập mã phòng:");
		     maPhong=Integer.parseInt(nhap.nextLine());
			}catch(Exception x) {
				nhapTiep=true;
				System.out.println("Nhập lại"+x.getMessage());
			}
			try {
				nhapTiep=true;
		        System.out.println("Nhập dãy phòng: ");
		        dayNha=nhap.nextLine();
			}catch(Exception x) {
				nhapTiep=true;
				System.out.println("nhập lại"+x.getMessage());
			}
		System.out.println("Nhập diện tích: ");
		dienTich=nhap.nextDouble();
		System.out.println("Nhập số bóng đèn: ");
		soBongDen=nhap.nextInt();
		nhap.nextLine();
		System.out.println("Chọn Phòng (1-Phòng lý thuyết / 2-Phòng máy tính / 3-Phòng thí nghiệm");
		int chonPhong=Integer.parseInt(nhap.nextLine());
		if(chonPhong==1) {
			System.out.println("Nhập máy chiếu (true/false): ");
			boolean mayChieu = nhap.nextBoolean();
			phongHoc = new PhongHocLyThuyet(maPhong, dayNha, dienTich, soBongDen, mayChieu);
		}else if(chonPhong == 2) {
			System.out.println("Số máy tính: ");
			int soMayTinh=nhap.nextInt();
			phongHoc = new PhongMayTinh(maPhong, dayNha, dienTich, soBongDen, soMayTinh);
		}else if(chonPhong==3) {
			System.out.println("Chuyên ngành: ");
			String chuyenNganh=nhap.nextLine();
			System.out.println("Sức chứa: ");
			int sucChua=nhap.nextInt();
			System.out.println("Nhập bồn rửa(true/false): ");
			boolean bonRua=nhap.nextBoolean();
			phongHoc = new PhongThiNghiem(maPhong, dayNha, dienTich, soBongDen, chuyenNganh, sucChua, bonRua);
		}else {
		System.out.println("nhập sai rồi");
		}
		danhSachPhongHoc.add(phongHoc);
	}
	public void inPhong() {
		for(PhongHoc phongHoc: danhSachPhongHoc) {
			phongHoc.xuat();
		}
	}
	public void timPhong(int maPhong) {
		
	}
	public void xoaPhong(int maPhong) {
		
	}
	
}
