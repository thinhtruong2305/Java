package DoiTuong.Tuan2;

import java.util.ArrayList;
import java.util.Scanner;

public class MainSanPham{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 /*int n;
	 Scanner nhap = new Scanner(System.in);
     System.out.println("Nhập số lượng sản phẩm cần nhập: ");
     n=nhap.nextInt();
     SanPham[] sp = new SanPham[n];
     for(int i=0;i<n;i++) {
    	 SanPham sp1 = new SanPham();
    	 sp1.Nhap();
    	 sp[i]=sp1;
     }*/
     ArrayList<SanPham> danhSachSanPham=new ArrayList<SanPham>();
     Scanner nhap = new Scanner(System.in);
     SanPham a=new SanPham();
     while(true) {
    	 System.out.println("Nhập tên sản phẩm: ");
    	 a.setTenSP(nhap.nextLine());
    	 System.out.println("Nhập đơn giá: ");
    	 a.setDonGia(nhap.nextDouble());
    	 System.out.println("Nhập giảm giá: ");
    	 a.setGiamGia(nhap.nextDouble());
    	 danhSachSanPham.add(a);
    	 System.out.println("Bạn có muốn nhập nữa hay không");
    	 System.out.println("Nhập nữa là Y/ Không nhập nữa là N");
    	 nhap.nextLine();
    	 if(nhap.nextLine().equals("N")) {
    		 break;
    	 }
     }
     for(SanPham y:danhSachSanPham) {
    	 System.out.println("Tên sản phẩm: "+y.getTenSP());
    	 System.out.println("Đơn giá: "+y.getDonGia()+"00");
    	 System.out.println("Giảm giá: "+y.getGiamGia()+"00");
     }
     /*for(SanPham x:sp) {
    	 x.Xuat();
     }*/
	}

}
