package DEMO_ATM;

import java.util.ArrayList;
import java.util.Scanner;

public class CSDLBank {
	private TaiKhoan taiKhoan;
	private TaiKhoan taiKhoan1;
	private ArrayList<TaiKhoan> danhSachTaiKhoan;
	Scanner sc = new Scanner(System.in);
	
	public CSDLBank() {
		danhSachTaiKhoan=new ArrayList<TaiKhoan>();
}
	
	public ArrayList<TaiKhoan> getDanhSachTaiKhoan() {
		return danhSachTaiKhoan;
	}

	public void setDanhSachTaiKhoan(ArrayList<TaiKhoan> danhSachTaiKhoan) {
		this.danhSachTaiKhoan = danhSachTaiKhoan;
	}

	public void setTaiKhoan(TaiKhoan taiKhoan) {
		this.taiKhoan=taiKhoan;
	}
	public TaiKhoan getTaiKhoan() {
		return this.taiKhoan;
	}
		
	public TaiKhoan getTaiKhoan1() {
		return taiKhoan1;
	}

	public void setTaiKhoan1(TaiKhoan taiKhoan1) {
		this.taiKhoan1 = taiKhoan1;
	}

	protected void add() {
		taiKhoan = new TaiKhoan(12, 12, 2000000);
		taiKhoan1 = new TaiKhoan(123, 123, 1000000);
		danhSachTaiKhoan.add(taiKhoan);
		danhSachTaiKhoan.add(taiKhoan1);
		setDanhSachTaiKhoan(danhSachTaiKhoan);
	}
	protected TaiKhoan timTaiKhoan(int soTaiKhoan, int matKhau) {
		TaiKhoan timThay=null;
		for (int i=0;i<danhSachTaiKhoan.size();i++) {
			if(danhSachTaiKhoan.get(i).getMatKhau() == matKhau && danhSachTaiKhoan.get(i).getSoTaiKhoan()==soTaiKhoan) {
				return danhSachTaiKhoan.get(i);
			}
		}
		return timThay;
	}
	
	protected boolean checkAccount(int soTaiKhoan,int matKhau) {
		boolean timThay = false;
		for (int i=0;i<danhSachTaiKhoan.size();i++) {
			if(danhSachTaiKhoan.get(i).getMatKhau() == matKhau && danhSachTaiKhoan.get(i).getSoTaiKhoan()==soTaiKhoan) {
				return timThay=true;
			}
		}
		return timThay;
	}
	
	protected TaiKhoan timTaiKhoan(int soTaiKhoan) {
		TaiKhoan find=null;
		for (int i=0;i<danhSachTaiKhoan.size();i++) {
			if(danhSachTaiKhoan.get(i).getSoTaiKhoan()==soTaiKhoan) {
				return danhSachTaiKhoan.get(i);
			}
		}
		return find;
	}
	
	protected void kiemTraTaiKhoan(int soTaiKhoan,int matKhau) {
		for (TaiKhoan taiKhoan : danhSachTaiKhoan) {
			if(taiKhoan.getMatKhau()==matKhau&&taiKhoan.getSoTaiKhoan()==soTaiKhoan) {
				taiKhoan.xuat();break;
			}else {
				System.out.println("Bạn nhập sai rồi");
			}
		}
	}
}
