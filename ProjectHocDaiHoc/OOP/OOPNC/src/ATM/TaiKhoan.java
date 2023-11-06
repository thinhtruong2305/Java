package ATM;

public class TaiKhoan {
	private String username;
	private String password;
	private double soDu;
	
	public TaiKhoan () {
		
	}
	public TaiKhoan(String username, String passwword, double soDu) {
		this.username=username;
		this.password=passwword;
		this.soDu=soDu;
	}
	
	public void setUsername(String username) {
		this.username=username;
	}
	public String getUsername() {
		return this.username;
	}
	
	public void setPassword(String password) {
		this.password=password;
	}
	public String getPassword() {
		return this.password;
	}
	
	public void setSoDu(double soDu) {
		this.soDu=soDu;
	}
	public double getSoDu() {
		return this.soDu;
	}
	
	protected void congTien(double tienCong) {
		this.soDu += tienCong;
	}
	protected void truTien(double tienTru) {
		this.soDu -= tienTru;
	}
}
