package DoiTuong.ThiGiuaKi;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class MainSach {
	static Scanner sc = new Scanner(System.in);
    static List<Sach> dSS = new ArrayList<Sach>();
    static boolean nhapTiep=true;
    static void nhapdSS() {
    	Sach sach;
    	int maSach=0,soLuong=0;
    	double donGia=0;
    	System.out.println("Nhập loại sách (Sách Giáo Khoa / Sách Tham Khảo): ");
    	String loaiSach=sc.nextLine();
       	if(loaiSach.equalsIgnoreCase("Sách Giáo Khoa")) {
       	do {
       		try {
       			nhapTiep=true;
        	    System.out.println("Mã sách: ");
        	    maSach=sc.nextInt();
        	    nhapTiep=false;
       		}catch (Exception ex) {
       			nhapTiep=true;
       			System.out.println("Nhập lại "+ex.getMessage());
       			sc.nextLine();
       		}
       	}while(nhapTiep);
       	do {
       		try {
       			nhapTiep=true;
        	    System.out.println("Số lượng: ");
        	    soLuong=sc.nextInt();
        	    nhapTiep=false;
       		}catch(Exception ex) {
       			nhapTiep=true;
       			System.out.println("nhập lại "+ex.getMessage());
       			sc.nextLine();
       		}
       	}while(nhapTiep);
       	do {
       		try {
       			nhapTiep=true;
        	    System.out.println("Đơn giá: ");
        	    donGia=sc.nextDouble();
        	    nhapTiep=false;
       		}catch(Exception ex) {
       			nhapTiep=true;
       			System.out.println("nhập lại "+ex.getMessage());
       			sc.nextLine();
       		}
       	}while(nhapTiep);
        	System.out.println("Nhà xuất bản: ");
        	String nhaXuatBan=sc.nextLine();
        	sc.nextLine();
        	System.out.println("nhập ngày: ");
        	String ngayNhap=sc.nextLine();
            System.out.println("nhập tình trạng: ");
            String tinhTrang=sc.nextLine();
            sach=new SachGiaoKhoa(maSach, soLuong, donGia, nhaXuatBan, ngayNhap, tinhTrang);
       	}else {
       		try {
       			nhapTiep=true;
       			System.out.println("Mã sách: ");
            	maSach=sc.nextInt();
            	nhapTiep=false;
       		}catch(Exception ex) {
       			nhapTiep=true;
       			System.out.println("nhập lại "+ex.getMessage());
       			sc.nextLine();
       		}
       		try {
       			nhapTiep=true;
        	    System.out.println("Số lượng: ");
        	    soLuong=sc.nextInt();
        	    nhapTiep=false;
       		}catch(Exception ex) {
       			nhapTiep=true;
       			System.out.println("nhập lại"+ex.getMessage());
       			sc.nextLine();
       		}
       		try {
       			nhapTiep=true;
        	    System.out.println("Đơn giá: ");
        	    donGia=sc.nextDouble();
        	    nhapTiep=false;
       		}catch(Exception ex) {
       			nhapTiep=true;
       			System.out.println("nhập lại "+ex.getMessage());
       			sc.nextLine();
       		}
        	System.out.println("Nhà xuất bản: ");
        	String nhaXuatBan=sc.nextLine();
        	sc.nextLine();
        	System.out.println("nhập ngày: ");
        	String ngayNhap=sc.nextLine();
            System.out.println("nhập thuế: ");
            double thue=Double.parseDouble(sc.nextLine());
            sach=new SachThamKhao(maSach, soLuong, donGia, nhaXuatBan, ngayNhap, thue);
       	}
       addSach(sach);
    }
    static void addSach(Sach sach) {
    	dSS.add(sach);
    }
    static void xuatSach() {
    	for (Sach sach : dSS) {
			sach.xuat();
		}
    }
    static void tinhTongTungLoai() {
    	double tienSGK=0;
    	double tienSTK=0;
    	if(dSS instanceof SachGiaoKhoa) {
    		tienSGK += ((SachGiaoKhoa) dSS).thanhTien();
    		System.out.println("Tiền sách giáo khoa: "+tienSGK);
    	}else {
    		try {
    		tienSTK += ((SachThamKhao) dSS).thanhTien();
    		}catch(ClassCastException cce) {
    			
    		}
    		System.out.println("Tiền sách tham khảo: "+tienSTK);
    	}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	        while(nhapTiep) {
	        		nhapdSS();
	        		System.out.println("Bạn muốn nhập tiếp không: Y/N");
	        		nhapTiep=sc.nextLine().equalsIgnoreCase("Y");
	        }
	        xuatSach();
	        tinhTongTungLoai();
	}

}
