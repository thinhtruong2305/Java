package DoiTuong.ThiGiuaKi;


public class SachGiaoKhoa extends Sach {
     //thuộc tính
	 private String tinhTrang;
	 //phương thức
	 protected SachGiaoKhoa() {
		 
	 }
	 protected SachGiaoKhoa(int maSach,int soLuong,double donGia,String nhaXuatBan,String ngayNhap,String tinhTrang) {
		 super(maSach,soLuong,donGia,nhaXuatBan,ngayNhap);
		 this.tinhTrang=tinhTrang;
	 }
	 protected double thanhTien() {
		 double tien;
		 if(getTinhTrang().equalsIgnoreCase("mới")) {
			 tien = this.getSoLuong()*this.getDonGia();
		 }else {
			 tien = this.getSoLuong()*this.getDonGia()*0.5;
		 }
		 return tien;
	 }
	 public void xuat() {
		 super.xuat();
		 System.out.println("Tình trạng: "+getTinhTrang());
		 System.out.println("Thành tiền: "+thanhTien());
	 }
	public String getTinhTrang() {
		return tinhTrang;
	}
	public void setTinhTrang(String tinhTrang) {
		this.tinhTrang = tinhTrang;
	}
}
