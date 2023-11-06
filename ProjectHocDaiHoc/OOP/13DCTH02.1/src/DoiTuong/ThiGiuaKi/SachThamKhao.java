package DoiTuong.ThiGiuaKi;


public class SachThamKhao extends Sach {
      //thuộc tính
	  private double thue;
	  //phương thức
	  protected SachThamKhao() {
		  
	  }
	  protected SachThamKhao(int maSach,int soLuong,double donGia,String nhaXuatBan,String ngayNhap,double thue) {
		  super(maSach,soLuong,donGia,nhaXuatBan,ngayNhap);
		  this.thue=thue;
	  }
	  protected double thanhTien() {
		  return (getSoLuong()*getDonGia())+getThue();
	  }
	  public void xuat() {
		  super.xuat();
		  System.out.println("Tình trạng: "+getThue());
		  System.out.println("Thành tiền: "+thanhTien());
	  }
	public double getThue() {
		return thue;
	}
	public void setThue(double thue) {
		this.thue = thue;
	}
}
