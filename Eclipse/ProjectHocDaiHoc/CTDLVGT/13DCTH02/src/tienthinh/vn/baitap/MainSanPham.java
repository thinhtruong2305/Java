package tienthinh.vn.baitap;

public class MainSanPham {

	public static void main(String[] args) {
		// TODO Auto-generated method stubta
       SanPham sanPham1 = new SanPham();
       SanPham sanPham2 = new SanPham();
       System.out.println("Nhập thông tin cho sản phẩm 1: ");
       sanPham1.nhap();
       System.out.println("Nhập thông tin cho sản phẩm 2: ");
       sanPham2.nhap();
       System.out.println("Xuất thông tin cho sản phẩm 1: ");
       sanPham1.xuat();
       System.out.println("Xuất thông tin cho sản phẩm 2:");
       sanPham2.xuat();
       //Hàm tạo bổ sung giảm giá và không
       SanPham sanPhamGiamGia= new SanPham("thịt", 45000, 5000);
       SanPham sanPham= new SanPham("Trứng", 25000);
       sanPham.xuat();
      
       }
	}


