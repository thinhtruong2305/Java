package DoiTuong.BaiTap;

public class PhongThiNghiem extends PhongHoc{
	private String chuyenNganh;
	private int sucChua;
	private boolean bonRua;
	
	public PhongThiNghiem() {
		
	}
	public PhongThiNghiem(int maPhong, String dayNha, double dienTich, int soBongDen, String chuyenNganh, int sucChua, boolean bonRua) {
		super(maPhong,dayNha,dienTich,soBongDen);
		this.chuyenNganh=chuyenNganh;
		this.sucChua=sucChua;
		this.bonRua=bonRua;
	}
	public void setChuyenNganh(String chuyenNganh) {
		this.chuyenNganh=chuyenNganh;
	}
	public String getChuyenNganh() {
		return this.chuyenNganh;
	}
	public void setSucChua(int sucChua) {
		this.sucChua=sucChua;
	}
	public int getSucChua() {
		return this.sucChua;
	}
	public void setBonRua(boolean bonRua) {
		this.bonRua=bonRua;
	}
	public boolean isBonRua() {
		return this.bonRua;
	}
	protected boolean kiemTraDatChuan() {
		if(this.kiemTraDoSang()==true && this.bonRua==true) {
			return true;
		}
		return false;
	}
	public void xuat() {
		String strBonRua=null;
		System.out.println("Phòng Thí Nghiệm");
		System.out.println("Chuyên ngành: "+this.chuyenNganh);
		System.out.println("Sức Chứa: "+this.sucChua);
		if(this.bonRua==true) {
			strBonRua="Có bồn rửa";
		}
			strBonRua="Không có bồn rửa";
		System.out.println(strBonRua);
		super.xuat();
	}
}
