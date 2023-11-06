package DoiTuong.Tuan6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainChuyenXe {
    static List<ChuyenXe> dSCX = new ArrayList<ChuyenXe>();
    static Scanner sc=new Scanner(System.in);
    static void addDSCX(ChuyenXe chuyenxe) {
    	dSCX.add(chuyenxe);
    }
    static void nhapDSCX() {
    	ChuyenXe cX;
    	System.out.print("Mã số chuyến: ");
		int maSoChuyen=sc.nextInt();
		System.out.print("Số xe: ");
		int soXe=sc.nextInt();
		System.out.print("Họ tên tài xế: ");
		String hoTenTaiXe=sc.nextLine();
		System.out.print("Chuyến Xe(Chuyến Xe Nội Thành / Chuyến Xe Ngoại Thành): ");
    	String chuyenXe=sc.nextLine();
    	if(chuyenXe.equalsIgnoreCase("Chuyến Xe Nội Thành")) {
    		System.out.print("Số tuyến: ");
    		int soTuyen=sc.nextInt();
    		System.out.print("Số Km đi được: ");
    		int soKmDi=sc.nextInt();
    	}else {
    		System.out.println("Nơi đến: ");
    		String noiDen=sc.nextLine();
    		System.out.println("Số ngày đi được: ");
    		
    	}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
