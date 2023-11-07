package ATM;

import java.util.Scanner;

public class ATM {
	static Scanner sc = new Scanner(System.in);
	static boolean nhapTiep;
	static KhachHang tienThinh = new KhachHang();
	static int soLanNhap=0;
	public static void main(String[] args) {
		do {
			dangNhap();
			soLanNhap++;
		}while(soLanNhap<6);
	}
	
	protected static void dangNhap() {
		System.out.print("Nhập Username: ");
		String username = sc.nextLine();
		System.out.print("Nhập Password: ");
		String password = sc.nextLine();
		xacNhan(username, password);
	}
	protected static void xacNhan(String username, String password) {
		if(tienThinh.getTaiKhoan().getUsername().equalsIgnoreCase(username) && tienThinh.getTaiKhoan().getPassword().equalsIgnoreCase(password)) {
			menu();
		}else {
			System.out.println("Bạn sai tài khoản hay mật khẩu");
		}
	}
	protected static void menu () {
		int luaChon=0;
		System.out.println("\t\tChào mừng quý khách\n");
		System.out.println("\tChức Năng");
		System.out.println("1.\tGửi tiền");
		System.out.println("2.\tRút tiền");
		System.out.println("3.\tKiểm tra số dư");
		System.out.println("4.\tKết thúc");
		do{
			try {
			nhapTiep=true;
			System.out.print("Mời quý khách lựa chọn số: \n");
			luaChon = sc.nextInt();
			sc.nextLine();
			nhapTiep=false;break;
		} catch(Exception ex) {
			nhapTiep=true;
			System.out.println("Nhập lại");
			sc.nextLine();
			}
		}while(nhapTiep=true);
		switch(luaChon) {
			case 1: 
				System.out.println("Số tiền bạn muốn gửi: \n");
				double soTienGui = sc.nextDouble();
				sc.nextLine();
				tienThinh.guiTien(soTienGui);
				System.out.println("Số dư của bạn: "+tienThinh.getTaiKhoan().getSoDu());
				break;
			case 2:
				System.out.println("Số tiền bạn muốn rút: \n");
				double soTienRut = sc.nextDouble();
				sc.nextLine();
				tienThinh.rutTien(soTienRut);
				System.out.println("Số dư của bạn: "+tienThinh.getTaiKhoan().getSoDu());
				break;
			case 3:
				System.out.println("Số dư của bạn: "+tienThinh.getTaiKhoan().getSoDu());
				break;
			default: System.out.println("Tạm Biệt quý khách");break;
		}
	}
}
