package tienthinh.vn.baitap;
import java.util.Scanner;

public class SanPham {
	//Thuộc tính Danh từ
     String tenSanPham;
     double donGia,giamGia;
     //Phương Thức/hành vi
     public SanPham() {
    	 
     }
     public void nhap() {
    	 Scanner nhap = new Scanner(System.in);
    	 System.out.print("Nhập Tên Sản Phẩm: ");
    	 tenSanPham=nhap.nextLine();
    	 System.out.print("Nhập Đơn Giá Sản Phẩm: ");
    	 donGia=nhap.nextDouble();
    	 System.out.println("Nhập số giá giảm: ");
    	 giamGia=nhap.nextDouble();
     }
     public void xuat() {
    	 System.out.println("Tên Sản Phẩm: "+tenSanPham);
    	 System.out.println("Số Giá Giảm: "+giamGia);
    	 System.out.println("Đơn Giá Của Sản Phẩm: "+(donGia-giamGia));
     }
     //Bổ sung 2 hàm tạo
     public SanPham(String _tenSanPham,double _donGia,double _giamGia) {
    	 this.tenSanPham = _tenSanPham;
    	 this.donGia = _donGia;
    	 this.giamGia = _giamGia;
     }
     public SanPham(String _tenSanPham,double _donGia) {
    	 this.tenSanPham= _tenSanPham;
    	 this.donGia= _donGia;
     }
	
}
