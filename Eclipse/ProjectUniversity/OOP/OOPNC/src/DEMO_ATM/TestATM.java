package DEMO_ATM;

import java.util.Scanner;

public class TestATM {
	static ATM atm = new ATM();
	static boolean restart=true;
	static int soLan = 0;
	static Scanner sc = new Scanner(System.in);
	static int soTaiKhoan;
	static int matKhau;
	static double tam=0;
	static double tam1=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(restart){
			if(dangNhap().equalsIgnoreCase("Bạn đã đăng nhập thành công")) {
				System.out.println("Bạn đã đăng nhập thành công");
				menu();
				System.out.println("  Bạn có muốn quay lại không");
				System.out.println("Có							Không");
				sc.nextLine();
				String str = sc.nextLine();
				if(str.equalsIgnoreCase("Có")) {
					restart=true;
				}else {
				restart=false;
				}
			}
		}
	}
	protected static String dangNhap() {
		atm.getcsdlBank().add();
		System.out.println("Nhập tài khoản: ");
		soTaiKhoan = sc.nextInt();
		System.out.println("Nhập mật khẩu: ");
		matKhau = sc.nextInt();
		sc.nextLine();
		if(atm.getcsdlBank().checkAccount(soTaiKhoan, matKhau)) {
			return "Bạn đã đăng nhập thành công";
		}else {
			return "Sai số tài khoản và mật khẩu";
		}
	}
	protected static void rutTien() {
		System.out.println("Nhập tiền rút: ");
		double soTienRut = sc.nextDouble();
		tam =atm.rutTien(soTaiKhoan, matKhau, soTienRut);
		System.out.println("Bạn đã rút "+soTienRut);
	}
	protected static void guiTien() {
		System.out.println("Nhập số tiền gửi: ");
		double soTienGui = sc.nextDouble();
		tam=atm.guiTien(soTaiKhoan, matKhau, soTienGui);
		System.out.println("Bạn đã gửi "+soTienGui);
	}
	protected static void chuyenTien() {
		System.out.println("Nhập tài khoản người nhận: ");
		int soTaiKhoanNguoiNhan = sc.nextInt();
		System.out.println("Nhập số tiền chuyển: ");
		double soTienChuyen = sc.nextDouble();
		tam=atm.chuyenTien(soTaiKhoan, matKhau, soTaiKhoanNguoiNhan, soTienChuyen);
		System.out.println("Bạn đã chuyển "+soTienChuyen);
	}
	protected static void kiemTra() {
		atm.getcsdlBank().kiemTraTaiKhoan(soTaiKhoan, matKhau);
	}
	protected static void menu() {
		int luaChon=0;
		System.out.println("1. Rút Tiền");
		System.out.println("2. Gửi Tiền");
		System.out.println("3. Chuyển Tiền");
		System.out.println("4. Kiểm tra");
		System.out.print("Mời bạn lựa chọn: ");
		luaChon = sc.nextInt();
		switch(luaChon) {
		case 1: rutTien();break;
		case 2: guiTien();break;
		case 3: chuyenTien(); break;
		case 4: kiemTra();break;
		default: System.out.println("Chào bạn");
		}
	}
}
