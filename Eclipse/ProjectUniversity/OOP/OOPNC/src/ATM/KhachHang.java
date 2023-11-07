package ATM;

public class KhachHang {
	private String name;
	private String dateOfBirth;
	private String address;
	private TaiKhoan taiKhoan;
	
	public KhachHang () {
		setTaiKhoan(new TaiKhoan("Trương Văn Tiến Thịnh", "712289", 1000000));
	}
	public KhachHang(String name, String dateOfBirth, String address, TaiKhoan taiKhoan) {
		setName(name);
		setDateOfBirth(dateOfBirth);
		setAddress(address);
		setTaiKhoan(taiKhoan);
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getDateOfBirth() {
		return this.dateOfBirth;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	public String getAddress() {
		return this.address;
	}
	
	public void setTaiKhoan(TaiKhoan taiKhoan) {
		this.taiKhoan = taiKhoan;
	}
	public TaiKhoan getTaiKhoan() {
		return this.taiKhoan;
	}
	
	protected void guiTien(double soTien) {
		taiKhoan.congTien(soTien);
	}
	protected void rutTien(double soTien) {
		taiKhoan.truTien(soTien);
	}
}
