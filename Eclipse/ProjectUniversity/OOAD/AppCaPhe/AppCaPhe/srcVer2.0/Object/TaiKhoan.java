package Object;

import java.util.Scanner;

public class TaiKhoan {
	private static int count = 0;
	Scanner sc = new Scanner(System.in);
	private int idTaiKhoan = 0;
	private String tenDangNhap, matKhau, ten;
	
	public TaiKhoan() {
		this.setIdTaiKhoan(++count);
	}
	public TaiKhoan(String tenDangNhap, String matKhau, String ten) {
		this.setIdTaiKhoan(++count);
		this.setTenDangNhap(tenDangNhap);
		this.setMatKhau(matKhau);
		this.setTen(ten);
	}
	
	public static int getCount() {
		return TaiKhoan.count;
	}
	public static void setCount(int count) {
		TaiKhoan.count = count;
	}
	public int getIdTaiKhoan() {
		return this.idTaiKhoan;
	}
	public void setIdTaiKhoan(int idTaiKhoan){
		this.idTaiKhoan = idTaiKhoan;
	}
	public String getTenDangNhap() {
		return this.tenDangNhap;
	}

	public void setTenDangNhap(String tenDangNhap) {
		this.tenDangNhap = tenDangNhap;
	}
	public String getMatKhau() {
		return this.matKhau;
	}
	public void setMatKhau(String matKhau) {
		this.matKhau = matKhau;
	}
	public String getTen() {
		return this.ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}

	//hiển thị
	public void display() {
		System.out.printf("\n%-3d %-30s %-30s %s\n",this.getIdTaiKhoan(),this.getTenDangNhap(),this.getMatKhau(),this.getTen());
	}
	
	//nhập thông tin
	public void input() {
		System.out.print("Nhập tên đăng nhập: ");
		this.setTenDangNhap(sc.nextLine());
		System.out.print("Nhập mật khẩu: ");
		this.setMatKhau(sc.nextLine());
		System.out.print("Nhập họ và tên: ");
		this.setTen(sc.nextLine());
	}
}
