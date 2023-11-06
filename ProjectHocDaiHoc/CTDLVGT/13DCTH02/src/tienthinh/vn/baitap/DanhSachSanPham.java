package tienthinh.vn.baitap;
import java.util.Scanner;
public class DanhSachSanPham {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		int n;
		Scanner nhap= new Scanner(System.in);
		 //Mảng Sản Phẩm
		   System.out.print("Nhập số lượng sản phẩm cần nhập: ");
		   n =Integer.parseInt(nhap.nextLine());
		   SanPham[] a = new SanPham[n];
	       for(int i=0;i < n;i++) {
	    	   SanPham sanPham = new SanPham();
	    	   sanPham.nhap();
	    	   a[i]= sanPham;
	       }
	       for(SanPham x : a) {
	    	   x.xuat();
	       }
	}

}
