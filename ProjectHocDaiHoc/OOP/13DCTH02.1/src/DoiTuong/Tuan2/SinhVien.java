package DoiTuong.Tuan2;

public class SinhVien {
// ECAPSULATION GỒM INTERFACES VÀ IMPLEMENTATION
//INTERFACE: ĐIỂM GIAO TIẾP- PHƯƠNG THỨC PUBLIC: ĐỂ TƯƠNG TÁC
//IMPLEMENTATION: LÀ THUỘC TÍNH/ PHƯƠNG THỨC PRIVATE: ĐỂ GIẤU ĐI
//thuộc tính
	//public String hoTen;
	//public double diem;
	private String hoTen;
	private double diem;
//phương thức
	//INTERFACES
	public String getHoTen() {
		return this.hoTen;
	}
	//INTERFACES
	public void setHoTen(String hoTen) {
		this.hoTen=hoTen;
	}
	public double getDiem() {
		return this.diem;
	}
	public void setDiem(double diem) {
		if(diem<0 || diem>10) {
			System.out.println("Điểm bất hợp lí");
		}
		this.diem=diem;
	}
	void nhap() {
		
	}
	void xuat() {
		
	}
}
