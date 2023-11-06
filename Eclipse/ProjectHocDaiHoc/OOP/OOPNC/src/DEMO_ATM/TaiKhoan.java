package DEMO_ATM;


public class TaiKhoan extends CSDLBank{
	private int soTaiKhoan;
	private int matKhau;
	private double soDu;
	
	
	public TaiKhoan() {
		
	}
	
	public TaiKhoan(int soTaiKhoan, int matKhau, double soDu) {
		this.soTaiKhoan=soTaiKhoan;
		this.matKhau=matKhau;
		this.soDu=soDu;
	}
	public void setSoTaiKhoan(int soTaiKhoan) {
		this.soTaiKhoan=soTaiKhoan;
	}
	public int getSoTaiKhoan() {
		return this.soTaiKhoan;
	}
	public void setMatKhau(int matKhau) {
		this.matKhau=matKhau;
	}
	public int getMatKhau() {
		return this.matKhau;
	}
	public void setSoDu(double soDu) {
		this.soDu=soDu;
	}
	public double getSoDu() {
		return this.soDu;
	}
	
	public void xuat() {
		System.out.println("Số tài khoản: "+getSoTaiKhoan());
		System.out.println("Số dư: "+getSoDu()+"00 đồng");
	}
}
