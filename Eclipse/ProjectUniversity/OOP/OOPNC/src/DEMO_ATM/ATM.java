package DEMO_ATM;



public class ATM {
	private CSDLBank csdlBank;
	public ATM() {
		csdlBank=new CSDLBank();
	}
	
	public void setcsdlBank(CSDLBank csdlBank) {
		this.csdlBank=csdlBank;
	}
	public CSDLBank getcsdlBank() {
		return this.csdlBank;
	}
	
	protected double guiTien(int soTaiKhoan,int matKhau,double tienGui) {
		return csdlBank.timTaiKhoan(soTaiKhoan, matKhau).getSoDu()+tienGui;
	}
	protected double rutTien(int soTaiKhoan,int matKhau,double soTienRut) {
		return csdlBank.timTaiKhoan(soTaiKhoan, matKhau).getSoDu()-soTienRut;
	}
	protected double chuyenTien(int soTaiKhoanNguoiChuyen,int matKhauNguoiChuyen,int soTaiKhoanNguoiNhan, double soTienChuyen) {
		rutTien(soTaiKhoanNguoiChuyen, matKhauNguoiChuyen, soTienChuyen);
		return csdlBank.timTaiKhoan(soTaiKhoanNguoiNhan).getSoDu()+soTienChuyen;
	}
}
