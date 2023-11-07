package Object;

import java.util.Scanner;

public class TaiKhoan {
	private static int count = 0;
	Scanner sc = new Scanner(System.in);
	private int idTaiKhoan = 0;
	private String tenDangNhap,matKhau,quyenHan;
	
	public TaiKhoan() {
		this.idTaiKhoan = ++count;
	}
	public TaiKhoan(String tenDangNhap, String matKhau, String quyenHan) {
		this.idTaiKhoan = ++count;
		this.tenDangNhap = tenDangNhap;
		this.matKhau = matKhau;
		this.quyenHan = quyenHan;
	}
	
	public static int getCount() {
		return count;
	}
	public static void setCount(int count) {
		TaiKhoan.count = count;
	}
	public int getIdTaiKhoan() {
		return idTaiKhoan;
	}
	public void setIdTaiKhoan(int idTaiKhoan){
		this.idTaiKhoan = idTaiKhoan;
	}
	public String getTenDangNhap() {
		return tenDangNhap;
	}
	public void setTenDangNhap(String tenDangNhap) {
		this.tenDangNhap = tenDangNhap;
	}
	public String getMatKhau() {
		return matKhau;
	}

	public void setMatKhau(String matKhau) {
		this.matKhau = matKhau;
	}

	public String getQuyenHan() {
		return quyenHan;
	}
	public void setQuyenHan(String quyenHan) {
		this.quyenHan = quyenHan;
	}

	@Override
	public String toString() {
		return "TaiKhoan [idTaiKhoan=" + idTaiKhoan + ", tenDangNhap=" + tenDangNhap + ", matKhau=" + matKhau + ", quyenHan="+ quyenHan + "]";
	}
	
	//hiển thị
	public void display() {
		System.out.println(this.toString());
	}
	
	//nhập thông tin
	public void input() {
		System.out.print("Nhập tên đăng nhập: ");
		this.setTenDangNhap(sc.nextLine());
		System.out.print("Nhập mật khẩu: ");
		this.setMatKhau(sc.nextLine());
		System.out.print("Nhập quyền hạn: ");
		this.setQuyenHan(sc.nextLine());
	}
}
