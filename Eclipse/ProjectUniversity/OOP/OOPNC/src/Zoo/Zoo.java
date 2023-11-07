package Zoo;

public class Zoo {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DanhSachThuVat ds = new DanhSachThuVat();
		do {
			ds.nhap();
		} while (Animal.Animal.getSoLuongThuVat()<5);
		ds.in();
	
	}
	
}
