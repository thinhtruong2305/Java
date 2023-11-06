package on.tap.cuoiki;
import java.util.Scanner;
public class BaLo {
//thuộc tính
	String hieu;
	String chatLieu;
	double gia;
	int namSX;
//Phương thức
	public BaLo() {
		
	}
	public BaLo(String hieu_,double gia_) {
		hieu = hieu_;
		gia = gia_;
	}
	public BaLo(String hieu_,String chatLieu_,double gia_,int namSX_) {
		hieu = hieu_;
		chatLieu = chatLieu_;
		gia = gia_;
		namSX = namSX_;
	}
	public void nhap() {
		Scanner nhap=new Scanner(System.in);
		System.out.print("Nhập hiệu của ba lô: ");
		hieu=nhap.nextLine();
		System.out.print("Nhập chất liệu của ba lô: ");
		chatLieu=nhap.nextLine();
		System.out.print("Nhập giá của ba lô: ");
		gia=nhap.nextDouble();
		System.out.print("Nhập năm sản xuất: ");
		namSX=nhap.nextInt();
	}
	public void xuat() {
		System.out.println("Hiệu: "+hieu);
		System.out.println("Chất liệu: "+chatLieu);
		System.out.println("Giá: "+gia);
		System.out.println("Năm sản xuất: "+namSX);
	}
}
