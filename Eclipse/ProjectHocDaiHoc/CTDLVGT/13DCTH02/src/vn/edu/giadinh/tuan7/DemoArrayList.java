package vn.edu.giadinh.tuan7;

import java.util.ArrayList;

import tienthinh.vn.baitap.DanhSachSanPham;

public class DemoArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         ArrayList<String> danhSachChuoi = new ArrayList<String>();
         danhSachChuoi.add("Một");
         danhSachChuoi.add("Hai");
         danhSachChuoi.add("Ba");
         System.out.println(danhSachChuoi);
         ArrayList<Integer> danhSachSoNguyen = new ArrayList<Integer>();
         danhSachSoNguyen.add(1);
         danhSachSoNguyen.add(2);
         danhSachSoNguyen.add(3);
         System.out.println(danhSachSoNguyen);
         ArrayList<SanPham> danhSachSanPham = new ArrayList<SanPham>();
         danhSachSanPham.add(new SanPham("Mì Gói", 15000));
         danhSachSanPham.add(new SanPham("nho", 10000));
         for(SanPham x: danhSachSanPham) {
        	 x.xuat();
         }
         ArrayList<String> a = new ArrayList<String>();
         a.add("Cường");
         a.add("tuấn");
	}

}
